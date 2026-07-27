package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class CatchingFishFragmentMVVM {
    public CatchingFishGradleMVVM CatchingFishCloudMessaging;
    public CatchingFishGradleMVVM CatchingFishEspressoTesting;
    public CatchingFishGradleMVVM CatchingFishFragmentHandler;
    public CatchingFishGradleMVVM CatchingFishLayout;
    public CatchingFishLayoutRoomFAB CatchingFishParcelableFAB = new CatchingFishLayoutKtor();
    public CatchingFishLayoutRoomFAB CatchingFishSnackbar = new CatchingFishLayoutKtor();
    public CatchingFishLayoutRoomFAB CatchingFishCoroutine = new CatchingFishLayoutKtor();
    public CatchingFishLayoutRoomFAB CatchingFishReduxKtor = new CatchingFishLayoutKtor();
    public CatchingFishCameraXGradle CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(0.0f);
    public CatchingFishCameraXGradle CatchingFishWorkManager = new CatchingFishEspressoTesting(0.0f);
    public CatchingFishCameraXGradle CatchingFishViewModelScope = new CatchingFishEspressoTesting(0.0f);
    public CatchingFishCameraXGradle CatchingFishViewModelFAB = new CatchingFishEspressoTesting(0.0f);

    public CatchingFishFragmentMVVM() {
        int i = 0;
        this.CatchingFishLayout = new CatchingFishGradleMVVM(i);
        this.CatchingFishFragmentHandler = new CatchingFishGradleMVVM(i);
        this.CatchingFishCloudMessaging = new CatchingFishGradleMVVM(i);
        this.CatchingFishEspressoTesting = new CatchingFishGradleMVVM(i);
    }

    public static CatchingFishCameraXGradle CatchingFishCoroutine(TypedArray typedArray, int i, CatchingFishCameraXGradle catchingFishCameraXGradle) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new CatchingFishEspressoTesting(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new CatchingFishGsonRobolectric(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return catchingFishCameraXGradle;
    }

    public static CatchingFishKtorMVI CatchingFishParcelableFAB(Context context, int i, int i2, CatchingFishEspressoTesting catchingFishEspressoTesting) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(CatchingFishSnackbarPicasso.CatchingFishGsonAppCompat);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            CatchingFishCameraXGradle CatchingFishCoroutine = CatchingFishCoroutine(obtainStyledAttributes, 5, catchingFishEspressoTesting);
            CatchingFishCameraXGradle CatchingFishCoroutine2 = CatchingFishCoroutine(obtainStyledAttributes, 8, CatchingFishCoroutine);
            CatchingFishCameraXGradle CatchingFishCoroutine3 = CatchingFishCoroutine(obtainStyledAttributes, 9, CatchingFishCoroutine);
            CatchingFishCameraXGradle CatchingFishCoroutine4 = CatchingFishCoroutine(obtainStyledAttributes, 7, CatchingFishCoroutine);
            CatchingFishCameraXGradle CatchingFishCoroutine5 = CatchingFishCoroutine(obtainStyledAttributes, 6, CatchingFishCoroutine);
            CatchingFishKtorMVI catchingFishKtorMVI = new CatchingFishKtorMVI();
            CatchingFishLayoutRoomFAB CatchingFishViewModelFAB = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i4);
            catchingFishKtorMVI.CatchingFishParcelableFAB = CatchingFishViewModelFAB;
            CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB);
            catchingFishKtorMVI.CatchingFishDaggerWebsocket = CatchingFishCoroutine2;
            CatchingFishLayoutRoomFAB CatchingFishViewModelFAB2 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i5);
            catchingFishKtorMVI.CatchingFishSnackbar = CatchingFishViewModelFAB2;
            CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB2);
            catchingFishKtorMVI.CatchingFishWorkManager = CatchingFishCoroutine3;
            CatchingFishLayoutRoomFAB CatchingFishViewModelFAB3 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i6);
            catchingFishKtorMVI.CatchingFishCoroutine = CatchingFishViewModelFAB3;
            CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB3);
            catchingFishKtorMVI.CatchingFishViewModelScope = CatchingFishCoroutine4;
            CatchingFishLayoutRoomFAB CatchingFishViewModelFAB4 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i7);
            catchingFishKtorMVI.CatchingFishReduxKtor = CatchingFishViewModelFAB4;
            CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB4);
            catchingFishKtorMVI.CatchingFishViewModelFAB = CatchingFishCoroutine5;
            return catchingFishKtorMVI;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static CatchingFishKtorMVI CatchingFishSnackbar(Context context, AttributeSet attributeSet, int i, int i2) {
        CatchingFishEspressoTesting catchingFishEspressoTesting = new CatchingFishEspressoTesting(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishNavigation, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return CatchingFishParcelableFAB(context, resourceId, resourceId2, catchingFishEspressoTesting);
    }

    public final boolean CatchingFishDaggerWebsocket(RectF rectF) {
        boolean z = this.CatchingFishEspressoTesting.getClass().equals(CatchingFishGradleMVVM.class) && this.CatchingFishFragmentHandler.getClass().equals(CatchingFishGradleMVVM.class) && this.CatchingFishLayout.getClass().equals(CatchingFishGradleMVVM.class) && this.CatchingFishCloudMessaging.getClass().equals(CatchingFishGradleMVVM.class);
        float CatchingFishParcelableFAB = this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(rectF);
        return z && ((this.CatchingFishWorkManager.CatchingFishParcelableFAB(rectF) > CatchingFishParcelableFAB ? 1 : (this.CatchingFishWorkManager.CatchingFishParcelableFAB(rectF) == CatchingFishParcelableFAB ? 0 : -1)) == 0 && (this.CatchingFishViewModelFAB.CatchingFishParcelableFAB(rectF) > CatchingFishParcelableFAB ? 1 : (this.CatchingFishViewModelFAB.CatchingFishParcelableFAB(rectF) == CatchingFishParcelableFAB ? 0 : -1)) == 0 && (this.CatchingFishViewModelScope.CatchingFishParcelableFAB(rectF) > CatchingFishParcelableFAB ? 1 : (this.CatchingFishViewModelScope.CatchingFishParcelableFAB(rectF) == CatchingFishParcelableFAB ? 0 : -1)) == 0) && CatchingFishReduxKtor();
    }

    public final boolean CatchingFishReduxKtor() {
        return (this.CatchingFishSnackbar instanceof CatchingFishLayoutKtor) && (this.CatchingFishParcelableFAB instanceof CatchingFishLayoutKtor) && (this.CatchingFishCoroutine instanceof CatchingFishLayoutKtor) && (this.CatchingFishReduxKtor instanceof CatchingFishLayoutKtor);
    }

    public final CatchingFishKtorMVI CatchingFishWorkManager() {
        CatchingFishKtorMVI catchingFishKtorMVI = new CatchingFishKtorMVI();
        catchingFishKtorMVI.CatchingFishParcelableFAB = this.CatchingFishParcelableFAB;
        catchingFishKtorMVI.CatchingFishSnackbar = this.CatchingFishSnackbar;
        catchingFishKtorMVI.CatchingFishCoroutine = this.CatchingFishCoroutine;
        catchingFishKtorMVI.CatchingFishReduxKtor = this.CatchingFishReduxKtor;
        catchingFishKtorMVI.CatchingFishDaggerWebsocket = this.CatchingFishDaggerWebsocket;
        catchingFishKtorMVI.CatchingFishWorkManager = this.CatchingFishWorkManager;
        catchingFishKtorMVI.CatchingFishViewModelScope = this.CatchingFishViewModelScope;
        catchingFishKtorMVI.CatchingFishViewModelFAB = this.CatchingFishViewModelFAB;
        catchingFishKtorMVI.CatchingFishLayout = this.CatchingFishLayout;
        catchingFishKtorMVI.CatchingFishFragmentHandler = this.CatchingFishFragmentHandler;
        catchingFishKtorMVI.CatchingFishCloudMessaging = this.CatchingFishCloudMessaging;
        catchingFishKtorMVI.CatchingFishEspressoTesting = this.CatchingFishEspressoTesting;
        return catchingFishKtorMVI;
    }

    public final String toString() {
        return "[" + this.CatchingFishDaggerWebsocket + ", " + this.CatchingFishWorkManager + ", " + this.CatchingFishViewModelScope + ", " + this.CatchingFishViewModelFAB + "]";
    }
}
