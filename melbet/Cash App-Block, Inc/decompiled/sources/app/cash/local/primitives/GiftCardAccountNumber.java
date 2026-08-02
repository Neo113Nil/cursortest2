package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GiftCardAccountNumber implements Parcelable {
    public static final Parcelable.Creator<GiftCardAccountNumber> CREATOR = new Line.Creator(12);
    public final String value;

    public /* synthetic */ GiftCardAccountNumber(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1241toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GiftCardAccountNumber(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GiftCardAccountNumber) {
            return Intrinsics.areEqual(this.value, ((GiftCardAccountNumber) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1241toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
