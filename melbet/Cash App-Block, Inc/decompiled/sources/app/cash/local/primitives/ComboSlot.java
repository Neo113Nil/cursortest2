package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboSlot implements Parcelable {
    public static final Parcelable.Creator<ComboSlot> CREATOR = new Cart.Creator(27);
    public final ArrayList availableItemTokens;
    public final ArrayList availableVariationTokens;
    public final String comboCategoryToken;
    public final String defaultVariationToken;
    public final String name;
    public final int numberOfSelections;
    public final ArrayList priceAdjustments;
    public final String token;

    public ComboSlot(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, int i, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.comboCategoryToken = str3;
        this.availableItemTokens = arrayList;
        this.availableVariationTokens = arrayList2;
        this.defaultVariationToken = str4;
        this.numberOfSelections = i;
        this.priceAdjustments = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        String str;
        boolean equals2;
        if (this != obj) {
            if (obj instanceof ComboSlot) {
                ComboSlot comboSlot = (ComboSlot) obj;
                if (Intrinsics.areEqual(this.token, comboSlot.token) && Intrinsics.areEqual(this.name, comboSlot.name)) {
                    String str2 = comboSlot.comboCategoryToken;
                    String str3 = this.comboCategoryToken;
                    if (str3 == null) {
                        if (str2 == null) {
                            equals = true;
                            if (equals && this.availableItemTokens.equals(comboSlot.availableItemTokens) && this.availableVariationTokens.equals(comboSlot.availableVariationTokens)) {
                                String str4 = comboSlot.defaultVariationToken;
                                str = this.defaultVariationToken;
                                if (str != null) {
                                    if (str4 == null) {
                                        equals2 = true;
                                        if (equals2 && this.numberOfSelections == comboSlot.numberOfSelections && this.priceAdjustments.equals(comboSlot.priceAdjustments)) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                } else {
                                    if (str4 != null) {
                                        equals2 = str.equals(str4);
                                        if (equals2) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                            String str42 = comboSlot.defaultVariationToken;
                            str = this.defaultVariationToken;
                            if (str != null) {
                            }
                        }
                    } else {
                        if (str2 != null) {
                            equals = str3.equals(str2);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        String str = this.comboCategoryToken;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.availableVariationTokens, CameraState$Type$EnumUnboxingLocalUtility.m(this.availableItemTokens, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.defaultVariationToken;
        return this.priceAdjustments.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.numberOfSelections, (m2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String m1233toStringimpl = ComboSlotToken.m1233toStringimpl(this.token);
        String str = this.comboCategoryToken;
        String m1232toStringimpl = str == null ? "null" : ComboCategoryToken.m1232toStringimpl(str);
        String str2 = this.defaultVariationToken;
        String m1265toStringimpl = str2 != null ? MenuItemVariationToken.m1265toStringimpl(str2) : "null";
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlot(token=", m1233toStringimpl, ", name=", this.name, ", comboCategoryToken=");
        m.append(m1232toStringimpl);
        m.append(", availableItemTokens=");
        m.append(this.availableItemTokens);
        m.append(", availableVariationTokens=");
        m.append(this.availableVariationTokens);
        m.append(", defaultVariationToken=");
        m.append(m1265toStringimpl);
        m.append(", numberOfSelections=");
        m.append(this.numberOfSelections);
        m.append(", priceAdjustments=");
        m.append(this.priceAdjustments);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        String str = this.comboCategoryToken;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.availableItemTokens, parcel);
        while (m.hasNext()) {
            parcel.writeString(((MenuItemToken) m.next()).value);
        }
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.availableVariationTokens, parcel);
        while (m2.hasNext()) {
            parcel.writeString(((MenuItemVariationToken) m2.next()).value);
        }
        String str2 = this.defaultVariationToken;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        parcel.writeInt(this.numberOfSelections);
        Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.priceAdjustments, parcel);
        while (m3.hasNext()) {
            ((ComboSlotPriceAdjustment) m3.next()).writeToParcel(parcel, i);
        }
    }
}
