package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h3 implements p4 {

    @NotNull
    public static final g3 Companion = new g3();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(16))};
    public final String a;
    public final q2 b;

    public /* synthetic */ h3(int i, String str, q2 q2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, f3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return Intrinsics.d(this.a, h3Var.a) && Intrinsics.d(this.b, h3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Contains(argName=" + this.a + ", value=" + this.b + ')';
    }

    public h3(String str, q2 q2Var) {
        this.a = str;
        this.b = q2Var;
    }
}
