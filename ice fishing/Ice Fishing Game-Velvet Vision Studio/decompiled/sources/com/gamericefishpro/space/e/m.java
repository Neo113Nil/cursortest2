package com.gamericefishpro.space.e;

import com.gamericefishpro.space.d.s;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.pi.x;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.f.b {
    public final x c;
    public Function2 d;
    public com.gamericefishpro.space.ri.e e;
    public s1 f;
    public boolean g;

    public m(x xVar, r rVar) {
        super(rVar);
        this.c = xVar;
        this.d = new k(2, 0, null);
    }

    @Override // com.gamericefishpro.space.f.b
    public final void t() {
        com.gamericefishpro.space.ri.e eVar = this.e;
        if (eVar != null) {
            eVar.j(new CancellationException("onBack cancelled"), true);
        }
        s1 s1Var = this.f;
        if (s1Var != null) {
            s1Var.c(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // com.gamericefishpro.space.f.b
    public final void u() {
        if (this.e != null && !this.g) {
            t();
        }
        if (this.e == null) {
            this.g = false;
            this.e = com.gamericefishpro.space.hj.c.a(-2, 4, com.gamericefishpro.space.ri.a.d);
            this.f = a0.u(this.c, null, new com.gamericefishpro.space.b0.o(this, (com.gamericefishpro.space.th.a) null, 5), 3);
        }
        com.gamericefishpro.space.ri.e eVar = this.e;
        if (eVar != null) {
            y3.q(eVar);
        }
        this.g = false;
    }

    @Override // com.gamericefishpro.space.f.b
    public final void v(com.gamericefishpro.space.d.a aVar) {
        com.gamericefishpro.space.ri.e eVar = this.e;
        if (eVar != null) {
            eVar.k(aVar);
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final void w() {
        t();
        if (super.r()) {
            this.g = true;
            this.e = com.gamericefishpro.space.hj.c.a(-2, 4, com.gamericefishpro.space.ri.a.d);
            this.f = a0.u(this.c, null, new com.gamericefishpro.space.b0.o(this, (com.gamericefishpro.space.th.a) null, 5), 3);
        }
    }

    public final void y(boolean z) {
        s1 s1Var;
        if (!z && super.r() && (s1Var = this.f) != null && !s1Var.b()) {
            t();
        }
        ((s) this.a).b(z);
        ((com.gamericefishpro.space.f.a) this.b).f(z);
    }
}
