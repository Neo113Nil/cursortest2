package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.Location;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DeliveryQuote implements Parcelable {
    public static final Parcelable.Creator<DeliveryQuote> CREATOR = new Line.Creator(4);
    public final String brandToken;
    public final LocalMoney deliveryFee;
    public final Fulfillment fulfillment;
    public final Location.LocationSummary location;
    public final GetDeliveryQuoteResponse.DeliveryQuote original;

    public DeliveryQuote(String str, Location.LocationSummary locationSummary, Fulfillment fulfillment, LocalMoney localMoney, GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote) {
        str.getClass();
        locationSummary.getClass();
        fulfillment.getClass();
        localMoney.getClass();
        deliveryQuote.getClass();
        this.brandToken = str;
        this.location = locationSummary;
        this.fulfillment = fulfillment;
        this.deliveryFee = localMoney;
        this.original = deliveryQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryQuote)) {
            return false;
        }
        DeliveryQuote deliveryQuote = (DeliveryQuote) obj;
        return Intrinsics.areEqual(this.brandToken, deliveryQuote.brandToken) && Intrinsics.areEqual(this.location, deliveryQuote.location) && Intrinsics.areEqual(this.fulfillment, deliveryQuote.fulfillment) && Intrinsics.areEqual(this.deliveryFee, deliveryQuote.deliveryFee) && Intrinsics.areEqual(this.original, deliveryQuote.original);
    }

    public final int hashCode() {
        return this.original.hashCode() + ((this.deliveryFee.hashCode() + ((this.fulfillment.hashCode() + ((this.location.hashCode() + (this.brandToken.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeliveryQuote(brandToken=" + BrandToken.m1229toStringimpl(this.brandToken) + ", location=" + this.location + ", fulfillment=" + this.fulfillment + ", deliveryFee=" + this.deliveryFee + ", original=" + this.original + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.brandToken);
        this.location.writeToParcel(parcel, i);
        this.fulfillment.writeToParcel(parcel, i);
        this.deliveryFee.writeToParcel(parcel, i);
        parcel.writeParcelable(this.original, i);
    }
}
