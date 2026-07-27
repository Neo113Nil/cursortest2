package kotlin.text;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGlideAdMobHilt implements View.OnApplyWindowInsetsListener {
    public final CatchingFishReduxLayout CatchingFishParcelableFAB;
    public CatchingFishKtorPicassoMVVM CatchingFishSnackbar;

    public CatchingFishGlideAdMobHilt(View view, CatchingFishReduxLayout catchingFishReduxLayout) {
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM;
        this.CatchingFishParcelableFAB = catchingFishReduxLayout;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB = CatchingFishStripeAPIHilt.CatchingFishParcelableFAB(view);
        if (CatchingFishParcelableFAB != null) {
            int i = Build.VERSION.SDK_INT;
            catchingFishKtorPicassoMVVM = (i >= 36 ? new CatchingFishRealmView(CatchingFishParcelableFAB) : i >= 35 ? new CatchingFishRealmHiltGradle(CatchingFishParcelableFAB) : i >= 34 ? new CatchingFishRoomAdMobMVP(CatchingFishParcelableFAB) : i >= 31 ? new CatchingFishJUnitView(CatchingFishParcelableFAB) : i >= 30 ? new CatchingFishMVPLayoutRealm(CatchingFishParcelableFAB) : i >= 29 ? new CatchingFishStateFlowBundle(CatchingFishParcelableFAB) : new CatchingFishAdMobMVPGlide(CatchingFishParcelableFAB)).CatchingFishSnackbar();
        } else {
            catchingFishKtorPicassoMVVM = null;
        }
        this.CatchingFishSnackbar = catchingFishKtorPicassoMVVM;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.CatchingFishSnackbar = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, windowInsets);
            return CatchingFishAdMobCameraXFAB.CatchingFishFragmentHandler(view, windowInsets);
        }
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, windowInsets);
        CatchingFishFragmentHilt catchingFishFragmentHilt = CatchingFishViewModelScope.CatchingFishParcelableFAB;
        if (this.CatchingFishSnackbar == null) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            this.CatchingFishSnackbar = CatchingFishStripeAPIHilt.CatchingFishParcelableFAB(view);
        }
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = CatchingFishViewModelScope;
            return CatchingFishAdMobCameraXFAB.CatchingFishFragmentHandler(view, windowInsets);
        }
        CatchingFishReduxLayout CatchingFishCloudMessaging = CatchingFishAdMobCameraXFAB.CatchingFishCloudMessaging(view);
        if (CatchingFishCloudMessaging != null && Objects.equals((CatchingFishKtorPicassoMVVM) CatchingFishCloudMessaging.CatchingFishDaggerWebsocket, CatchingFishViewModelScope)) {
            return CatchingFishAdMobCameraXFAB.CatchingFishFragmentHandler(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishSnackbar;
        int i = 1;
        while (i <= 512) {
            CatchingFishReduxPayPal CatchingFishLayout = catchingFishFragmentHilt.CatchingFishLayout(i);
            CatchingFishReduxPayPal CatchingFishLayout2 = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(i);
            int i2 = CatchingFishLayout.CatchingFishParcelableFAB;
            int i3 = CatchingFishLayout.CatchingFishReduxKtor;
            int i4 = CatchingFishLayout.CatchingFishCoroutine;
            int i5 = CatchingFishLayout.CatchingFishSnackbar;
            int i6 = CatchingFishLayout2.CatchingFishParcelableFAB;
            int i7 = CatchingFishLayout2.CatchingFishReduxKtor;
            int i8 = CatchingFishLayout2.CatchingFishCoroutine;
            int i9 = CatchingFishLayout2.CatchingFishSnackbar;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.CatchingFishSnackbar = CatchingFishViewModelScope;
            return CatchingFishAdMobCameraXFAB.CatchingFishFragmentHandler(view, windowInsets);
        }
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM2 = this.CatchingFishSnackbar;
        CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit = new CatchingFishGoogleMapsJUnit(i12, (i10 & 8) != 0 ? CatchingFishAdMobCameraXFAB.CatchingFishDaggerWebsocket : (i11 & 8) != 0 ? CatchingFishAdMobCameraXFAB.CatchingFishWorkManager : (i10 & 519) != 0 ? CatchingFishAdMobCameraXFAB.CatchingFishViewModelScope : (i11 & 519) != 0 ? CatchingFishAdMobCameraXFAB.CatchingFishViewModelFAB : null, (i12 & 8) != 0 ? 160L : 250L);
        catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishSnackbar());
        CatchingFishReduxPayPal CatchingFishLayout3 = catchingFishFragmentHilt.CatchingFishLayout(i12);
        CatchingFishReduxPayPal CatchingFishLayout4 = catchingFishKtorPicassoMVVM2.CatchingFishParcelableFAB.CatchingFishLayout(i12);
        int min = Math.min(CatchingFishLayout3.CatchingFishParcelableFAB, CatchingFishLayout4.CatchingFishParcelableFAB);
        int i13 = CatchingFishLayout3.CatchingFishSnackbar;
        int i14 = CatchingFishLayout4.CatchingFishSnackbar;
        int min2 = Math.min(i13, i14);
        int i15 = CatchingFishLayout3.CatchingFishCoroutine;
        int i16 = CatchingFishLayout4.CatchingFishCoroutine;
        int min3 = Math.min(i15, i16);
        int i17 = CatchingFishLayout3.CatchingFishReduxKtor;
        int i18 = CatchingFishLayout4.CatchingFishReduxKtor;
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(25, CatchingFishReduxPayPal.CatchingFishSnackbar(min, min2, min3, Math.min(i17, i18)), CatchingFishReduxPayPal.CatchingFishSnackbar(Math.max(CatchingFishLayout3.CatchingFishParcelableFAB, CatchingFishLayout4.CatchingFishParcelableFAB), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        CatchingFishAdMobCameraXFAB.CatchingFishViewModelScope(view, catchingFishGoogleMapsJUnit, CatchingFishViewModelScope, false);
        duration.addUpdateListener(new CatchingFishGoogleMapsMVVM(catchingFishGoogleMapsJUnit, CatchingFishViewModelScope, catchingFishKtorPicassoMVVM2, i12, view));
        duration.addListener(new CatchingFishExoPlayerPayPal(view, catchingFishGoogleMapsJUnit));
        CatchingFishReduxMockkRealm.CatchingFishParcelableFAB(view, new CatchingFishMVPSharedFlow(view, catchingFishGoogleMapsJUnit, catchingFishViewModelIntent, duration));
        this.CatchingFishSnackbar = CatchingFishViewModelScope;
        return CatchingFishAdMobCameraXFAB.CatchingFishFragmentHandler(view, windowInsets);
    }
}
