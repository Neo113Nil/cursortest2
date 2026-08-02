package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItemPreorderingSummary implements Parcelable {
    public static final Parcelable.Creator<MenuItemPreorderingSummary> CREATOR = new MenuItem.Creator(5);
    public final String description;
    public final String title;

    public MenuItemPreorderingSummary(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemPreorderingSummary)) {
            return false;
        }
        MenuItemPreorderingSummary menuItemPreorderingSummary = (MenuItemPreorderingSummary) obj;
        return Intrinsics.areEqual(this.title, menuItemPreorderingSummary.title) && Intrinsics.areEqual(this.description, menuItemPreorderingSummary.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MenuItemPreorderingSummary(title=", this.title, ", description=", this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
