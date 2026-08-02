package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();
    public static final arf[] f;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new h0(9)), btf.a(bwfVar, new h0(10)), btf.a(bwfVar, new h0(11)), btf.a(bwfVar, new h0(12)), btf.a(bwfVar, new h0(13))};
    }

    public /* synthetic */ w1(int i, List list, List list2, List list3, List list4, List list5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, u1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.d(this.a, w1Var.a) && Intrinsics.d(this.b, w1Var.b) && Intrinsics.d(this.c, w1Var.c) && Intrinsics.d(this.d, w1Var.d) && Intrinsics.d(this.e, w1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(k5r.d(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueDefinitionsDto(widgets=");
        sb.append(this.a);
        sb.append(", conditionalPlaques=");
        sb.append(this.b);
        sb.append(", prefetchPlaques=");
        sb.append(this.c);
        sb.append(", defaultPlaques=");
        sb.append(this.d);
        sb.append(", fallbackPlaques=");
        return eta.h(sb, this.e, ')');
    }

    public w1(List list, List list2, List list3, List list4, List list5) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }
}
