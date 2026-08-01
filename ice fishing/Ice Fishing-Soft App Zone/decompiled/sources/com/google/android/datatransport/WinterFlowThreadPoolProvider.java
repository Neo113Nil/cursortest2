package com.google.android.datatransport;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolProvider implements Executor, Closeable {
    public final WinterFlowFunctionSession WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final WinterFlowFunctionSession WinterFlowSyntax;
    public final WinterFlowProxyArray WinterFlowTransactionAgent;
    public final int WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowServerProtocol = AtomicLongFieldUpdater.newUpdater(WinterFlowThreadPoolProvider.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowThreadListener = AtomicLongFieldUpdater.newUpdater(WinterFlowThreadPoolProvider.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowServiceUtility = AtomicIntegerFieldUpdater.newUpdater(WinterFlowThreadPoolProvider.class, "_isTerminated$volatile");
    public static final WinterFlowJSONDecorator WinterFlowBandwidthObject = new WinterFlowJSONDecorator(25, "NOT_IN_STACK");

    public WinterFlowThreadPoolProvider(int i, int i2, long j, String str) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = str;
        if (i < 1) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(i, " should be at least 1", "Core pool size ");
            throw null;
        }
        if (i2 < i) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(i2, " should not exceed maximal supported number of threads 2097150", "Max pool size ");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.WinterFlowSyntax = new WinterFlowFunctionSession();
        this.WinterFlowResponseEngine = new WinterFlowFunctionSession();
        this.WinterFlowTransactionAgent = new WinterFlowProxyArray((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void WinterFlowTransactionManagerStrategy(WinterFlowThreadPoolProvider winterFlowThreadPoolProvider, Runnable runnable, int i) {
        winterFlowThreadPoolProvider.WinterFlowArrayNetwork(runnable, false, (i & 4) == 0);
    }

    public final void WinterFlowArrayNetwork(Runnable runnable, boolean z, boolean z2) {
        WinterFlowUIQuery winterFlowServiceProviderFunction;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork;
        WinterFlowSerializerSystem.WinterFlowTransactionManagerStrategy.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof WinterFlowUIQuery) {
            winterFlowServiceProviderFunction = (WinterFlowUIQuery) runnable;
            winterFlowServiceProviderFunction.WinterFlowVariableVersionControl = nanoTime;
            winterFlowServiceProviderFunction.WinterFlowTransactionManagerStrategy = z;
        } else {
            winterFlowServiceProviderFunction = new WinterFlowServiceProviderFunction(runnable, nanoTime, z);
        }
        boolean z3 = winterFlowServiceProviderFunction.WinterFlowTransactionManagerStrategy;
        AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowThreadListener;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        WinterFlowValidatorRuntime winterFlowValidatorRuntime = currentThread instanceof WinterFlowValidatorRuntime ? (WinterFlowValidatorRuntime) currentThread : null;
        if (winterFlowValidatorRuntime == null || winterFlowValidatorRuntime.WinterFlowServerProtocol != this) {
            winterFlowValidatorRuntime = null;
        }
        if (winterFlowValidatorRuntime != null && (winterFlowDatabaseNetwork = winterFlowValidatorRuntime.WinterFlowUnitTestResponse) != WinterFlowDatabaseNetwork.WinterFlowSyntax && (winterFlowServiceProviderFunction.WinterFlowTransactionManagerStrategy || winterFlowDatabaseNetwork != WinterFlowDatabaseNetwork.WinterFlowTransactionManagerStrategy)) {
            winterFlowValidatorRuntime.WinterFlowTransactionAgent = true;
            WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = winterFlowValidatorRuntime.WinterFlowVariableVersionControl;
            if (z2) {
                winterFlowServiceProviderFunction = winterFlowSessionManagerMechanism.WinterFlowRouterStructure(winterFlowServiceProviderFunction);
            } else {
                winterFlowSessionManagerMechanism.getClass();
                WinterFlowUIQuery winterFlowUIQuery = (WinterFlowUIQuery) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getAndSetObject(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy, winterFlowServiceProviderFunction);
                winterFlowServiceProviderFunction = winterFlowUIQuery == null ? null : winterFlowSessionManagerMechanism.WinterFlowRouterStructure(winterFlowUIQuery);
            }
        }
        if (winterFlowServiceProviderFunction != null) {
            if (!(winterFlowServiceProviderFunction.WinterFlowTransactionManagerStrategy ? this.WinterFlowResponseEngine.WinterFlowRouterStructure(winterFlowServiceProviderFunction) : this.WinterFlowSyntax.WinterFlowRouterStructure(winterFlowServiceProviderFunction))) {
                throw new RejectedExecutionException(this.WinterFlowRouterRouter + " was terminated");
            }
        }
        boolean z4 = z2 && winterFlowValidatorRuntime != null;
        if (z3) {
            if (z4 || WinterFlowThreadListener() || WinterFlowTransactionAgent(addAndGet)) {
                return;
            }
            WinterFlowThreadListener();
            return;
        }
        if (z4 || WinterFlowThreadListener() || WinterFlowTransactionAgent(atomicLongFieldUpdater.get(this))) {
            return;
        }
        WinterFlowThreadListener();
    }

    public final int WinterFlowHookDataSource() {
        synchronized (this.WinterFlowTransactionAgent) {
            try {
                if (WinterFlowServiceUtility.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowThreadListener;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.WinterFlowVariableVersionControl) {
                    return 0;
                }
                if (i >= this.WinterFlowTransactionManagerStrategy) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.WinterFlowTransactionAgent.WinterFlowHookDataSource(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                WinterFlowValidatorRuntime winterFlowValidatorRuntime = new WinterFlowValidatorRuntime(this, i3);
                this.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(i3, winterFlowValidatorRuntime);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                winterFlowValidatorRuntime.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void WinterFlowRouterRouter(WinterFlowValidatorRuntime winterFlowValidatorRuntime, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowServerProtocol;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object WinterFlowCacheManagerAgent = winterFlowValidatorRuntime.WinterFlowCacheManagerAgent();
                    while (true) {
                        if (WinterFlowCacheManagerAgent == WinterFlowBandwidthObject) {
                            i3 = -1;
                            break;
                        }
                        if (WinterFlowCacheManagerAgent == null) {
                            i3 = 0;
                            break;
                        }
                        WinterFlowValidatorRuntime winterFlowValidatorRuntime2 = (WinterFlowValidatorRuntime) WinterFlowCacheManagerAgent;
                        int WinterFlowHookDataSource = winterFlowValidatorRuntime2.WinterFlowHookDataSource();
                        if (WinterFlowHookDataSource != 0) {
                            i3 = WinterFlowHookDataSource;
                            break;
                        }
                        WinterFlowCacheManagerAgent = winterFlowValidatorRuntime2.WinterFlowCacheManagerAgent();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                WinterFlowThreadPoolProvider winterFlowThreadPoolProvider = this;
                if (atomicLongFieldUpdater.compareAndSet(winterFlowThreadPoolProvider, j, j3)) {
                    return;
                } else {
                    this = winterFlowThreadPoolProvider;
                }
            }
        }
    }

    public final boolean WinterFlowThreadListener() {
        WinterFlowThreadPoolProvider winterFlowThreadPoolProvider;
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowServerProtocol;
            long j = atomicLongFieldUpdater.get(this);
            WinterFlowValidatorRuntime winterFlowValidatorRuntime = (WinterFlowValidatorRuntime) this.WinterFlowTransactionAgent.WinterFlowHookDataSource((int) (2097151 & j));
            if (winterFlowValidatorRuntime == null) {
                winterFlowValidatorRuntime = null;
                winterFlowThreadPoolProvider = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object WinterFlowCacheManagerAgent = winterFlowValidatorRuntime.WinterFlowCacheManagerAgent();
                while (true) {
                    winterFlowJSONDecorator = WinterFlowBandwidthObject;
                    if (WinterFlowCacheManagerAgent == winterFlowJSONDecorator) {
                        i = -1;
                        break;
                    }
                    if (WinterFlowCacheManagerAgent == null) {
                        i = 0;
                        break;
                    }
                    WinterFlowValidatorRuntime winterFlowValidatorRuntime2 = (WinterFlowValidatorRuntime) WinterFlowCacheManagerAgent;
                    i = winterFlowValidatorRuntime2.WinterFlowHookDataSource();
                    if (i != 0) {
                        break;
                    }
                    WinterFlowCacheManagerAgent = winterFlowValidatorRuntime2.WinterFlowCacheManagerAgent();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    WinterFlowThreadPoolProvider winterFlowThreadPoolProvider2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(winterFlowThreadPoolProvider2, j, j2 | i);
                    winterFlowThreadPoolProvider = winterFlowThreadPoolProvider2;
                    if (compareAndSet) {
                        winterFlowValidatorRuntime.WinterFlowUnitTestResponse(winterFlowJSONDecorator);
                    }
                    this = winterFlowThreadPoolProvider;
                } else {
                    continue;
                }
            }
            if (winterFlowValidatorRuntime == null) {
                return false;
            }
            if (WinterFlowValidatorRuntime.WinterFlowThreadListener.compareAndSet(winterFlowValidatorRuntime, -1, 0)) {
                LockSupport.unpark(winterFlowValidatorRuntime);
                return true;
            }
            this = winterFlowThreadPoolProvider;
        }
    }

    public final boolean WinterFlowTransactionAgent(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.WinterFlowVariableVersionControl;
        if (i < i2) {
            int WinterFlowHookDataSource = WinterFlowHookDataSource();
            if (WinterFlowHookDataSource == 1 && i2 > 1) {
                WinterFlowHookDataSource();
            }
            if (WinterFlowHookDataSource > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        WinterFlowUIQuery winterFlowUIQuery;
        if (WinterFlowServiceUtility.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            WinterFlowValidatorRuntime winterFlowValidatorRuntime = currentThread instanceof WinterFlowValidatorRuntime ? (WinterFlowValidatorRuntime) currentThread : null;
            if (winterFlowValidatorRuntime == null || winterFlowValidatorRuntime.WinterFlowServerProtocol != this) {
                winterFlowValidatorRuntime = null;
            }
            synchronized (this.WinterFlowTransactionAgent) {
                i = (int) (WinterFlowThreadListener.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object WinterFlowHookDataSource = this.WinterFlowTransactionAgent.WinterFlowHookDataSource(i2);
                    WinterFlowHookDataSource.getClass();
                    WinterFlowValidatorRuntime winterFlowValidatorRuntime2 = (WinterFlowValidatorRuntime) WinterFlowHookDataSource;
                    if (winterFlowValidatorRuntime2 != winterFlowValidatorRuntime) {
                        while (winterFlowValidatorRuntime2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(winterFlowValidatorRuntime2);
                            winterFlowValidatorRuntime2.join(10000L);
                        }
                        WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = winterFlowValidatorRuntime2.WinterFlowVariableVersionControl;
                        WinterFlowFunctionSession winterFlowFunctionSession = this.WinterFlowResponseEngine;
                        winterFlowSessionManagerMechanism.getClass();
                        WinterFlowUIQuery winterFlowUIQuery2 = (WinterFlowUIQuery) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getAndSetObject(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy, (Object) null);
                        if (winterFlowUIQuery2 != null) {
                            winterFlowFunctionSession.WinterFlowRouterStructure(winterFlowUIQuery2);
                        }
                        while (true) {
                            WinterFlowUIQuery WinterFlowCacheManagerAgent = winterFlowSessionManagerMechanism.WinterFlowCacheManagerAgent();
                            if (WinterFlowCacheManagerAgent == null) {
                                break;
                            } else {
                                winterFlowFunctionSession.WinterFlowRouterStructure(WinterFlowCacheManagerAgent);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.WinterFlowResponseEngine.WinterFlowHookDataSource();
            this.WinterFlowSyntax.WinterFlowHookDataSource();
            while (true) {
                if (winterFlowValidatorRuntime != null) {
                    winterFlowUIQuery = winterFlowValidatorRuntime.WinterFlowRouterStructure(true);
                }
                winterFlowUIQuery = (WinterFlowUIQuery) this.WinterFlowSyntax.WinterFlowArrayNetwork();
                if (winterFlowUIQuery == null && (winterFlowUIQuery = (WinterFlowUIQuery) this.WinterFlowResponseEngine.WinterFlowArrayNetwork()) == null) {
                    break;
                }
                try {
                    winterFlowUIQuery.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (winterFlowValidatorRuntime != null) {
                winterFlowValidatorRuntime.WinterFlowRouterRouter(WinterFlowDatabaseNetwork.WinterFlowSyntax);
            }
            WinterFlowServerProtocol.set(this, 0L);
            WinterFlowThreadListener.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WinterFlowTransactionManagerStrategy(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        WinterFlowProxyArray winterFlowProxyArray = this.WinterFlowTransactionAgent;
        int WinterFlowRouterStructure = winterFlowProxyArray.WinterFlowRouterStructure();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < WinterFlowRouterStructure; i6++) {
            WinterFlowValidatorRuntime winterFlowValidatorRuntime = (WinterFlowValidatorRuntime) winterFlowProxyArray.WinterFlowHookDataSource(i6);
            if (winterFlowValidatorRuntime != null) {
                WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = winterFlowValidatorRuntime.WinterFlowVariableVersionControl;
                winterFlowSessionManagerMechanism.getClass();
                Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy);
                int WinterFlowHookDataSource = winterFlowSessionManagerMechanism.WinterFlowHookDataSource();
                if (objectVolatile != null) {
                    WinterFlowHookDataSource++;
                }
                int ordinal = winterFlowValidatorRuntime.WinterFlowUnitTestResponse.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(WinterFlowHookDataSource);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(WinterFlowHookDataSource);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (WinterFlowHookDataSource > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(WinterFlowHookDataSource);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = WinterFlowThreadListener.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.WinterFlowRouterRouter);
        sb4.append('@');
        sb4.append(WinterFlowQuerySyntax.WinterFlowBandwidthObject(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.WinterFlowVariableVersionControl;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.WinterFlowTransactionManagerStrategy);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.WinterFlowSyntax.WinterFlowCacheManagerAgent());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.WinterFlowResponseEngine.WinterFlowCacheManagerAgent());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
