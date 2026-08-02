package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalBrand$CashBackOffer$Percentage;
import com.squareup.protos.cash.local.client.v1.LocalCashBackOfferPercentage;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class BrandKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfileEmail.deepLinkSpecs;
    }

    public static final Brand toBrand(LocalBrand localBrand) {
        String str;
        Boolean bool;
        LocalLocationLinks localLocationLinks;
        LocalLocationSummary localLocationSummary;
        String str2 = localBrand.token;
        str2.getClass();
        String str3 = localBrand.name;
        str3.getClass();
        String str4 = localBrand.category;
        String str5 = localBrand.description;
        LocalImage localImage = localBrand.hero_image;
        LocalImage localImage2 = localBrand.artwork_image;
        LocalLocationDetail localLocationDetail = localBrand.selected_location;
        if (localLocationDetail == null || (localLocationSummary = localLocationDetail.summary) == null || (str = localLocationSummary.token) == null) {
            str = null;
        }
        List list = localBrand.nearby_locations;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LocationKt.toLocation((LocalLocationSummary) it.next()));
        }
        LocalColor localColor = localBrand.background_color;
        String str6 = (localLocationDetail == null || (localLocationLinks = localLocationDetail.links) == null) ? null : localLocationLinks.profile_share_link_url;
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = localBrand.cash_back_offer;
        LocalCashBackOfferPercentage localCashBackOfferPercentage = localBrand$CashBackOffer$Percentage == null ? null : localBrand$CashBackOffer$Percentage.value;
        String str7 = str;
        String str8 = str6;
        LocalBrand.Banner banner = localBrand.banner;
        banner.getClass();
        LocalCashMarketingContent localCashMarketingContent = null;
        LocalCashBackOfferPercentage localCashBackOfferPercentage2 = localCashBackOfferPercentage;
        LocalMiniCard localMiniCard = localBrand.mini_card;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = localBrand.estimated_pickup_wait_time;
        if (localLocationDetail != null) {
            localCashMarketingContent = localLocationDetail.local_cash_marketing_content;
        }
        String str9 = localBrand.cashtag;
        LocalBrand.FulfillmentSelection fulfillmentSelection = localBrand.fulfillment_selection;
        LocalBrand.RequiredLocationSelection requiredLocationSelection = localBrand.required_location_selection;
        return new Brand(str2, str3, str4, str5, localImage, localImage2, str7, arrayList, localColor, str8, localCashBackOfferPercentage2, banner, localMiniCard, localEstimatedCompletionDuration, localCashMarketingContent, str9, fulfillmentSelection, (requiredLocationSelection == null || (bool = requiredLocationSelection.selected_location_is_default) == null) ? false : bool.booleanValue());
    }
}
