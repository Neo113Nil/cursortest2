package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import com.squareup.protos.cash.local.client.v1.CardBrandType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CartPaymentSummary implements Parcelable {
    public static final Parcelable.Creator<CartPaymentSummary> CREATOR = new Cart.Creator(22);
    public final CardBrandType cardBrand;
    public final String last4;

    public CartPaymentSummary(CardBrandType cardBrandType, String str) {
        cardBrandType.getClass();
        str.getClass();
        this.cardBrand = cardBrandType;
        this.last4 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartPaymentSummary)) {
            return false;
        }
        CartPaymentSummary cartPaymentSummary = (CartPaymentSummary) obj;
        return this.cardBrand == cartPaymentSummary.cardBrand && Intrinsics.areEqual(this.last4, cartPaymentSummary.last4);
    }

    public final int hashCode() {
        return this.last4.hashCode() + (this.cardBrand.hashCode() * 31);
    }

    public final String toString() {
        return "CartPaymentSummary(cardBrand=" + this.cardBrand + ", last4=" + this.last4 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.cardBrand.name());
        parcel.writeString(this.last4);
    }
}
