package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItemVariation implements Parcelable {
    public static final Parcelable.Creator<MenuItemVariation> CREATOR = new MenuItem.Creator(7);
    public final LocalMenuAvailability availability;
    public final LocalMenuItemDeal deal;
    public final String name;
    public final LocalMoney price;
    public final String token;

    public MenuItemVariation(String str, String str2, LocalMoney localMoney, LocalMenuItemDeal localMenuItemDeal, LocalMenuAvailability localMenuAvailability) {
        str.getClass();
        str2.getClass();
        localMoney.getClass();
        localMenuAvailability.getClass();
        this.token = str;
        this.name = str2;
        this.price = localMoney;
        this.deal = localMenuItemDeal;
        this.availability = localMenuAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemVariation)) {
            return false;
        }
        MenuItemVariation menuItemVariation = (MenuItemVariation) obj;
        return Intrinsics.areEqual(this.token, menuItemVariation.token) && Intrinsics.areEqual(this.name, menuItemVariation.name) && Intrinsics.areEqual(this.price, menuItemVariation.price) && Intrinsics.areEqual(this.deal, menuItemVariation.deal) && this.availability == menuItemVariation.availability;
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name)) * 31;
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        return this.availability.hashCode() + ((hashCode + (localMenuItemDeal == null ? 0 : localMenuItemDeal.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItemVariation(token=", MenuItemVariationToken.m1265toStringimpl(this.token), ", name=", this.name, ", price=");
        m.append(this.price);
        m.append(", deal=");
        m.append(this.deal);
        m.append(", availability=");
        m.append(this.availability);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        this.price.writeToParcel(parcel, i);
        parcel.writeParcelable(this.deal, i);
        parcel.writeString(this.availability.name());
    }
}
