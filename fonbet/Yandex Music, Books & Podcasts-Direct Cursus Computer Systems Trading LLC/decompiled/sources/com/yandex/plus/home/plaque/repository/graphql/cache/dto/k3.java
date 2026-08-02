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
public final class k3 implements p4 {

    @NotNull
    public static final j3 Companion = new j3();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(17))};
    public final String a;
    public final i2 b;

    public /* synthetic */ k3(int i, String str, i2 i2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, i3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.d(this.a, k3Var.a) && Intrinsics.d(this.b, k3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Equal(argName=" + this.a + ", value=" + this.b + ')';
    }

    public k3(String str, i2 i2Var) {
        this.a = str;
        this.b = i2Var;
    }
}
