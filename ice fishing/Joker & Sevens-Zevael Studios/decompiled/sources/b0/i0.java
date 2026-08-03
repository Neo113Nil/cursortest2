package b0;

import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 extends y0.m implements u1 {
    public g0 A;

    /* renamed from: u, reason: collision with root package name */
    public oc.a f833u;

    /* renamed from: v, reason: collision with root package name */
    public a0.d f834v;

    /* renamed from: w, reason: collision with root package name */
    public x.e0 f835w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f836x;

    /* renamed from: y, reason: collision with root package name */
    public e2.h f837y;

    /* renamed from: z, reason: collision with root package name */
    public final g0 f838z = new g0(this, 0);

    public i0(oc.a aVar, a0.d dVar, x.e0 e0Var, boolean z10) {
        this.f833u = aVar;
        this.f834v = dVar;
        this.f835w = e0Var;
        this.f836x = z10;
        r0();
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
        vc.c[] cVarArr = e2.u.f2053a;
        e2.v vVar = e2.s.f2037m;
        vc.c[] cVarArr2 = e2.u.f2053a;
        vc.c cVar = cVarArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        jVar.d(e2.s.I, this.f838z);
        if (this.f835w == x.e0.f7769g) {
            e2.h hVar = this.f837y;
            if (hVar == null) {
                pc.j.k("scrollAxisRange");
                throw null;
            }
            e2.v vVar2 = e2.s.f2045u;
            vc.c cVar2 = cVarArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            e2.h hVar2 = this.f837y;
            if (hVar2 == null) {
                pc.j.k("scrollAxisRange");
                throw null;
            }
            e2.v vVar3 = e2.s.f2044t;
            vc.c cVar3 = cVarArr2[11];
            vVar3.a(jVar, hVar2);
        }
        g0 g0Var = this.A;
        if (g0Var != null) {
            jVar.d(e2.i.f1964f, new e2.a(null, g0Var));
        }
        jVar.d(e2.i.A, new e2.a(null, new a0.a0(10, new f0(this, 0))));
        this.f834v.getClass();
        e2.b bVar = new e2.b(-1, 1);
        e2.v vVar4 = e2.s.f2030f;
        vc.c cVar4 = cVarArr2[22];
        vVar4.a(jVar, bVar);
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    public final void r0() {
        this.f837y = new e2.h(new f0(this, 1), new f0(this, 2));
        this.A = this.f836x ? new g0(this, 1) : null;
    }
}
