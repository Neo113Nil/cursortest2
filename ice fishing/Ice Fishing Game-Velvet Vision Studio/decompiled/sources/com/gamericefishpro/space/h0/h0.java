package com.gamericefishpro.space.h0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final Object a;
    public final j0 b;
    public int d;
    public h0 e;
    public boolean f;
    public int c = -1;
    public final com.gamericefishpro.space.t0.f1 g = com.gamericefishpro.space.t0.i.v(null);

    public h0(Object obj, j0 j0Var) {
        this.a = obj;
        this.b = j0Var;
    }

    public final h0 a() {
        if (this.f) {
            com.gamericefishpro.space.c0.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.d.add(this);
            h0 h0Var = (h0) this.g.getValue();
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.e = h0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            com.gamericefishpro.space.c0.a.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.d.remove(this);
            h0 h0Var = this.e;
            if (h0Var != null) {
                h0Var.b();
            }
            this.e = null;
        }
    }
}
