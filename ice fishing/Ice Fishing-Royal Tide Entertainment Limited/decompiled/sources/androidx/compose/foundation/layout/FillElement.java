package androidx.compose.foundation.layout;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishEspressoCameraX;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishMVPLiveData;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends CatchingFishAppCompatMVVM {
    public final int CatchingFishParcelableFAB;

    public FillElement(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishEspressoCameraX catchingFishEspressoCameraX = (CatchingFishEspressoCameraX) catchingFishFABStripeAPIFAB;
        catchingFishEspressoCameraX.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishEspressoCameraX.CatchingFish = 1.0f;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        CatchingFishEspressoCameraX catchingFishEspressoCameraX = new CatchingFishEspressoCameraX();
        catchingFishEspressoCameraX.CatchingFishNavigation = this.CatchingFishParcelableFAB;
        catchingFishEspressoCameraX.CatchingFish = 1.0f;
        return catchingFishEspressoCameraX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.CatchingFishParcelableFAB == ((FillElement) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (CatchingFishMVPLiveData.CatchingFishParcelableFlux(this.CatchingFishParcelableFAB) * 31);
    }
}
