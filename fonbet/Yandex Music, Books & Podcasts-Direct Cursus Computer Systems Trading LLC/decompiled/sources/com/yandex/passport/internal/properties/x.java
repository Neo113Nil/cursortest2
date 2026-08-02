package com.yandex.passport.internal.properties;

import com.yandex.passport.api.a2;
import com.yandex.passport.api.q1;
import com.yandex.passport.api.x0;
import defpackage.f1d;
import defpackage.joj;
import defpackage.k5r;
import defpackage.l48;
import defpackage.uah;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements q1 {
    public final Map A;
    public final Map B;
    public final Map a;
    public final Map b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final joj j;
    public final String k;
    public final String l;
    public final l48 m;
    public final List n;
    public final Boolean o;
    public final l p;
    public final com.yandex.passport.api.q q;
    public final Locale r;
    public final com.yandex.passport.internal.network.p s;
    public final Map t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final Map y;
    public final Map z;

    public x(Map map, Map map2, String str, String str2, Long l, String str3, String str4, List list, List list2, joj jojVar, String str5, String str6, l48 l48Var, List list3, Boolean bool, l lVar, com.yandex.passport.api.q qVar, Locale locale, com.yandex.passport.internal.network.p pVar, Map map3, String str7, boolean z, boolean z2, boolean z3, Map map4, Map map5) {
        map.getClass();
        map2.getClass();
        list.getClass();
        list2.getClass();
        jojVar.getClass();
        list3.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = map;
        this.b = map2;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = list2;
        this.j = jojVar;
        this.k = str5;
        this.l = str6;
        this.m = l48Var;
        this.n = list3;
        this.o = bool;
        this.p = lVar;
        this.q = qVar;
        this.r = locale;
        this.s = pVar;
        this.t = map3;
        this.u = str7;
        this.v = z;
        this.w = z2;
        this.x = z3;
        this.y = map4;
        this.z = map5;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            com.yandex.passport.common.core.b K = com.yandex.plus.core.network.api.utils.a.K((com.yandex.passport.api.k0) entry.getKey());
            com.yandex.passport.internal.credentials.f fVar = (com.yandex.passport.internal.credentials.f) entry.getValue();
            fVar.getClass();
            arrayList.add(new Pair(K, new com.yandex.passport.internal.credentials.f(fVar.a, fVar.b)));
        }
        this.A = uah.n(arrayList);
        Map map6 = this.b;
        ArrayList arrayList2 = new ArrayList(map6.size());
        for (Map.Entry entry2 : map6.entrySet()) {
            com.yandex.passport.common.core.b K2 = com.yandex.plus.core.network.api.utils.a.K((com.yandex.passport.api.k0) entry2.getKey());
            com.yandex.passport.internal.credentials.f fVar2 = (com.yandex.passport.internal.credentials.f) entry2.getValue();
            fVar2.getClass();
            String str8 = fVar2.a;
            String str9 = fVar2.b;
            str8.getClass();
            str9.getClass();
            arrayList2.add(new Pair(K2, new com.yandex.passport.internal.credentials.f(str8, str9)));
        }
        this.B = uah.n(arrayList2);
    }

    @Override // com.yandex.passport.api.q1
    public final Boolean A() {
        return this.o;
    }

    @Override // com.yandex.passport.api.q1
    public final List B() {
        return this.h;
    }

    @Override // com.yandex.passport.api.q1
    public final String C() {
        return this.k;
    }

    @Override // com.yandex.passport.api.q1
    public final joj D() {
        return this.j;
    }

    public final boolean a() {
        return (this.m == null && this.n.isEmpty()) ? false : true;
    }

    public final com.yandex.passport.internal.credentials.f b(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        return (com.yandex.passport.internal.credentials.f) this.A.get(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && Intrinsics.d(this.b, xVar.b) && Intrinsics.d(this.c, xVar.c) && Intrinsics.d(this.d, xVar.d) && Intrinsics.d(this.e, xVar.e) && Intrinsics.d(this.f, xVar.f) && Intrinsics.d(this.g, xVar.g) && Intrinsics.d(this.h, xVar.h) && Intrinsics.d(this.i, xVar.i) && Intrinsics.d(this.j, xVar.j) && Intrinsics.d(this.k, xVar.k) && Intrinsics.d(this.l, xVar.l) && Intrinsics.d(this.m, xVar.m) && Intrinsics.d(this.n, xVar.n) && Intrinsics.d(this.o, xVar.o) && Intrinsics.d(this.p, xVar.p) && Intrinsics.d(this.q, xVar.q) && Intrinsics.d(this.r, xVar.r) && this.s.equals(xVar.s) && Intrinsics.d(this.t, xVar.t) && Intrinsics.d(this.u, xVar.u) && this.v == xVar.v && this.w == xVar.w && this.x == xVar.x && Intrinsics.d(this.y, xVar.y) && Intrinsics.d(this.z, xVar.z);
    }

    @Override // com.yandex.passport.api.q1
    public final String f() {
        return this.c;
    }

    @Override // com.yandex.passport.api.q1
    public final String g() {
        return this.u;
    }

    @Override // com.yandex.passport.api.q1
    public final String h() {
        return this.l;
    }

    public final int hashCode() {
        int b = f1d.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (this.j.hashCode() + k5r.d(k5r.d((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h), 31, this.i)) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        l48 l48Var = this.m;
        int d = k5r.d((hashCode7 + (l48Var == null ? 0 : l48Var.hashCode())) * 31, 31, this.n);
        Boolean bool = this.o;
        int hashCode8 = (d + (bool == null ? 0 : bool.hashCode())) * 31;
        l lVar = this.p;
        int hashCode9 = (hashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        com.yandex.passport.api.q qVar = this.q;
        int hashCode10 = (hashCode9 + (qVar == null ? 0 : qVar.hashCode())) * 961;
        Locale locale = this.r;
        int b2 = f1d.b(this.t, (this.s.hashCode() + ((hashCode10 + (locale == null ? 0 : locale.hashCode())) * 31)) * 31, 961);
        String str7 = this.u;
        return this.z.hashCode() + f1d.b(this.y, k5r.e(k5r.e(k5r.e((b2 + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.v), 31, this.w), 31, this.x), 31);
    }

    @Override // com.yandex.passport.api.q1
    public final com.yandex.passport.api.q i() {
        return this.q;
    }

    @Override // com.yandex.passport.api.q1
    public final boolean isWhiteLabel() {
        return this.x;
    }

    @Override // com.yandex.passport.api.q1
    public final l48 j() {
        return this.m;
    }

    @Override // com.yandex.passport.api.q1
    public final List k() {
        return this.i;
    }

    @Override // com.yandex.passport.api.q1
    public final String l() {
        return this.f;
    }

    @Override // com.yandex.passport.api.q1
    public final boolean m() {
        return this.v;
    }

    @Override // com.yandex.passport.api.q1
    public final Map n() {
        return this.z;
    }

    @Override // com.yandex.passport.api.q1
    public final String o() {
        return this.d;
    }

    @Override // com.yandex.passport.api.q1
    public final Map p() {
        return this.a;
    }

    @Override // com.yandex.passport.api.q1
    public final List q() {
        return this.n;
    }

    @Override // com.yandex.passport.api.q1
    public final Locale r() {
        return this.r;
    }

    @Override // com.yandex.passport.api.q1
    public final Map s() {
        return this.b;
    }

    @Override // com.yandex.passport.api.q1
    public final Map t() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties(credentialsMap=");
        sb.append(this.a);
        sb.append(", masterCredentialsMap=");
        sb.append(this.b);
        sb.append(", applicationPackageName=");
        sb.append(this.c);
        sb.append(", applicationVersion=");
        sb.append(this.d);
        sb.append(", applicationVersionCode=");
        sb.append(this.e);
        sb.append(", applicationClid=");
        sb.append(this.f);
        sb.append(", deviceGeoLocation=");
        sb.append(this.g);
        sb.append(", deviceGeoLocations=");
        sb.append(this.h);
        sb.append(", productLocation=");
        sb.append(this.i);
        sb.append(", okHttpClientBuilder=");
        sb.append(this.j);
        sb.append(", legalRulesUrl=");
        sb.append(this.k);
        sb.append(", legalConfidentialUrl=");
        sb.append(this.l);
        sb.append(", pushTokenProvider=");
        sb.append(this.m);
        sb.append(", pushTokenProviders=");
        sb.append(this.n);
        sb.append(", isAccountSharingEnabled=");
        sb.append(this.o);
        sb.append(", defaultLoginProperties=");
        sb.append(this.p);
        sb.append(", loggingDelegate=");
        sb.append(this.q);
        sb.append(", assertionDelegate=null, preferredLocale=");
        sb.append(this.r);
        sb.append(", urlOverride=");
        sb.append(this.s);
        sb.append(", locationsUrlOverride=");
        sb.append(this.t);
        sb.append(", twoFactorOtpProvider=null, origin=");
        sb.append(this.u);
        sb.append(", saveOnlyLocal=");
        sb.append(this.v);
        sb.append(", supportWebAuthN=");
        sb.append(this.w);
        sb.append(", isWhiteLabel=");
        sb.append(this.x);
        sb.append(", additionalMetricParams=");
        sb.append(this.y);
        sb.append(", vpnBlockerAdditionalParams=");
        return k5r.p(sb, this.z, ')');
    }

    @Override // com.yandex.passport.api.q1
    public final Map u() {
        return this.t;
    }

    @Override // com.yandex.passport.api.q1
    public final Long v() {
        return this.e;
    }

    @Override // com.yandex.passport.api.q1
    public final String w() {
        return this.g;
    }

    @Override // com.yandex.passport.api.q1
    public final boolean x() {
        return this.w;
    }

    @Override // com.yandex.passport.api.q1
    public final x0 y() {
        return this.p;
    }

    @Override // com.yandex.passport.api.q1
    public final a2 z() {
        return this.s;
    }
}
