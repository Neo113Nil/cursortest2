package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w8 implements Parcelable {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    @NotNull
    public static final v8 Companion = new v8();

    @NotNull
    public static final Parcelable.Creator<w8> CREATOR = new com.yandex.passport.api.impl.a(24);

    public /* synthetic */ w8(int i, long j, String str, String str2, String str3, String str4, int i2) {
        if (41 != (i & 41)) {
            u7g.V(i, 41, u8.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return this.a == w8Var.a && Intrinsics.d(this.b, w8Var.b) && Intrinsics.d(this.c, w8Var.c) && Intrinsics.d(this.d, w8Var.d) && Intrinsics.d(this.e, w8Var.e) && this.f == w8Var.f;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = k5r.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return Integer.hashCode(this.f) + ((c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterMember(uid=");
        sb.append(this.a);
        sb.append(", displayLogin=");
        sb.append(this.b);
        sb.append(", publicName=");
        sb.append(this.c);
        sb.append(", phoneNumber=");
        sb.append(this.d);
        sb.append(", avatarUrl=");
        sb.append(this.e);
        sb.append(", primaryAliasType=");
        return vz1.r(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public w8(int i, long j, String str, String str2, String str3, String str4) {
        str3.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }
}
