package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r1 implements t1 {

    @NotNull
    public static final q1 Companion = new q1();
    public static final arf[] c = {btf.a(bwf.b, new h0(8)), null};
    public final s1 a;
    public final String b;

    public /* synthetic */ r1(int i, s1 s1Var, String str) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, p1.a.getDescriptor());
            throw null;
        }
        this.a = s1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.a == r1Var.a && Intrinsics.d(this.b, r1Var.b);
    }

    public final int hashCode() {
        s1 s1Var = this.a;
        return this.b.hashCode() + ((s1Var == null ? 0 : s1Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(position=");
        sb.append(this.a);
        sb.append(", url=");
        return dfi.i(sb, this.b, ')');
    }

    public r1(s1 s1Var, String str) {
        this.a = s1Var;
        this.b = str;
    }
}
