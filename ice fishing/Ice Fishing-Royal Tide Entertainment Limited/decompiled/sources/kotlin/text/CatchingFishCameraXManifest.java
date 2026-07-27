package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishCameraXManifest {
    public final CatchingFishKtorSnackbar CatchingFishParcelableFAB;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishSnackbar = AtomicReferenceFieldUpdater.newUpdater(CatchingFishCameraXManifest.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishCoroutine = AtomicLongFieldUpdater.newUpdater(CatchingFishCameraXManifest.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishReduxKtor = AtomicReferenceFieldUpdater.newUpdater(CatchingFishCameraXManifest.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishDaggerWebsocket = AtomicLongFieldUpdater.newUpdater(CatchingFishCameraXManifest.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishWorkManager = AtomicIntegerFieldUpdater.newUpdater(CatchingFishCameraXManifest.class, "_availablePermits$volatile");

    public CatchingFishCameraXManifest() {
        CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux = new CatchingFishPicassoMVVMFlux(0L, null, 2);
        this.head$volatile = catchingFishPicassoMVVMFlux;
        this.tail$volatile = catchingFishPicassoMVVMFlux;
        this._availablePermits$volatile = 1;
        this.CatchingFishParcelableFAB = new CatchingFishKtorSnackbar(2, this);
    }

    public final void CatchingFishParcelableFAB(CatchingFishContextMoshi catchingFishContextMoshi) {
        Object CatchingFishGsonAppCompat;
        CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux;
        CatchingFishKtorMockk catchingFishKtorMockk = catchingFishContextMoshi.CatchingFishReduxKtor;
        CatchingFishManifestAdMob catchingFishManifestAdMob = catchingFishContextMoshi.CatchingFishDaggerWebsocket;
        while (true) {
            int andDecrement = CatchingFishWorkManager.getAndDecrement(this);
            if (andDecrement <= 1) {
                CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                if (andDecrement > 0) {
                    CatchingFishManifestAdMob.CatchingFishViewModelScope.set(catchingFishManifestAdMob, null);
                    catchingFishKtorMockk.CatchingFishCustomView(catchingFishRealmContext, catchingFishKtorMockk.CatchingFishWorkManager, new CatchingFishKtorSnackbar(0, new CatchingFishFragmentFactory(catchingFishManifestAdMob, catchingFishContextMoshi)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
                CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux2 = (CatchingFishPicassoMVVMFlux) atomicReferenceFieldUpdater.get(this);
                long andIncrement = CatchingFishDaggerWebsocket.getAndIncrement(this);
                CatchingFishViewJUnitDagger catchingFishViewJUnitDagger = CatchingFishViewJUnitDagger.CatchingFishEspressoTesting;
                long j = andIncrement / CatchingFishGsonMVP.CatchingFishWorkManager;
                while (true) {
                    CatchingFishGsonAppCompat = CatchingFishLayoutRoomFAB.CatchingFishGsonAppCompat(catchingFishPicassoMVVMFlux2, j, catchingFishViewJUnitDagger);
                    if (!CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                        CatchingFishFluxSnackbar CatchingFishCardViewView = CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                        while (true) {
                            CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(this);
                            catchingFishPicassoMVVMFlux = catchingFishPicassoMVVMFlux2;
                            if (catchingFishFluxSnackbar.CatchingFishCoroutine >= CatchingFishCardViewView.CatchingFishCoroutine) {
                                break;
                            }
                            if (!CatchingFishCardViewView.CatchingFishLayout()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxSnackbar, CatchingFishCardViewView)) {
                                if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxSnackbar) {
                                    if (CatchingFishCardViewView.CatchingFishDaggerWebsocket()) {
                                        CatchingFishCardViewView.CatchingFishReduxKtor();
                                    }
                                    catchingFishPicassoMVVMFlux2 = catchingFishPicassoMVVMFlux;
                                }
                            }
                            if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                                catchingFishFluxSnackbar.CatchingFishReduxKtor();
                            }
                        }
                    } else {
                        break;
                    }
                    catchingFishPicassoMVVMFlux2 = catchingFishPicassoMVVMFlux;
                }
                CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux3 = (CatchingFishPicassoMVVMFlux) CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                AtomicReferenceArray atomicReferenceArray = catchingFishPicassoMVVMFlux3.CatchingFishDaggerWebsocket;
                int i = (int) (andIncrement % CatchingFishGsonMVP.CatchingFishWorkManager);
                while (!atomicReferenceArray.compareAndSet(i, null, catchingFishContextMoshi)) {
                    if (atomicReferenceArray.get(i) != null) {
                        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishGsonMVP.CatchingFishSnackbar;
                        CatchingFishFluxWorkManager catchingFishFluxWorkManager2 = CatchingFishGsonMVP.CatchingFishCoroutine;
                        while (!atomicReferenceArray.compareAndSet(i, catchingFishFluxWorkManager, catchingFishFluxWorkManager2)) {
                            if (atomicReferenceArray.get(i) != catchingFishFluxWorkManager) {
                                break;
                            }
                        }
                        CatchingFishManifestAdMob.CatchingFishViewModelScope.set(catchingFishManifestAdMob, null);
                        catchingFishKtorMockk.CatchingFishCustomView(catchingFishRealmContext, catchingFishKtorMockk.CatchingFishWorkManager, new CatchingFishKtorSnackbar(0, new CatchingFishFragmentFactory(catchingFishManifestAdMob, catchingFishContextMoshi)));
                        return;
                    }
                }
                catchingFishContextMoshi.CatchingFishParcelableFAB(catchingFishPicassoMVVMFlux3, i);
                return;
            }
        }
    }

    public final void CatchingFishSnackbar() {
        boolean z;
        int i;
        Object CatchingFishGsonAppCompat;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishWorkManager;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishSnackbar;
            CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux = (CatchingFishPicassoMVVMFlux) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = CatchingFishCoroutine.getAndIncrement(this);
            long j = andIncrement2 / CatchingFishGsonMVP.CatchingFishWorkManager;
            CatchingFishBundleWidget catchingFishBundleWidget = CatchingFishBundleWidget.CatchingFishEspressoTesting;
            while (true) {
                CatchingFishGsonAppCompat = CatchingFishLayoutRoomFAB.CatchingFishGsonAppCompat(catchingFishPicassoMVVMFlux, j, catchingFishBundleWidget);
                if (!CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                    CatchingFishFluxSnackbar CatchingFishCardViewView = CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                    while (true) {
                        CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(this);
                        if (catchingFishFluxSnackbar.CatchingFishCoroutine >= CatchingFishCardViewView.CatchingFishCoroutine) {
                            break;
                        }
                        if (!CatchingFishCardViewView.CatchingFishLayout()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxSnackbar, CatchingFishCardViewView)) {
                            if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxSnackbar) {
                                if (CatchingFishCardViewView.CatchingFishDaggerWebsocket()) {
                                    CatchingFishCardViewView.CatchingFishReduxKtor();
                                }
                            }
                        }
                        if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                            catchingFishFluxSnackbar.CatchingFishReduxKtor();
                        }
                    }
                } else {
                    break;
                }
            }
            CatchingFishPicassoMVVMFlux catchingFishPicassoMVVMFlux2 = (CatchingFishPicassoMVVMFlux) CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
            AtomicReferenceArray atomicReferenceArray = catchingFishPicassoMVVMFlux2.CatchingFishDaggerWebsocket;
            catchingFishPicassoMVVMFlux2.CatchingFishParcelableFAB();
            boolean z2 = false;
            if (catchingFishPicassoMVVMFlux2.CatchingFishCoroutine <= j) {
                int i2 = (int) (andIncrement2 % CatchingFishGsonMVP.CatchingFishWorkManager);
                Object andSet = atomicReferenceArray.getAndSet(i2, CatchingFishGsonMVP.CatchingFishSnackbar);
                if (andSet == null) {
                    int i3 = CatchingFishGsonMVP.CatchingFishParcelableFAB;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishGsonMVP.CatchingFishSnackbar;
                            CatchingFishFluxWorkManager catchingFishFluxWorkManager2 = CatchingFishGsonMVP.CatchingFishReduxKtor;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, catchingFishFluxWorkManager, catchingFishFluxWorkManager2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != catchingFishFluxWorkManager) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == CatchingFishGsonMVP.CatchingFishCoroutine) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != CatchingFishGsonMVP.CatchingFishDaggerWebsocket) {
                    if (!(andSet instanceof CatchingFishGsonLiveData)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    CatchingFishGsonLiveData catchingFishGsonLiveData = (CatchingFishGsonLiveData) andSet;
                    CatchingFishFluxWorkManager CatchingFishWorkManager2 = catchingFishGsonLiveData.CatchingFishWorkManager(CatchingFishRealmContext.CatchingFishParcelableFAB, this.CatchingFishParcelableFAB);
                    if (CatchingFishWorkManager2 != null) {
                        catchingFishGsonLiveData.CatchingFishJetpackCompose(CatchingFishWorkManager2);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
