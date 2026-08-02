package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c0> CREATOR = new b0(0);
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final long q;
    public final int r;
    public final String s;

    public c0(long j, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, long j2, long j3, String str7, String str8, String str9, String str10, String str11, boolean z, long j4, int i, String str12) {
        dfi.s(str, str5, str12);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = arrayList;
        this.i = j2;
        this.j = j3;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = z;
        this.q = j4;
        this.r = i;
        this.s = str12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a == c0Var.a && Intrinsics.d(this.b, c0Var.b) && Intrinsics.d(this.c, c0Var.c) && Intrinsics.d(this.d, c0Var.d) && Intrinsics.d(this.e, c0Var.e) && Intrinsics.d(this.f, c0Var.f) && Intrinsics.d(this.g, c0Var.g) && this.h.equals(c0Var.h) && this.i == c0Var.i && this.j == c0Var.j && Intrinsics.d(this.k, c0Var.k) && Intrinsics.d(this.l, c0Var.l) && Intrinsics.d(this.m, c0Var.m) && Intrinsics.d(this.n, c0Var.n) && Intrinsics.d(this.o, c0Var.o) && this.p == c0Var.p && this.q == c0Var.q && this.r == c0Var.r && Intrinsics.d(this.s, c0Var.s);
    }

    public final int hashCode() {
        int c = k5r.c(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int c2 = k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        int c3 = tlm.c(this.j, tlm.c(this.i, dfi.b(this.h, (c2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31);
        String str5 = this.k;
        int hashCode3 = (c3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        return this.s.hashCode() + f1d.a(this.r, tlm.c(this.q, k5r.e((hashCode6 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.p), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PicturePayload(uid=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", pushId=");
        sb.append(this.c);
        sb.append(", platform=");
        sb.append(this.d);
        sb.append(", eventName=");
        sb.append(this.e);
        sb.append(", pushService=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", pictures=");
        sb.append(this.h);
        sb.append(", expireAt=");
        sb.append(this.i);
        sb.append(", timeToLive=");
        sb.append(this.j);
        sb.append(", country=");
        sb.append(this.k);
        sb.append(", city=");
        sb.append(this.l);
        sb.append(", application=");
        sb.append(this.m);
        sb.append(", operatingSystem=");
        sb.append(this.n);
        sb.append(", userIp=");
        sb.append(this.o);
        sb.append(", isSilent=");
        sb.append(this.p);
        sb.append(", timestamp=");
        sb.append(this.q);
        sb.append(", notificationId=");
        sb.append(this.r);
        sb.append(", webviewUrl=");
        return dfi.i(sb, this.s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        ArrayList arrayList = this.h;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
    }
}
