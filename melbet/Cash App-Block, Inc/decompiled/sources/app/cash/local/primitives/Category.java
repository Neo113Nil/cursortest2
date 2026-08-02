package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Cart;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Category implements Parcelable {
    public static final Parcelable.Creator<Category> CREATOR = new Cart.Creator(24);
    public final LocalImage image;
    public final ArrayList items;
    public final MenuHours menuHours;
    public final String name;
    public final String token;

    public Category(String str, String str2, LocalImage localImage, ArrayList arrayList, MenuHours menuHours) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.image = localImage;
        this.items = arrayList;
        this.menuHours = menuHours;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return Intrinsics.areEqual(this.token, category.token) && Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.image, category.image) && this.items.equals(category.items) && Intrinsics.areEqual(this.menuHours, category.menuHours);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        LocalImage localImage = this.image;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, (m + (localImage == null ? 0 : localImage.hashCode())) * 31, 31);
        MenuHours menuHours = this.menuHours;
        return m2 + (menuHours != null ? menuHours.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Category(token=", MenuCategoryToken.m1259toStringimpl(this.token), ", name=", this.name, ", image=");
        m.append(this.image);
        m.append(", items=");
        m.append(this.items);
        m.append(", menuHours=");
        m.append(this.menuHours);
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
        MenuHours menuHours = this.menuHours;
        if (menuHours == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            menuHours.writeToParcel(parcel, i);
        }
    }
}
