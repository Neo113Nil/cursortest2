package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MessageToken implements Parcelable {
    public static final Parcelable.Creator<MessageToken> CREATOR = new MenuItem.Creator(10);
    public final String value;

    public /* synthetic */ MessageToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MessageToken m1270boximpl(String str) {
        return new MessageToken(str);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1271equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1272hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1273toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageToken(value=", str, ")");
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m1274writeToParcelimpl(String str, Parcel parcel) {
        parcel.getClass();
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MessageToken) {
            return Intrinsics.areEqual(this.value, ((MessageToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1273toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1275unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
