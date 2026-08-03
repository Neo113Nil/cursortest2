package y0;

import r1.q;
import w.z;
import x1.f1;
import x1.i1;
import y1.r;
import yc.a0;
import yc.b1;
import yc.e1;
import yc.v;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m implements x1.l {

    /* renamed from: h, reason: collision with root package name */
    public dd.e f8444h;

    /* renamed from: i, reason: collision with root package name */
    public int f8445i;

    /* renamed from: k, reason: collision with root package name */
    public m f8447k;

    /* renamed from: l, reason: collision with root package name */
    public m f8448l;

    /* renamed from: m, reason: collision with root package name */
    public i1 f8449m;

    /* renamed from: n, reason: collision with root package name */
    public f1 f8450n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8451o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8452p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8453q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8454r;

    /* renamed from: s, reason: collision with root package name */
    public c1.b f8455s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8456t;

    /* renamed from: g, reason: collision with root package name */
    public m f8443g = this;

    /* renamed from: j, reason: collision with root package name */
    public int f8446j = -1;

    public final y f0() {
        dd.e eVar = this.f8444h;
        if (eVar != null) {
            return eVar;
        }
        dd.e a6 = a0.a(((r) x1.f.w(this)).getCoroutineContext().d(new e1((b1) ((r) x1.f.w(this)).getCoroutineContext().v(v.f8910h))));
        this.f8444h = a6;
        return a6;
    }

    public boolean g0() {
        return !(this instanceof z);
    }

    public void h0() {
        if (this.f8456t) {
            u1.a.b("node attached multiple times");
        }
        if (this.f8450n == null) {
            u1.a.b("attach invoked on a node without a coordinator");
        }
        this.f8456t = true;
        this.f8453q = true;
    }

    public void i0() {
        if (!this.f8456t) {
            u1.a.b("Cannot detach a node that is not attached");
        }
        if (this.f8453q) {
            u1.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f8454r) {
            u1.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f8456t = false;
        dd.e eVar = this.f8444h;
        if (eVar != null) {
            a0.d(eVar, new q("The Modifier.Node was detached", 1));
            this.f8444h = null;
        }
    }

    public void m0() {
        if (!this.f8456t) {
            u1.a.b("reset() called on an unattached node");
        }
        l0();
    }

    public void n0() {
        if (!this.f8456t) {
            u1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f8453q) {
            u1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f8453q = false;
        j0();
        this.f8454r = true;
    }

    public void o0() {
        if (!this.f8456t) {
            u1.a.b("node detached multiple times");
        }
        if (this.f8450n == null) {
            u1.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f8454r) {
            u1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f8454r = false;
        c1.b bVar = this.f8455s;
        if (bVar != null) {
            bVar.invoke();
        }
        k0();
    }

    public void p0(m mVar) {
        this.f8443g = mVar;
    }

    public void q0(f1 f1Var) {
        this.f8450n = f1Var;
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
    }
}
