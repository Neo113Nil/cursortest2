package androidx.compose.ui.input.rotary;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishGlideContext;
import kotlin.text.CatchingFishMVI;

/* loaded from: classes.dex */
final class RotaryInputElement extends CatchingFishAppCompatMVVM {
    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        ((CatchingFishGlideContext) catchingFishFABStripeAPIFAB).CatchingFishNavigation = CatchingFishMVI.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishMVI catchingFishMVI = CatchingFishMVI.CatchingFishViewModelFAB;
        CatchingFishGlideContext catchingFishGlideContext = new CatchingFishGlideContext();
        catchingFishGlideContext.CatchingFishNavigation = catchingFishMVI;
        return catchingFishGlideContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return CatchingFishMVI.CatchingFishViewModelFAB.hashCode() * 31;
    }
}
