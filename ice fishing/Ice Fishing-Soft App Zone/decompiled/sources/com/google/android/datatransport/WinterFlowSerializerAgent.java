package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerAgent {
    public static final Object WinterFlowBandwidthObject = new Object();
    public static volatile ScheduledExecutorService WinterFlowServiceUtility;
    public ScheduledFuture WinterFlowArrayNetwork;
    public int WinterFlowCacheManagerAgent;
    public final PowerManager.WakeLock WinterFlowHookDataSource;
    public final String WinterFlowResponseEngine;
    public WinterFlowThreadPoolSession WinterFlowRouterRouter;
    public final Object WinterFlowRouterStructure;
    public final AtomicInteger WinterFlowServerProtocol;
    public final WinterFlowCacheUtility WinterFlowSyntax;
    public final ScheduledExecutorService WinterFlowThreadListener;
    public final HashMap WinterFlowTransactionAgent;
    public final HashSet WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public long WinterFlowVariableVersionControl;

    public WinterFlowSerializerAgent(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.WinterFlowRouterStructure = new Object();
        this.WinterFlowCacheManagerAgent = 0;
        this.WinterFlowTransactionManagerStrategy = new HashSet();
        this.WinterFlowUnitTestResponse = true;
        this.WinterFlowSyntax = WinterFlowCacheUtility.WinterFlowResolverController;
        this.WinterFlowTransactionAgent = new HashMap();
        this.WinterFlowServerProtocol = new AtomicInteger(0);
        WinterFlowUnitTestLibrary.WinterFlowOrchestrationSubsystem("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.WinterFlowRouterRouter = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.WinterFlowResponseEngine = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.WinterFlowResponseEngine = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new WinterFlowServerSystem(sb.toString());
        }
        this.WinterFlowHookDataSource = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = WinterFlowInheritanceNetwork.WinterFlowRouterStructure;
        synchronized (WinterFlowInheritanceNetwork.class) {
            Boolean bool = WinterFlowInheritanceNetwork.WinterFlowCacheManagerAgent;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = WinterFlowHandlerWebsocket.WinterFlowServerProtocol(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                WinterFlowInheritanceNetwork.WinterFlowCacheManagerAgent = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = WinterFlowDatabaseSchemaQuery.WinterFlowRouterStructure;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = WinterFlowInheritanceNetwork.WinterFlowHookDataSource;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = WinterFlowInheritanceNetwork.WinterFlowRouterStructure;
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
                    this.WinterFlowHookDataSource.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = WinterFlowServiceUtility;
        if (scheduledExecutorService == null) {
            synchronized (WinterFlowBandwidthObject) {
                try {
                    scheduledExecutorService = WinterFlowServiceUtility;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        WinterFlowServiceUtility = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.WinterFlowThreadListener = scheduledExecutorService;
    }

    public final void WinterFlowArrayNetwork() {
        HashSet hashSet = this.WinterFlowTransactionManagerStrategy;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
    }

    public final void WinterFlowCacheManagerAgent() {
        if (this.WinterFlowServerProtocol.decrementAndGet() < 0) {
            String.valueOf(this.WinterFlowResponseEngine).concat(" release without a matched acquire!");
        }
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (this.WinterFlowUnitTestResponse) {
                    TextUtils.isEmpty(null);
                }
                if (this.WinterFlowTransactionAgent.containsKey(null)) {
                    WinterFlowMapperModule winterFlowMapperModule = (WinterFlowMapperModule) this.WinterFlowTransactionAgent.get(null);
                    if (winterFlowMapperModule != null) {
                        int i = winterFlowMapperModule.WinterFlowRouterStructure - 1;
                        winterFlowMapperModule.WinterFlowRouterStructure = i;
                        if (i == 0) {
                            this.WinterFlowTransactionAgent.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.WinterFlowResponseEngine).concat(" counter does not exist");
                }
                WinterFlowVariableVersionControl();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean WinterFlowHookDataSource() {
        boolean z;
        synchronized (this.WinterFlowRouterStructure) {
            z = this.WinterFlowCacheManagerAgent > 0;
        }
        return z;
    }

    public final void WinterFlowRouterStructure() {
        this.WinterFlowServerProtocol.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (!WinterFlowHookDataSource()) {
                    this.WinterFlowRouterRouter = WinterFlowThreadPoolSession.WinterFlowVariableVersionControl;
                    this.WinterFlowHookDataSource.acquire();
                    this.WinterFlowSyntax.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.WinterFlowCacheManagerAgent++;
                if (this.WinterFlowUnitTestResponse) {
                    TextUtils.isEmpty(null);
                }
                WinterFlowMapperModule winterFlowMapperModule = (WinterFlowMapperModule) this.WinterFlowTransactionAgent.get(null);
                if (winterFlowMapperModule == null) {
                    winterFlowMapperModule = new WinterFlowMapperModule();
                    this.WinterFlowTransactionAgent.put(null, winterFlowMapperModule);
                }
                winterFlowMapperModule.WinterFlowRouterStructure++;
                this.WinterFlowSyntax.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.WinterFlowVariableVersionControl) {
                    this.WinterFlowVariableVersionControl = j;
                    ScheduledFuture scheduledFuture = this.WinterFlowArrayNetwork;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.WinterFlowArrayNetwork = this.WinterFlowThreadListener.schedule(new WinterFlowDeploymentSystem(14, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void WinterFlowVariableVersionControl() {
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (WinterFlowHookDataSource()) {
                    if (this.WinterFlowUnitTestResponse) {
                        int i = this.WinterFlowCacheManagerAgent - 1;
                        this.WinterFlowCacheManagerAgent = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.WinterFlowCacheManagerAgent = 0;
                    }
                    WinterFlowArrayNetwork();
                    Iterator it = this.WinterFlowTransactionAgent.values().iterator();
                    while (it.hasNext()) {
                        ((WinterFlowMapperModule) it.next()).WinterFlowRouterStructure = 0;
                    }
                    this.WinterFlowTransactionAgent.clear();
                    ScheduledFuture scheduledFuture = this.WinterFlowArrayNetwork;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.WinterFlowArrayNetwork = null;
                        this.WinterFlowVariableVersionControl = 0L;
                    }
                    if (this.WinterFlowHookDataSource.isHeld()) {
                        try {
                            try {
                                this.WinterFlowHookDataSource.release();
                                if (this.WinterFlowRouterRouter != null) {
                                    this.WinterFlowRouterRouter = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.WinterFlowResponseEngine).concat(" failed to release!");
                                if (this.WinterFlowRouterRouter != null) {
                                    this.WinterFlowRouterRouter = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.WinterFlowRouterRouter != null) {
                                this.WinterFlowRouterRouter = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.WinterFlowResponseEngine).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
