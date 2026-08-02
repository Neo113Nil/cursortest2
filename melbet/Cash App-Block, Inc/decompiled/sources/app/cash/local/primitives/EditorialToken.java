package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class EditorialToken implements Parcelable {
    public static final Parcelable.Creator<EditorialToken> CREATOR = new Line.Creator(8);
    public final String value;

    public /* synthetic */ EditorialToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EditorialToken m1234boximpl(String str) {
        return new EditorialToken(str);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1235equalsimpl0(String str, String str2) {
        return str.equals(str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1236hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1237toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EditorialToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EditorialToken) {
            return this.value.equals(((EditorialToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1237toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
