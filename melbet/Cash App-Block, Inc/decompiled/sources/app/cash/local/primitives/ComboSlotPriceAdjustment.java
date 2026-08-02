package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboSlotPriceAdjustment implements Parcelable {
    public static final Parcelable.Creator<ComboSlotPriceAdjustment> CREATOR = new Cart.Creator(28);
    public final LocalMoney priceAdjustment;
    public final String variationToken;

    public ComboSlotPriceAdjustment(LocalMoney localMoney, String str) {
        str.getClass();
        localMoney.getClass();
        this.variationToken = str;
        this.priceAdjustment = localMoney;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSlotPriceAdjustment)) {
            return false;
        }
        ComboSlotPriceAdjustment comboSlotPriceAdjustment = (ComboSlotPriceAdjustment) obj;
        return Intrinsics.areEqual(this.variationToken, comboSlotPriceAdjustment.variationToken) && Intrinsics.areEqual(this.priceAdjustment, comboSlotPriceAdjustment.priceAdjustment);
    }

    public final int hashCode() {
        return this.priceAdjustment.hashCode() + (this.variationToken.hashCode() * 31);
    }

    public final String toString() {
        return "ComboSlotPriceAdjustment(variationToken=" + MenuItemVariationToken.m1265toStringimpl(this.variationToken) + ", priceAdjustment=" + this.priceAdjustment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.variationToken);
        this.priceAdjustment.writeToParcel(parcel, i);
    }
}
