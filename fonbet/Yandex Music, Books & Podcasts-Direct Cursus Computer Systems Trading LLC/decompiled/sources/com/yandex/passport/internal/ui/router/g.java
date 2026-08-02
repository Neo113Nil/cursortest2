package com.yandex.passport.internal.ui.router;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements i {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new e(1);
    public final int a;

    public g(int i) {
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
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("ImageResource(value="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
