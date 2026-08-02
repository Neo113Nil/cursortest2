package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a1> CREATOR = new b0(3);
    public final long a;
    public final boolean b;
    public final boolean c;

    public a1(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a == a1Var.a && this.b == a1Var.b && this.c == a1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentPushProperties(durationMs=");
        sb.append(this.a);
        sb.append(", codeOnlyForeground=");
        sb.append(this.b);
        sb.append(", codeForeground=");
        return dfi.j(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
