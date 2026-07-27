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

/* loaded from: classes4.dex */
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

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getRevenue = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component1 = executorService;
    }

    private static double getMediationNetwork(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> AFAdRevenueData(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component1.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1nSDK.this.I_(sensorEvent);
                }
            });
        } else {
            I_(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H_, reason: merged with bridge method [inline-methods] */
    public void I_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = copyOf;
            this.component4[1] = currentTimeMillis;
            this.AFAdRevenueData = getMediationNetwork(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.areAllFieldsValid) {
            this.areAllFieldsValid = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = currentTimeMillis;
                return;
            }
            double mediationNetwork = getMediationNetwork(fArr3, fArr);
            if (mediationNetwork > this.AFAdRevenueData) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = currentTimeMillis;
                this.AFAdRevenueData = mediationNetwork;
            }
        }
    }

    final void getMediationNetwork(Map<AFj1nSDK, Map<String, Object>> map, boolean z) {
        if (AFAdRevenueData()) {
            map.put(this, getRevenue());
            if (z) {
                int length = this.component2.length;
                for (int i = 0; i < length; i++) {
                    this.component2[i] = null;
                }
                int length2 = this.component4.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.component4[i2] = 0;
                }
                this.AFAdRevenueData = 0.0d;
                this.areAllFieldsValid = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, getRevenue());
    }

    private boolean getRevenue(int i, String str, String str2) {
        return this.getMediationNetwork == i && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
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

    private boolean AFAdRevenueData() {
        return this.component2[0] != null;
    }

    public final int hashCode() {
        return this.getRevenue;
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
}
