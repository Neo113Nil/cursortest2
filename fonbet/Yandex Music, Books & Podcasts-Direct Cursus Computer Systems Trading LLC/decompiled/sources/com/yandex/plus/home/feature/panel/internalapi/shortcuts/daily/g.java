package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final String a;
    public final f b;
    public final f c;
    public final f d;
    public final a e;
    public final com.yandex.plus.home.feature.panel.internal.mapper.a f;
    public final d g;
    public final e h;
    public final b i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    public g(String str, f fVar, f fVar2, f fVar3, a aVar, com.yandex.plus.home.feature.panel.internal.mapper.a aVar2, d dVar, e eVar, b bVar, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.a = str;
        this.b = fVar;
        this.c = fVar2;
        this.d = fVar3;
        this.e = aVar;
        this.f = aVar2;
        this.g = dVar;
        this.h = eVar;
        this.i = bVar;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c) && this.d.equals(gVar.d) && this.e.equals(gVar.e) && Intrinsics.d(this.f, gVar.f) && Intrinsics.d(this.g, gVar.g) && Intrinsics.d(this.h, gVar.h) && Intrinsics.d(this.i, gVar.i) && Intrinsics.d(this.j, gVar.j) && Intrinsics.d(this.k, gVar.k) && Intrinsics.d(this.l, gVar.l) && this.m == gVar.m;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        com.yandex.plus.home.feature.panel.internal.mapper.a aVar = this.f;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.g;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.h;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.i;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.j;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return Boolean.hashCode(this.m) + ((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPartProperties(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", background=");
        sb.append(this.e);
        sb.append(", rootClickListener=");
        sb.append(this.f);
        sb.append(", button=");
        sb.append(this.g);
        sb.append(", giftProgressProperties=");
        sb.append(this.h);
        sb.append(", badgeContent=");
        sb.append(this.i);
        sb.append(", giftUrl=");
        sb.append(this.j);
        sb.append(", confettiFirstLayerUrl=");
        sb.append(this.k);
        sb.append(", confettiSecondLayerUrl=");
        sb.append(this.l);
        sb.append(", analyticsParams=null, isBig=");
        return dfi.j(sb, this.m, ')');
    }
}
