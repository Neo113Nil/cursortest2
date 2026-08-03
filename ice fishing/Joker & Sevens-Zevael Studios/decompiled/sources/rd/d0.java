package rd;

import androidx.lifecycle.m0;
import androidx.lifecycle.t0;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final id.i f6129b;

    /* renamed from: c, reason: collision with root package name */
    public final pd.a f6130c;

    /* renamed from: d, reason: collision with root package name */
    public final bd.e0 f6131d;

    /* renamed from: e, reason: collision with root package name */
    public final bd.q f6132e;

    /* renamed from: f, reason: collision with root package name */
    public r1 f6133f;

    public d0(id.i iVar) {
        pc.j.e(iVar, "repository");
        this.f6129b = iVar;
        this.f6130c = new pd.a();
        qd.j jVar = new qd.j(0, 0);
        qd.h hVar = new qd.h();
        bc.v vVar = bc.v.f1067g;
        bd.e0 a6 = bd.u.a(new y(jVar, hVar, vVar, vVar, false, false, false, false, null, null));
        this.f6131d = a6;
        this.f6132e = new bd.q(a6);
        fc.d dVar = null;
        yc.a0.q(m0.h(this), null, new z(this, dVar, 0), 3);
        yc.a0.q(m0.h(this), null, new z(this, dVar, 1), 3);
        yc.a0.q(m0.h(this), null, new z(this, dVar, 2), 3);
        yc.a0.q(m0.h(this), null, new z(this, dVar, 3), 3);
    }

    @Override // androidx.lifecycle.t0
    public final void d() {
        r1 r1Var = this.f6133f;
        if (r1Var != null) {
            r1Var.a(null);
        }
    }
}
