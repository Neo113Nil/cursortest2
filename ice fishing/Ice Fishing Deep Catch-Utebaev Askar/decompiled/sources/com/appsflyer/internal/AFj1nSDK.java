package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK implements SensorEventListener {
    private double AFAdRevenueData;
    private long areAllFieldsValid;
    private final Executor component1;
    private final float[][] component2 = new float[2][];
    private final long[] component4 = new long[2];
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private final int getRevenue;

    public AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getRevenue = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component1 = executorService;
    }

    private static List<Float> AFAdRevenueData(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H_, reason: merged with bridge method [inline-methods] */
    public void I_(SensorEvent sensorEvent) {
        long j2 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = fArrCopyOf;
            this.component4[1] = jCurrentTimeMillis;
            this.AFAdRevenueData = getMediationNetwork(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j2 - this.areAllFieldsValid) {
            this.areAllFieldsValid = j2;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = jCurrentTimeMillis;
                return;
            }
            double mediationNetwork = getMediationNetwork(fArr3, fArr);
            if (mediationNetwork > this.AFAdRevenueData) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = jCurrentTimeMillis;
                this.AFAdRevenueData = mediationNetwork;
            }
        }
    }

    private static double getMediationNetwork(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i2 = 0; i2 < iMin; i2++) {
            dPow += StrictMath.pow(fArr[i2] - fArr2[i2], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    private Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFAdRevenueData(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFAdRevenueData(fArr2));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getRevenue(aFj1nSDK.getMediationNetwork, aFj1nSDK.getCurrencyIso4217Code, aFj1nSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component1.execute(new l(this, sensorEvent, 1));
        } else {
            I_(sensorEvent);
        }
    }

    private boolean AFAdRevenueData() {
        return this.component2[0] != null;
    }

    private boolean getRevenue(int i2, String str, String str2) {
        return this.getMediationNetwork == i2 && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    public final void getMediationNetwork(Map<AFj1nSDK, Map<String, Object>> map, boolean z) {
        if (!AFAdRevenueData()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getRevenue());
            return;
        }
        map.put(this, getRevenue());
        if (z) {
            int length = this.component2.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.component2[i2] = null;
            }
            int length2 = this.component4.length;
            for (int i3 = 0; i3 < length2; i3++) {
                this.component4[i3] = 0;
            }
            this.AFAdRevenueData = 0.0d;
            this.areAllFieldsValid = 0L;
        }
    }
}
