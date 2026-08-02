package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NestedModifierList implements Parcelable {
    public static final Parcelable.Creator<NestedModifierList> CREATOR = new MenuItem.Creator(14);
    public final boolean allowQuantities;
    public final boolean isFreeText;
    public final Integer maxLength;
    public final Integer maxSelections;
    public final int minSelections;
    public final ArrayList modifiers;
    public final String name;
    public final boolean requireNonEmptyString;
    public final String token;

    public NestedModifierList(String str, String str2, int i, Integer num, boolean z, ArrayList arrayList, boolean z2, Integer num2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.minSelections = i;
        this.maxSelections = num;
        this.allowQuantities = z;
        this.modifiers = arrayList;
        this.isFreeText = z2;
        this.maxLength = num2;
        this.requireNonEmptyString = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestedModifierList)) {
            return false;
        }
        NestedModifierList nestedModifierList = (NestedModifierList) obj;
        return Intrinsics.areEqual(this.token, nestedModifierList.token) && Intrinsics.areEqual(this.name, nestedModifierList.name) && this.minSelections == nestedModifierList.minSelections && Intrinsics.areEqual(this.maxSelections, nestedModifierList.maxSelections) && this.allowQuantities == nestedModifierList.allowQuantities && this.modifiers.equals(nestedModifierList.modifiers) && this.isFreeText == nestedModifierList.isFreeText && Intrinsics.areEqual(this.maxLength, nestedModifierList.maxLength) && this.requireNonEmptyString == nestedModifierList.requireNonEmptyString;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minSelections, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name), 31);
        Integer num = this.maxSelections;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.modifiers, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (num == null ? 0 : num.hashCode())) * 31, 31, this.allowQuantities), 31), 31, this.isFreeText);
        Integer num2 = this.maxLength;
        return Boolean.hashCode(this.requireNonEmptyString) + ((m2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NestedModifierList(token=", MenuItemModifierListToken.m1260toStringimpl(this.token), ", name=", this.name, ", minSelections=");
        m.append(this.minSelections);
        m.append(", maxSelections=");
        m.append(this.maxSelections);
        m.append(", allowQuantities=");
        m.append(this.allowQuantities);
        m.append(", modifiers=");
        m.append(this.modifiers);
        m.append(", isFreeText=");
        m.append(this.isFreeText);
        m.append(", maxLength=");
        m.append(this.maxLength);
        m.append(", requireNonEmptyString=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.requireNonEmptyString, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        parcel.writeInt(this.minSelections);
        Integer num = this.maxSelections;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeInt(this.allowQuantities ? 1 : 0);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.modifiers, parcel);
        while (m.hasNext()) {
            ((Modifier) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFreeText ? 1 : 0);
        Integer num2 = this.maxLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
        parcel.writeInt(this.requireNonEmptyString ? 1 : 0);
    }
}
