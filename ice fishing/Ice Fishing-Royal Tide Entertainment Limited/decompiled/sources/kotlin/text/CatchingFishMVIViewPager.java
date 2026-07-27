package kotlin.text;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class CatchingFishMVIViewPager extends CatchingFishLifecycleWidget {
    public static final CatchingFishKtorPicassoMVVM CatchingFishParcelableFlux;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        CatchingFishParcelableFlux = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, windowInsets);
    }

    public CatchingFishMVIViewPager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
    }

    @Override // kotlin.text.CatchingFishMoshiStripeAPI, kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public boolean CatchingFishCoroutineFlow(int i) {
        boolean isVisible;
        isVisible = this.CatchingFishCoroutine.isVisible(CatchingFishLiveDataGlide.CatchingFishParcelableFAB(i));
        return isVisible;
    }

    @Override // kotlin.text.CatchingFishMoshiStripeAPI, kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishFragmentHandler(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.CatchingFishCoroutine.getInsetsIgnoringVisibility(CatchingFishLiveDataGlide.CatchingFishParcelableFAB(i));
        return CatchingFishReduxPayPal.CatchingFishCoroutine(insetsIgnoringVisibility);
    }

    @Override // kotlin.text.CatchingFishMoshiStripeAPI, kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public CatchingFishReduxPayPal CatchingFishLayout(int i) {
        Insets insets;
        insets = this.CatchingFishCoroutine.getInsets(CatchingFishLiveDataGlide.CatchingFishParcelableFAB(i));
        return CatchingFishReduxPayPal.CatchingFishCoroutine(insets);
    }

    public CatchingFishMVIViewPager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishMVIViewPager catchingFishMVIViewPager) {
        super(catchingFishKtorPicassoMVVM, catchingFishMVIViewPager);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishStateLiveData(View view) {
    }
}
