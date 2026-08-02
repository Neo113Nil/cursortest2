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
public final class c4 implements p4 {

    @NotNull
    public static final b4 Companion = new b4();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(22))};
    public final String a;
    public final i2 b;

    public /* synthetic */ c4(int i, String str, i2 i2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Intrinsics.d(this.a, c4Var.a) && Intrinsics.d(this.b, c4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LesserOrEqual(argName=" + this.a + ", value=" + this.b + ')';
    }

    public c4(String str, i2 i2Var) {
        this.a = str;
        this.b = i2Var;
    }
}
