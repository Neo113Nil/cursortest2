package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMVIDagger implements CatchingFishIntentManifest {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public final CatchingFishMVIBundle CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishMVIDagger(CatchingFishFragmentWidget catchingFishFragmentWidget, CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishMockkView catchingFishMockkView) {
        this.CatchingFishDaggerWebsocket = catchingFishFragmentWidget;
        this.CatchingFishWorkManager = catchingFishIntentManifest;
        this.CatchingFishViewModelScope = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishIntentManifest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishLayout(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFragmentPicasso catchingFishFragmentPicasso;
        Object obj2;
        int i;
        CatchingFishMVIDagger catchingFishMVIDagger;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (catchingFishWebsocketGradle instanceof CatchingFishFragmentPicasso) {
                    catchingFishFragmentPicasso = (CatchingFishFragmentPicasso) catchingFishWebsocketGradle;
                    int i2 = catchingFishFragmentPicasso.CatchingFishCloudMessaging;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        catchingFishFragmentPicasso.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                        obj2 = catchingFishFragmentPicasso.CatchingFishLayout;
                        i = catchingFishFragmentPicasso.CatchingFishCloudMessaging;
                        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = catchingFishFragmentPicasso.CatchingFishViewModelFAB;
                                    catchingFishMVIDagger = catchingFishFragmentPicasso.CatchingFishViewModelScope;
                                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                                } else if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                            return catchingFishRealmContext;
                        }
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                        if (((CatchingFishFragmentWidget) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor) {
                            CatchingFishIntentManifest catchingFishIntentManifest = (CatchingFishIntentManifest) this.CatchingFishWorkManager;
                            catchingFishFragmentPicasso.CatchingFishCloudMessaging = 1;
                            if (catchingFishIntentManifest.CatchingFishLayout(obj, catchingFishFragmentPicasso) != catchingFishXMLLayoutMockk) {
                                return catchingFishRealmContext;
                            }
                        } else {
                            catchingFishFragmentPicasso.CatchingFishViewModelScope = this;
                            catchingFishFragmentPicasso.CatchingFishViewModelFAB = obj;
                            catchingFishFragmentPicasso.CatchingFishCloudMessaging = 2;
                            obj2 = this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket(obj, catchingFishFragmentPicasso);
                            if (obj2 != catchingFishXMLLayoutMockk) {
                                catchingFishMVIDagger = this;
                            }
                        }
                        return catchingFishXMLLayoutMockk;
                        if (!((Boolean) obj2).booleanValue()) {
                            return catchingFishRealmContext;
                        }
                        ((CatchingFishFragmentWidget) catchingFishMVIDagger.CatchingFishDaggerWebsocket).CatchingFishReduxKtor = true;
                        CatchingFishIntentManifest catchingFishIntentManifest2 = (CatchingFishIntentManifest) catchingFishMVIDagger.CatchingFishWorkManager;
                        catchingFishFragmentPicasso.CatchingFishViewModelScope = null;
                        catchingFishFragmentPicasso.CatchingFishViewModelFAB = null;
                        catchingFishFragmentPicasso.CatchingFishCloudMessaging = 3;
                        if (catchingFishIntentManifest2.CatchingFishLayout(obj, catchingFishFragmentPicasso) != catchingFishXMLLayoutMockk) {
                            return catchingFishRealmContext;
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                }
                catchingFishFragmentPicasso = new CatchingFishFragmentPicasso(this, catchingFishWebsocketGradle);
                obj2 = catchingFishFragmentPicasso.CatchingFishLayout;
                i = catchingFishFragmentPicasso.CatchingFishCloudMessaging;
                CatchingFishRealmContext catchingFishRealmContext2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object CatchingFishCustomViewJUnit = CatchingFishLayoutRoomFAB.CatchingFishCustomViewJUnit((CatchingFishManifestMockk) this.CatchingFishDaggerWebsocket, obj, this.CatchingFishWorkManager, (CatchingFishGradleAsyncTask) this.CatchingFishViewModelScope, catchingFishWebsocketGradle);
                return CatchingFishCustomViewJUnit == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishCustomViewJUnit : CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    public CatchingFishMVIDagger(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishManifestMockk catchingFishManifestMockk) {
        this.CatchingFishDaggerWebsocket = catchingFishManifestMockk;
        this.CatchingFishWorkManager = CatchingFishAdMobFAB.CatchingFishPayPalLiveData(catchingFishManifestMockk);
        this.CatchingFishViewModelScope = new CatchingFishGradleAsyncTask(catchingFishIntentManifest, null);
    }
}
