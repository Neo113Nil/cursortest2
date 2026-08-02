package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o1 implements t1 {

    @NotNull
    public static final n1 Companion = new n1();
    public static final arf[] c = {btf.a(bwf.b, new h0(7)), null};
    public final s1 a;
    public final int b;

    public /* synthetic */ o1(int i, s1 s1Var, int i2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m1.a.getDescriptor());
            throw null;
        }
        this.a = s1Var;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a == o1Var.a && this.b == o1Var.b;
    }

    public final int hashCode() {
        s1 s1Var = this.a;
        return Integer.hashCode(this.b) + ((s1Var == null ? 0 : s1Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Count(position=");
        sb.append(this.a);
        sb.append(", count=");
        return vz1.r(sb, this.b, ')');
    }

    public o1(s1 s1Var, int i) {
        this.a = s1Var;
        this.b = i;
    }
}
