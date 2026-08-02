package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c4 implements Parcelable {
    public final long a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @NotNull
    public static final b4 Companion = new b4();

    @NotNull
    public static final Parcelable.Creator<c4> CREATOR = new com.yandex.passport.api.impl.a(19);

    public /* synthetic */ c4(int i, long j, boolean z, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, a4.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return this.a == c4Var.a && this.b == c4Var.b && Intrinsics.d(this.c, c4Var.c) && Intrinsics.d(this.d, c4Var.d) && Intrinsics.d(this.e, c4Var.e) && Intrinsics.d(this.f, c4Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(k5r.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Member(uid=");
        sb.append(this.a);
        sb.append(", hasPlus=");
        sb.append(this.b);
        sb.append(", displayLogin=");
        sb.append(this.c);
        sb.append(", displayName=");
        sb.append(this.d);
        sb.append(", publicName=");
        sb.append(this.e);
        sb.append(", avatarUrl=");
        return dfi.i(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public c4(long j, boolean z, String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
