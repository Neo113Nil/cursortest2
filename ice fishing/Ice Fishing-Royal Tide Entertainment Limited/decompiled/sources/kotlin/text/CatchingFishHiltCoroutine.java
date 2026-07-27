package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltCoroutine implements CatchingFishNavigationRedux {
    public final CatchingFishFluxPicasso CatchingFishReduxKtor;
    public Throwable CatchingFishWorkManager;
    public final Object CatchingFishDaggerWebsocket = new Object();
    public final CatchingFishRetrofitGradle CatchingFishViewModelScope = new CatchingFishRetrofitGradle(0);
    public CatchingFishBundleGradle CatchingFishViewModelFAB = new CatchingFishBundleGradle();
    public CatchingFishBundleGradle CatchingFishLayout = new CatchingFishBundleGradle();

    public CatchingFishHiltCoroutine(CatchingFishFluxPicasso catchingFishFluxPicasso) {
        this.CatchingFishReduxKtor = catchingFishFluxPicasso;
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishAnimationMockk(CatchingFishManifestMockk catchingFishManifestMockk) {
        return CatchingFishAdMobFAB.CatchingFishMutableLiveData(this, catchingFishManifestMockk);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishPicassoContext CatchingFishCoroutineFlow(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        return CatchingFishAdMobFAB.CatchingFishCoroutineFlow(this, catchingFishGlidePayPal);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final Object CatchingFishEspressoTesting(Object obj, CatchingFishMockkView catchingFishMockkView) {
        return catchingFishMockkView.CatchingFishDaggerWebsocket(obj, this);
    }

    @Override // kotlin.text.CatchingFishNavigationRedux
    public final Object CatchingFishOkHttp(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        int i;
        int i2;
        int i3;
        CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishStateFlowGson));
        catchingFishKtorMockk.CatchingFish();
        CatchingFishLayoutMVVM catchingFishLayoutMVVM = new CatchingFishLayoutMVVM();
        catchingFishLayoutMVVM.CatchingFishParcelableFAB = catchingFishServiceHandler;
        catchingFishLayoutMVVM.CatchingFishSnackbar = catchingFishKtorMockk;
        CatchingFishAdMobRoom catchingFishAdMobRoom = new CatchingFishAdMobRoom();
        catchingFishAdMobRoom.CatchingFishReduxKtor = -1;
        synchronized (this.CatchingFishDaggerWebsocket) {
            Throwable th = this.CatchingFishWorkManager;
            if (th != null) {
                catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th));
            } else {
                CatchingFishRetrofitGradle catchingFishRetrofitGradle = this.CatchingFishViewModelScope;
                do {
                    i = catchingFishRetrofitGradle.get();
                    i2 = i + 1;
                } while (!catchingFishRetrofitGradle.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                catchingFishAdMobRoom.CatchingFishReduxKtor = (i2 >>> 27) & 15;
                this.CatchingFishViewModelFAB.CatchingFishParcelableFAB(catchingFishLayoutMVVM);
                catchingFishKtorMockk.CatchingFishDaggerHiltFAB(new CatchingFishPicassoAdMob(catchingFishLayoutMVVM, this, catchingFishAdMobRoom));
                if (z) {
                    try {
                        this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
                    } catch (Throwable th2) {
                        synchronized (this.CatchingFishDaggerWebsocket) {
                            try {
                                if (this.CatchingFishWorkManager == null) {
                                    this.CatchingFishWorkManager = th2;
                                    CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishViewModelFAB;
                                    Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
                                    int i4 = catchingFishBundleGradle.CatchingFishSnackbar;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        CatchingFishKtorMockk catchingFishKtorMockk2 = ((CatchingFishLayoutMVVM) objArr[i5]).CatchingFishSnackbar;
                                        if (catchingFishKtorMockk2 != null) {
                                            catchingFishKtorMockk2.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th2));
                                        }
                                    }
                                    this.CatchingFishViewModelFAB.CatchingFishCoroutine();
                                    CatchingFishRetrofitGradle catchingFishRetrofitGradle2 = this.CatchingFishViewModelScope;
                                    do {
                                        i3 = catchingFishRetrofitGradle2.get();
                                    } while (!catchingFishRetrofitGradle2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return catchingFishKtorMockk.CatchingFishNavigation();
    }

    public final void CatchingFishParcelableFAB(long j) {
        int i;
        CatchingFishKtorMockk catchingFishKtorMockk;
        Object CatchingFishViewModelFAB;
        synchronized (this.CatchingFishDaggerWebsocket) {
            try {
                CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishViewModelFAB;
                this.CatchingFishViewModelFAB = this.CatchingFishLayout;
                this.CatchingFishLayout = catchingFishBundleGradle;
                CatchingFishRetrofitGradle catchingFishRetrofitGradle = this.CatchingFishViewModelScope;
                do {
                    i = catchingFishRetrofitGradle.get();
                } while (!catchingFishRetrofitGradle.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = catchingFishBundleGradle.CatchingFishSnackbar;
                for (int i3 = 0; i3 < i2; i3++) {
                    CatchingFishLayoutMVVM catchingFishLayoutMVVM = (CatchingFishLayoutMVVM) catchingFishBundleGradle.CatchingFishDaggerWebsocket(i3);
                    CatchingFishServiceHandler catchingFishServiceHandler = catchingFishLayoutMVVM.CatchingFishParcelableFAB;
                    if (catchingFishServiceHandler != null && (catchingFishKtorMockk = catchingFishLayoutMVVM.CatchingFishSnackbar) != null) {
                        try {
                            CatchingFishViewModelFAB = catchingFishServiceHandler.CatchingFishFragmentHandler(Long.valueOf(j));
                        } catch (Throwable th) {
                            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
                        }
                        catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishViewModelFAB);
                    }
                }
                catchingFishBundleGradle.CatchingFishCoroutine();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishReduxKtor(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        return CatchingFishAdMobFAB.CatchingFishMVPRobolectric(this, catchingFishGlidePayPal);
    }
}
