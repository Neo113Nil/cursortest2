package kotlin.text;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class CatchingFishMoshiStripeAPI extends CatchingFishFABMVVMFAB {
    public static final CatchingFishKtorPicassoMVVM CatchingFishSpannableWidget;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        CatchingFishSpannableWidget = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, windowInsets);
    }

    public CatchingFishMoshiStripeAPI(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public boolean CatchingFishCoroutineFlow(int i) {
        boolean isVisible;
        isVisible = this.CatchingFishCoroutine.isVisible(CatchingFishNavigationMoshi.CatchingFishParcelableFAB(i));
        return isVisible;
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishFragmentHandler(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.CatchingFishCoroutine.getInsetsIgnoringVisibility(CatchingFishNavigationMoshi.CatchingFishParcelableFAB(i));
        return CatchingFishReduxPayPal.CatchingFishCoroutine(insetsIgnoringVisibility);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishLayout(int i) {
        Insets insets;
        insets = this.CatchingFishCoroutine.getInsets(CatchingFishNavigationMoshi.CatchingFishParcelableFAB(i));
        return CatchingFishReduxPayPal.CatchingFishCoroutine(insets);
    }

    public CatchingFishMoshiStripeAPI(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishMoshiStripeAPI catchingFishMoshiStripeAPI) {
        super(catchingFishKtorPicassoMVVM, catchingFishMoshiStripeAPI);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public final void CatchingFishReduxKtor(View view) {
    }
}
