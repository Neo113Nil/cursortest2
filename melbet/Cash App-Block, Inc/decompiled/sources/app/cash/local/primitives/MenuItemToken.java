package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItemToken implements Parcelable {
    public static final Parcelable.Creator<MenuItemToken> CREATOR = new MenuItem.Creator(6);
    public final String value;

    public /* synthetic */ MenuItemToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemToken m1261boximpl(String str) {
        return new MenuItemToken(str);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1262equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1263hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1264toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItemToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MenuItemToken) {
            return Intrinsics.areEqual(this.value, ((MenuItemToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1264toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
