package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MessageToken;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalBrandProfileScreen implements LocalScreen, SingleInstanceScreen, HasAttributionKeyScreenScreen {
    public static final Parcelable.Creator<LocalBrandProfileScreen> CREATOR = new LocalLoyaltySheet.Creator(7);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final String couponCode;
    public final boolean isEmbeddedInSheet;
    public final MarketingMessageOfferDetails offer;
    public final String pendingMessageToken;
    public final BrandSpotSyncTokens syncTokens;
    public final String userIntentLinkContext;

    public /* synthetic */ LocalBrandProfileScreen(BrandSpot brandSpot, AttributionKey attributionKey, MarketingMessageOfferDetails marketingMessageOfferDetails, String str, String str2, BrandSpotSyncTokens brandSpotSyncTokens, String str3, int i) {
        this(brandSpot, (i & 2) != 0 ? new AttributionKey(null) : attributionKey, (i & 4) != 0 ? null : marketingMessageOfferDetails, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? new BrandSpotSyncTokens((String) null, (String) null, 7) : brandSpotSyncTokens, (i & 64) != 0 ? null : str3, (i & 128) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean m1271equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandProfileScreen)) {
            return false;
        }
        LocalBrandProfileScreen localBrandProfileScreen = (LocalBrandProfileScreen) obj;
        if (!Intrinsics.areEqual(this.brandSpot, localBrandProfileScreen.brandSpot) || !Intrinsics.areEqual(this.attributionKey, localBrandProfileScreen.attributionKey) || !Intrinsics.areEqual(this.offer, localBrandProfileScreen.offer)) {
            return false;
        }
        String str = localBrandProfileScreen.pendingMessageToken;
        String str2 = this.pendingMessageToken;
        if (str2 == null) {
            if (str == null) {
                m1271equalsimpl0 = true;
            }
            m1271equalsimpl0 = false;
        } else {
            if (str != null) {
                m1271equalsimpl0 = MessageToken.m1271equalsimpl0(str2, str);
            }
            m1271equalsimpl0 = false;
        }
        return m1271equalsimpl0 && Intrinsics.areEqual(this.couponCode, localBrandProfileScreen.couponCode) && Intrinsics.areEqual(this.syncTokens, localBrandProfileScreen.syncTokens) && Intrinsics.areEqual(this.userIntentLinkContext, localBrandProfileScreen.userIntentLinkContext) && this.isEmbeddedInSheet == localBrandProfileScreen.isEmbeddedInSheet;
    }

    @Override // app.cash.local.screens.app.HasAttributionKeyScreenScreen
    public final AttributionKey getAttributionKey() {
        return this.attributionKey;
    }

    public final MarketingMessageOfferDetails getOffer() {
        return this.offer;
    }

    public final int hashCode() {
        int hashCode = (this.attributionKey.hashCode() + (this.brandSpot.hashCode() * 31)) * 31;
        MarketingMessageOfferDetails marketingMessageOfferDetails = this.offer;
        int hashCode2 = (hashCode + (marketingMessageOfferDetails == null ? 0 : marketingMessageOfferDetails.hashCode())) * 31;
        String str = this.pendingMessageToken;
        int m1272hashCodeimpl = (hashCode2 + (str == null ? 0 : MessageToken.m1272hashCodeimpl(str))) * 31;
        String str2 = this.couponCode;
        int hashCode3 = (this.syncTokens.hashCode() + ((m1272hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.userIntentLinkContext;
        return Boolean.hashCode(this.isEmbeddedInSheet) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.pendingMessageToken;
        String m1273toStringimpl = str == null ? "null" : MessageToken.m1273toStringimpl(str);
        StringBuilder sb = new StringBuilder("LocalBrandProfileScreen(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", attributionKey=");
        sb.append(this.attributionKey);
        sb.append(", offer=");
        sb.append(this.offer);
        sb.append(", pendingMessageToken=");
        sb.append(m1273toStringimpl);
        sb.append(", couponCode=");
        sb.append(this.couponCode);
        sb.append(", syncTokens=");
        sb.append(this.syncTokens);
        sb.append(", userIntentLinkContext=██, isEmbeddedInSheet=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isEmbeddedInSheet, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeParcelable(this.offer, i);
        String str = this.pendingMessageToken;
        parcel.writeParcelable(str != null ? MessageToken.m1270boximpl(str) : null, i);
        parcel.writeString(this.couponCode);
        parcel.writeParcelable(this.syncTokens, i);
        parcel.writeString(this.userIntentLinkContext);
        parcel.writeInt(this.isEmbeddedInSheet ? 1 : 0);
    }

    public LocalBrandProfileScreen(BrandSpot brandSpot, AttributionKey attributionKey, MarketingMessageOfferDetails marketingMessageOfferDetails, String str, String str2, BrandSpotSyncTokens brandSpotSyncTokens, String str3, boolean z) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.offer = marketingMessageOfferDetails;
        this.pendingMessageToken = str;
        this.couponCode = str2;
        this.syncTokens = brandSpotSyncTokens;
        this.userIntentLinkContext = str3;
        this.isEmbeddedInSheet = z;
    }
}
