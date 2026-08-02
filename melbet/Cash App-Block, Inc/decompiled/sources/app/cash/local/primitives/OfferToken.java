package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OfferToken implements Parcelable {
    public static final Parcelable.Creator<OfferToken> CREATOR = new MenuItem.Creator(15);
    public final String value;

    public /* synthetic */ OfferToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OfferToken m1278boximpl(String str) {
        return new OfferToken(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1279toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfferToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OfferToken) {
            return Intrinsics.areEqual(this.value, ((OfferToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1279toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
