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
public final class t3 implements p4 {

    @NotNull
    public static final s3 Companion = new s3();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(20))};
    public final String a;
    public final y2 b;

    public /* synthetic */ t3(int i, String str, y2 y2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = y2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return Intrinsics.d(this.a, t3Var.a) && Intrinsics.d(this.b, t3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InSet(argName=" + this.a + ", value=" + this.b + ')';
    }

    public t3(String str, y2 y2Var) {
        this.a = str;
        this.b = y2Var;
    }
}
