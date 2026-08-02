package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboCategoryToken implements Parcelable {
    public static final Parcelable.Creator<ComboCategoryToken> CREATOR = new Cart.Creator(26);
    public final String value;

    public /* synthetic */ ComboCategoryToken(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1232toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboCategoryToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ComboCategoryToken) {
            return Intrinsics.areEqual(this.value, ((ComboCategoryToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1232toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
