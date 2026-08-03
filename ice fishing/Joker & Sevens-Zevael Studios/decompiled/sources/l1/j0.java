package l1;

import b0.p0;
import m0.i1;
import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 extends k1.b {

    /* renamed from: e, reason: collision with root package name */
    public final l1 f4043e = m0.z.s(new e1.e(0));

    /* renamed from: f, reason: collision with root package name */
    public final l1 f4044f = m0.z.s(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final e0 f4045g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f4046h;

    /* renamed from: i, reason: collision with root package name */
    public float f4047i;

    /* renamed from: j, reason: collision with root package name */
    public f1.l f4048j;

    /* renamed from: k, reason: collision with root package name */
    public int f4049k;

    public j0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f3980f = new p0(9, this);
        this.f4045g = e0Var;
        this.f4046h = new i1(0);
        this.f4047i = 1.0f;
        this.f4049k = -1;
    }

    @Override // k1.b
    public final void a(float f10) {
        this.f4047i = f10;
    }

    @Override // k1.b
    public final void b(f1.l lVar) {
        this.f4048j = lVar;
    }

    @Override // k1.b
    public final long d() {
        return ((e1.e) this.f4043e.getValue()).f1943a;
    }

    @Override // k1.b
    public final void e(x1.i0 i0Var) {
        h1.b bVar = i0Var.f8081g;
        f1.l lVar = this.f4048j;
        e0 e0Var = this.f4045g;
        if (lVar == null) {
            lVar = (f1.l) e0Var.f3981g.getValue();
        }
        if (((Boolean) this.f4044f.getValue()).booleanValue() && i0Var.getLayoutDirection() == s2.l.f6397h) {
            long J = bVar.J();
            a5.c cVar = bVar.f2596h;
            long x10 = cVar.x();
            cVar.t().k();
            try {
                ((f8.c) cVar.f262h).t(-1.0f, 1.0f, J);
                e0Var.e(i0Var, this.f4047i, lVar);
            } finally {
                cVar.t().g();
                cVar.Q(x10);
            }
        } else {
            e0Var.e(i0Var, this.f4047i, lVar);
        }
        this.f4049k = this.f4046h.g();
    }
}
