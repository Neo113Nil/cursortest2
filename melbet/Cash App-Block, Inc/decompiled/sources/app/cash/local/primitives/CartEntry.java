package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CartEntry implements Parcelable {
    public static final Parcelable.Creator<CartEntry> CREATOR = new Cart.Creator(19);
    public final List comboSlotSelections;
    public final String discountText;
    public final SortedSet freeTextEntries;
    public final String menuItemToken;
    public final SortedSet modifierSelections;
    public final String offerToken;
    public final String variationToken;

    public final class ComboSlotSelection implements Parcelable {
        public static final Parcelable.Creator<ComboSlotSelection> CREATOR = new Cart.Creator(18);
        public final String comboSlotToken;
        public final SortedSet freeTextEntries;
        public final String menuItemToken;
        public final SortedSet modifierSelections;
        public final String variationToken;

        public ComboSlotSelection(String str, String str2, String str3, SortedSet sortedSet, SortedSet sortedSet2) {
            str.getClass();
            str2.getClass();
            sortedSet.getClass();
            sortedSet2.getClass();
            this.comboSlotToken = str;
            this.menuItemToken = str2;
            this.variationToken = str3;
            this.modifierSelections = sortedSet;
            this.freeTextEntries = sortedSet2;
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
            if (!(obj instanceof ComboSlotSelection)) {
                return false;
            }
            ComboSlotSelection comboSlotSelection = (ComboSlotSelection) obj;
            if (!Intrinsics.areEqual(this.comboSlotToken, comboSlotSelection.comboSlotToken) || !Intrinsics.areEqual(this.menuItemToken, comboSlotSelection.menuItemToken)) {
                return false;
            }
            String str = comboSlotSelection.variationToken;
            String str2 = this.variationToken;
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
            return areEqual && Intrinsics.areEqual(this.modifierSelections, comboSlotSelection.modifierSelections) && Intrinsics.areEqual(this.freeTextEntries, comboSlotSelection.freeTextEntries);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.comboSlotToken.hashCode() * 31, 31, this.menuItemToken);
            String str = this.variationToken;
            return this.freeTextEntries.hashCode() + ((this.modifierSelections.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            String m1233toStringimpl = ComboSlotToken.m1233toStringimpl(this.comboSlotToken);
            String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.menuItemToken);
            String str = this.variationToken;
            String m1265toStringimpl = str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str);
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlotSelection(comboSlotToken=", m1233toStringimpl, ", menuItemToken=", m1264toStringimpl, ", variationToken=");
            m.append(m1265toStringimpl);
            m.append(", modifierSelections=");
            m.append(this.modifierSelections);
            m.append(", freeTextEntries=");
            m.append(this.freeTextEntries);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.comboSlotToken);
            parcel.writeString(this.menuItemToken);
            String str = this.variationToken;
            if (str == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(str);
            }
            SortedSet sortedSet = this.modifierSelections;
            parcel.writeInt(sortedSet.size());
            Iterator it = sortedSet.iterator();
            while (it.hasNext()) {
                ((ModifierSelection) it.next()).writeToParcel(parcel, i);
            }
            SortedSet sortedSet2 = this.freeTextEntries;
            parcel.writeInt(sortedSet2.size());
            Iterator it2 = sortedSet2.iterator();
            while (it2.hasNext()) {
                ((ModifierFreeEntry) it2.next()).writeToParcel(parcel, i);
            }
        }
    }

    public final class ModifierFreeEntry implements Parcelable, Comparable {
        public static final Parcelable.Creator<ModifierFreeEntry> CREATOR = new Cart.Creator(20);
        public final String input;
        public final String listToken;

        public ModifierFreeEntry(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.listToken = str;
            this.input = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ModifierFreeEntry modifierFreeEntry = (ModifierFreeEntry) obj;
            modifierFreeEntry.getClass();
            Function1[] function1Arr = {new Data$$ExternalSyntheticLambda0(28), new Data$$ExternalSyntheticLambda0(29)};
            for (int i = 0; i < 2; i++) {
                Function1 function1 = function1Arr[i];
                int compareValues = ComparisonsKt__ComparisonsKt.compareValues((Comparable) function1.invoke(this), (Comparable) function1.invoke(modifierFreeEntry));
                if (compareValues != 0) {
                    return compareValues;
                }
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModifierFreeEntry)) {
                return false;
            }
            ModifierFreeEntry modifierFreeEntry = (ModifierFreeEntry) obj;
            return Intrinsics.areEqual(this.listToken, modifierFreeEntry.listToken) && Intrinsics.areEqual(this.input, modifierFreeEntry.input);
        }

        public final int hashCode() {
            return this.input.hashCode() + (this.listToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ModifierFreeEntry(listToken=", MenuItemModifierListToken.m1260toStringimpl(this.listToken), ", input=", this.input, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.listToken);
            parcel.writeString(this.input);
        }
    }

    public final class ModifierSelection implements Parcelable, Comparable {
        public static final Parcelable.Creator<ModifierSelection> CREATOR = new Cart.Creator(21);
        public final String listToken;
        public final Integer quantity;
        public final String selectionToken;

        public ModifierSelection(Integer num, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.listToken = str;
            this.selectionToken = str2;
            this.quantity = num;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ModifierSelection modifierSelection = (ModifierSelection) obj;
            modifierSelection.getClass();
            Function1[] function1Arr = {new LocationMenu$$ExternalSyntheticLambda6(1), new LocationMenu$$ExternalSyntheticLambda6(2), new LocationMenu$$ExternalSyntheticLambda6(3)};
            for (int i = 0; i < 3; i++) {
                Function1 function1 = function1Arr[i];
                int compareValues = ComparisonsKt__ComparisonsKt.compareValues((Comparable) function1.invoke(this), (Comparable) function1.invoke(modifierSelection));
                if (compareValues != 0) {
                    return compareValues;
                }
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModifierSelection)) {
                return false;
            }
            ModifierSelection modifierSelection = (ModifierSelection) obj;
            return Intrinsics.areEqual(this.listToken, modifierSelection.listToken) && Intrinsics.areEqual(this.selectionToken, modifierSelection.selectionToken) && Intrinsics.areEqual(this.quantity, modifierSelection.quantity);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.listToken.hashCode() * 31, 31, this.selectionToken);
            Integer num = this.quantity;
            return m + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ModifierSelection(listToken=", MenuItemModifierListToken.m1260toStringimpl(this.listToken), ", selectionToken=", ModifierToken.m1277toStringimpl(this.selectionToken), ", quantity="), this.quantity, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.listToken);
            parcel.writeString(this.selectionToken);
            Integer num = this.quantity;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CartEntry(String str, String str2, SortedSet sortedSet, SortedSet sortedSet2, ArrayList arrayList, String str3, int i) {
        this(str, str2, r5, r14, (i & 16) != 0 ? EmptyList.INSTANCE : arrayList, (i & 32) != 0 ? null : str3, (String) null);
        SortedSet sortedSet3;
        if ((i & 4) != 0) {
            TreeSet treeSet = new TreeSet();
            ArraysKt___ArraysKt.toCollection(new ModifierSelection[0], treeSet);
            sortedSet3 = treeSet;
        } else {
            sortedSet3 = sortedSet;
        }
        SortedSet sortedSet4 = sortedSet2;
        if ((i & 8) != 0) {
            TreeSet treeSet2 = new TreeSet();
            ArraysKt___ArraysKt.toCollection(new ModifierFreeEntry[0], treeSet2);
            sortedSet4 = treeSet2;
        }
    }

    /* renamed from: copy-Fx2-XuU$default, reason: not valid java name */
    public static CartEntry m1230copyFx2XuU$default(CartEntry cartEntry, String str, int i) {
        String str2 = cartEntry.menuItemToken;
        String str3 = cartEntry.variationToken;
        SortedSet sortedSet = cartEntry.modifierSelections;
        SortedSet sortedSet2 = cartEntry.freeTextEntries;
        List list = cartEntry.comboSlotSelections;
        String str4 = (i & 64) != 0 ? cartEntry.offerToken : null;
        cartEntry.getClass();
        str2.getClass();
        sortedSet.getClass();
        sortedSet2.getClass();
        list.getClass();
        return new CartEntry(str2, str3, sortedSet, sortedSet2, list, str, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        boolean areEqual2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        if (!Intrinsics.areEqual(this.menuItemToken, cartEntry.menuItemToken)) {
            return false;
        }
        String str = cartEntry.variationToken;
        String str2 = this.variationToken;
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
        if (!areEqual || !Intrinsics.areEqual(this.modifierSelections, cartEntry.modifierSelections) || !Intrinsics.areEqual(this.freeTextEntries, cartEntry.freeTextEntries) || !Intrinsics.areEqual(this.comboSlotSelections, cartEntry.comboSlotSelections) || !Intrinsics.areEqual(this.discountText, cartEntry.discountText)) {
            return false;
        }
        String str3 = cartEntry.offerToken;
        String str4 = this.offerToken;
        if (str4 == null) {
            if (str3 == null) {
                areEqual2 = true;
            }
            areEqual2 = false;
        } else {
            if (str3 != null) {
                areEqual2 = Intrinsics.areEqual(str4, str3);
            }
            areEqual2 = false;
        }
        return areEqual2;
    }

    public final int hashCode() {
        int hashCode = this.menuItemToken.hashCode() * 31;
        String str = this.variationToken;
        int m = Recorder$$ExternalSyntheticOutline2.m((this.freeTextEntries.hashCode() + ((this.modifierSelections.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.comboSlotSelections);
        String str2 = this.discountText;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerToken;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.menuItemToken);
        String str = this.variationToken;
        String m1265toStringimpl = str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str);
        String str2 = this.offerToken;
        String m1279toStringimpl = str2 != null ? OfferToken.m1279toStringimpl(str2) : "null";
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartEntry(menuItemToken=", m1264toStringimpl, ", variationToken=", m1265toStringimpl, ", modifierSelections=");
        m.append(this.modifierSelections);
        m.append(", freeTextEntries=");
        m.append(this.freeTextEntries);
        m.append(", comboSlotSelections=");
        Recorder$$ExternalSyntheticOutline2.m(", discountText=", this.discountText, ", offerToken=", m, this.comboSlotSelections);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m1279toStringimpl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.menuItemToken);
        String str = this.variationToken;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        SortedSet sortedSet = this.modifierSelections;
        parcel.writeInt(sortedSet.size());
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            ((ModifierSelection) it.next()).writeToParcel(parcel, i);
        }
        SortedSet sortedSet2 = this.freeTextEntries;
        parcel.writeInt(sortedSet2.size());
        Iterator it2 = sortedSet2.iterator();
        while (it2.hasNext()) {
            ((ModifierFreeEntry) it2.next()).writeToParcel(parcel, i);
        }
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.comboSlotSelections, parcel);
        while (m.hasNext()) {
            ((ComboSlotSelection) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.discountText);
        String str2 = this.offerToken;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
    }

    public CartEntry(String str, String str2, SortedSet sortedSet, SortedSet sortedSet2, List list, String str3, String str4) {
        str.getClass();
        sortedSet.getClass();
        sortedSet2.getClass();
        list.getClass();
        this.menuItemToken = str;
        this.variationToken = str2;
        this.modifierSelections = sortedSet;
        this.freeTextEntries = sortedSet2;
        this.comboSlotSelections = list;
        this.discountText = str3;
        this.offerToken = str4;
    }
}
