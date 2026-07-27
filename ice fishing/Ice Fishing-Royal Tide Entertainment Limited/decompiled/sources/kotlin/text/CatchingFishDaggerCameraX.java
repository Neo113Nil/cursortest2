package kotlin.text;

import android.view.WindowInsets;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishDaggerCameraX extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishBiometricRoom CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishReduxRetrofit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishDaggerCameraX(CatchingFishReduxRetrofit catchingFishReduxRetrofit, CatchingFishBiometricRoom catchingFishBiometricRoom, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishReduxRetrofit;
        this.CatchingFishViewModelScope = catchingFishBiometricRoom;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        WindowInsets CatchingFishWorkManager;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAdMobJUnit catchingFishAdMobJUnit = (CatchingFishAdMobJUnit) obj;
                CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishAdMobJUnit instanceof CatchingFishGradleCameraX ? (CatchingFishGradleCameraX) catchingFishAdMobJUnit : null;
                CatchingFishReduxRetrofit catchingFishReduxRetrofit = this.CatchingFishWorkManager;
                if (catchingFishGradleCameraX != null) {
                    HashMap<CatchingFishHiltBundle, CatchingFishBiometricRoom> holderToLayoutNode = catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishViewModelScope;
                    holderToLayoutNode.put(catchingFishReduxRetrofit, catchingFishBiometricRoom);
                    catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().addView(catchingFishReduxRetrofit);
                    catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(catchingFishBiometricRoom, catchingFishReduxRetrofit);
                    catchingFishReduxRetrofit.setImportantForAccessibility(1);
                    CatchingFishFABCameraX.CatchingFishOkHttp(catchingFishReduxRetrofit, new CatchingFishViewModelFlux(catchingFishGradleCameraX, catchingFishBiometricRoom, catchingFishGradleCameraX));
                }
                if (catchingFishReduxRetrofit.getView().getParent() != catchingFishReduxRetrofit) {
                    catchingFishReduxRetrofit.addView(catchingFishReduxRetrofit.getView());
                }
                break;
            case 1:
                CatchingFishLayoutRoomFAB.CatchingFishReduxKtor(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
            default:
                CatchingFishBiometricRoom catchingFishBiometricRoom2 = this.CatchingFishViewModelScope;
                CatchingFishReduxRetrofit catchingFishReduxRetrofit2 = this.CatchingFishWorkManager;
                CatchingFishLayoutRoomFAB.CatchingFishReduxKtor(catchingFishReduxRetrofit2, catchingFishBiometricRoom2);
                ((CatchingFishGradleCameraX) catchingFishReduxRetrofit2.CatchingFishWorkManager).CatchingFishCustomView = true;
                int[] iArr = catchingFishReduxRetrofit2.CatchingFishRoomDatabase;
                int i = iArr[0];
                int i2 = iArr[1];
                catchingFishReduxRetrofit2.getView().getLocationOnScreen(iArr);
                long j = catchingFishReduxRetrofit2.CatchingFishNavigation;
                long CatchingFishSensorManager = ((CatchingFishMockkCoroutine) obj).CatchingFishSensorManager();
                catchingFishReduxRetrofit2.CatchingFishNavigation = CatchingFishSensorManager;
                CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = catchingFishReduxRetrofit2.CatchingFish;
                if (catchingFishKtorPicassoMVVM != null && ((i != iArr[0] || i2 != iArr[1] || !CatchingFishRobolectricHilt.CatchingFish(j, CatchingFishSensorManager)) && (CatchingFishWorkManager = catchingFishReduxRetrofit2.CatchingFishEspressoTesting(catchingFishKtorPicassoMVVM).CatchingFishWorkManager()) != null)) {
                    catchingFishReduxRetrofit2.getView().dispatchApplyWindowInsets(CatchingFishWorkManager);
                }
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
