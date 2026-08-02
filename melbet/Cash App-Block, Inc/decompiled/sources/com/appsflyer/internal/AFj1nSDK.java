package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFj1nSDK implements SensorEventListener {
    private final String AFAdRevenueData;
    private final Executor component3;
    private long component4;
    private final String getCurrencyIso4217Code;
    private double getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component2 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    public AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type2 = sensor.getType();
        this.getMonetizationNetwork = type2;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFAdRevenueData = str;
        this.getRevenue = str.hashCode() + ((name.hashCode() + ((type2 + 31) * 31)) * 31);
        this.component3 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = copyOf;
            this.areAllFieldsValid[1] = currentTimeMillis;
            this.getMediationNetwork = getCurrencyIso4217Code(fArr3, copyOf);
            return;
        }
        if (Strings.DISK_CACHE_SIZE <= j - this.component4) {
            this.component4 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = currentTimeMillis;
                return;
            }
            double currencyIso4217Code = getCurrencyIso4217Code(fArr3, fArr);
            if (currencyIso4217Code > this.getMediationNetwork) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = currentTimeMillis;
                this.getMediationNetwork = currencyIso4217Code;
            }
        }
    }

    private static double getCurrencyIso4217Code(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> getMediationNetwork(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMonetizationNetwork));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.AFAdRevenueData);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMediationNetwork(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMediationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getRevenue(int i, String str, String str2) {
        return this.getMonetizationNetwork == i && this.getCurrencyIso4217Code.equals(str) && this.AFAdRevenueData.equals(str2);
    }

    public final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z) {
        if (!AFAdRevenueData()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMonetizationNetwork());
            return;
        }
        map.put(this, getMonetizationNetwork());
        if (z) {
            int length = this.component2.length;
            for (int i = 0; i < length; i++) {
                this.component2[i] = null;
            }
            int length2 = this.areAllFieldsValid.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.areAllFieldsValid[i2] = 0;
            }
            this.getMediationNetwork = 0.0d;
            this.component4 = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getRevenue(aFj1nSDK.getMonetizationNetwork, aFj1nSDK.getCurrencyIso4217Code, aFj1nSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component3.execute(new AFb1iSDK$$ExternalSyntheticLambda1(1, this, sensorEvent));
        } else {
            G_(sensorEvent);
        }
    }

    private boolean AFAdRevenueData() {
        return this.component2[0] != null;
    }
}
