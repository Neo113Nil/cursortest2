package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final Map d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String j;
    public final String k;
    public final String l;
    public final com.yandex.plus.core.graphql.type.w0 m;
    public final com.yandex.plus.core.graphql.type.x0 n;
    public final h o;

    public i(String str, ArrayList arrayList, String str2, Map map, boolean z, boolean z2, String str3, String str4, ArrayList arrayList2, String str5, String str6, String str7, com.yandex.plus.core.graphql.type.w0 w0Var, com.yandex.plus.core.graphql.type.x0 x0Var, h hVar) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = map;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = arrayList2;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = w0Var;
        this.n = x0Var;
        this.o = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && Intrinsics.d(this.c, iVar.c) && this.d.equals(iVar.d) && this.e == iVar.e && this.f == iVar.f && this.g.equals(iVar.g) && this.h.equals(iVar.h) && this.i.equals(iVar.i) && this.j.equals(iVar.j) && this.k.equals(iVar.k) && this.l.equals(iVar.l) && this.m == iVar.m && this.n == iVar.n && Intrinsics.d(this.o, iVar.o);
    }

    public final int hashCode() {
        int b = dfi.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (this.n.hashCode() + ((this.m.hashCode() + k5r.c(k5r.c(k5r.c(dfi.b(this.i, k5r.c(k5r.c(k5r.e(k5r.e(f1d.b(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31;
        h hVar = this.o;
        return hashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalOffer(additionalText=" + this.a + ", benefits=" + this.b + ", disclaimer=" + this.c + ", iconImages=" + this.d + ", isAvailable=" + this.e + ", isSelected=" + this.f + ", offerName=" + this.g + ", offersBatchId=" + this.h + ", offersToReplace=" + this.i + ", positionId=" + this.j + ", text=" + this.k + ", title=" + this.l + ", upsaleStep=" + this.m + ", upsaleType=" + this.n + ", offerSwitchToggle=" + this.o + ')';
    }
}
