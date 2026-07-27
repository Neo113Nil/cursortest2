package kotlin.text;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketWidget implements CatchingFishNavigationRedux {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public CatchingFishWebsocketWidget(Choreographer choreographer, CatchingFishContextFragment catchingFishContextFragment) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = choreographer;
        this.CatchingFishWorkManager = catchingFishContextFragment;
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishAnimationMockk(CatchingFishManifestMockk catchingFishManifestMockk) {
        switch (this.CatchingFishReduxKtor) {
        }
        return CatchingFishAdMobFAB.CatchingFishMutableLiveData(this, catchingFishManifestMockk);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishPicassoContext CatchingFishCoroutineFlow(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        switch (this.CatchingFishReduxKtor) {
        }
        return CatchingFishAdMobFAB.CatchingFishCoroutineFlow(this, catchingFishGlidePayPal);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final Object CatchingFishEspressoTesting(Object obj, CatchingFishMockkView catchingFishMockkView) {
        switch (this.CatchingFishReduxKtor) {
        }
        return catchingFishMockkView.CatchingFishDaggerWebsocket(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // kotlin.text.CatchingFishNavigationRedux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishToastContextMVP catchingFishToastContextMVP;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk;
        int i;
        boolean z;
        Object CatchingFishNavigation;
        Object CatchingFishOkHttp;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishContextFragment catchingFishContextFragment = (CatchingFishContextFragment) this.CatchingFishWorkManager;
                CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishStateFlowGson));
                catchingFishKtorMockk.CatchingFish();
                CatchingFishJUnit catchingFishJUnit = new CatchingFishJUnit(catchingFishKtorMockk, this, catchingFishServiceHandler);
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishContextFragment.CatchingFishWorkManager, (Choreographer) this.CatchingFishDaggerWebsocket)) {
                    synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
                        catchingFishContextFragment.CatchingFishFragmentHandler.add(catchingFishJUnit);
                        if (!catchingFishContextFragment.CatchingFishOkHttp) {
                            catchingFishContextFragment.CatchingFishOkHttp = true;
                            catchingFishContextFragment.CatchingFishWorkManager.postFrameCallback(catchingFishContextFragment.CatchingFishUnitTesting);
                        }
                    }
                    catchingFishKtorMockk.CatchingFishDaggerHiltFAB(new CatchingFishOkHttpRedux(2, catchingFishContextFragment, catchingFishJUnit));
                } else {
                    ((Choreographer) this.CatchingFishDaggerWebsocket).postFrameCallback(catchingFishJUnit);
                    catchingFishKtorMockk.CatchingFishDaggerHiltFAB(new CatchingFishOkHttpRedux(3, this, catchingFishJUnit));
                }
                return catchingFishKtorMockk.CatchingFishNavigation();
            default:
                if (catchingFishStateFlowGson instanceof CatchingFishToastContextMVP) {
                    catchingFishToastContextMVP = (CatchingFishToastContextMVP) catchingFishStateFlowGson;
                    int i2 = catchingFishToastContextMVP.CatchingFishFragmentHandler;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        catchingFishToastContextMVP.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                        Object obj = catchingFishToastContextMVP.CatchingFishViewModelFAB;
                        catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        i = catchingFishToastContextMVP.CatchingFishFragmentHandler;
                        if (i != 0) {
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                            CatchingFishWebsocketRoom catchingFishWebsocketRoom = (CatchingFishWebsocketRoom) this.CatchingFishWorkManager;
                            catchingFishToastContextMVP.CatchingFishViewModelScope = catchingFishServiceHandler;
                            catchingFishToastContextMVP.CatchingFishFragmentHandler = 1;
                            synchronized (catchingFishWebsocketRoom.CatchingFishSnackbar) {
                                z = catchingFishWebsocketRoom.CatchingFishParcelableFAB;
                            }
                            if (!z) {
                                CatchingFishKtorMockk catchingFishKtorMockk2 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishToastContextMVP));
                                catchingFishKtorMockk2.CatchingFish();
                                synchronized (catchingFishWebsocketRoom.CatchingFishSnackbar) {
                                    ((ArrayList) catchingFishWebsocketRoom.CatchingFishCoroutine).add(catchingFishKtorMockk2);
                                }
                                catchingFishKtorMockk2.CatchingFishDaggerHiltFAB(new CatchingFishWorkManagerHilt(1, catchingFishWebsocketRoom, catchingFishKtorMockk2));
                                CatchingFishNavigation = catchingFishKtorMockk2.CatchingFishNavigation();
                                if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                                    CatchingFishNavigation = CatchingFishRealmContext.CatchingFishParcelableFAB;
                                    break;
                                }
                            } else {
                                CatchingFishNavigation = CatchingFishRealmContext.CatchingFishParcelableFAB;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                                return obj;
                            }
                            catchingFishServiceHandler = catchingFishToastContextMVP.CatchingFishViewModelScope;
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        }
                        CatchingFishNavigationRedux catchingFishNavigationRedux = (CatchingFishNavigationRedux) this.CatchingFishDaggerWebsocket;
                        catchingFishToastContextMVP.CatchingFishViewModelScope = null;
                        catchingFishToastContextMVP.CatchingFishFragmentHandler = 2;
                        CatchingFishOkHttp = catchingFishNavigationRedux.CatchingFishOkHttp(catchingFishServiceHandler, catchingFishToastContextMVP);
                        if (CatchingFishOkHttp != catchingFishXMLLayoutMockk) {
                            return CatchingFishOkHttp;
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                }
                catchingFishToastContextMVP = new CatchingFishToastContextMVP(this, catchingFishStateFlowGson);
                Object obj2 = catchingFishToastContextMVP.CatchingFishViewModelFAB;
                catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                i = catchingFishToastContextMVP.CatchingFishFragmentHandler;
                if (i != 0) {
                }
                CatchingFishNavigationRedux catchingFishNavigationRedux2 = (CatchingFishNavigationRedux) this.CatchingFishDaggerWebsocket;
                catchingFishToastContextMVP.CatchingFishViewModelScope = null;
                catchingFishToastContextMVP.CatchingFishFragmentHandler = 2;
                CatchingFishOkHttp = catchingFishNavigationRedux2.CatchingFishOkHttp(catchingFishServiceHandler, catchingFishToastContextMVP);
                if (CatchingFishOkHttp != catchingFishXMLLayoutMockk) {
                }
                return catchingFishXMLLayoutMockk;
        }
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishReduxKtor(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        switch (this.CatchingFishReduxKtor) {
        }
        return CatchingFishAdMobFAB.CatchingFishMVPRobolectric(this, catchingFishGlidePayPal);
    }

    public CatchingFishWebsocketWidget(CatchingFishNavigationRedux catchingFishNavigationRedux) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishDaggerWebsocket = catchingFishNavigationRedux;
        this.CatchingFishWorkManager = new CatchingFishWebsocketRoom();
    }
}
