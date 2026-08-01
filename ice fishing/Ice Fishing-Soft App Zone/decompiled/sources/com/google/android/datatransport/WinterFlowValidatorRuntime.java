package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorRuntime extends Thread {
    public int WinterFlowResponseEngine;
    public long WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowThreadPoolProvider WinterFlowServerProtocol;
    public long WinterFlowSyntax;
    public boolean WinterFlowTransactionAgent;
    public final WinterFlowBandwidthCache WinterFlowTransactionManagerStrategy;
    public WinterFlowDatabaseNetwork WinterFlowUnitTestResponse;
    public final WinterFlowSessionManagerMechanism WinterFlowVariableVersionControl;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowThreadListener = AtomicIntegerFieldUpdater.newUpdater(WinterFlowValidatorRuntime.class, "workerCtl$volatile");
    public static final /* synthetic */ long WinterFlowServiceUtility = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowValidatorRuntime.class.getDeclaredField("workerCtl$volatile"));

    public WinterFlowValidatorRuntime(WinterFlowThreadPoolProvider winterFlowThreadPoolProvider, int i) {
        this.WinterFlowServerProtocol = winterFlowThreadPoolProvider;
        setDaemon(true);
        setContextClassLoader(WinterFlowThreadPoolProvider.class.getClassLoader());
        this.WinterFlowVariableVersionControl = new WinterFlowSessionManagerMechanism();
        this.WinterFlowTransactionManagerStrategy = new WinterFlowBandwidthCache();
        this.WinterFlowUnitTestResponse = WinterFlowDatabaseNetwork.WinterFlowRouterRouter;
        this.nextParkedWorker = WinterFlowThreadPoolProvider.WinterFlowBandwidthObject;
        int nanoTime = (int) System.nanoTime();
        this.WinterFlowResponseEngine = nanoTime == 0 ? 42 : nanoTime;
        WinterFlowTransactionManagerStrategy(i);
    }

    public final int WinterFlowArrayNetwork(int i) {
        int i2 = this.WinterFlowResponseEngine;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.WinterFlowResponseEngine = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final Object WinterFlowCacheManagerAgent() {
        return this.nextParkedWorker;
    }

    public final int WinterFlowHookDataSource() {
        return this.indexInArray;
    }

    public final boolean WinterFlowRouterRouter(WinterFlowDatabaseNetwork winterFlowDatabaseNetwork) {
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork2 = this.WinterFlowUnitTestResponse;
        boolean z = winterFlowDatabaseNetwork2 == WinterFlowDatabaseNetwork.WinterFlowVariableVersionControl;
        if (z) {
            WinterFlowThreadPoolProvider.WinterFlowThreadListener.addAndGet(this.WinterFlowServerProtocol, 4398046511104L);
        }
        if (winterFlowDatabaseNetwork2 != winterFlowDatabaseNetwork) {
            this.WinterFlowUnitTestResponse = winterFlowDatabaseNetwork;
        }
        return z;
    }

    public final WinterFlowUIQuery WinterFlowRouterStructure(boolean z) {
        WinterFlowUIQuery WinterFlowVariableVersionControl;
        WinterFlowUIQuery WinterFlowVariableVersionControl2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork = this.WinterFlowUnitTestResponse;
        WinterFlowThreadPoolProvider winterFlowThreadPoolProvider = this.WinterFlowServerProtocol;
        WinterFlowUIQuery winterFlowUIQuery = null;
        WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork2 = WinterFlowDatabaseNetwork.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseNetwork != winterFlowDatabaseNetwork2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowThreadPoolProvider.WinterFlowThreadListener;
            do {
                j = atomicLongFieldUpdater.get(winterFlowThreadPoolProvider);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    winterFlowSessionManagerMechanism.getClass();
                    long j2 = WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy;
                    loop1: while (true) {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        WinterFlowUIQuery winterFlowUIQuery2 = (WinterFlowUIQuery) unsafe.getObjectVolatile(winterFlowSessionManagerMechanism, j2);
                        if (winterFlowUIQuery2 != null && winterFlowUIQuery2.WinterFlowTransactionManagerStrategy) {
                            do {
                                unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                                if (unsafe2.compareAndSwapObject(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy, winterFlowUIQuery2, (Object) null)) {
                                    winterFlowUIQuery = winterFlowUIQuery2;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(winterFlowSessionManagerMechanism, j2) == winterFlowUIQuery2);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowVariableVersionControl);
                    int intVolatile2 = unsafe.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowUnitTestResponse);
                    while (true) {
                        if (intVolatile == intVolatile2 || WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowArrayNetwork) == 0) {
                            break;
                        }
                        intVolatile2--;
                        WinterFlowUIQuery WinterFlowArrayNetwork = winterFlowSessionManagerMechanism.WinterFlowArrayNetwork(intVolatile2, true);
                        if (WinterFlowArrayNetwork != null) {
                            winterFlowUIQuery = WinterFlowArrayNetwork;
                            break;
                        }
                    }
                    if (winterFlowUIQuery != null) {
                        return winterFlowUIQuery;
                    }
                    WinterFlowUIQuery winterFlowUIQuery3 = (WinterFlowUIQuery) winterFlowThreadPoolProvider.WinterFlowResponseEngine.WinterFlowArrayNetwork();
                    return winterFlowUIQuery3 == null ? WinterFlowSyntax(1) : winterFlowUIQuery3;
                }
            } while (!WinterFlowThreadPoolProvider.WinterFlowThreadListener.compareAndSet(winterFlowThreadPoolProvider, j, j - 4398046511104L));
            this.WinterFlowUnitTestResponse = winterFlowDatabaseNetwork2;
        }
        if (z) {
            boolean z2 = WinterFlowArrayNetwork(winterFlowThreadPoolProvider.WinterFlowVariableVersionControl * 2) == 0;
            if (z2 && (WinterFlowVariableVersionControl2 = WinterFlowVariableVersionControl()) != null) {
                return WinterFlowVariableVersionControl2;
            }
            winterFlowSessionManagerMechanism.getClass();
            WinterFlowUIQuery winterFlowUIQuery4 = (WinterFlowUIQuery) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getAndSetObject(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy, (Object) null);
            if (winterFlowUIQuery4 == null) {
                winterFlowUIQuery4 = winterFlowSessionManagerMechanism.WinterFlowCacheManagerAgent();
            }
            if (winterFlowUIQuery4 != null) {
                return winterFlowUIQuery4;
            }
            if (!z2 && (WinterFlowVariableVersionControl = WinterFlowVariableVersionControl()) != null) {
                return WinterFlowVariableVersionControl;
            }
        } else {
            WinterFlowUIQuery WinterFlowVariableVersionControl3 = WinterFlowVariableVersionControl();
            if (WinterFlowVariableVersionControl3 != null) {
                return WinterFlowVariableVersionControl3;
            }
        }
        return WinterFlowSyntax(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowUIQuery WinterFlowSyntax(int i) {
        int i2;
        long j;
        WinterFlowUIQuery winterFlowUIQuery;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowThreadPoolProvider.WinterFlowThreadListener;
        WinterFlowThreadPoolProvider winterFlowThreadPoolProvider = this.WinterFlowServerProtocol;
        int i4 = (int) (atomicLongFieldUpdater.get(winterFlowThreadPoolProvider) & 2097151);
        WinterFlowUIQuery winterFlowUIQuery2 = null;
        if (i4 < 2) {
            return null;
        }
        int WinterFlowArrayNetwork = WinterFlowArrayNetwork(i4);
        int i5 = 0;
        long j4 = Long.MAX_VALUE;
        while (i5 < i4) {
            WinterFlowArrayNetwork++;
            if (WinterFlowArrayNetwork > i4) {
                WinterFlowArrayNetwork = 1;
            }
            WinterFlowValidatorRuntime winterFlowValidatorRuntime = (WinterFlowValidatorRuntime) winterFlowThreadPoolProvider.WinterFlowTransactionAgent.WinterFlowHookDataSource(WinterFlowArrayNetwork);
            if (winterFlowValidatorRuntime == null || winterFlowValidatorRuntime == this) {
                i2 = i4;
            } else {
                WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = winterFlowValidatorRuntime.WinterFlowVariableVersionControl;
                if (i3 == 3) {
                    winterFlowUIQuery = winterFlowSessionManagerMechanism.WinterFlowCacheManagerAgent();
                    i2 = i4;
                    j = 0;
                } else {
                    winterFlowSessionManagerMechanism.getClass();
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    int intVolatile = unsafe2.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowVariableVersionControl);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowUnitTestResponse);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(winterFlowSessionManagerMechanism, WinterFlowSessionManagerMechanism.WinterFlowArrayNetwork) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        WinterFlowUIQuery WinterFlowArrayNetwork2 = winterFlowSessionManagerMechanism.WinterFlowArrayNetwork(intVolatile, z);
                        if (WinterFlowArrayNetwork2 != null) {
                            winterFlowUIQuery = WinterFlowArrayNetwork2;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    winterFlowUIQuery = winterFlowUIQuery2;
                }
                WinterFlowBandwidthCache winterFlowBandwidthCache = this.WinterFlowTransactionManagerStrategy;
                if (winterFlowUIQuery == null) {
                    j2 = -1;
                    long j5 = WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy;
                    while (true) {
                        WinterFlowUIQuery winterFlowUIQuery3 = (WinterFlowUIQuery) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowSessionManagerMechanism, j5);
                        if (winterFlowUIQuery3 == null) {
                            break;
                        }
                        if (((winterFlowUIQuery3.WinterFlowTransactionManagerStrategy ? 1 : 2) & i) == 0) {
                            break;
                        }
                        WinterFlowSerializerSystem.WinterFlowTransactionManagerStrategy.getClass();
                        WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism2 = winterFlowSessionManagerMechanism;
                        long nanoTime = System.nanoTime() - winterFlowUIQuery3.WinterFlowVariableVersionControl;
                        long j6 = WinterFlowSerializerSystem.WinterFlowHookDataSource;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                            if (unsafe.compareAndSwapObject(winterFlowSessionManagerMechanism2, WinterFlowSessionManagerMechanism.WinterFlowTransactionManagerStrategy, winterFlowUIQuery3, (Object) null)) {
                                winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowUIQuery3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(winterFlowSessionManagerMechanism2, j5) == winterFlowUIQuery3);
                        winterFlowSessionManagerMechanism = winterFlowSessionManagerMechanism2;
                    }
                } else {
                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowUIQuery;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    WinterFlowUIQuery winterFlowUIQuery4 = (WinterFlowUIQuery) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = null;
                    return winterFlowUIQuery4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            winterFlowUIQuery2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.WinterFlowSyntax = j4;
        return null;
    }

    public final void WinterFlowTransactionManagerStrategy(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.WinterFlowServerProtocol.WinterFlowRouterRouter);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void WinterFlowUnitTestResponse(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final WinterFlowUIQuery WinterFlowVariableVersionControl() {
        int WinterFlowArrayNetwork = WinterFlowArrayNetwork(2);
        WinterFlowThreadPoolProvider winterFlowThreadPoolProvider = this.WinterFlowServerProtocol;
        WinterFlowFunctionSession winterFlowFunctionSession = winterFlowThreadPoolProvider.WinterFlowResponseEngine;
        WinterFlowFunctionSession winterFlowFunctionSession2 = winterFlowThreadPoolProvider.WinterFlowSyntax;
        if (WinterFlowArrayNetwork == 0) {
            WinterFlowUIQuery winterFlowUIQuery = (WinterFlowUIQuery) winterFlowFunctionSession2.WinterFlowArrayNetwork();
            return winterFlowUIQuery != null ? winterFlowUIQuery : (WinterFlowUIQuery) winterFlowFunctionSession.WinterFlowArrayNetwork();
        }
        WinterFlowUIQuery winterFlowUIQuery2 = (WinterFlowUIQuery) winterFlowFunctionSession.WinterFlowArrayNetwork();
        return winterFlowUIQuery2 != null ? winterFlowUIQuery2 : (WinterFlowUIQuery) winterFlowFunctionSession2.WinterFlowArrayNetwork();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork;
        loop0: while (true) {
            boolean z = false;
            while (WinterFlowThreadPoolProvider.WinterFlowServiceUtility.get(this.WinterFlowServerProtocol) == 0) {
                WinterFlowDatabaseNetwork winterFlowDatabaseNetwork2 = this.WinterFlowUnitTestResponse;
                WinterFlowDatabaseNetwork winterFlowDatabaseNetwork3 = WinterFlowDatabaseNetwork.WinterFlowSyntax;
                if (winterFlowDatabaseNetwork2 == winterFlowDatabaseNetwork3) {
                    break loop0;
                }
                WinterFlowUIQuery WinterFlowRouterStructure = WinterFlowRouterStructure(this.WinterFlowTransactionAgent);
                if (WinterFlowRouterStructure != null) {
                    this.WinterFlowSyntax = 0L;
                    WinterFlowThreadPoolProvider winterFlowThreadPoolProvider = this.WinterFlowServerProtocol;
                    this.WinterFlowRouterRouter = 0L;
                    if (this.WinterFlowUnitTestResponse == WinterFlowDatabaseNetwork.WinterFlowUnitTestResponse) {
                        this.WinterFlowUnitTestResponse = WinterFlowDatabaseNetwork.WinterFlowTransactionManagerStrategy;
                    }
                    if (WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy) {
                        if (WinterFlowRouterRouter(WinterFlowDatabaseNetwork.WinterFlowTransactionManagerStrategy) && !winterFlowThreadPoolProvider.WinterFlowThreadListener() && !winterFlowThreadPoolProvider.WinterFlowTransactionAgent(WinterFlowThreadPoolProvider.WinterFlowThreadListener.get(winterFlowThreadPoolProvider))) {
                            winterFlowThreadPoolProvider.WinterFlowThreadListener();
                        }
                        try {
                            WinterFlowRouterStructure.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        WinterFlowThreadPoolProvider.WinterFlowThreadListener.addAndGet(winterFlowThreadPoolProvider, -2097152L);
                        if (this.WinterFlowUnitTestResponse != winterFlowDatabaseNetwork3) {
                            this.WinterFlowUnitTestResponse = WinterFlowDatabaseNetwork.WinterFlowRouterRouter;
                        }
                    } else {
                        try {
                            WinterFlowRouterStructure.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.WinterFlowTransactionAgent = false;
                    if (this.WinterFlowSyntax == 0) {
                        Object obj = this.nextParkedWorker;
                        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowThreadPoolProvider.WinterFlowBandwidthObject;
                        if (obj != winterFlowJSONDecorator) {
                            int i = -1;
                            WinterFlowQueueThreadPool.WinterFlowRouterStructure.putIntVolatile(this, WinterFlowServiceUtility, -1);
                            while (this.nextParkedWorker != WinterFlowThreadPoolProvider.WinterFlowBandwidthObject) {
                                Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                                long j = WinterFlowServiceUtility;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    WinterFlowThreadPoolProvider winterFlowThreadPoolProvider2 = this.WinterFlowServerProtocol;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = WinterFlowThreadPoolProvider.WinterFlowServiceUtility;
                                    if (atomicIntegerFieldUpdater.get(winterFlowThreadPoolProvider2) != 0) {
                                        break;
                                    }
                                    WinterFlowDatabaseNetwork winterFlowDatabaseNetwork4 = this.WinterFlowUnitTestResponse;
                                    WinterFlowDatabaseNetwork winterFlowDatabaseNetwork5 = WinterFlowDatabaseNetwork.WinterFlowSyntax;
                                    if (winterFlowDatabaseNetwork4 == winterFlowDatabaseNetwork5) {
                                        break;
                                    }
                                    WinterFlowRouterRouter(WinterFlowDatabaseNetwork.WinterFlowUnitTestResponse);
                                    Thread.interrupted();
                                    if (this.WinterFlowRouterRouter == 0) {
                                        winterFlowDatabaseNetwork = winterFlowDatabaseNetwork5;
                                        this.WinterFlowRouterRouter = System.nanoTime() + this.WinterFlowServerProtocol.WinterFlowUnitTestResponse;
                                    } else {
                                        winterFlowDatabaseNetwork = winterFlowDatabaseNetwork5;
                                    }
                                    LockSupport.parkNanos(this.WinterFlowServerProtocol.WinterFlowUnitTestResponse);
                                    if (System.nanoTime() - this.WinterFlowRouterRouter >= 0) {
                                        this.WinterFlowRouterRouter = 0L;
                                        WinterFlowThreadPoolProvider winterFlowThreadPoolProvider3 = this.WinterFlowServerProtocol;
                                        synchronized (winterFlowThreadPoolProvider3.WinterFlowTransactionAgent) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater.get(winterFlowThreadPoolProvider3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowThreadPoolProvider.WinterFlowThreadListener;
                                                    if (((int) (atomicLongFieldUpdater.get(winterFlowThreadPoolProvider3) & 2097151)) > winterFlowThreadPoolProvider3.WinterFlowVariableVersionControl) {
                                                        if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            WinterFlowTransactionManagerStrategy(0);
                                                            winterFlowThreadPoolProvider3.WinterFlowRouterRouter(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(winterFlowThreadPoolProvider3) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Object WinterFlowHookDataSource = winterFlowThreadPoolProvider3.WinterFlowTransactionAgent.WinterFlowHookDataSource(andDecrement);
                                                                WinterFlowHookDataSource.getClass();
                                                                WinterFlowValidatorRuntime winterFlowValidatorRuntime = (WinterFlowValidatorRuntime) WinterFlowHookDataSource;
                                                                winterFlowThreadPoolProvider3.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(i2, winterFlowValidatorRuntime);
                                                                winterFlowValidatorRuntime.WinterFlowTransactionManagerStrategy(i2);
                                                                winterFlowThreadPoolProvider3.WinterFlowRouterRouter(winterFlowValidatorRuntime, andDecrement, i2);
                                                            }
                                                            winterFlowThreadPoolProvider3.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(andDecrement, null);
                                                            this.WinterFlowUnitTestResponse = winterFlowDatabaseNetwork;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    i = -1;
                                }
                            }
                        } else {
                            WinterFlowThreadPoolProvider winterFlowThreadPoolProvider4 = this.WinterFlowServerProtocol;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = WinterFlowThreadPoolProvider.WinterFlowServerProtocol;
                            if (this.nextParkedWorker == winterFlowJSONDecorator) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(winterFlowThreadPoolProvider4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = winterFlowThreadPoolProvider4.WinterFlowTransactionAgent.WinterFlowHookDataSource((int) (j2 & 2097151));
                                    WinterFlowThreadPoolProvider winterFlowThreadPoolProvider5 = winterFlowThreadPoolProvider4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(winterFlowThreadPoolProvider5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    winterFlowThreadPoolProvider4 = winterFlowThreadPoolProvider5;
                                }
                            }
                        }
                    } else if (z) {
                        WinterFlowRouterRouter(WinterFlowDatabaseNetwork.WinterFlowUnitTestResponse);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.WinterFlowSyntax);
                        this.WinterFlowSyntax = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        WinterFlowRouterRouter(WinterFlowDatabaseNetwork.WinterFlowSyntax);
    }
}
