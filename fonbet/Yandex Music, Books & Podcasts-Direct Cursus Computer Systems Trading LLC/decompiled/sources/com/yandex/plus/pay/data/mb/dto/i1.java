package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i1 {

    @NotNull
    public static final e1 Companion = new e1();
    public static final arf[] l;
    public final String a;
    public final String b;
    public final z0 c;
    public final String d;
    public final String e;
    public final k1 f;
    public final Map g;
    public final String h;
    public final String i;
    public final h1 j;
    public final List k;

    static {
        bwf bwfVar = bwf.b;
        l = new arf[]{null, null, null, null, null, btf.a(bwfVar, new c1(0)), btf.a(bwfVar, new c1(1)), null, null, null, btf.a(bwfVar, new c1(2))};
    }

    public /* synthetic */ i1(int i, String str, String str2, z0 z0Var, String str3, String str4, k1 k1Var, Map map, String str5, String str6, h1 h1Var, List list) {
        if (1814 != (i & 1814)) {
            u7g.V(i, 1814, d1.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = z0Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = k1.b;
        } else {
            this.f = k1Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = map;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        this.i = str6;
        this.j = h1Var;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.a, i1Var.a) && Intrinsics.d(this.b, i1Var.b) && Intrinsics.d(this.c, i1Var.c) && Intrinsics.d(this.d, i1Var.d) && Intrinsics.d(this.e, i1Var.e) && this.f == i1Var.f && Intrinsics.d(this.g, i1Var.g) && Intrinsics.d(this.h, i1Var.h) && Intrinsics.d(this.i, i1Var.i) && Intrinsics.d(this.j, i1Var.j) && Intrinsics.d(this.k, i1Var.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (this.f.hashCode() + k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e)) * 31;
        Map map = this.g;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.h;
        return this.k.hashCode() + k5r.c(k5r.c((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i), 31, this.j.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tariff(additionText=");
        sb.append(this.a);
        sb.append(", commonPeriod=");
        sb.append(this.b);
        sb.append(", commonPrice=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", offerVendorType=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", text=");
        sb.append(this.h);
        sb.append(", title=");
        sb.append(this.i);
        sb.append(", tariffName=");
        sb.append(this.j);
        sb.append(", plans=");
        return eta.h(sb, this.k, ')');
    }
}
