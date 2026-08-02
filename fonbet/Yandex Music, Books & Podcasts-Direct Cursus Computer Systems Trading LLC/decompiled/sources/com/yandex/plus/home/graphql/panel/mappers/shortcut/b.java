package com.yandex.plus.home.graphql.panel.mappers.shortcut;

import com.appsflyer.internal.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.repository.api.model.panel.d0;
import com.yandex.plus.home.repository.api.model.panel.h;
import defpackage.k5r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final v e;
    public final v f;
    public final v g;
    public final d0 h;
    public final String i;
    public final v j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final d0 o;
    public final h p;
    public final String q;
    public final v r;
    public final v s;
    public final y t;
    public final y u;
    public final y v;
    public final Map w;

    public b(String str, String str2, String str3, String str4, v vVar, v vVar2, v vVar3, d0 d0Var, String str5, v vVar4, List list, List list2, List list3, List list4, d0 d0Var2, h hVar, String str6, v vVar5, v vVar6, y yVar, y yVar2, y yVar3, Map map) {
        str3.getClass();
        vVar2.getClass();
        list.getClass();
        list3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vVar;
        this.f = vVar2;
        this.g = vVar3;
        this.h = d0Var;
        this.i = str5;
        this.j = vVar4;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = d0Var2;
        this.p = hVar;
        this.q = str6;
        this.r = vVar5;
        this.s = vVar6;
        this.t = yVar;
        this.u = yVar2;
        this.v = yVar3;
        this.w = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && Intrinsics.d(this.c, bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && Intrinsics.d(this.f, bVar.f) && this.g.equals(bVar.g) && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i) && Intrinsics.d(this.j, bVar.j) && Intrinsics.d(this.k, bVar.k) && Intrinsics.d(this.l, bVar.l) && Intrinsics.d(this.m, bVar.m) && Intrinsics.d(this.n, bVar.n) && Intrinsics.d(this.o, bVar.o) && Intrinsics.d(this.p, bVar.p) && Intrinsics.d(this.q, bVar.q) && this.r.equals(bVar.r) && this.s.equals(bVar.s) && this.t.equals(bVar.t) && Intrinsics.d(this.u, bVar.u) && Intrinsics.d(this.v, bVar.v) && Intrinsics.d(this.w, bVar.w);
    }

    public final int hashCode() {
        int f = k.f(this.g, k.f(this.f, k.f(this.e, k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31);
        d0 d0Var = this.h;
        int hashCode = (f + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v vVar = this.j;
        int d = k5r.d((hashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.k);
        List list = this.l;
        int d2 = k5r.d((d + (list == null ? 0 : list.hashCode())) * 31, 31, this.m);
        List list2 = this.n;
        int hashCode3 = (d2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        d0 d0Var2 = this.o;
        int hashCode4 = (hashCode3 + (d0Var2 == null ? 0 : d0Var2.hashCode())) * 31;
        h hVar = this.p;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.q;
        int hashCode6 = (this.t.hashCode() + k.f(this.s, k.f(this.r, (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31)) * 31;
        y yVar = this.u;
        int hashCode7 = (hashCode6 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        y yVar2 = this.v;
        int hashCode8 = (hashCode7 + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        Map map = this.w;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyShortcutMainPart(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", titleTextColor=");
        sb.append(this.e);
        sb.append(", subtitleTextColor=");
        sb.append(this.f);
        sb.append(", backgroundColor=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", descriptionTextColor=");
        sb.append(this.j);
        sb.append(", subtitleStyledTexts=");
        sb.append(this.k);
        sb.append(", descriptionStyledTexts=");
        sb.append(this.l);
        sb.append(", subtitleTextIcons=");
        sb.append(this.m);
        sb.append(", descriptionTextIcons=");
        sb.append(this.n);
        sb.append(", buttonAction=");
        sb.append(this.o);
        sb.append(", giftProgress=");
        sb.append(this.p);
        sb.append(", badgeText=");
        sb.append(this.q);
        sb.append(", badgeTextColor=");
        sb.append(this.r);
        sb.append(", badgeBackgroundColor=");
        sb.append(this.s);
        sb.append(", giftImage=");
        sb.append(this.t);
        sb.append(", firstConfettiImage=");
        sb.append(this.u);
        sb.append(", secondConfettiImage=");
        sb.append(this.v);
        sb.append(", analyticsParams=");
        return k5r.p(sb, this.w, ')');
    }
}
