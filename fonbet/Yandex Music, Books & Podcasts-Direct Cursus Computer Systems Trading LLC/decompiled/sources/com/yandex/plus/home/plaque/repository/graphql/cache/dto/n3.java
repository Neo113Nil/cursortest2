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
public final class n3 implements p4 {

    @NotNull
    public static final m3 Companion = new m3();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(18))};
    public final String a;
    public final i2 b;

    public /* synthetic */ n3(int i, String str, i2 i2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, l3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Intrinsics.d(this.a, n3Var.a) && Intrinsics.d(this.b, n3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Greater(argName=" + this.a + ", value=" + this.b + ')';
    }

    public n3(String str, i2 i2Var) {
        this.a = str;
        this.b = i2Var;
    }
}
