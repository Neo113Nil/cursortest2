package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItemVariationToken implements Parcelable {
    public static final Parcelable.Creator<MenuItemVariationToken> CREATOR = new MenuItem.Creator(8);
    public final String value;

    public /* synthetic */ MenuItemVariationToken(String str) {
        this.value = str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1265toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItemVariationToken(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MenuItemVariationToken) {
            return Intrinsics.areEqual(this.value, ((MenuItemVariationToken) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m1265toStringimpl(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
