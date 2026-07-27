package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitGlide extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishEspressoTesting = AtomicIntegerFieldUpdater.newUpdater(CatchingFishRetrofitGlide.class, "workerCtl$volatile");
    public final /* synthetic */ CatchingFishSnackbarGraphQL CatchingFishCloudMessaging;
    public final CatchingFishRoomGoogleMaps CatchingFishDaggerWebsocket;
    public boolean CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final CatchingFishIntentAsyncTask CatchingFishReduxKtor;
    public long CatchingFishViewModelFAB;
    public long CatchingFishViewModelScope;
    public CatchingFishKtorHiltKtor CatchingFishWorkManager;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public CatchingFishRetrofitGlide(CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL, int i) {
        this.CatchingFishCloudMessaging = catchingFishSnackbarGraphQL;
        setDaemon(true);
        setContextClassLoader(CatchingFishSnackbarGraphQL.class.getClassLoader());
        this.CatchingFishReduxKtor = new CatchingFishIntentAsyncTask();
        this.CatchingFishDaggerWebsocket = new CatchingFishRoomGoogleMaps();
        this.CatchingFishWorkManager = CatchingFishKtorHiltKtor.CatchingFishViewModelScope;
        this.nextParkedWorker = CatchingFishSnackbarGraphQL.CatchingFishUnitTesting;
        int nanoTime = (int) System.nanoTime();
        this.CatchingFishLayout = nanoTime == 0 ? 42 : nanoTime;
        CatchingFishWorkManager(i);
    }

    public final Object CatchingFishCoroutine() {
        return this.nextParkedWorker;
    }

    public final CatchingFishServiceMoshiMVP CatchingFishDaggerWebsocket() {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(2);
        CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL = this.CatchingFishCloudMessaging;
        if (CatchingFishReduxKtor == 0) {
            CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) catchingFishSnackbarGraphQL.CatchingFishViewModelFAB.CatchingFishReduxKtor();
            return catchingFishServiceMoshiMVP != null ? catchingFishServiceMoshiMVP : (CatchingFishServiceMoshiMVP) catchingFishSnackbarGraphQL.CatchingFishLayout.CatchingFishReduxKtor();
        }
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP2 = (CatchingFishServiceMoshiMVP) catchingFishSnackbarGraphQL.CatchingFishLayout.CatchingFishReduxKtor();
        return catchingFishServiceMoshiMVP2 != null ? catchingFishServiceMoshiMVP2 : (CatchingFishServiceMoshiMVP) catchingFishSnackbarGraphQL.CatchingFishViewModelFAB.CatchingFishReduxKtor();
    }

    public final CatchingFishServiceMoshiMVP CatchingFishLayout(int i) {
        long j;
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP;
        long j2;
        long j3;
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting;
        CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL = this.CatchingFishCloudMessaging;
        int i2 = (int) (atomicLongFieldUpdater.get(catchingFishSnackbarGraphQL) & 2097151);
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP3 = null;
        if (i2 < 2) {
            return null;
        }
        int CatchingFishReduxKtor = CatchingFishReduxKtor(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            CatchingFishReduxKtor++;
            if (CatchingFishReduxKtor > i2) {
                CatchingFishReduxKtor = 1;
            }
            CatchingFishRetrofitGlide catchingFishRetrofitGlide = (CatchingFishRetrofitGlide) catchingFishSnackbarGraphQL.CatchingFishFragmentHandler.CatchingFishSnackbar(CatchingFishReduxKtor);
            if (catchingFishRetrofitGlide != null && catchingFishRetrofitGlide != this) {
                CatchingFishIntentAsyncTask catchingFishIntentAsyncTask = catchingFishRetrofitGlide.CatchingFishReduxKtor;
                if (i == 3) {
                    catchingFishServiceMoshiMVP = catchingFishIntentAsyncTask.CatchingFishSnackbar();
                    j = 0;
                } else {
                    catchingFishIntentAsyncTask.getClass();
                    int i4 = CatchingFishIntentAsyncTask.CatchingFishReduxKtor.get(catchingFishIntentAsyncTask);
                    int i5 = CatchingFishIntentAsyncTask.CatchingFishCoroutine.get(catchingFishIntentAsyncTask);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || CatchingFishIntentAsyncTask.CatchingFishDaggerWebsocket.get(catchingFishIntentAsyncTask) != 0) {
                            int i6 = i4 + 1;
                            catchingFishServiceMoshiMVP = catchingFishIntentAsyncTask.CatchingFishCoroutine(i4, z);
                            if (catchingFishServiceMoshiMVP != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    catchingFishServiceMoshiMVP = catchingFishServiceMoshiMVP3;
                }
                CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps = this.CatchingFishDaggerWebsocket;
                if (catchingFishServiceMoshiMVP != null) {
                    catchingFishRoomGoogleMaps.CatchingFishReduxKtor = catchingFishServiceMoshiMVP;
                    catchingFishServiceMoshiMVP2 = catchingFishServiceMoshiMVP3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishIntentAsyncTask.CatchingFishSnackbar;
                        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP4 = (CatchingFishServiceMoshiMVP) atomicReferenceFieldUpdater.get(catchingFishIntentAsyncTask);
                        if (catchingFishServiceMoshiMVP4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((catchingFishServiceMoshiMVP4.CatchingFishDaggerWebsocket ? 1 : 2) & i) == 0) {
                            break;
                        }
                        CatchingFishPicassoService.CatchingFishWorkManager.getClass();
                        CatchingFishIntentAsyncTask catchingFishIntentAsyncTask2 = catchingFishIntentAsyncTask;
                        long nanoTime = System.nanoTime() - catchingFishServiceMoshiMVP4.CatchingFishReduxKtor;
                        long j5 = CatchingFishPicassoService.CatchingFishSnackbar;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            catchingFishServiceMoshiMVP2 = null;
                            break;
                        }
                        do {
                            catchingFishServiceMoshiMVP2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(catchingFishIntentAsyncTask2, catchingFishServiceMoshiMVP4, null)) {
                                catchingFishRoomGoogleMaps.CatchingFishReduxKtor = catchingFishServiceMoshiMVP4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(catchingFishIntentAsyncTask2) == catchingFishServiceMoshiMVP4);
                        catchingFishIntentAsyncTask = catchingFishIntentAsyncTask2;
                        catchingFishServiceMoshiMVP3 = null;
                    }
                    j3 = -2;
                    catchingFishServiceMoshiMVP2 = catchingFishServiceMoshiMVP3;
                }
                if (j3 == j2) {
                    CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP5 = (CatchingFishServiceMoshiMVP) catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                    catchingFishRoomGoogleMaps.CatchingFishReduxKtor = catchingFishServiceMoshiMVP2;
                    return catchingFishServiceMoshiMVP5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            catchingFishServiceMoshiMVP3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.CatchingFishViewModelFAB = j4;
        return null;
    }

    public final CatchingFishServiceMoshiMVP CatchingFishParcelableFAB(boolean z) {
        CatchingFishServiceMoshiMVP CatchingFishDaggerWebsocket;
        CatchingFishServiceMoshiMVP CatchingFishDaggerWebsocket2;
        long j;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor = this.CatchingFishWorkManager;
        CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL = this.CatchingFishCloudMessaging;
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP = null;
        CatchingFishIntentAsyncTask catchingFishIntentAsyncTask = this.CatchingFishReduxKtor;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor2 = CatchingFishKtorHiltKtor.CatchingFishReduxKtor;
        if (catchingFishKtorHiltKtor != catchingFishKtorHiltKtor2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting;
            do {
                j = atomicLongFieldUpdater.get(catchingFishSnackbarGraphQL);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    catchingFishIntentAsyncTask.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishIntentAsyncTask.CatchingFishSnackbar;
                        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP2 = (CatchingFishServiceMoshiMVP) atomicReferenceFieldUpdater.get(catchingFishIntentAsyncTask);
                        if (catchingFishServiceMoshiMVP2 != null && catchingFishServiceMoshiMVP2.CatchingFishDaggerWebsocket) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishIntentAsyncTask, catchingFishServiceMoshiMVP2, null)) {
                                if (atomicReferenceFieldUpdater.get(catchingFishIntentAsyncTask) != catchingFishServiceMoshiMVP2) {
                                    break;
                                }
                            }
                            catchingFishServiceMoshiMVP = catchingFishServiceMoshiMVP2;
                            break loop1;
                        }
                    }
                    int i = CatchingFishIntentAsyncTask.CatchingFishReduxKtor.get(catchingFishIntentAsyncTask);
                    int i2 = CatchingFishIntentAsyncTask.CatchingFishCoroutine.get(catchingFishIntentAsyncTask);
                    while (true) {
                        if (i == i2 || CatchingFishIntentAsyncTask.CatchingFishDaggerWebsocket.get(catchingFishIntentAsyncTask) == 0) {
                            break;
                        }
                        i2--;
                        CatchingFishServiceMoshiMVP CatchingFishCoroutine = catchingFishIntentAsyncTask.CatchingFishCoroutine(i2, true);
                        if (CatchingFishCoroutine != null) {
                            catchingFishServiceMoshiMVP = CatchingFishCoroutine;
                            break;
                        }
                    }
                    if (catchingFishServiceMoshiMVP != null) {
                        return catchingFishServiceMoshiMVP;
                    }
                    CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP3 = (CatchingFishServiceMoshiMVP) catchingFishSnackbarGraphQL.CatchingFishLayout.CatchingFishReduxKtor();
                    return catchingFishServiceMoshiMVP3 == null ? CatchingFishLayout(1) : catchingFishServiceMoshiMVP3;
                }
            } while (!CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting.compareAndSet(catchingFishSnackbarGraphQL, j, j - 4398046511104L));
            this.CatchingFishWorkManager = catchingFishKtorHiltKtor2;
        }
        if (z) {
            boolean z2 = CatchingFishReduxKtor(catchingFishSnackbarGraphQL.CatchingFishReduxKtor * 2) == 0;
            if (z2 && (CatchingFishDaggerWebsocket2 = CatchingFishDaggerWebsocket()) != null) {
                return CatchingFishDaggerWebsocket2;
            }
            catchingFishIntentAsyncTask.getClass();
            CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP4 = (CatchingFishServiceMoshiMVP) CatchingFishIntentAsyncTask.CatchingFishSnackbar.getAndSet(catchingFishIntentAsyncTask, null);
            if (catchingFishServiceMoshiMVP4 == null) {
                catchingFishServiceMoshiMVP4 = catchingFishIntentAsyncTask.CatchingFishSnackbar();
            }
            if (catchingFishServiceMoshiMVP4 != null) {
                return catchingFishServiceMoshiMVP4;
            }
            if (!z2 && (CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket()) != null) {
                return CatchingFishDaggerWebsocket;
            }
        } else {
            CatchingFishServiceMoshiMVP CatchingFishDaggerWebsocket3 = CatchingFishDaggerWebsocket();
            if (CatchingFishDaggerWebsocket3 != null) {
                return CatchingFishDaggerWebsocket3;
            }
        }
        return CatchingFishLayout(3);
    }

    public final int CatchingFishReduxKtor(int i) {
        int i2 = this.CatchingFishLayout;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.CatchingFishLayout = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final int CatchingFishSnackbar() {
        return this.indexInArray;
    }

    public final boolean CatchingFishViewModelFAB(CatchingFishKtorHiltKtor catchingFishKtorHiltKtor) {
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor2 = this.CatchingFishWorkManager;
        boolean z = catchingFishKtorHiltKtor2 == CatchingFishKtorHiltKtor.CatchingFishReduxKtor;
        if (z) {
            CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting.addAndGet(this.CatchingFishCloudMessaging, 4398046511104L);
        }
        if (catchingFishKtorHiltKtor2 != catchingFishKtorHiltKtor) {
            this.CatchingFishWorkManager = catchingFishKtorHiltKtor;
        }
        return z;
    }

    public final void CatchingFishViewModelScope(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final void CatchingFishWorkManager(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishCloudMessaging.CatchingFishViewModelScope);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (CatchingFishSnackbarGraphQL.CatchingFishOkHttp.get(this.CatchingFishCloudMessaging) == 0) {
                CatchingFishKtorHiltKtor catchingFishKtorHiltKtor = this.CatchingFishWorkManager;
                CatchingFishKtorHiltKtor catchingFishKtorHiltKtor2 = CatchingFishKtorHiltKtor.CatchingFishViewModelFAB;
                if (catchingFishKtorHiltKtor == catchingFishKtorHiltKtor2) {
                    break loop0;
                }
                CatchingFishServiceMoshiMVP CatchingFishParcelableFAB = CatchingFishParcelableFAB(this.CatchingFishFragmentHandler);
                if (CatchingFishParcelableFAB != null) {
                    this.CatchingFishViewModelFAB = 0L;
                    CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL = this.CatchingFishCloudMessaging;
                    this.CatchingFishViewModelScope = 0L;
                    if (this.CatchingFishWorkManager == CatchingFishKtorHiltKtor.CatchingFishWorkManager) {
                        this.CatchingFishWorkManager = CatchingFishKtorHiltKtor.CatchingFishDaggerWebsocket;
                    }
                    if (CatchingFishParcelableFAB.CatchingFishDaggerWebsocket) {
                        if (CatchingFishViewModelFAB(CatchingFishKtorHiltKtor.CatchingFishDaggerWebsocket) && !catchingFishSnackbarGraphQL.CatchingFishEspressoTesting() && !catchingFishSnackbarGraphQL.CatchingFishLayout(CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting.get(catchingFishSnackbarGraphQL))) {
                            catchingFishSnackbarGraphQL.CatchingFishEspressoTesting();
                        }
                        try {
                            CatchingFishParcelableFAB.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting.addAndGet(catchingFishSnackbarGraphQL, -2097152L);
                        if (this.CatchingFishWorkManager != catchingFishKtorHiltKtor2) {
                            this.CatchingFishWorkManager = CatchingFishKtorHiltKtor.CatchingFishViewModelScope;
                        }
                    } else {
                        try {
                            CatchingFishParcelableFAB.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.CatchingFishFragmentHandler = false;
                    if (this.CatchingFishViewModelFAB == 0) {
                        Object obj = this.nextParkedWorker;
                        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishSnackbarGraphQL.CatchingFishUnitTesting;
                        if (obj != catchingFishFluxWorkManager) {
                            CatchingFishEspressoTesting.set(this, -1);
                            while (this.nextParkedWorker != CatchingFishSnackbarGraphQL.CatchingFishUnitTesting) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishEspressoTesting;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL2 = this.CatchingFishCloudMessaging;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CatchingFishSnackbarGraphQL.CatchingFishOkHttp;
                                    if (atomicIntegerFieldUpdater2.get(catchingFishSnackbarGraphQL2) != 0) {
                                        break;
                                    }
                                    CatchingFishKtorHiltKtor catchingFishKtorHiltKtor3 = this.CatchingFishWorkManager;
                                    CatchingFishKtorHiltKtor catchingFishKtorHiltKtor4 = CatchingFishKtorHiltKtor.CatchingFishViewModelFAB;
                                    if (catchingFishKtorHiltKtor3 == catchingFishKtorHiltKtor4) {
                                        break;
                                    }
                                    CatchingFishViewModelFAB(CatchingFishKtorHiltKtor.CatchingFishWorkManager);
                                    Thread.interrupted();
                                    if (this.CatchingFishViewModelScope == 0) {
                                        j = 2097151;
                                        this.CatchingFishViewModelScope = System.nanoTime() + this.CatchingFishCloudMessaging.CatchingFishWorkManager;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.CatchingFishCloudMessaging.CatchingFishWorkManager);
                                    if (System.nanoTime() - this.CatchingFishViewModelScope >= 0) {
                                        this.CatchingFishViewModelScope = 0L;
                                        CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL3 = this.CatchingFishCloudMessaging;
                                        synchronized (catchingFishSnackbarGraphQL3.CatchingFishFragmentHandler) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(catchingFishSnackbarGraphQL3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishSnackbarGraphQL.CatchingFishEspressoTesting;
                                                    if (((int) (atomicLongFieldUpdater.get(catchingFishSnackbarGraphQL3) & j)) > catchingFishSnackbarGraphQL3.CatchingFishReduxKtor) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            CatchingFishWorkManager(0);
                                                            catchingFishSnackbarGraphQL3.CatchingFishDaggerWebsocket(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(catchingFishSnackbarGraphQL3) & j);
                                                            if (andDecrement != i) {
                                                                Object CatchingFishSnackbar = catchingFishSnackbarGraphQL3.CatchingFishFragmentHandler.CatchingFishSnackbar(andDecrement);
                                                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishSnackbar);
                                                                CatchingFishRetrofitGlide catchingFishRetrofitGlide = (CatchingFishRetrofitGlide) CatchingFishSnackbar;
                                                                catchingFishSnackbarGraphQL3.CatchingFishFragmentHandler.CatchingFishCoroutine(i, catchingFishRetrofitGlide);
                                                                catchingFishRetrofitGlide.CatchingFishWorkManager(i);
                                                                catchingFishSnackbarGraphQL3.CatchingFishDaggerWebsocket(catchingFishRetrofitGlide, andDecrement, i);
                                                            }
                                                            catchingFishSnackbarGraphQL3.CatchingFishFragmentHandler.CatchingFishCoroutine(andDecrement, null);
                                                            this.CatchingFishWorkManager = catchingFishKtorHiltKtor4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL4 = this.CatchingFishCloudMessaging;
                            if (this.nextParkedWorker == catchingFishFluxWorkManager) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishSnackbarGraphQL.CatchingFishCloudMessaging;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(catchingFishSnackbarGraphQL4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = catchingFishSnackbarGraphQL4.CatchingFishFragmentHandler.CatchingFishSnackbar((int) (j2 & 2097151));
                                    CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL5 = catchingFishSnackbarGraphQL4;
                                    if (CatchingFishSnackbarGraphQL.CatchingFishCloudMessaging.compareAndSet(catchingFishSnackbarGraphQL5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        catchingFishSnackbarGraphQL4 = catchingFishSnackbarGraphQL5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        CatchingFishViewModelFAB(CatchingFishKtorHiltKtor.CatchingFishWorkManager);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.CatchingFishViewModelFAB);
                        this.CatchingFishViewModelFAB = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        CatchingFishViewModelFAB(CatchingFishKtorHiltKtor.CatchingFishViewModelFAB);
    }
}
