package b1;

import a0.r;
import bc.a0;
import pc.j;
import pc.s;
import x1.f;
import x1.v;
import x1.z1;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends m implements z1, v {

    /* renamed from: u, reason: collision with root package name */
    public e f944u;

    /* renamed from: v, reason: collision with root package name */
    public e f945v;

    /* renamed from: w, reason: collision with root package name */
    public long f946w;

    @Override // y0.m
    public final void k0() {
        this.f945v = null;
        this.f944u = null;
    }

    @Override // x1.z1
    public final Object r() {
        return c.f941a;
    }

    public final boolean r0(f8.c cVar) {
        e eVar = this.f944u;
        if (eVar != null) {
            return eVar.r0(cVar);
        }
        e eVar2 = this.f945v;
        if (eVar2 != null) {
            return eVar2.r0(cVar);
        }
        return false;
    }

    @Override // x1.v
    public final void s(long j3) {
        this.f946w = j3;
    }

    public final void s0(f8.c cVar) {
        e eVar = this.f945v;
        if (eVar != null) {
            eVar.s0(cVar);
            return;
        }
        e eVar2 = this.f944u;
        if (eVar2 != null) {
            eVar2.s0(cVar);
        }
    }

    public final void t0(f8.c cVar) {
        e eVar = this.f945v;
        if (eVar != null) {
            eVar.t0(cVar);
        }
        e eVar2 = this.f944u;
        if (eVar2 != null) {
            eVar2.t0(cVar);
        }
        this.f944u = null;
    }

    public final void u0(f8.c cVar) {
        z1 z1Var;
        e eVar;
        e eVar2 = this.f944u;
        if (eVar2 == null || !i7.b.j(eVar2, a0.q(cVar))) {
            if (this.f8443g.f8456t) {
                s sVar = new s();
                f.y(this, new r(sVar, this, cVar, 1));
                z1Var = (z1) sVar.f5683g;
            } else {
                z1Var = null;
            }
            eVar = (e) z1Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.s0(cVar);
            eVar.u0(cVar);
            e eVar3 = this.f945v;
            if (eVar3 != null) {
                eVar3.t0(cVar);
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.f945v;
            if (eVar4 != null) {
                eVar4.s0(cVar);
                eVar4.u0(cVar);
            }
            eVar2.t0(cVar);
        } else if (!j.a(eVar, eVar2)) {
            if (eVar != null) {
                eVar.s0(cVar);
                eVar.u0(cVar);
            }
            if (eVar2 != null) {
                eVar2.t0(cVar);
            }
        } else if (eVar != null) {
            eVar.u0(cVar);
        } else {
            e eVar5 = this.f945v;
            if (eVar5 != null) {
                eVar5.u0(cVar);
            }
        }
        this.f944u = eVar;
    }

    public final void v0(f8.c cVar) {
        e eVar = this.f945v;
        if (eVar != null) {
            eVar.v0(cVar);
            return;
        }
        e eVar2 = this.f944u;
        if (eVar2 != null) {
            eVar2.v0(cVar);
        }
    }
}
