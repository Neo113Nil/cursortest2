package com.gamericefishpro.space.d4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public final o1 a;
    public com.gamericefishpro.space.u3.b[] b;

    public d1() {
        this(new o1((o1) null));
    }

    public final void a() {
        com.gamericefishpro.space.u3.b[] bVarArr = this.b;
        if (bVarArr != null) {
            com.gamericefishpro.space.u3.b bVarG = bVarArr[0];
            com.gamericefishpro.space.u3.b bVarG2 = bVarArr[1];
            o1 o1Var = this.a;
            if (bVarG2 == null) {
                bVarG2 = o1Var.a.g(2);
            }
            if (bVarG == null) {
                bVarG = o1Var.a.g(1);
            }
            g(com.gamericefishpro.space.u3.b.a(bVarG, bVarG2));
            com.gamericefishpro.space.u3.b bVar = this.b[com.gamericefishpro.space.a.a.s(16)];
            if (bVar != null) {
                f(bVar);
            }
            com.gamericefishpro.space.u3.b bVar2 = this.b[com.gamericefishpro.space.a.a.s(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            com.gamericefishpro.space.u3.b bVar3 = this.b[com.gamericefishpro.space.a.a.s(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract o1 b();

    public void c(int i, com.gamericefishpro.space.u3.b bVar) {
        if (this.b == null) {
            this.b = new com.gamericefishpro.space.u3.b[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[com.gamericefishpro.space.a.a.s(i2)] = bVar;
            }
        }
    }

    public abstract void e(com.gamericefishpro.space.u3.b bVar);

    public abstract void g(com.gamericefishpro.space.u3.b bVar);

    public d1(o1 o1Var) {
        this.a = o1Var;
    }

    public void d(com.gamericefishpro.space.u3.b bVar) {
    }

    public void f(com.gamericefishpro.space.u3.b bVar) {
    }

    public void h(com.gamericefishpro.space.u3.b bVar) {
    }
}
