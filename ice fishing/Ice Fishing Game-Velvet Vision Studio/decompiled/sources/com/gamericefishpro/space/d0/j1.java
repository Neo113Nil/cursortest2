package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements k1 {
    public final String a;
    public final com.gamericefishpro.space.t0.f1 b;

    public j1(m0 m0Var, String str) {
        this.a = str;
        this.b = com.gamericefishpro.space.t0.i.v(m0Var);
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int a(com.gamericefishpro.space.c3.c cVar) {
        return e().b;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int b(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        return e().c;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int c(com.gamericefishpro.space.c3.c cVar) {
        return e().d;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int d(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        return e().a;
    }

    public final m0 e() {
        return (m0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            return Intrinsics.a(e(), ((j1) obj).e());
        }
        return false;
    }

    public final void f(m0 m0Var) {
        this.b.setValue(m0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return com.gamericefishpro.space.m5.a.i(sb, e().d, ')');
    }
}
