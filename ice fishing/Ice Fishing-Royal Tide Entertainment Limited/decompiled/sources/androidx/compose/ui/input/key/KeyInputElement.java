package androidx.compose.ui.input.key;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishLayoutIntent;
import kotlin.text.CatchingFishRoomDaggerHilt;

/* loaded from: classes.dex */
final class KeyInputElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishRoomDaggerHilt CatchingFishParcelableFAB;

    public KeyInputElement(CatchingFishRoomDaggerHilt catchingFishRoomDaggerHilt) {
        this.CatchingFishParcelableFAB = catchingFishRoomDaggerHilt;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        ((CatchingFishLayoutIntent) catchingFishFABStripeAPIFAB).CatchingFishNavigation = this.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishLayoutIntent catchingFishLayoutIntent = new CatchingFishLayoutIntent();
        catchingFishLayoutIntent.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        return catchingFishLayoutIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.CatchingFishParcelableFAB == ((KeyInputElement) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() * 31;
    }
}
