package com.giderosmobile.android.player;

import android.app.Activity;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class Geolocation {
    private static final int TWO_MINUTES = 120000;
    private LocationManager locationManager_;
    private Sensor mAccelerometer;
    private float[] mMatrixI;
    private float[] mMatrixR;
    private float[] mMatrixValues;
    private Sensor magneticSensor;
    private SensorManager sensorManager;
    private Location currentBestLocation = null;
    private LocationListener locationListener_ = null;
    private SensorEventListener magneticListener_ = null;
    boolean gps_enabled = false;
    boolean network_enabled = false;
    private double locThreshold = 0.0d;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onHeadingChanged(double d, double d2, float f, float f2, float f3);

    private static native void onLocationChanged(double d, double d2, double d3, double d4, double d5, double d6, int i);

    public double getAccuracy() {
        return 0.0d;
    }

    public void setAccuracy(double d) {
    }

    Geolocation() {
        Activity activity = WeakActivityHolder.get();
        this.locationManager_ = (LocationManager) activity.getSystemService("location");
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.magneticSensor = sensorManager.getDefaultSensor(2);
        this.mAccelerometer = this.sensorManager.getDefaultSensor(1);
        this.mMatrixR = new float[9];
        this.mMatrixI = new float[9];
        this.mMatrixValues = new float[3];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isAvailable() {
        boolean z;
        int checkSelfPermission;
        int checkSelfPermission2;
        Activity activity = WeakActivityHolder.get();
        this.gps_enabled = this.locationManager_.isProviderEnabled("gps");
        this.network_enabled = this.locationManager_.isProviderEnabled("network");
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.gps_enabled) {
                checkSelfPermission2 = activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION");
                if (checkSelfPermission2 != 0) {
                    this.gps_enabled = false;
                    z = true;
                    if (this.network_enabled) {
                        checkSelfPermission = activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
                        if (checkSelfPermission != 0) {
                            this.network_enabled = false;
                            z = true;
                        }
                    }
                    if (z && !this.gps_enabled) {
                        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 0);
                    }
                }
            }
            z = false;
            if (this.network_enabled) {
            }
            if (z) {
                activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 0);
            }
        }
        return this.gps_enabled || this.network_enabled;
    }

    public boolean isHeadingAvailable() {
        return this.magneticSensor != null;
    }

    public void setThreshold(double d) {
        this.locThreshold = d;
        if (this.locationListener_ != null) {
            stopUpdatingLocation();
            startUpdatingLocation();
        }
    }

    public double getThreshold() {
        return this.locThreshold;
    }

    public void start() {
        startUpdatingLocation();
        startUpdatingHeading();
    }

    public void stop() {
        stopUpdatingLocation();
        stopUpdatingHeading();
    }

    public void startUpdatingLocation() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.Geolocation.1
            @Override // java.lang.Runnable
            public void run() {
                Location lastKnownLocation;
                if (Geolocation.this.locationListener_ != null) {
                    return;
                }
                Geolocation.this.locationListener_ = new LocationListener() { // from class: com.giderosmobile.android.player.Geolocation.1.1
                    @Override // android.location.LocationListener
                    public void onProviderDisabled(String str) {
                    }

                    @Override // android.location.LocationListener
                    public void onProviderEnabled(String str) {
                    }

                    @Override // android.location.LocationListener
                    public void onStatusChanged(String str, int i, Bundle bundle) {
                    }

                    @Override // android.location.LocationListener
                    public void onLocationChanged(Location location) {
                        if (Geolocation.this.isBetterLocation(location, Geolocation.this.currentBestLocation)) {
                            Geolocation.this.currentBestLocation = location;
                            Geolocation.this.sendLocationUpdate(Geolocation.this.currentBestLocation);
                        }
                    }
                };
                if (Geolocation.this.gps_enabled) {
                    Geolocation.this.locationManager_.requestLocationUpdates("gps", 0L, (float) Geolocation.this.locThreshold, Geolocation.this.locationListener_);
                }
                if (Geolocation.this.network_enabled) {
                    Geolocation.this.locationManager_.requestLocationUpdates("network", 0L, (float) Geolocation.this.locThreshold, Geolocation.this.locationListener_);
                }
                if (!Geolocation.this.gps_enabled || (lastKnownLocation = Geolocation.this.locationManager_.getLastKnownLocation("gps")) == null) {
                    return;
                }
                Geolocation.this.locationListener_.onLocationChanged(lastKnownLocation);
            }
        });
    }

    public void stopUpdatingLocation() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.Geolocation.2
            @Override // java.lang.Runnable
            public void run() {
                if (Geolocation.this.locationListener_ == null) {
                    return;
                }
                Geolocation.this.locationManager_.removeUpdates(Geolocation.this.locationListener_);
                Geolocation.this.locationListener_ = null;
            }
        });
    }

    public void startUpdatingHeading() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.Geolocation.3
            @Override // java.lang.Runnable
            public void run() {
                if (Geolocation.this.magneticSensor != null && Geolocation.this.magneticListener_ == null) {
                    Geolocation.this.magneticListener_ = new SensorEventListener() { // from class: com.giderosmobile.android.player.Geolocation.3.1
                        boolean hasAcc;
                        float[] mAcc = new float[3];

                        @Override // android.hardware.SensorEventListener
                        public void onAccuracyChanged(Sensor sensor, int i) {
                        }

                        @Override // android.hardware.SensorEventListener
                        public void onSensorChanged(SensorEvent sensorEvent) {
                            double d;
                            float f = sensorEvent.values[0];
                            float f2 = sensorEvent.values[1];
                            float f3 = sensorEvent.values[2];
                            if (sensorEvent.sensor.getType() == 1) {
                                this.hasAcc = true;
                                float[] fArr = this.mAcc;
                                fArr[0] = f;
                                fArr[1] = f2;
                                fArr[2] = f3;
                                return;
                            }
                            double atan2 = (Math.atan2(f, -f2) + 3.141592653589793d) * 57.29577951308232d;
                            if (this.hasAcc && SensorManager.getRotationMatrix(Geolocation.this.mMatrixR, Geolocation.this.mMatrixI, this.mAcc, sensorEvent.values)) {
                                SensorManager.getOrientation(Geolocation.this.mMatrixR, Geolocation.this.mMatrixValues);
                                atan2 = Geolocation.this.mMatrixValues[0] * 57.29577951308232d;
                                if (Geolocation.this.currentBestLocation != null) {
                                    d = new GeomagneticField((float) Geolocation.this.currentBestLocation.getLatitude(), (float) Geolocation.this.currentBestLocation.getLongitude(), (float) Geolocation.this.currentBestLocation.getAltitude(), System.currentTimeMillis()).getDeclination() + atan2;
                                    Geolocation.onHeadingChanged(atan2, d, f, f2, f3);
                                }
                            }
                            d = atan2;
                            Geolocation.onHeadingChanged(atan2, d, f, f2, f3);
                        }
                    };
                    Geolocation.this.sensorManager.registerListener(Geolocation.this.magneticListener_, Geolocation.this.magneticSensor, 3);
                    if (Geolocation.this.mAccelerometer != null) {
                        Geolocation.this.sensorManager.registerListener(Geolocation.this.magneticListener_, Geolocation.this.mAccelerometer, 3);
                    }
                }
            }
        });
    }

    public void stopUpdatingHeading() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.Geolocation.4
            @Override // java.lang.Runnable
            public void run() {
                if (Geolocation.this.magneticSensor == null || Geolocation.this.magneticListener_ == null) {
                    return;
                }
                Geolocation.this.sensorManager.unregisterListener(Geolocation.this.magneticListener_, Geolocation.this.magneticSensor);
                if (Geolocation.this.mAccelerometer != null) {
                    Geolocation.this.sensorManager.unregisterListener(Geolocation.this.magneticListener_, Geolocation.this.mAccelerometer);
                }
                Geolocation.this.magneticListener_ = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLocationUpdate(Location location) {
        double d;
        int i;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        double altitude = location.getAltitude();
        double speed = location.hasSpeed() ? location.getSpeed() : -1.0d;
        double bearing = location.hasBearing() ? location.getBearing() : -1.0d;
        double accuracy = location.hasAccuracy() ? location.getAccuracy() : -1.0d;
        String provider = location.getProvider();
        int i2 = "gps".equals(provider) ? 80 : 0;
        if ("network".equals(provider)) {
            d = bearing;
            i = 78;
        } else {
            d = bearing;
            i = i2;
        }
        onLocationChanged(latitude, longitude, altitude, speed, d, accuracy, i);
    }

    protected boolean isBetterLocation(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && isSameProvider;
        }
        return true;
    }

    private boolean isSameProvider(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
