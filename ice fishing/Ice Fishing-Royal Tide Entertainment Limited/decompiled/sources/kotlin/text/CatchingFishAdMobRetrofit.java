package kotlin.text;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishAdMobRetrofit extends CatchingFishMVPMVPHilt {
    public CatchingFishAdMobRetrofit(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.CatchingFishCoroutine.consumeDisplayCutout();
        return CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, consumeDisplayCutout);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public CatchingFishIntentGsonRoom CatchingFishViewModelFAB() {
        DisplayCutout displayCutout;
        displayCutout = this.CatchingFishCoroutine.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new CatchingFishIntentGsonRoom(displayCutout);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishAdMobRetrofit)) {
            return false;
        }
        CatchingFishAdMobRetrofit catchingFishAdMobRetrofit = (CatchingFishAdMobRetrofit) obj;
        return Objects.equals(this.CatchingFishCoroutine, catchingFishAdMobRetrofit.CatchingFishCoroutine) && Objects.equals(this.CatchingFishViewModelScope, catchingFishAdMobRetrofit.CatchingFishViewModelScope) && CatchingFishRealmMoshiFAB.CatchingFishHandler(this.CatchingFishViewModelFAB, catchingFishAdMobRetrofit.CatchingFishViewModelFAB);
    }

    @Override // kotlin.text.CatchingFishFragmentHilt
    public int hashCode() {
        return this.CatchingFishCoroutine.hashCode();
    }

    public CatchingFishAdMobRetrofit(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishAdMobRetrofit catchingFishAdMobRetrofit) {
        super(catchingFishKtorPicassoMVVM, catchingFishAdMobRetrofit);
    }
}
