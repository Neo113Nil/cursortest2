package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Cart;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboCategory implements Parcelable {
    public static final Parcelable.Creator<ComboCategory> CREATOR = new Cart.Creator(25);
    public final LocalImage image;
    public final ArrayList items;
    public final String name;
    public final String token;

    public ComboCategory(String str, String str2, LocalImage localImage, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.image = localImage;
        this.items = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboCategory)) {
            return false;
        }
        ComboCategory comboCategory = (ComboCategory) obj;
        return Intrinsics.areEqual(this.token, comboCategory.token) && Intrinsics.areEqual(this.name, comboCategory.name) && Intrinsics.areEqual(this.image, comboCategory.image) && this.items.equals(comboCategory.items);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        LocalImage localImage = this.image;
        return this.items.hashCode() + ((m + (localImage == null ? 0 : localImage.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboCategory(token=", ComboCategoryToken.m1232toStringimpl(this.token), ", name=", this.name, ", image=");
        m.append(this.image);
        m.append(", items=");
        m.append(this.items);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.image, i);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.items, parcel);
        while (m.hasNext()) {
            parcel.writeString(((MenuItemToken) m.next()).value);
        }
    }
}
