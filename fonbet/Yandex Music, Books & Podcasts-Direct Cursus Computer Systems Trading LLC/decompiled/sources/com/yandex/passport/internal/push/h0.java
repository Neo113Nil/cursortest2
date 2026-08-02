package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h0> CREATOR = new b0(1);
    public final String a;
    public final float b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Boolean l;
    public final String m;
    public final Boolean n;
    public final String o;
    public final String p;
    public final Boolean q;
    public final Long r;
    public final com.yandex.passport.sloth.data.h s;
    public final Boolean t;
    public final Boolean u;

    public h0(String str, float f, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, String str10, String str11, Boolean bool3, Long l, com.yandex.passport.sloth.data.h hVar, Boolean bool4, Boolean bool5) {
        str9.getClass();
        hVar.getClass();
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = bool;
        this.m = str9;
        this.n = bool2;
        this.o = str10;
        this.p = str11;
        this.q = bool3;
        this.r = l;
        this.s = hVar;
        this.t = bool4;
        this.u = bool5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.a, h0Var.a) && Float.compare(this.b, h0Var.b) == 0 && Intrinsics.d(this.c, h0Var.c) && Intrinsics.d(this.d, h0Var.d) && this.e == h0Var.e && this.f == h0Var.f && Intrinsics.d(this.g, h0Var.g) && Intrinsics.d(this.h, h0Var.h) && Intrinsics.d(this.i, h0Var.i) && Intrinsics.d(this.j, h0Var.j) && Intrinsics.d(this.k, h0Var.k) && Intrinsics.d(this.l, h0Var.l) && Intrinsics.d(this.m, h0Var.m) && Intrinsics.d(this.n, h0Var.n) && Intrinsics.d(this.o, h0Var.o) && Intrinsics.d(this.p, h0Var.p) && Intrinsics.d(this.q, h0Var.q) && Intrinsics.d(this.r, h0Var.r) && this.s == h0Var.s && Intrinsics.d(this.t, h0Var.t) && Intrinsics.d(this.u, h0Var.u);
    }

    public final int hashCode() {
        String str = this.a;
        int a = eta.a((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int c = tlm.c(this.f, tlm.c(this.e, (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.g;
        int hashCode2 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.l;
        int c2 = k5r.c((hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.m);
        Boolean bool2 = this.n;
        int hashCode7 = (c2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.o;
        int hashCode8 = (hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.p;
        int hashCode9 = (hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.q;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.r;
        int hashCode11 = (this.s.hashCode() + ((hashCode10 + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        Boolean bool4 = this.t;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.u;
        return hashCode12 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushPayload(platform=");
        sb.append(this.a);
        sb.append(", passpAmProto=");
        sb.append(this.b);
        sb.append(", pushService=");
        sb.append(this.c);
        sb.append(", eventName=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", uid=");
        sb.append(this.f);
        sb.append(", pushId=");
        sb.append(this.g);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(", body=");
        sb.append(this.i);
        sb.append(", subtitle=");
        sb.append(this.j);
        sb.append(", minAmVersion=");
        sb.append(this.k);
        sb.append(", isSilent=");
        sb.append(this.l);
        sb.append(", webviewUrl=");
        sb.append(this.m);
        sb.append(", requireWebAuth=");
        sb.append(this.n);
        sb.append(", bodyIncludeCode=");
        sb.append(this.o);
        sb.append(", trackId=");
        sb.append(this.p);
        sb.append(", showCodeInNotification=");
        sb.append(this.q);
        sb.append(", expireAt=");
        sb.append(this.r);
        sb.append(", pushType=");
        sb.append(this.s);
        sb.append(", openInBrowser=");
        sb.append(this.t);
        sb.append(", requireWebAuthWithUid=");
        return com.appsflyer.internal.k.p(sb, this.u, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        Boolean bool = this.l;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.m);
        Boolean bool2 = this.n;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        Boolean bool3 = this.q;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l = this.r;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.s.name());
        Boolean bool4 = this.t;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.u;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }
}
