package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboSlotToken implements Parcelable {
    public static final Parcelable.Creator<ComboSlotToken> CREATOR = new Cart.Creator(29);
    public final String value;

    public /* synthetic */ ComboSlotToken(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1233toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlotToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ComboSlotToken) {
            return Intrinsics.areEqual(this.value, ((ComboSlotToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1233toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
