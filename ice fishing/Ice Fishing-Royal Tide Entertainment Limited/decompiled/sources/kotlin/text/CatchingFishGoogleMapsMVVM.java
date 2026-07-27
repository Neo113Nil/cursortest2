package kotlin.text;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsMVVM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CatchingFishKtorPicassoMVVM CatchingFishCoroutine;
    public final /* synthetic */ View CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishGoogleMapsJUnit CatchingFishParcelableFAB;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishKtorPicassoMVVM CatchingFishSnackbar;

    public CatchingFishGoogleMapsMVVM(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM2, int i, View view) {
        this.CatchingFishParcelableFAB = catchingFishGoogleMapsJUnit;
        this.CatchingFishSnackbar = catchingFishKtorPicassoMVVM;
        this.CatchingFishCoroutine = catchingFishKtorPicassoMVVM2;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit = this.CatchingFishParcelableFAB;
        catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(animatedFraction);
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishSnackbar;
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        float CatchingFishCoroutine = catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishCoroutine();
        PathInterpolator pathInterpolator = CatchingFishAdMobCameraXFAB.CatchingFishDaggerWebsocket;
        int i = Build.VERSION.SDK_INT;
        CatchingFishManifestFABMVI catchingFishRealmView = i >= 36 ? new CatchingFishRealmView(catchingFishKtorPicassoMVVM) : i >= 35 ? new CatchingFishRealmHiltGradle(catchingFishKtorPicassoMVVM) : i >= 34 ? new CatchingFishRoomAdMobMVP(catchingFishKtorPicassoMVVM) : i >= 31 ? new CatchingFishJUnitView(catchingFishKtorPicassoMVVM) : i >= 30 ? new CatchingFishMVPLayoutRealm(catchingFishKtorPicassoMVVM) : i >= 29 ? new CatchingFishStateFlowBundle(catchingFishKtorPicassoMVVM) : new CatchingFishAdMobMVPGlide(catchingFishKtorPicassoMVVM);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.CatchingFishReduxKtor & i2) == 0) {
                catchingFishRealmView.CatchingFishReduxKtor(i2, catchingFishFragmentHilt.CatchingFishLayout(i2));
            } else {
                CatchingFishReduxPayPal CatchingFishLayout = catchingFishFragmentHilt.CatchingFishLayout(i2);
                CatchingFishReduxPayPal CatchingFishLayout2 = this.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishLayout(i2);
                float f = 1.0f - CatchingFishCoroutine;
                catchingFishRealmView.CatchingFishReduxKtor(i2, CatchingFishKtorPicassoMVVM.CatchingFishDaggerWebsocket(CatchingFishLayout, (int) (((CatchingFishLayout.CatchingFishParcelableFAB - CatchingFishLayout2.CatchingFishParcelableFAB) * f) + 0.5d), (int) (((CatchingFishLayout.CatchingFishSnackbar - CatchingFishLayout2.CatchingFishSnackbar) * f) + 0.5d), (int) (((CatchingFishLayout.CatchingFishCoroutine - CatchingFishLayout2.CatchingFishCoroutine) * f) + 0.5d), (int) (((CatchingFishLayout.CatchingFishReduxKtor - CatchingFishLayout2.CatchingFishReduxKtor) * f) + 0.5d)));
            }
        }
        CatchingFishAdMobCameraXFAB.CatchingFishViewModelFAB(this.CatchingFishDaggerWebsocket, catchingFishRealmView.CatchingFishSnackbar(), Collections.singletonList(catchingFishGoogleMapsJUnit));
    }
}
