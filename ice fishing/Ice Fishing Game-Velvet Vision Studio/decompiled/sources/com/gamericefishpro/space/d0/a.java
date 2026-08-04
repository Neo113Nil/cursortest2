package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k1 {
    public final int a;
    public final String b;
    public final com.gamericefishpro.space.t0.f1 c = com.gamericefishpro.space.t0.i.v(com.gamericefishpro.space.u3.b.e);
    public final com.gamericefishpro.space.t0.f1 d = com.gamericefishpro.space.t0.i.v(Boolean.TRUE);

    public a(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final com.gamericefishpro.space.u3.b e() {
        return (com.gamericefishpro.space.u3.b) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(com.gamericefishpro.space.d4.o1 o1Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(o1Var.a.g(i2));
            f(o1Var.a.q(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return com.gamericefishpro.space.m5.a.i(sb, e().d, ')');
    }
}
