package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Line;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MarketingMessageOfferDetails implements Parcelable {
    public static final Parcelable.Creator<MarketingMessageOfferDetails> CREATOR = new Line.Creator(26);
    public final String disclaimerText;
    public final String discountDescription;
    public final String eligibleItems;
    public final LocalImage image;
    public final String label;
    public final String offerCode;
    public final List offerLines;
    public final String offerToken;
    public final String redemptionInstructions;
    public final Offer.OfferStatus status;
    public final String termsAndConditions;
    public final String termsUrl;
    public final Instant validThrough;
    public final String validityText;

    public MarketingMessageOfferDetails(LocalImage localImage, String str, String str2, String str3, String str4, String str5, String str6, Instant instant, String str7, List list, String str8, String str9, String str10, Offer.OfferStatus offerStatus) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.image = localImage;
        this.label = str;
        this.validityText = str2;
        this.offerToken = str3;
        this.offerCode = str4;
        this.termsAndConditions = str5;
        this.redemptionInstructions = str6;
        this.validThrough = instant;
        this.disclaimerText = str7;
        this.offerLines = list;
        this.termsUrl = str8;
        this.discountDescription = str9;
        this.eligibleItems = str10;
        this.status = offerStatus;
    }

    /* renamed from: copy-lPTozlg$default, reason: not valid java name */
    public static MarketingMessageOfferDetails m1254copylPTozlg$default(MarketingMessageOfferDetails marketingMessageOfferDetails) {
        Offer.OfferStatus offerStatus = Offer.OfferStatus.OFFER_STATUS_REDEEMED;
        LocalImage localImage = marketingMessageOfferDetails.image;
        String str = marketingMessageOfferDetails.label;
        String str2 = marketingMessageOfferDetails.validityText;
        String str3 = marketingMessageOfferDetails.offerToken;
        String str4 = marketingMessageOfferDetails.offerCode;
        String str5 = marketingMessageOfferDetails.termsAndConditions;
        String str6 = marketingMessageOfferDetails.redemptionInstructions;
        Instant instant = marketingMessageOfferDetails.validThrough;
        String str7 = marketingMessageOfferDetails.disclaimerText;
        List list = marketingMessageOfferDetails.offerLines;
        String str8 = marketingMessageOfferDetails.termsUrl;
        String str9 = marketingMessageOfferDetails.discountDescription;
        String str10 = marketingMessageOfferDetails.eligibleItems;
        marketingMessageOfferDetails.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new MarketingMessageOfferDetails(localImage, str, str2, str3, str4, str5, str6, instant, str7, list, str8, str9, str10, offerStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingMessageOfferDetails)) {
            return false;
        }
        MarketingMessageOfferDetails marketingMessageOfferDetails = (MarketingMessageOfferDetails) obj;
        return Intrinsics.areEqual(this.image, marketingMessageOfferDetails.image) && Intrinsics.areEqual(this.label, marketingMessageOfferDetails.label) && Intrinsics.areEqual(this.validityText, marketingMessageOfferDetails.validityText) && Intrinsics.areEqual(this.offerToken, marketingMessageOfferDetails.offerToken) && Intrinsics.areEqual(this.offerCode, marketingMessageOfferDetails.offerCode) && Intrinsics.areEqual(this.termsAndConditions, marketingMessageOfferDetails.termsAndConditions) && Intrinsics.areEqual(this.redemptionInstructions, marketingMessageOfferDetails.redemptionInstructions) && Intrinsics.areEqual(this.validThrough, marketingMessageOfferDetails.validThrough) && Intrinsics.areEqual(this.disclaimerText, marketingMessageOfferDetails.disclaimerText) && Intrinsics.areEqual(this.offerLines, marketingMessageOfferDetails.offerLines) && Intrinsics.areEqual(this.termsUrl, marketingMessageOfferDetails.termsUrl) && Intrinsics.areEqual(this.discountDescription, marketingMessageOfferDetails.discountDescription) && Intrinsics.areEqual(this.eligibleItems, marketingMessageOfferDetails.eligibleItems) && this.status == marketingMessageOfferDetails.status;
    }

    /* renamed from: getOfferToken-jCLHVJg, reason: not valid java name */
    public final String m1255getOfferTokenjCLHVJg() {
        return this.offerToken;
    }

    public final Offer.OfferStatus getStatus() {
        return this.status;
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.label), 31, this.validityText), 31, this.offerToken), 31, this.offerCode);
        String str = this.termsAndConditions;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redemptionInstructions;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.validThrough;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str3 = this.disclaimerText;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.offerLines);
        String str4 = this.termsUrl;
        int hashCode4 = (m2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountDescription;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eligibleItems;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Offer.OfferStatus offerStatus = this.status;
        return hashCode6 + (offerStatus != null ? offerStatus.hashCode() : 0);
    }

    public final String toString() {
        String m1279toStringimpl = OfferToken.m1279toStringimpl(this.offerToken);
        StringBuilder sb = new StringBuilder("MarketingMessageOfferDetails(image=");
        sb.append(this.image);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", validityText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.validityText, ", offerToken=", m1279toStringimpl, ", offerCode=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.offerCode, ", termsAndConditions=", this.termsAndConditions, ", redemptionInstructions=");
        sb.append(this.redemptionInstructions);
        sb.append(", validThrough=");
        sb.append(this.validThrough);
        sb.append(", disclaimerText=");
        NavAction$$ExternalSyntheticOutline0.m(this.disclaimerText, ", offerLines=", ", termsUrl=", sb, this.offerLines);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.termsUrl, ", discountDescription=", this.discountDescription, ", eligibleItems=");
        sb.append(this.eligibleItems);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.label);
        parcel.writeString(this.validityText);
        parcel.writeString(this.offerToken);
        parcel.writeString(this.offerCode);
        parcel.writeString(this.termsAndConditions);
        parcel.writeString(this.redemptionInstructions);
        parcel.writeSerializable(this.validThrough);
        parcel.writeString(this.disclaimerText);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.offerLines, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeString(this.termsUrl);
        parcel.writeString(this.discountDescription);
        parcel.writeString(this.eligibleItems);
        Offer.OfferStatus offerStatus = this.status;
        if (offerStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerStatus.name());
        }
    }
}
