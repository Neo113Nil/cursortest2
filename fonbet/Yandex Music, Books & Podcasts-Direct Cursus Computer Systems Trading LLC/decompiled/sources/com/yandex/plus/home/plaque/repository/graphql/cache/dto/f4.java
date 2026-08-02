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
public final class f4 implements p4 {

    @NotNull
    public static final e4 Companion = new e4();
    public static final arf[] b = {btf.a(bwf.b, new h0(23))};
    public final p4 a;

    public /* synthetic */ f4(int i, p4 p4Var) {
        if (1 == (i & 1)) {
            this.a = p4Var;
        } else {
            u7g.V(i, 1, d4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4) && Intrinsics.d(this.a, ((f4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Not(predicate=" + this.a + ')';
    }

    public f4(p4 p4Var) {
        this.a = p4Var;
    }
}
