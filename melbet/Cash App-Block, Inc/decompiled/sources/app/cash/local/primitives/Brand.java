package app.cash.local.primitives;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCashBackOfferPercentage;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Brand {
    public final LocalImage artworkImage;
    public final LocalColor backgroundColor;
    public final LocalBrand.Banner banner;
    public final String cashtag;
    public final String category;
    public final String description;
    public final LocalEstimatedCompletionDuration estimatedPickupWaitTime;
    public final LocalBrand.FulfillmentSelection fulfillmentSelection;
    public final LocalImage heroImage;
    public final LocalCashMarketingContent marketingContent;
    public final LocalMiniCard miniCard;
    public final String name;
    public final ArrayList nearbyLocations;
    public final LocalCashBackOfferPercentage offerPercentage;
    public final boolean requiresFulfillmentConfirmation;
    public final String selectedLocation;
    public final String shareLinkUrl;
    public final String token;

    public Brand(String str, String str2, String str3, String str4, LocalImage localImage, LocalImage localImage2, String str5, ArrayList arrayList, LocalColor localColor, String str6, LocalCashBackOfferPercentage localCashBackOfferPercentage, LocalBrand.Banner banner, LocalMiniCard localMiniCard, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, LocalCashMarketingContent localCashMarketingContent, String str7, LocalBrand.FulfillmentSelection fulfillmentSelection, boolean z) {
        str.getClass();
        str2.getClass();
        banner.getClass();
        this.token = str;
        this.name = str2;
        this.category = str3;
        this.description = str4;
        this.heroImage = localImage;
        this.artworkImage = localImage2;
        this.selectedLocation = str5;
        this.nearbyLocations = arrayList;
        this.backgroundColor = localColor;
        this.shareLinkUrl = str6;
        this.offerPercentage = localCashBackOfferPercentage;
        this.banner = banner;
        this.miniCard = localMiniCard;
        this.estimatedPickupWaitTime = localEstimatedCompletionDuration;
        this.marketingContent = localCashMarketingContent;
        this.cashtag = str7;
        this.fulfillmentSelection = fulfillmentSelection;
        this.requiresFulfillmentConfirmation = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof Brand) {
                Brand brand = (Brand) obj;
                if (Intrinsics.areEqual(this.token, brand.token) && Intrinsics.areEqual(this.name, brand.name) && Intrinsics.areEqual(this.category, brand.category) && Intrinsics.areEqual(this.description, brand.description) && Intrinsics.areEqual(this.heroImage, brand.heroImage) && Intrinsics.areEqual(this.artworkImage, brand.artworkImage)) {
                    String str = brand.selectedLocation;
                    String str2 = this.selectedLocation;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.nearbyLocations.equals(brand.nearbyLocations) && Intrinsics.areEqual(this.backgroundColor, brand.backgroundColor) && Intrinsics.areEqual(this.shareLinkUrl, brand.shareLinkUrl) && Intrinsics.areEqual(this.offerPercentage, brand.offerPercentage) && this.banner == brand.banner && Intrinsics.areEqual(this.miniCard, brand.miniCard) && Intrinsics.areEqual(this.estimatedPickupWaitTime, brand.estimatedPickupWaitTime) && Intrinsics.areEqual(this.marketingContent, brand.marketingContent) && Intrinsics.areEqual(this.cashtag, brand.cashtag) && Intrinsics.areEqual(this.fulfillmentSelection, brand.fulfillmentSelection) && this.requiresFulfillmentConfirmation == brand.requiresFulfillmentConfirmation) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        String str = this.category;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalImage localImage = this.heroImage;
        int hashCode3 = (hashCode2 + (localImage == null ? 0 : localImage.hashCode())) * 31;
        LocalImage localImage2 = this.artworkImage;
        int hashCode4 = (hashCode3 + (localImage2 == null ? 0 : localImage2.hashCode())) * 31;
        String str3 = this.selectedLocation;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.nearbyLocations, (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        LocalColor localColor = this.backgroundColor;
        int hashCode5 = (m2 + (localColor == null ? 0 : localColor.hashCode())) * 31;
        String str4 = this.shareLinkUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalCashBackOfferPercentage localCashBackOfferPercentage = this.offerPercentage;
        int hashCode7 = (this.banner.hashCode() + ((hashCode6 + (localCashBackOfferPercentage == null ? 0 : localCashBackOfferPercentage.hashCode())) * 31)) * 31;
        LocalMiniCard localMiniCard = this.miniCard;
        int hashCode8 = (hashCode7 + (localMiniCard == null ? 0 : localMiniCard.hashCode())) * 31;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimatedPickupWaitTime;
        int hashCode9 = (hashCode8 + (localEstimatedCompletionDuration == null ? 0 : localEstimatedCompletionDuration.hashCode())) * 31;
        LocalCashMarketingContent localCashMarketingContent = this.marketingContent;
        int hashCode10 = (hashCode9 + (localCashMarketingContent == null ? 0 : localCashMarketingContent.hashCode())) * 31;
        String str5 = this.cashtag;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocalBrand.FulfillmentSelection fulfillmentSelection = this.fulfillmentSelection;
        return Boolean.hashCode(this.requiresFulfillmentConfirmation) + ((hashCode11 + (fulfillmentSelection != null ? fulfillmentSelection.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String m1229toStringimpl = BrandToken.m1229toStringimpl(this.token);
        String str = this.selectedLocation;
        String m1252toStringimpl = str == null ? "null" : LocationToken.m1252toStringimpl(str);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Brand(token=", m1229toStringimpl, ", name=", this.name, ", category=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.category, ", description=", this.description, ", heroImage=");
        m.append(this.heroImage);
        m.append(", artworkImage=");
        m.append(this.artworkImage);
        m.append(", selectedLocation=");
        m.append(m1252toStringimpl);
        m.append(", nearbyLocations=");
        m.append(this.nearbyLocations);
        m.append(", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", shareLinkUrl=");
        m.append(this.shareLinkUrl);
        m.append(", offerPercentage=");
        m.append(this.offerPercentage);
        m.append(", banner=");
        m.append(this.banner);
        m.append(", miniCard=");
        m.append(this.miniCard);
        m.append(", estimatedPickupWaitTime=");
        m.append(this.estimatedPickupWaitTime);
        m.append(", marketingContent=");
        m.append(this.marketingContent);
        m.append(", cashtag=");
        m.append(this.cashtag);
        m.append(", fulfillmentSelection=");
        m.append(this.fulfillmentSelection);
        m.append(", requiresFulfillmentConfirmation=");
        m.append(this.requiresFulfillmentConfirmation);
        m.append(")");
        return m.toString();
    }
}
