package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class CatchingFishPayPalHilt extends CatchingFishReduxMockkView implements CatchingFishRealmAndroidX {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishFragmentHandler = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPayPalHilt.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishCloudMessaging = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPayPalHilt.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishEspressoTesting = AtomicIntegerFieldUpdater.newUpdater(CatchingFishPayPalHilt.class, "_isCompleted$volatile");

    public void CatchingFishCameraXIntent(Runnable runnable) {
        CatchingFishHandler();
        if (!CatchingFishPayPalLiveData(runnable)) {
            CatchingFishViewGlide.CatchingFishOkHttp.CatchingFishCameraXIntent(runnable);
            return;
        }
        Thread CatchingFishJobScheduler = CatchingFishJobScheduler();
        if (Thread.currentThread() != CatchingFishJobScheduler) {
            LockSupport.unpark(CatchingFishJobScheduler);
        }
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        CatchingFishCameraXIntent(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((kotlin.text.CatchingFishManifestFABMVVM.CatchingFishSnackbar.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishGradleManifest() {
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishViewModelFAB;
        if (catchingFishMVVMLifecycle != null ? catchingFishMVVMLifecycle.isEmpty() : true) {
            CatchingFishFirebaseContext catchingFishFirebaseContext = (CatchingFishFirebaseContext) CatchingFishCloudMessaging.get(this);
            if (catchingFishFirebaseContext != null) {
            }
            Object obj = CatchingFishFragmentHandler.get(this);
            if (obj != null) {
                if (obj instanceof CatchingFishGlideCameraX) {
                    long j = CatchingFishGlideCameraX.CatchingFishWorkManager.get((CatchingFishGlideCameraX) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == CatchingFishBiometricBundle.CatchingFishDaggerWebsocket) {
                }
            }
            return true;
        }
        return false;
    }

    public final void CatchingFishHandler() {
        CatchingFishViewMoshi catchingFishViewMoshi;
        CatchingFishFirebaseContext catchingFishFirebaseContext = (CatchingFishFirebaseContext) CatchingFishCloudMessaging.get(this);
        if (catchingFishFirebaseContext == null || CatchingFishManifestFABMVVM.CatchingFishSnackbar.get(catchingFishFirebaseContext) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (catchingFishFirebaseContext) {
                try {
                    CatchingFishViewMoshi[] catchingFishViewMoshiArr = catchingFishFirebaseContext.CatchingFishParcelableFAB;
                    CatchingFishViewMoshi catchingFishViewMoshi2 = catchingFishViewMoshiArr != null ? catchingFishViewMoshiArr[0] : null;
                    if (catchingFishViewMoshi2 != null) {
                        catchingFishViewMoshi = ((nanoTime - catchingFishViewMoshi2.CatchingFishReduxKtor) > 0L ? 1 : ((nanoTime - catchingFishViewMoshi2.CatchingFishReduxKtor) == 0L ? 0 : -1)) >= 0 ? CatchingFishPayPalLiveData(catchingFishViewMoshi2) : false ? catchingFishFirebaseContext.CatchingFishSnackbar(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (catchingFishViewMoshi != null);
    }

    public final void CatchingFishMotionLayout(long j, CatchingFishViewMoshi catchingFishViewMoshi) {
        int CatchingFishSnackbar;
        Thread CatchingFishJobScheduler;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishCloudMessaging;
        if (CatchingFishEspressoTesting.get(this) != 0) {
            CatchingFishSnackbar = 1;
        } else {
            CatchingFishFirebaseContext catchingFishFirebaseContext = (CatchingFishFirebaseContext) atomicReferenceFieldUpdater.get(this);
            if (catchingFishFirebaseContext == null) {
                CatchingFishFirebaseContext catchingFishFirebaseContext2 = new CatchingFishFirebaseContext();
                catchingFishFirebaseContext2.CatchingFishCoroutine = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, catchingFishFirebaseContext2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
                catchingFishFirebaseContext = (CatchingFishFirebaseContext) obj;
            }
            CatchingFishSnackbar = catchingFishViewMoshi.CatchingFishSnackbar(j, catchingFishFirebaseContext, this);
        }
        if (CatchingFishSnackbar != 0) {
            if (CatchingFishSnackbar == 1) {
                CatchingFishDagger(j, catchingFishViewMoshi);
                return;
            } else {
                if (CatchingFishSnackbar != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        CatchingFishFirebaseContext catchingFishFirebaseContext3 = (CatchingFishFirebaseContext) atomicReferenceFieldUpdater.get(this);
        if (catchingFishFirebaseContext3 != null) {
            synchronized (catchingFishFirebaseContext3) {
                CatchingFishViewMoshi[] catchingFishViewMoshiArr = catchingFishFirebaseContext3.CatchingFishParcelableFAB;
                r2 = catchingFishViewMoshiArr != null ? catchingFishViewMoshiArr[0] : null;
            }
        }
        if (r2 != catchingFishViewMoshi || Thread.currentThread() == (CatchingFishJobScheduler = CatchingFishJobScheduler())) {
            return;
        }
        LockSupport.unpark(CatchingFishJobScheduler);
    }

    @Override // kotlin.text.CatchingFishRealmAndroidX
    public final void CatchingFishParcelableFlux(long j, CatchingFishKtorMockk catchingFishKtorMockk) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            CatchingFishToastJUnit catchingFishToastJUnit = new CatchingFishToastJUnit(this, j2 + nanoTime, catchingFishKtorMockk);
            CatchingFishMotionLayout(nanoTime, catchingFishToastJUnit);
            catchingFishKtorMockk.CatchingFishSpannableWidget(new CatchingFishDaggerKtor(2, catchingFishToastJUnit));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishPayPalLiveData(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (CatchingFishEspressoTesting.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof CatchingFishGlideCameraX)) {
                        if (obj != CatchingFishBiometricBundle.CatchingFishDaggerWebsocket) {
                            CatchingFishGlideCameraX catchingFishGlideCameraX = new CatchingFishGlideCameraX(8, true);
                            catchingFishGlideCameraX.CatchingFishParcelableFAB((Runnable) obj);
                            catchingFishGlideCameraX.CatchingFishParcelableFAB(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishGlideCameraX)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    CatchingFishGlideCameraX catchingFishGlideCameraX2 = (CatchingFishGlideCameraX) obj;
                    int CatchingFishParcelableFAB = catchingFishGlideCameraX2.CatchingFishParcelableFAB(runnable);
                    if (CatchingFishParcelableFAB == 0) {
                        break;
                    }
                    if (CatchingFishParcelableFAB == 1) {
                        CatchingFishGlideCameraX CatchingFishCoroutine = catchingFishGlideCameraX2.CatchingFishCoroutine();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, CatchingFishCoroutine) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (CatchingFishParcelableFAB == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishReduxMockkView
    public final long CatchingFishSensorManager() {
        Runnable runnable;
        CatchingFishViewMoshi catchingFishViewMoshi;
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishBiometricBundle.CatchingFishDaggerWebsocket;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
        if (!CatchingFishEspressoMockk()) {
            CatchingFishHandler();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof CatchingFishGlideCameraX)) {
                    if (obj != catchingFishFluxWorkManager) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                CatchingFishGlideCameraX catchingFishGlideCameraX = (CatchingFishGlideCameraX) obj;
                Object CatchingFishReduxKtor = catchingFishGlideCameraX.CatchingFishReduxKtor();
                if (CatchingFishReduxKtor != CatchingFishGlideCameraX.CatchingFishViewModelScope) {
                    runnable = (Runnable) CatchingFishReduxKtor;
                    break;
                }
                CatchingFishGlideCameraX CatchingFishCoroutine = catchingFishGlideCameraX.CatchingFishCoroutine();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, CatchingFishCoroutine) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishViewModelFAB;
            if (((catchingFishMVVMLifecycle == null || catchingFishMVVMLifecycle.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof CatchingFishGlideCameraX) {
                        long j = CatchingFishGlideCameraX.CatchingFishWorkManager.get((CatchingFishGlideCameraX) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == catchingFishFluxWorkManager) {
                        return Long.MAX_VALUE;
                    }
                }
                CatchingFishFirebaseContext catchingFishFirebaseContext = (CatchingFishFirebaseContext) CatchingFishCloudMessaging.get(this);
                if (catchingFishFirebaseContext != null) {
                    synchronized (catchingFishFirebaseContext) {
                        CatchingFishViewMoshi[] catchingFishViewMoshiArr = catchingFishFirebaseContext.CatchingFishParcelableFAB;
                        catchingFishViewMoshi = catchingFishViewMoshiArr != null ? catchingFishViewMoshiArr[0] : null;
                    }
                    if (catchingFishViewMoshi != null) {
                        long nanoTime = catchingFishViewMoshi.CatchingFishReduxKtor - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // kotlin.text.CatchingFishReduxMockkView
    public void shutdown() {
        CatchingFishViewMoshi CatchingFishSnackbar;
        CatchingFishMVVMOkHttp.CatchingFishParcelableFAB.set(null);
        CatchingFishEspressoTesting.set(this, 1);
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishBiometricBundle.CatchingFishDaggerWebsocket;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof CatchingFishGlideCameraX)) {
                    if (obj != catchingFishFluxWorkManager) {
                        CatchingFishGlideCameraX catchingFishGlideCameraX = new CatchingFishGlideCameraX(8, true);
                        catchingFishGlideCameraX.CatchingFishParcelableFAB((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishGlideCameraX)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((CatchingFishGlideCameraX) obj).CatchingFishSnackbar();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, catchingFishFluxWorkManager)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (CatchingFishSensorManager() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            CatchingFishFirebaseContext catchingFishFirebaseContext = (CatchingFishFirebaseContext) CatchingFishCloudMessaging.get(this);
            if (catchingFishFirebaseContext == null) {
                return;
            }
            synchronized (catchingFishFirebaseContext) {
                CatchingFishSnackbar = CatchingFishManifestFABMVVM.CatchingFishSnackbar.get(catchingFishFirebaseContext) > 0 ? catchingFishFirebaseContext.CatchingFishSnackbar(0) : null;
            }
            if (CatchingFishSnackbar == null) {
                return;
            } else {
                CatchingFishDagger(nanoTime, CatchingFishSnackbar);
            }
        }
    }
}
