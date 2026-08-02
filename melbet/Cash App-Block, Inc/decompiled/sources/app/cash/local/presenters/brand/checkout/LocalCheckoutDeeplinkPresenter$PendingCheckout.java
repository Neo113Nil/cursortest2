package app.cash.local.presenters.brand.checkout;

import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutDeeplinkPresenter$PendingCheckout {
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final CreateCartResponse cartResponse;

    public LocalCheckoutDeeplinkPresenter$PendingCheckout(BrandSpot brandSpot, CreateCartResponse createCartResponse, AttributionKey attributionKey) {
        brandSpot.getClass();
        createCartResponse.getClass();
        attributionKey.getClass();
        this.brandSpot = brandSpot;
        this.cartResponse = createCartResponse;
        this.attributionKey = attributionKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutDeeplinkPresenter$PendingCheckout)) {
            return false;
        }
        LocalCheckoutDeeplinkPresenter$PendingCheckout localCheckoutDeeplinkPresenter$PendingCheckout = (LocalCheckoutDeeplinkPresenter$PendingCheckout) obj;
        return Intrinsics.areEqual(this.brandSpot, localCheckoutDeeplinkPresenter$PendingCheckout.brandSpot) && Intrinsics.areEqual(this.cartResponse, localCheckoutDeeplinkPresenter$PendingCheckout.cartResponse) && Intrinsics.areEqual(this.attributionKey, localCheckoutDeeplinkPresenter$PendingCheckout.attributionKey);
    }

    public final int hashCode() {
        return this.attributionKey.hashCode() + ((this.cartResponse.hashCode() + (this.brandSpot.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PendingCheckout(brandSpot=" + this.brandSpot + ", cartResponse=" + this.cartResponse + ", attributionKey=" + this.attributionKey + ")";
    }
}
