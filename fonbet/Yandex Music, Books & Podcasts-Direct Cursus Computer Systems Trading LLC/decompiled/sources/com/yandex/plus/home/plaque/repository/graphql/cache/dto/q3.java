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
public final class q3 implements p4 {

    @NotNull
    public static final p3 Companion = new p3();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(19))};
    public final String a;
    public final i2 b;

    public /* synthetic */ q3(int i, String str, i2 i2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.d(this.a, q3Var.a) && Intrinsics.d(this.b, q3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GreaterOrEqual(argName=" + this.a + ", value=" + this.b + ')';
    }

    public q3(String str, i2 i2Var) {
        this.a = str;
        this.b = i2Var;
    }
}
