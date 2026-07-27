package androidx.versionedparcelable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524 {
    public static volatile ScheduledExecutorService CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    public static final Object EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = new Object();
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final PowerManager.WakeLock AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public MysticCacheProtocolRepositoryPyu3cL3GvtiXl6x2MW58356707852088 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public long LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final String NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final Object ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final HashMap ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public final ScheduledExecutorService ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
    public ScheduledFuture RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310 UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final HashSet YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final AtomicInteger ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;

    public QuantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new Object();
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 0;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new HashSet();
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = true;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942;
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = new HashMap();
        this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = new AtomicInteger(0);
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927(sb.toString());
        }
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        synchronized (JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.class) {
            Boolean bool = JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = EmeraldStackStateCompilerTl9OTxLgZuuRkXKHcJ26184265395232.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = CrimsonRouteExecutorAttributeMomQaj3H5PMvlUqGgR26107891851468.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
        if (scheduledExecutorService == null) {
            synchronized (EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111) {
                try {
                    scheduledExecutorService = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = scheduledExecutorService;
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        if (this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.decrementAndGet() < 0) {
            String.valueOf(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480).concat(" release without a matched acquire!");
        }
        synchronized (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            try {
                if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    TextUtils.isEmpty(null);
                }
                if (this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.containsKey(null)) {
                    LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 = (LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025) this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(null);
                    if (lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 != null) {
                        int i = lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 - 1;
                        lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
                        if (i == 0) {
                            this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480).concat(" counter does not exist");
                }
                LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        boolean z;
        synchronized (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            z = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 > 0;
        }
        return z;
    }

    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        synchronized (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            try {
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
                    if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                        int i = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 - 1;
                        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 0;
                    }
                    RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                    Iterator it = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.values().iterator();
                    while (it.hasNext()) {
                        ((LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
                    }
                    this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.clear();
                    ScheduledFuture scheduledFuture = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = null;
                        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0L;
                    }
                    if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.isHeld()) {
                        try {
                            try {
                                this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.release();
                                if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 != null) {
                                    this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480).concat(" failed to release!");
                                if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 != null) {
                                    this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 != null) {
                                this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            try {
                if (!AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
                    this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = MysticCacheProtocolRepositoryPyu3cL3GvtiXl6x2MW58356707852088.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.acquire();
                    this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495++;
                if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    TextUtils.isEmpty(null);
                }
                LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 = (LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025) this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(null);
                if (lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 == null) {
                    lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025 = new LunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025();
                    this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.put(null, lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025);
                }
                lunarNodeStreamConcurrencyW41cU10kbNK64HZSDO81544516220025.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800++;
                this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = j;
                    ScheduledFuture scheduledFuture = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.schedule(new XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050(12, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        HashSet hashSet = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
    }
}
