package app.cash.local.primitives.order;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RowIdentifier implements Parcelable {
    public static final Parcelable.Creator<RowIdentifier> CREATOR = new MenuItem.Creator(29);
    public final String value;

    public /* synthetic */ RowIdentifier(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1286toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RowIdentifier(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RowIdentifier) {
            return Intrinsics.areEqual(this.value, ((RowIdentifier) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1286toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
