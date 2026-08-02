package com.yandex.passport.internal.social.esia;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e0> CREATOR = new z(3);
    public final d0 a;
    public final String b;
    public final Throwable c;
    public final boolean d;
    public final boolean e;

    public e0(d0 d0Var, String str, Throwable th, boolean z, boolean z2) {
        this.a = d0Var;
        this.b = str;
        this.c = th;
        this.d = z;
        this.e = z2;
    }

    public static e0 a(e0 e0Var, d0 d0Var, String str, Throwable th, boolean z, int i) {
        if ((i & 1) != 0) {
            d0Var = e0Var.a;
        }
        d0 d0Var2 = d0Var;
        if ((i & 2) != 0) {
            str = e0Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            th = e0Var.c;
        }
        Throwable th2 = th;
        boolean z2 = e0Var.d;
        if ((i & 16) != 0) {
            z = e0Var.e;
        }
        e0Var.getClass();
        return new e0(d0Var2, str2, th2, z2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.a, e0Var.a) && Intrinsics.d(this.b, e0Var.b) && Intrinsics.d(this.c, e0Var.c) && this.d == e0Var.d && this.e == e0Var.e;
    }

    public final int hashCode() {
        d0 d0Var = this.a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.c;
        return Boolean.hashCode(this.e) + k5r.e((hashCode2 + (th != null ? th.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(result=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", isEsiaBindingAppToApp=");
        sb.append(this.d);
        sb.append(", isWaitingForEsiaCallback=");
        return dfi.j(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
