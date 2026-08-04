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

/* JADX INFO: loaded from: classes.dex */
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

    public AFj1mSDK(Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        synchronized (this.AFAdRevenueData) {
            this.getCurrencyIso4217Code.post(new r(this, 0));
        }
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

    public final void AFAdRevenueData() {
        this.getCurrencyIso4217Code.post(new r(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011 A[PHI: r1
      0x0011: PHI (r1v2 java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) = 
      (r1v0 java.util.List<java.util.Map<java.lang.String, java.lang.Object>>)
      (r1v1 java.util.List<java.util.Map<java.lang.String, java.lang.Object>>)
     binds: [B:3:0x000f, B:6:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFj1oSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listComponent2 = component2();
        if (listComponent2.isEmpty()) {
            listComponent2 = component1();
            if (!listComponent2.isEmpty()) {
                concurrentHashMap.put("sensors", listComponent2);
            }
        } else {
            concurrentHashMap.put("sensors", listComponent2);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final void getMediationNetwork() {
        this.getCurrencyIso4217Code.post(this.copydefault);
        this.getCurrencyIso4217Code.post(this.getRevenue);
    }

    public final void getMonetizationNetwork() {
        this.getCurrencyIso4217Code.post(new r(this, 1));
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final synchronized void getRevenue() {
        this.getCurrencyIso4217Code.post(this.copydefault);
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
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    aFj1mSDK.getCurrencyIso4217Code.postDelayed(aFj1mSDK.getMonetizationNetwork, 150L);
                    AFj1mSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getMonetizationNetwork = new r(this, 3);
        this.copydefault = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.AFAdRevenueData) {
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    if (aFj1mSDK.getMediationNetwork) {
                        aFj1mSDK.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK.getRevenue);
                        AFj1mSDK aFj1mSDK2 = AFj1mSDK.this;
                        aFj1mSDK2.getCurrencyIso4217Code.removeCallbacks(aFj1mSDK2.getMonetizationNetwork);
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

    private static boolean AFAdRevenueData(int i2) {
        return i2 >= 0 && component1.get(i2);
    }
}
