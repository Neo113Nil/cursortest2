package app.cash.local.presenters.brand.profile;

import app.cash.local.primitives.BrandSpot;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalOrder;

/* loaded from: classes3.dex */
public abstract class LocalBrandProfilePresenterKt {
    public static final BrandSpot EMPTY_BRAND_SPOT = new BrandSpot("empty-brand-token", "empty-location-token");

    public static final boolean access$isInStoreOpenTabOrder(LocalOrder localOrder) {
        LocalFulfillment localFulfillment = localOrder.fulfillment;
        return (localFulfillment != null ? localFulfillment.type : null) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE && localOrder.open_tab_info != null;
    }
}
