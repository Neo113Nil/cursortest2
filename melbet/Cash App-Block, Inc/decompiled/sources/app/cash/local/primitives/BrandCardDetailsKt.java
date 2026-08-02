package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.app.v1.card.BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard$TypeDetails$BrandCardDetails;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class BrandCardDetailsKt {
    public static final BrandCardDetails getBrandCardDetails(LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails) {
        localCard$TypeDetails$BrandCardDetails.getClass();
        if (localCard$TypeDetails$BrandCardDetails == null) {
            localCard$TypeDetails$BrandCardDetails = null;
        }
        if (localCard$TypeDetails$BrandCardDetails != null) {
            return localCard$TypeDetails$BrandCardDetails.value;
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfile.deepLinkSpecs;
    }
}
