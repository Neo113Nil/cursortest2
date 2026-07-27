package kotlin.text;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarGraphQL implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishCloudMessaging = AtomicLongFieldUpdater.newUpdater(CatchingFishSnackbarGraphQL.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishEspressoTesting = AtomicLongFieldUpdater.newUpdater(CatchingFishSnackbarGraphQL.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishOkHttp = AtomicIntegerFieldUpdater.newUpdater(CatchingFishSnackbarGraphQL.class, "_isTerminated$volatile");
    public static final CatchingFishFluxWorkManager CatchingFishUnitTesting = new CatchingFishFluxWorkManager("NOT_IN_STACK", 1);
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishPayPalRoomRealm CatchingFishFragmentHandler;
    public final CatchingFishFirebaseGraphQL CatchingFishLayout;
    public final int CatchingFishReduxKtor;
    public final CatchingFishFirebaseGraphQL CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public CatchingFishSnackbarGraphQL(int i, int i2, long j, String str) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = j;
        this.CatchingFishViewModelScope = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.CatchingFishViewModelFAB = new CatchingFishFirebaseGraphQL();
        this.CatchingFishLayout = new CatchingFishFirebaseGraphQL();
        this.CatchingFishFragmentHandler = new CatchingFishPayPalRoomRealm((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void CatchingFishReduxKtor(CatchingFishSnackbarGraphQL catchingFishSnackbarGraphQL, Runnable runnable, int i) {
        catchingFishSnackbarGraphQL.CatchingFishCoroutine(runnable, false, (i & 4) == 0);
    }

    public final void CatchingFishCoroutine(Runnable runnable, boolean z, boolean z2) {
        CatchingFishServiceMoshiMVP catchingFishFABContextKtor;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor;
        CatchingFishPicassoService.CatchingFishWorkManager.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof CatchingFishServiceMoshiMVP) {
            catchingFishFABContextKtor = (CatchingFishServiceMoshiMVP) runnable;
            catchingFishFABContextKtor.CatchingFishReduxKtor = nanoTime;
            catchingFishFABContextKtor.CatchingFishDaggerWebsocket = z;
        } else {
            catchingFishFABContextKtor = new CatchingFishFABContextKtor(runnable, nanoTime, z);
        }
        boolean z3 = catchingFishFABContextKtor.CatchingFishDaggerWebsocket;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishEspressoTesting;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        CatchingFishRetrofitGlide catchingFishRetrofitGlide = currentThread instanceof CatchingFishRetrofitGlide ? (CatchingFishRetrofitGlide) currentThread : null;
        if (catchingFishRetrofitGlide == null || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishRetrofitGlide.CatchingFishCloudMessaging, this)) {
            catchingFishRetrofitGlide = null;
        }
        if (catchingFishRetrofitGlide != null && (catchingFishKtorHiltKtor = catchingFishRetrofitGlide.CatchingFishWorkManager) != CatchingFishKtorHiltKtor.CatchingFishViewModelFAB && (catchingFishFABContextKtor.CatchingFishDaggerWebsocket || catchingFishKtorHiltKtor != CatchingFishKtorHiltKtor.CatchingFishDaggerWebsocket)) {
            catchingFishRetrofitGlide.CatchingFishFragmentHandler = true;
            CatchingFishIntentAsyncTask catchingFishIntentAsyncTask = catchingFishRetrofitGlide.CatchingFishReduxKtor;
            if (z2) {
                catchingFishFABContextKtor = catchingFishIntentAsyncTask.CatchingFishParcelableFAB(catchingFishFABContextKtor);
            } else {
                catchingFishIntentAsyncTask.getClass();
                CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) CatchingFishIntentAsyncTask.CatchingFishSnackbar.getAndSet(catchingFishIntentAsyncTask, catchingFishFABContextKtor);
                catchingFishFABContextKtor = catchingFishServiceMoshiMVP == null ? null : catchingFishIntentAsyncTask.CatchingFishParcelableFAB(catchingFishServiceMoshiMVP);
            }
        }
        if (catchingFishFABContextKtor != null) {
            if (!(catchingFishFABContextKtor.CatchingFishDaggerWebsocket ? this.CatchingFishLayout.CatchingFishParcelableFAB(catchingFishFABContextKtor) : this.CatchingFishViewModelFAB.CatchingFishParcelableFAB(catchingFishFABContextKtor))) {
                throw new RejectedExecutionException(CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder(), this.CatchingFishViewModelScope, " was terminated"));
            }
        }
        boolean z4 = z2 && catchingFishRetrofitGlide != null;
        if (z3) {
            if (z4 || CatchingFishEspressoTesting() || CatchingFishLayout(addAndGet)) {
                return;
            }
            CatchingFishEspressoTesting();
            return;
        }
        if (z4 || CatchingFishEspressoTesting() || CatchingFishLayout(atomicLongFieldUpdater.get(this))) {
            return;
        }
        CatchingFishEspressoTesting();
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishRetrofitGlide catchingFishRetrofitGlide, int i, int i2) {
        while (true) {
            long j = CatchingFishCloudMessaging.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object CatchingFishCoroutine = catchingFishRetrofitGlide.CatchingFishCoroutine();
                    while (true) {
                        if (CatchingFishCoroutine == CatchingFishUnitTesting) {
                            i3 = -1;
                            break;
                        }
                        if (CatchingFishCoroutine == null) {
                            i3 = 0;
                            break;
                        }
                        CatchingFishRetrofitGlide catchingFishRetrofitGlide2 = (CatchingFishRetrofitGlide) CatchingFishCoroutine;
                        int CatchingFishSnackbar = catchingFishRetrofitGlide2.CatchingFishSnackbar();
                        if (CatchingFishSnackbar != 0) {
                            i3 = CatchingFishSnackbar;
                            break;
                        }
                        CatchingFishCoroutine = catchingFishRetrofitGlide2.CatchingFishCoroutine();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (CatchingFishCloudMessaging.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean CatchingFishEspressoTesting() {
        CatchingFishFluxWorkManager catchingFishFluxWorkManager;
        int i;
        while (true) {
            long j = CatchingFishCloudMessaging.get(this);
            CatchingFishRetrofitGlide catchingFishRetrofitGlide = (CatchingFishRetrofitGlide) this.CatchingFishFragmentHandler.CatchingFishSnackbar((int) (2097151 & j));
            if (catchingFishRetrofitGlide == null) {
                catchingFishRetrofitGlide = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object CatchingFishCoroutine = catchingFishRetrofitGlide.CatchingFishCoroutine();
                while (true) {
                    catchingFishFluxWorkManager = CatchingFishUnitTesting;
                    if (CatchingFishCoroutine == catchingFishFluxWorkManager) {
                        i = -1;
                        break;
                    }
                    if (CatchingFishCoroutine == null) {
                        i = 0;
                        break;
                    }
                    CatchingFishRetrofitGlide catchingFishRetrofitGlide2 = (CatchingFishRetrofitGlide) CatchingFishCoroutine;
                    i = catchingFishRetrofitGlide2.CatchingFishSnackbar();
                    if (i != 0) {
                        break;
                    }
                    CatchingFishCoroutine = catchingFishRetrofitGlide2.CatchingFishCoroutine();
                }
                if (i >= 0) {
                    if (CatchingFishCloudMessaging.compareAndSet(this, j, i | j2)) {
                        catchingFishRetrofitGlide.CatchingFishViewModelScope(catchingFishFluxWorkManager);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (catchingFishRetrofitGlide == null) {
                return false;
            }
            if (CatchingFishRetrofitGlide.CatchingFishEspressoTesting.compareAndSet(catchingFishRetrofitGlide, -1, 0)) {
                LockSupport.unpark(catchingFishRetrofitGlide);
                return true;
            }
        }
    }

    public final boolean CatchingFishLayout(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.CatchingFishReduxKtor;
        if (i < i2) {
            int CatchingFishSnackbar = CatchingFishSnackbar();
            if (CatchingFishSnackbar == 1 && i2 > 1) {
                CatchingFishSnackbar();
            }
            if (CatchingFishSnackbar > 0) {
                return true;
            }
        }
        return false;
    }

    public final int CatchingFishSnackbar() {
        synchronized (this.CatchingFishFragmentHandler) {
            try {
                if (CatchingFishOkHttp.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishEspressoTesting;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.CatchingFishReduxKtor) {
                    return 0;
                }
                if (i >= this.CatchingFishDaggerWebsocket) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.CatchingFishFragmentHandler.CatchingFishSnackbar(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                CatchingFishRetrofitGlide catchingFishRetrofitGlide = new CatchingFishRetrofitGlide(this, i3);
                this.CatchingFishFragmentHandler.CatchingFishCoroutine(i3, catchingFishRetrofitGlide);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                catchingFishRetrofitGlide.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP;
        if (CatchingFishOkHttp.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            CatchingFishRetrofitGlide catchingFishRetrofitGlide = currentThread instanceof CatchingFishRetrofitGlide ? (CatchingFishRetrofitGlide) currentThread : null;
            if (catchingFishRetrofitGlide == null || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishRetrofitGlide.CatchingFishCloudMessaging, this)) {
                catchingFishRetrofitGlide = null;
            }
            synchronized (this.CatchingFishFragmentHandler) {
                i = (int) (CatchingFishEspressoTesting.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object CatchingFishSnackbar = this.CatchingFishFragmentHandler.CatchingFishSnackbar(i2);
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishSnackbar);
                    CatchingFishRetrofitGlide catchingFishRetrofitGlide2 = (CatchingFishRetrofitGlide) CatchingFishSnackbar;
                    if (catchingFishRetrofitGlide2 != catchingFishRetrofitGlide) {
                        while (catchingFishRetrofitGlide2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(catchingFishRetrofitGlide2);
                            catchingFishRetrofitGlide2.join(10000L);
                        }
                        CatchingFishIntentAsyncTask catchingFishIntentAsyncTask = catchingFishRetrofitGlide2.CatchingFishReduxKtor;
                        CatchingFishFirebaseGraphQL catchingFishFirebaseGraphQL = this.CatchingFishLayout;
                        catchingFishIntentAsyncTask.getClass();
                        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP2 = (CatchingFishServiceMoshiMVP) CatchingFishIntentAsyncTask.CatchingFishSnackbar.getAndSet(catchingFishIntentAsyncTask, null);
                        if (catchingFishServiceMoshiMVP2 != null) {
                            catchingFishFirebaseGraphQL.CatchingFishParcelableFAB(catchingFishServiceMoshiMVP2);
                        }
                        while (true) {
                            CatchingFishServiceMoshiMVP CatchingFishSnackbar2 = catchingFishIntentAsyncTask.CatchingFishSnackbar();
                            if (CatchingFishSnackbar2 == null) {
                                break;
                            } else {
                                catchingFishFirebaseGraphQL.CatchingFishParcelableFAB(CatchingFishSnackbar2);
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
            this.CatchingFishLayout.CatchingFishSnackbar();
            this.CatchingFishViewModelFAB.CatchingFishSnackbar();
            while (true) {
                if (catchingFishRetrofitGlide != null) {
                    catchingFishServiceMoshiMVP = catchingFishRetrofitGlide.CatchingFishParcelableFAB(true);
                }
                catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) this.CatchingFishViewModelFAB.CatchingFishReduxKtor();
                if (catchingFishServiceMoshiMVP == null && (catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) this.CatchingFishLayout.CatchingFishReduxKtor()) == null) {
                    break;
                }
                try {
                    catchingFishServiceMoshiMVP.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (catchingFishRetrofitGlide != null) {
                catchingFishRetrofitGlide.CatchingFishViewModelFAB(CatchingFishKtorHiltKtor.CatchingFishViewModelFAB);
            }
            CatchingFishCloudMessaging.set(this, 0L);
            CatchingFishEspressoTesting.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CatchingFishReduxKtor(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CatchingFishPayPalRoomRealm catchingFishPayPalRoomRealm = this.CatchingFishFragmentHandler;
        int CatchingFishParcelableFAB = catchingFishPayPalRoomRealm.CatchingFishParcelableFAB();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < CatchingFishParcelableFAB; i6++) {
            CatchingFishRetrofitGlide catchingFishRetrofitGlide = (CatchingFishRetrofitGlide) catchingFishPayPalRoomRealm.CatchingFishSnackbar(i6);
            if (catchingFishRetrofitGlide != null) {
                CatchingFishIntentAsyncTask catchingFishIntentAsyncTask = catchingFishRetrofitGlide.CatchingFishReduxKtor;
                catchingFishIntentAsyncTask.getClass();
                int i7 = CatchingFishIntentAsyncTask.CatchingFishSnackbar.get(catchingFishIntentAsyncTask) != null ? (CatchingFishIntentAsyncTask.CatchingFishCoroutine.get(catchingFishIntentAsyncTask) - CatchingFishIntentAsyncTask.CatchingFishReduxKtor.get(catchingFishIntentAsyncTask)) + 1 : CatchingFishIntentAsyncTask.CatchingFishCoroutine.get(catchingFishIntentAsyncTask) - CatchingFishIntentAsyncTask.CatchingFishReduxKtor.get(catchingFishIntentAsyncTask);
                int ordinal = catchingFishRetrofitGlide.CatchingFishWorkManager.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new CatchingFishBiometricView();
                    }
                    i5++;
                }
            }
        }
        long j = CatchingFishEspressoTesting.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.CatchingFishViewModelScope);
        sb4.append('@');
        sb4.append(CatchingFishBiometricBundle.CatchingFish(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.CatchingFishReduxKtor;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.CatchingFishDaggerWebsocket);
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
        sb4.append(this.CatchingFishViewModelFAB.CatchingFishCoroutine());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.CatchingFishLayout.CatchingFishCoroutine());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
