package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuCategoryToken implements Parcelable {
    public static final Parcelable.Creator<MenuCategoryToken> CREATOR = new Line.Creator(27);
    public final String value;

    public /* synthetic */ MenuCategoryToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuCategoryToken m1256boximpl(String str) {
        return new MenuCategoryToken(str);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1257equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1258hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1259toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuCategoryToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MenuCategoryToken) {
            return Intrinsics.areEqual(this.value, ((MenuCategoryToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1259toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
