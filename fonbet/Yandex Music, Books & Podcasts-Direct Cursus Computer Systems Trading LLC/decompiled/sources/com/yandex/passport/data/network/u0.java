package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.tlm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final t0 c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final Pair i;
    public final String j;
    public final String k;
    public final Map l;

    public u0(com.yandex.passport.data.models.g gVar, String str, t0 t0Var, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, String str4, Pair pair, String str5, String str6, Map map) {
        map.getClass();
        this.a = gVar;
        this.b = str;
        this.c = t0Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = pair;
        this.j = str5;
        this.k = str6;
        this.l = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a.equals(u0Var.a) && Intrinsics.d(this.b, u0Var.b) && Intrinsics.d(this.c, u0Var.c) && this.d.equals(u0Var.d) && this.e.equals(u0Var.e) && Intrinsics.d(this.f, u0Var.f) && Intrinsics.d(this.g, u0Var.g) && this.h.equals(u0Var.h) && this.i.equals(u0Var.i) && Intrinsics.d(this.j, u0Var.j) && Intrinsics.d(this.k, u0Var.k) && this.l.equals(u0Var.l);
    }

    public final int hashCode() {
        int c = tlm.c(0L, Integer.hashCode(this.a.a) * 31, 31);
        String str = this.b;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        t0 t0Var = this.c;
        int d = k5r.d(k5r.d((hashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode2 = (d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (this.i.hashCode() + k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h)) * 31;
        String str4 = this.j;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return this.l.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=0, placemark=");
        sb.append(this.b);
        sb.append(", gps=");
        sb.append(this.c);
        sb.append(", productLocation=");
        sb.append(this.d);
        sb.append(", deviceGeoLocation=");
        sb.append(this.e);
        sb.append(", authToken=");
        sb.append(this.f);
        sb.append(", appId=");
        sb.append(this.g);
        sb.append(", appVersion=");
        sb.append(this.h);
        sb.append(", simRegion=");
        sb.append(this.i);
        sb.append(", deviceRegion=");
        sb.append(this.j);
        sb.append(", cookies=");
        sb.append(this.k);
        sb.append(", additionalParams=");
        return k5r.p(sb, this.l, ')');
    }
}
