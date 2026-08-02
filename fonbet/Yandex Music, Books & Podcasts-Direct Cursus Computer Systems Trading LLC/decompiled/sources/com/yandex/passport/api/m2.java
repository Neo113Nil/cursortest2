package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class m2 implements o2 {

    @NotNull
    public static final Parcelable.Creator<m2> CREATOR = new a(9);
    public final int a;

    public m2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && this.a == ((m2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Custom(backgroundResId="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
