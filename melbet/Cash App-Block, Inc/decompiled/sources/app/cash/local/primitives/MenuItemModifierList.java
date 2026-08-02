package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItemModifierList implements Parcelable {
    public static final Parcelable.Creator<MenuItemModifierList> CREATOR = new MenuItem.Creator(1);
    public final InputType inputType;
    public final String name;
    public final String token;

    public abstract class InputType implements Parcelable {

        public final class FreeTextEntry extends InputType {
            public static final Parcelable.Creator<FreeTextEntry> CREATOR = new MenuItem.Creator(2);
            public final int maxLength;
            public final boolean requireNonEmptyString;

            public FreeTextEntry(int i, boolean z) {
                this.maxLength = i;
                this.requireNonEmptyString = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreeTextEntry)) {
                    return false;
                }
                FreeTextEntry freeTextEntry = (FreeTextEntry) obj;
                return this.maxLength == freeTextEntry.maxLength && this.requireNonEmptyString == freeTextEntry.requireNonEmptyString;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.requireNonEmptyString) + (Integer.hashCode(this.maxLength) * 31);
            }

            public final String toString() {
                return "FreeTextEntry(maxLength=" + this.maxLength + ", requireNonEmptyString=" + this.requireNonEmptyString + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.maxLength);
                parcel.writeInt(this.requireNonEmptyString ? 1 : 0);
            }
        }

        public final class SelectFromList extends InputType {
            public static final Parcelable.Creator<SelectFromList> CREATOR = new MenuItem.Creator(3);
            public final ArrayList modifiers;

            public SelectFromList(ArrayList arrayList) {
                this.modifiers = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectFromList) && this.modifiers.equals(((SelectFromList) obj).modifiers);
            }

            public final int hashCode() {
                return this.modifiers.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("SelectFromList(modifiers=", ")", this.modifiers);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.modifiers, parcel);
                while (m.hasNext()) {
                    ((Modifier) m.next()).writeToParcel(parcel, i);
                }
            }
        }
    }

    public MenuItemModifierList(String str, String str2, InputType inputType) {
        str.getClass();
        str2.getClass();
        inputType.getClass();
        this.token = str;
        this.name = str2;
        this.inputType = inputType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemModifierList)) {
            return false;
        }
        MenuItemModifierList menuItemModifierList = (MenuItemModifierList) obj;
        return Intrinsics.areEqual(this.token, menuItemModifierList.token) && Intrinsics.areEqual(this.name, menuItemModifierList.name) && Intrinsics.areEqual(this.inputType, menuItemModifierList.inputType);
    }

    public final int hashCode() {
        return this.inputType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItemModifierList(token=", MenuItemModifierListToken.m1260toStringimpl(this.token), ", name=", this.name, ", inputType=");
        m.append(this.inputType);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.inputType, i);
    }
}
