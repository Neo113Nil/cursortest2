package kotlin.text;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class CatchingFishAdMobMVPGlide extends CatchingFishManifestFABMVI {
    public static boolean CatchingFishFragmentHandler = false;
    public static Constructor CatchingFishLayout = null;
    public static boolean CatchingFishViewModelFAB = false;
    public static Field CatchingFishViewModelScope;
    public WindowInsets CatchingFishDaggerWebsocket;
    public CatchingFishReduxPayPal CatchingFishWorkManager;

    public CatchingFishAdMobMVPGlide() {
        this.CatchingFishDaggerWebsocket = CatchingFishFragmentHandler();
    }

    private static WindowInsets CatchingFishFragmentHandler() {
        if (!CatchingFishViewModelFAB) {
            try {
                CatchingFishViewModelScope = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            CatchingFishViewModelFAB = true;
        }
        Field field = CatchingFishViewModelScope;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!CatchingFishFragmentHandler) {
            try {
                CatchingFishLayout = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            CatchingFishFragmentHandler = true;
        }
        Constructor constructor = CatchingFishLayout;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishManifestFABMVI
    public CatchingFishKtorPicassoMVVM CatchingFishSnackbar() {
        CatchingFishParcelableFAB();
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope2 = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, this.CatchingFishDaggerWebsocket);
        CatchingFishReduxPayPal[] catchingFishReduxPayPalArr = this.CatchingFishSnackbar;
        CatchingFishFragmentHilt catchingFishFragmentHilt = CatchingFishViewModelScope2.CatchingFishParcelableFAB;
        catchingFishFragmentHilt.CatchingFishSpannableWidget(catchingFishReduxPayPalArr);
        catchingFishFragmentHilt.CatchingFishCardViewRealm(this.CatchingFishWorkManager);
        catchingFishFragmentHilt.CatchingFishDaggerHiltFAB(null);
        catchingFishFragmentHilt.CatchingFishCardViewView(this.CatchingFishCoroutine);
        catchingFishFragmentHilt.CatchingFishMVPRobolectric(this.CatchingFishReduxKtor);
        return CatchingFishViewModelScope2;
    }

    @Override // kotlin.text.CatchingFishManifestFABMVI
    public void CatchingFishViewModelFAB(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        WindowInsets windowInsets = this.CatchingFishDaggerWebsocket;
        if (windowInsets != null) {
            this.CatchingFishDaggerWebsocket = windowInsets.replaceSystemWindowInsets(catchingFishReduxPayPal.CatchingFishParcelableFAB, catchingFishReduxPayPal.CatchingFishSnackbar, catchingFishReduxPayPal.CatchingFishCoroutine, catchingFishReduxPayPal.CatchingFishReduxKtor);
        }
    }

    @Override // kotlin.text.CatchingFishManifestFABMVI
    public void CatchingFishWorkManager(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        this.CatchingFishWorkManager = catchingFishReduxPayPal;
    }

    public CatchingFishAdMobMVPGlide(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        super(catchingFishKtorPicassoMVVM);
        this.CatchingFishDaggerWebsocket = catchingFishKtorPicassoMVVM.CatchingFishWorkManager();
    }
}
