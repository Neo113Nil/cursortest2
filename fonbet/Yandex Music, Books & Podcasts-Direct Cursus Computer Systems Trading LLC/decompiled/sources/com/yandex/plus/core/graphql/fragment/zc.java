package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zc {
    public final String a;
    public final int b;
    public final ArrayList c;
    public final tc d;
    public final sc e;
    public final uc f;
    public final yc g;
    public final vc h;
    public final xc i;
    public final String j;
    public final wc k;
    public final Map l;

    public zc(String str, int i, ArrayList arrayList, tc tcVar, sc scVar, uc ucVar, yc ycVar, vc vcVar, xc xcVar, String str2, wc wcVar, Map map) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = tcVar;
        this.e = scVar;
        this.f = ucVar;
        this.g = ycVar;
        this.h = vcVar;
        this.i = xcVar;
        this.j = str2;
        this.k = wcVar;
        this.l = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc)) {
            return false;
        }
        zc zcVar = (zc) obj;
        return this.a.equals(zcVar.a) && this.b == zcVar.b && this.c.equals(zcVar.c) && Intrinsics.d(this.d, zcVar.d) && this.e.equals(zcVar.e) && this.f.equals(zcVar.f) && Intrinsics.d(this.g, zcVar.g) && Intrinsics.d(this.h, zcVar.h) && Intrinsics.d(this.i, zcVar.i) && Intrinsics.d(this.j, zcVar.j) && Intrinsics.d(this.k, zcVar.k) && this.l.equals(zcVar.l);
    }

    public final int hashCode() {
        int b = dfi.b(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
        tc tcVar = this.d;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((b + (tcVar == null ? 0 : tcVar.hashCode())) * 31)) * 31)) * 31;
        yc ycVar = this.g;
        int hashCode2 = (hashCode + (ycVar == null ? 0 : ycVar.hashCode())) * 31;
        vc vcVar = this.h;
        int hashCode3 = (hashCode2 + (vcVar == null ? 0 : vcVar.hashCode())) * 31;
        xc xcVar = this.i;
        int hashCode4 = (hashCode3 + (xcVar == null ? 0 : xcVar.hashCode())) * 31;
        String str = this.j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        wc wcVar = this.k;
        return this.l.hashCode() + ((hashCode5 + (wcVar != null ? wcVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plaque(plaqueId=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", widgetsLevelIds=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        sb.append(this.d);
        sb.append(", condition=");
        sb.append(this.e);
        sb.append(", displayRules=");
        sb.append(this.f);
        sb.append(", strictAction=");
        sb.append(this.g);
        sb.append(", metricContext=");
        sb.append(this.h);
        sb.append(", params=");
        sb.append(this.i);
        sb.append(", seenContext=");
        sb.append(this.j);
        sb.append(", notification=");
        sb.append(this.k);
        sb.append(", serviceMeta=");
        return k5r.p(sb, this.l, ')');
    }
}
