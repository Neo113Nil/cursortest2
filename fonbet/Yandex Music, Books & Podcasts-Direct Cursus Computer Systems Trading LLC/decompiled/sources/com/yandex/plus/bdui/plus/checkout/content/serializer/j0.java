package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final arf[] n;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final Map i;
    public final List j;
    public final String k;
    public final z0 l;
    public final List m;

    static {
        bwf bwfVar = bwf.b;
        n = new arf[]{null, null, null, null, null, null, null, null, btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(25)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(26)), null, null, btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(27))};
    }

    public j0(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Map map, List list, String str7, z0 z0Var, List list2) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, h0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = map;
        this.j = list;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = z0Var;
        }
        this.m = (i & 4096) == 0 ? c5b.a : list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.a, j0Var.a) && Intrinsics.d(this.b, j0Var.b) && Intrinsics.d(this.c, j0Var.c) && this.d == j0Var.d && this.e == j0Var.e && Intrinsics.d(this.f, j0Var.f) && Intrinsics.d(this.g, j0Var.g) && Intrinsics.d(this.h, j0Var.h) && Intrinsics.d(this.i, j0Var.i) && Intrinsics.d(this.j, j0Var.j) && Intrinsics.d(this.k, j0Var.k) && Intrinsics.d(this.l, j0Var.l) && Intrinsics.d(this.m, j0Var.m);
    }

    public final int hashCode() {
        int d = k5r.d(f1d.b(this.i, k5r.c(k5r.c(k5r.c(k5r.e(k5r.e(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j);
        String str = this.k;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        z0 z0Var = this.l;
        return this.m.hashCode() + ((hashCode + (z0Var != null ? z0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalOfferDto(offerName=");
        sb.append(this.a);
        sb.append(", positionId=");
        sb.append(this.b);
        sb.append(", offersBatchId=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", isAvailable=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", offerText=");
        sb.append(this.g);
        sb.append(", additionalOfferText=");
        sb.append(this.h);
        sb.append(", iconImages=");
        sb.append(this.i);
        sb.append(", benefits=");
        sb.append(this.j);
        sb.append(", disclaimer=");
        sb.append(this.k);
        sb.append(", offerSwitchToggle=");
        sb.append(this.l);
        sb.append(", offersReplace=");
        return eta.h(sb, this.m, ')');
    }
}
