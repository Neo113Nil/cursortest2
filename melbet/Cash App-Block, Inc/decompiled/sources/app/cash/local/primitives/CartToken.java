package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CartToken implements Parcelable {
    public static final Parcelable.Creator<CartToken> CREATOR = new Cart.Creator(23);
    public final String value;

    public /* synthetic */ CartToken(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1231toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CartToken) {
            return this.value.equals(((CartToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1231toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
