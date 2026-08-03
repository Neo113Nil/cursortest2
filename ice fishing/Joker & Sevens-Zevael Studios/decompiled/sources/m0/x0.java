package m0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 implements e2, yc.w {

    /* renamed from: g, reason: collision with root package name */
    public final fc.i f4802g;

    /* renamed from: h, reason: collision with root package name */
    public final oc.e f4803h;

    /* renamed from: i, reason: collision with root package name */
    public final dd.e f4804i;

    /* renamed from: j, reason: collision with root package name */
    public yc.r1 f4805j;

    public x0(fc.i iVar, oc.e eVar) {
        this.f4802g = iVar;
        this.f4803h = eVar;
        this.f4804i = yc.a0.a(iVar.d(iVar.v(x0.b.f7962h) != null ? this : fc.j.f2348g));
    }

    @Override // m0.e2
    public final void c() {
        yc.r1 r1Var = this.f4805j;
        if (r1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r1Var.a(cancellationException);
        }
        this.f4805j = yc.a0.q(this.f4804i, null, this.f4803h, 3);
    }

    @Override // fc.i
    public final fc.i d(fc.i iVar) {
        return v6.a.K(this, iVar);
    }

    @Override // m0.e2
    public final void e() {
        yc.r1 r1Var = this.f4805j;
        if (r1Var != null) {
            r1Var.B(new n0(1));
        }
        this.f4805j = null;
    }

    @Override // fc.i
    public final fc.i g(fc.h hVar) {
        return v6.a.J(this, hVar);
    }

    @Override // fc.g
    public final fc.h getKey() {
        return yc.v.f8909g;
    }

    @Override // m0.e2
    public final void h() {
        yc.r1 r1Var = this.f4805j;
        if (r1Var != null) {
            r1Var.B(new n0(1));
        }
        this.f4805j = null;
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // yc.w
    public final void q(fc.i iVar, Throwable th) {
        x0.b bVar = (x0.b) iVar.v(x0.b.f7962h);
        if (bVar != null) {
            u5.d.l(th, new y1(5, bVar, this));
        }
        yc.w wVar = (yc.w) this.f4802g.v(yc.v.f8909g);
        if (wVar == null) {
            throw th;
        }
        wVar.q(iVar, th);
    }

    @Override // fc.i
    public final fc.g v(fc.h hVar) {
        return v6.a.D(this, hVar);
    }
}
