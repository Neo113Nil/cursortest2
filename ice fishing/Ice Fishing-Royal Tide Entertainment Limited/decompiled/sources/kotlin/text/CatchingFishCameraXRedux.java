package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishCameraXRedux implements CatchingFishIntentManifest {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishCameraXRedux(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // kotlin.text.CatchingFishIntentManifest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishLayout(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishSharedFlowHilt catchingFishSharedFlowHilt;
        int i;
        Object CatchingFishWorkManager;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (catchingFishWebsocketGradle instanceof CatchingFishSharedFlowHilt) {
                    catchingFishSharedFlowHilt = (CatchingFishSharedFlowHilt) catchingFishWebsocketGradle;
                    int i2 = catchingFishSharedFlowHilt.CatchingFishViewModelFAB;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        catchingFishSharedFlowHilt.CatchingFishViewModelFAB = i2 - Integer.MIN_VALUE;
                        Object obj2 = catchingFishSharedFlowHilt.CatchingFishViewModelScope;
                        i = catchingFishSharedFlowHilt.CatchingFishViewModelFAB;
                        if (i != 0) {
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                            CatchingFishIntentManifest catchingFishIntentManifest = (CatchingFishIntentManifest) this.CatchingFishDaggerWebsocket;
                            CatchingFishMVVMAndroidX catchingFishMVVMAndroidX = (CatchingFishMVVMAndroidX) obj;
                            if (catchingFishMVVMAndroidX instanceof CatchingFishBiometricMoshi) {
                                throw ((CatchingFishBiometricMoshi) catchingFishMVVMAndroidX).CatchingFishSnackbar;
                            }
                            if (!(catchingFishMVVMAndroidX instanceof CatchingFishMockkStripeAPI)) {
                                if (catchingFishMVVMAndroidX instanceof CatchingFishCardViewMockk ? true : catchingFishMVVMAndroidX instanceof CatchingFishToastSpannable) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new CatchingFishBiometricView();
                            }
                            Object obj3 = ((CatchingFishMockkStripeAPI) catchingFishMVVMAndroidX).CatchingFishSnackbar;
                            catchingFishSharedFlowHilt.CatchingFishViewModelFAB = 1;
                            Object CatchingFishLayout = catchingFishIntentManifest.CatchingFishLayout(obj3, catchingFishSharedFlowHilt);
                            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                            if (CatchingFishLayout == catchingFishXMLLayoutMockk) {
                                return catchingFishXMLLayoutMockk;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                        }
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                }
                catchingFishSharedFlowHilt = new CatchingFishSharedFlowHilt(this, catchingFishWebsocketGradle);
                Object obj22 = catchingFishSharedFlowHilt.CatchingFishViewModelScope;
                i = catchingFishSharedFlowHilt.CatchingFishViewModelFAB;
                if (i != 0) {
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishKtorView catchingFishKtorView = (CatchingFishKtorView) this.CatchingFishDaggerWebsocket;
                return ((catchingFishKtorView.CatchingFishCloudMessaging.CatchingFishLayout() instanceof CatchingFishCardViewMockk) || (CatchingFishWorkManager = CatchingFishKtorView.CatchingFishWorkManager(catchingFishKtorView, true, catchingFishWebsocketGradle)) != CatchingFishXMLLayoutMockk.CatchingFishReduxKtor) ? CatchingFishRealmContext.CatchingFishParcelableFAB : CatchingFishWorkManager;
            case 2:
                ((CatchingFishRoomGoogleMaps) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor = obj;
                throw new CatchingFishUnitTestingGson(this);
            default:
                ((CatchingFishNavigationRoom) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor.CatchingFishViewModelScope(((Number) obj).floatValue());
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
