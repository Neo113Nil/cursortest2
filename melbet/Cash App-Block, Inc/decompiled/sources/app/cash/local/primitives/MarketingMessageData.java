package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import com.google.android.gms.common.zza;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageType;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MarketingMessageData implements Parcelable {
    public static final Parcelable.Creator<MarketingMessageData> CREATOR = new zza(2);
    public static final List SUPPORTED_TYPES = CollectionsKt__CollectionsKt.listOf((Object[]) new MarketingMessageType[]{MarketingMessageType.MARKETING_MESSAGE_TYPE_GENERAL, MarketingMessageType.MARKETING_MESSAGE_TYPE_PROMOTIONAL, MarketingMessageType.MARKETING_MESSAGE_TYPE_COUPON, MarketingMessageType.MARKETING_MESSAGE_TYPE_COUPON_WITH_ITEM});
    public final LocalColor backgroundColor;
    public final Badge badge;
    public final BrandSpot brandSpot;
    public final String cashtag;
    public final LocalColor foregroundColor;
    public final LocalImage image;
    public final LocalImage logo;
    public final String message;
    public final String messageToken;
    public final MarketingMessageOfferDetails offerDetails;
    public final Instant startsAt;

    /* loaded from: classes3.dex */
    public final class Badge implements Parcelable {
        public static final Parcelable.Creator<Badge> CREATOR = new Line.Creator(25);
        public final boolean isViewed;
        public final String text;

        public Badge(boolean z, String str) {
            str.getClass();
            this.isViewed = z;
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return this.isViewed == badge.isViewed && Intrinsics.areEqual(this.text, badge.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (Boolean.hashCode(this.isViewed) * 31);
        }

        public final String toString() {
            return "Badge(isViewed=" + this.isViewed + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isViewed ? 1 : 0);
            parcel.writeString(this.text);
        }
    }

    public MarketingMessageData(String str, String str2, LocalImage localImage, String str3, Instant instant, LocalColor localColor, LocalColor localColor2, BrandSpot brandSpot, LocalImage localImage2, MarketingMessageOfferDetails marketingMessageOfferDetails, Badge badge) {
        str.getClass();
        str3.getClass();
        instant.getClass();
        localColor.getClass();
        localColor2.getClass();
        brandSpot.getClass();
        this.messageToken = str;
        this.message = str2;
        this.image = localImage;
        this.cashtag = str3;
        this.startsAt = instant;
        this.backgroundColor = localColor;
        this.foregroundColor = localColor2;
        this.brandSpot = brandSpot;
        this.logo = localImage2;
        this.offerDetails = marketingMessageOfferDetails;
        this.badge = badge;
    }

    /* renamed from: copy-jf4iykI$default, reason: not valid java name */
    public static MarketingMessageData m1253copyjf4iykI$default(MarketingMessageData marketingMessageData, String str, LocalImage localImage, String str2, Instant instant, LocalColor localColor, MarketingMessageOfferDetails marketingMessageOfferDetails, Badge badge, int i) {
        String str3 = marketingMessageData.messageToken;
        if ((i & 2) != 0) {
            str = marketingMessageData.message;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            localImage = marketingMessageData.image;
        }
        LocalImage localImage2 = localImage;
        String str5 = (i & 8) != 0 ? marketingMessageData.cashtag : str2;
        Instant instant2 = (i & 16) != 0 ? marketingMessageData.startsAt : instant;
        LocalColor localColor2 = (i & 32) != 0 ? marketingMessageData.backgroundColor : localColor;
        LocalColor localColor3 = marketingMessageData.foregroundColor;
        BrandSpot brandSpot = marketingMessageData.brandSpot;
        LocalImage localImage3 = (i & 256) != 0 ? marketingMessageData.logo : null;
        MarketingMessageOfferDetails marketingMessageOfferDetails2 = (i & 512) != 0 ? marketingMessageData.offerDetails : marketingMessageOfferDetails;
        Badge badge2 = (i & 1024) != 0 ? marketingMessageData.badge : badge;
        marketingMessageData.getClass();
        str3.getClass();
        str5.getClass();
        instant2.getClass();
        localColor2.getClass();
        localColor3.getClass();
        brandSpot.getClass();
        return new MarketingMessageData(str3, str4, localImage2, str5, instant2, localColor2, localColor3, brandSpot, localImage3, marketingMessageOfferDetails2, badge2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingMessageData)) {
            return false;
        }
        MarketingMessageData marketingMessageData = (MarketingMessageData) obj;
        return MessageToken.m1271equalsimpl0(this.messageToken, marketingMessageData.messageToken) && Intrinsics.areEqual(this.message, marketingMessageData.message) && Intrinsics.areEqual(this.image, marketingMessageData.image) && Intrinsics.areEqual(this.cashtag, marketingMessageData.cashtag) && Intrinsics.areEqual(this.startsAt, marketingMessageData.startsAt) && Intrinsics.areEqual(this.backgroundColor, marketingMessageData.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, marketingMessageData.foregroundColor) && Intrinsics.areEqual(this.brandSpot, marketingMessageData.brandSpot) && Intrinsics.areEqual(this.logo, marketingMessageData.logo) && Intrinsics.areEqual(this.offerDetails, marketingMessageData.offerDetails) && Intrinsics.areEqual(this.badge, marketingMessageData.badge);
    }

    public final int hashCode() {
        int m1272hashCodeimpl = MessageToken.m1272hashCodeimpl(this.messageToken) * 31;
        String str = this.message;
        int hashCode = (m1272hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        LocalImage localImage = this.image;
        int hashCode2 = (this.brandSpot.hashCode() + ((this.foregroundColor.hashCode() + ((this.backgroundColor.hashCode() + ((this.startsAt.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.cashtag)) * 31)) * 31)) * 31)) * 31;
        LocalImage localImage2 = this.logo;
        int hashCode3 = (hashCode2 + (localImage2 == null ? 0 : localImage2.hashCode())) * 31;
        MarketingMessageOfferDetails marketingMessageOfferDetails = this.offerDetails;
        int hashCode4 = (hashCode3 + (marketingMessageOfferDetails == null ? 0 : marketingMessageOfferDetails.hashCode())) * 31;
        Badge badge = this.badge;
        return hashCode4 + (badge != null ? badge.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MarketingMessageData(messageToken=", MessageToken.m1273toStringimpl(this.messageToken), ", message=", this.message, ", image=");
        m.append(this.image);
        m.append(", cashtag=");
        m.append(this.cashtag);
        m.append(", startsAt=");
        m.append(this.startsAt);
        m.append(", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", foregroundColor=");
        m.append(this.foregroundColor);
        m.append(", brandSpot=");
        m.append(this.brandSpot);
        m.append(", logo=");
        m.append(this.logo);
        m.append(", offerDetails=");
        m.append(this.offerDetails);
        m.append(", badge=");
        m.append(this.badge);
        m.append(")");
        return m.toString();
    }

    public final MarketingMessageData withRedeemedStatus(Set set) {
        set.getClass();
        MarketingMessageOfferDetails marketingMessageOfferDetails = this.offerDetails;
        return (marketingMessageOfferDetails == null || !set.contains(OfferToken.m1278boximpl(marketingMessageOfferDetails.m1255getOfferTokenjCLHVJg())) || marketingMessageOfferDetails.getStatus() == Offer.OfferStatus.OFFER_STATUS_REDEEMED) ? this : m1253copyjf4iykI$default(this, null, null, null, null, null, MarketingMessageOfferDetails.m1254copylPTozlg$default(marketingMessageOfferDetails), null, 1535);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        MessageToken.m1274writeToParcelimpl(this.messageToken, parcel);
        parcel.writeString(this.message);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.cashtag);
        parcel.writeSerializable(this.startsAt);
        parcel.writeParcelable(this.backgroundColor, i);
        parcel.writeParcelable(this.foregroundColor, i);
        this.brandSpot.writeToParcel(parcel, i);
        parcel.writeParcelable(this.logo, i);
        MarketingMessageOfferDetails marketingMessageOfferDetails = this.offerDetails;
        if (marketingMessageOfferDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketingMessageOfferDetails.writeToParcel(parcel, i);
        }
        Badge badge = this.badge;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, i);
        }
    }
}
