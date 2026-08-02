package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ModifierListConfig implements Parcelable {
    public static final Parcelable.Creator<ModifierListConfig> CREATOR = new MenuItem.Creator(12);
    public final boolean allowQuantities;
    public final Integer maxSelections;
    public final Integer minSelections;
    public final String token;

    public ModifierListConfig(String str, Integer num, Integer num2, boolean z) {
        this.token = str;
        this.minSelections = num;
        this.maxSelections = num2;
        this.allowQuantities = z;
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
        if (!(obj instanceof ModifierListConfig)) {
            return false;
        }
        ModifierListConfig modifierListConfig = (ModifierListConfig) obj;
        String str = modifierListConfig.token;
        String str2 = this.token;
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
        return areEqual && Intrinsics.areEqual(this.minSelections, modifierListConfig.minSelections) && Intrinsics.areEqual(this.maxSelections, modifierListConfig.maxSelections) && this.allowQuantities == modifierListConfig.allowQuantities;
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.minSelections;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxSelections;
        return Boolean.hashCode(this.allowQuantities) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.token;
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.minSelections, "ModifierListConfig(token=", str == null ? "null" : MenuItemModifierListToken.m1260toStringimpl(str), ", minSelections=", ", maxSelections=");
        m.append(this.maxSelections);
        m.append(", allowQuantities=");
        m.append(this.allowQuantities);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.token;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        Integer num = this.minSelections;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        Integer num2 = this.maxSelections;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
        parcel.writeInt(this.allowQuantities ? 1 : 0);
    }
}
