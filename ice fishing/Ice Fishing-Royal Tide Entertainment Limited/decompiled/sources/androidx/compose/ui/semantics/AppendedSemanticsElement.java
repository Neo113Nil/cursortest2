package androidx.compose.ui.semantics;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishGlideStateFlow;
import kotlin.text.CatchingFishJUnitLayout;
import kotlin.text.CatchingFishServiceHandler;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends CatchingFishAppCompatMVVM implements CatchingFishJUnitLayout {
    public final boolean CatchingFishParcelableFAB;
    public final CatchingFishServiceHandler CatchingFishSnackbar;

    public AppendedSemanticsElement(CatchingFishServiceHandler catchingFishServiceHandler, boolean z) {
        this.CatchingFishParcelableFAB = z;
        this.CatchingFishSnackbar = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishGlideStateFlow catchingFishGlideStateFlow = (CatchingFishGlideStateFlow) catchingFishFABStripeAPIFAB;
        catchingFishGlideStateFlow.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishGlideStateFlow.CatchingFish = this.CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishGlideStateFlow catchingFishGlideStateFlow = new CatchingFishGlideStateFlow();
        catchingFishGlideStateFlow.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishGlideStateFlow.CatchingFish = this.CatchingFishSnackbar;
        return catchingFishGlideStateFlow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.CatchingFishParcelableFAB == appendedSemanticsElement.CatchingFishParcelableFAB && this.CatchingFishSnackbar == appendedSemanticsElement.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode() + (Boolean.hashCode(this.CatchingFishParcelableFAB) * 31);
    }
}
