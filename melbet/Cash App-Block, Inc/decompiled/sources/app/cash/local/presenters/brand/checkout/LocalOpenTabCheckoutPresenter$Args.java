package app.cash.local.presenters.brand.checkout;

import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.LocalErrorResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalOpenTabCheckoutPresenter$Args {
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final LocalErrorResponse errors;
    public final BrandSpotSyncTokens syncTokens;

    public LocalOpenTabCheckoutPresenter$Args(BrandSpot brandSpot, AttributionKey attributionKey, LocalErrorResponse localErrorResponse, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.errors = localErrorResponse;
        this.syncTokens = brandSpotSyncTokens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalOpenTabCheckoutPresenter$Args)) {
            return false;
        }
        LocalOpenTabCheckoutPresenter$Args localOpenTabCheckoutPresenter$Args = (LocalOpenTabCheckoutPresenter$Args) obj;
        return Intrinsics.areEqual(this.brandSpot, localOpenTabCheckoutPresenter$Args.brandSpot) && Intrinsics.areEqual(this.attributionKey, localOpenTabCheckoutPresenter$Args.attributionKey) && Intrinsics.areEqual(this.errors, localOpenTabCheckoutPresenter$Args.errors) && Intrinsics.areEqual(this.syncTokens, localOpenTabCheckoutPresenter$Args.syncTokens);
    }

    public final int hashCode() {
        int hashCode = (this.attributionKey.hashCode() + (this.brandSpot.hashCode() * 31)) * 31;
        LocalErrorResponse localErrorResponse = this.errors;
        return this.syncTokens.hashCode() + ((hashCode + (localErrorResponse == null ? 0 : localErrorResponse.errors.hashCode())) * 31);
    }

    public final String toString() {
        return "Args(brandSpot=" + this.brandSpot + ", attributionKey=" + this.attributionKey + ", errors=" + this.errors + ", syncTokens=" + this.syncTokens + ")";
    }
}
