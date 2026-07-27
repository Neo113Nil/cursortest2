package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class AFj1mSDK implements AFj1oSDK {
    private static final BitSet component1;
    final Object AFAdRevenueData;
    private final Map<AFj1nSDK, Map<String, Object>> areAllFieldsValid;
    private final ExecutorService component2;
    private final SensorManager component3;
    private final Map<AFj1nSDK, AFj1nSDK> component4;
    private final Runnable copydefault;
    final Handler getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Runnable getRevenue;
    private boolean hashCode;

    static {
        BitSet bitSet = new BitSet(6);
        component1 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        synchronized (this.AFAdRevenueData) {
            this.getCurrencyIso4217Code.post(new AFj1mSDK$$ExternalSyntheticLambda0(this));
        }
    }

    private AFj1mSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFAdRevenueData = new Object();
        BitSet bitSet = component1;
        this.component4 = new HashMap(bitSet.size());
        this.areAllFieldsValid = new ConcurrentHashMap(bitSet.size());
        this.getRevenue = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.AFAdRevenueData) {
                    AFj1mSDK.this.getMonetizationNetwork();
                    AFj1mSDK.this.getCurrencyIso4217Code.postDelayed(AFj1mSDK.this.getMonetizationNetwork, 150L);
                    AFj1mSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFj1mSDK.this.component3();
            }
        };
        this.copydefault = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.AFAdRevenueData) {
                    if (AFj1mSDK.this.getMediationNetwork) {
                        AFj1mSDK.this.getCurrencyIso4217Code.removeCallbacks(AFj1mSDK.this.getRevenue);
                        AFj1mSDK.this.getCurrencyIso4217Code.removeCallbacks(AFj1mSDK.this.getMonetizationNetwork);
                        AFj1mSDK.this.AFAdRevenueData();
                        AFj1mSDK.this.getMediationNetwork = false;
                    }
                }
            }
        };
        this.component3 = sensorManager;
        this.getCurrencyIso4217Code = handler;
        this.component2 = executorService;
    }

    private static boolean AFAdRevenueData(int i) {
        return i >= 0 && component1.get(i);
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final void getMediationNetwork() {
        this.getCurrencyIso4217Code.post(this.copydefault);
        this.getCurrencyIso4217Code.post(this.getRevenue);
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final synchronized void getRevenue() {
        this.getCurrencyIso4217Code.post(this.copydefault);
    }

    final void getMonetizationNetwork() {
        this.getCurrencyIso4217Code.post(new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1mSDK.this.component4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        try {
            for (Sensor sensor : this.component3.getSensorList(-1)) {
                if (AFAdRevenueData(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component2);
                    if (!this.component4.containsKey(aFj1nSDK)) {
                        this.component4.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component3.registerListener(this.component4.get(aFj1nSDK), sensor, 1, this.getCurrencyIso4217Code);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.hashCode = true;
    }

    final void AFAdRevenueData() {
        this.getCurrencyIso4217Code.post(new AFj1mSDK$$ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid() {
        try {
            if (!this.component4.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.component4.values()) {
                    this.component3.unregisterListener(aFj1nSDK);
                    aFj1nSDK.getMediationNetwork(this.areAllFieldsValid, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.hashCode = false;
    }

    private List<Map<String, Object>> component1() {
        synchronized (this.AFAdRevenueData) {
            Iterator<AFj1nSDK> it = this.component4.values().iterator();
            while (it.hasNext()) {
                it.next().getMediationNetwork(this.areAllFieldsValid, true);
            }
            if (this.areAllFieldsValid.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
        }
    }

    private List<Map<String, Object>> component2() {
        synchronized (this.AFAdRevenueData) {
            if (!this.component4.isEmpty() && this.hashCode) {
                Iterator<AFj1nSDK> it = this.component4.values().iterator();
                while (it.hasNext()) {
                    it.next().getMediationNetwork(this.areAllFieldsValid, false);
                }
            }
            if (this.areAllFieldsValid.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
        }
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> component2 = component2();
        if (!component2.isEmpty()) {
            concurrentHashMap.put("sensors", component2);
        } else {
            List<Map<String, Object>> component12 = component1();
            if (!component12.isEmpty()) {
                concurrentHashMap.put("sensors", component12);
            }
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1mSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
