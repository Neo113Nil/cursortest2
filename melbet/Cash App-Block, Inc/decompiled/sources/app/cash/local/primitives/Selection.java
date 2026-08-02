package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Selection implements Parcelable {
    public static final Parcelable.Creator<Selection> CREATOR = new MenuItem.Creator(22);
    public final List comboSlots;
    public final String menuItemToken;
    public final String menuItemVariationToken;
    public final List modifiers;
    public final int quantity;
    public final List textModifiers;

    public Selection(String str, int i, String str2, List list, List list2, List list3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.menuItemToken = str;
        this.quantity = i;
        this.menuItemVariationToken = str2;
        this.modifiers = list;
        this.textModifiers = list2;
        this.comboSlots = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        if (!Intrinsics.areEqual(this.menuItemToken, selection.menuItemToken) || this.quantity != selection.quantity) {
            return false;
        }
        String str = selection.menuItemVariationToken;
        String str2 = this.menuItemVariationToken;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        return areEqual && Intrinsics.areEqual(this.modifiers, selection.modifiers) && Intrinsics.areEqual(this.textModifiers, selection.textModifiers) && Intrinsics.areEqual(this.comboSlots, selection.comboSlots);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, this.menuItemToken.hashCode() * 31, 31);
        String str = this.menuItemVariationToken;
        return this.comboSlots.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.modifiers), 31, this.textModifiers);
    }

    public final String toString() {
        String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.menuItemToken);
        String str = this.menuItemVariationToken;
        String m1265toStringimpl = str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str);
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Selection(menuItemToken=", this.quantity, m1264toStringimpl, ", quantity=", ", menuItemVariationToken=");
        NavAction$$ExternalSyntheticOutline0.m(m1265toStringimpl, ", modifiers=", ", textModifiers=", m, this.modifiers);
        m.append(this.textModifiers);
        m.append(", comboSlots=");
        m.append(this.comboSlots);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.menuItemToken);
        parcel.writeInt(this.quantity);
        String str = this.menuItemVariationToken;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.modifiers, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.textModifiers, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.comboSlots, parcel);
        while (m3.hasNext()) {
            parcel.writeParcelable((Parcelable) m3.next(), i);
        }
    }
}
