package com.gamericefishpro.space.h1;

import com.gamericefishpro.space.b2.q;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.k1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.pi.u;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.y.r;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements com.gamericefishpro.space.h2.i {
    public f1 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public com.gamericefishpro.space.b2.b F;
    public boolean G;
    public com.gamericefishpro.space.ui.c e;
    public int i;
    public l w;
    public l y;
    public k1 z;
    public l d = this;
    public int v = -1;

    public final x o0() {
        com.gamericefishpro.space.ui.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        com.gamericefishpro.space.ui.c cVarB = a0.b(((t) com.gamericefishpro.space.h2.k.t(this)).getCoroutineContext().o(new com.gamericefishpro.space.pi.f1((d1) ((t) com.gamericefishpro.space.h2.k.t(this)).getCoroutineContext().j(u.e))));
        this.e = cVarB;
        return cVarB;
    }

    public boolean p0() {
        return !(this instanceof r);
    }

    public void q0() {
        if (this.G) {
            com.gamericefishpro.space.e2.a.b("node attached multiple times");
        }
        if (this.A == null) {
            com.gamericefishpro.space.e2.a.b("attach invoked on a node without a coordinator");
        }
        this.G = true;
        this.D = true;
    }

    public void r0() {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("Cannot detach a node that is not attached");
        }
        if (this.D) {
            com.gamericefishpro.space.e2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.E) {
            com.gamericefishpro.space.e2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.G = false;
        com.gamericefishpro.space.ui.c cVar = this.e;
        if (cVar != null) {
            a0.f(cVar, new q("The Modifier.Node was detached", 2));
            this.e = null;
        }
    }

    public void v0() {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("reset() called on an unattached node");
        }
        u0();
    }

    public void w0() {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.D) {
            com.gamericefishpro.space.e2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.D = false;
        s0();
        this.E = true;
    }

    public void x0() {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("node detached multiple times");
        }
        if (this.A == null) {
            com.gamericefishpro.space.e2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.E) {
            com.gamericefishpro.space.e2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.E = false;
        com.gamericefishpro.space.b2.b bVar = this.F;
        if (bVar != null) {
            bVar.invoke();
        }
        t0();
    }

    public void y0(l lVar) {
        this.d = lVar;
    }

    public void z0(f1 f1Var) {
        this.A = f1Var;
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0() {
    }
}
