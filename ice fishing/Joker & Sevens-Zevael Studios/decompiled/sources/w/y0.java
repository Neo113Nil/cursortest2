package w;

import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y0 extends y0.m implements u1 {

    /* renamed from: u, reason: collision with root package name */
    public b1 f7534u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7535v;

    @Override // x1.u1
    public final void I(e2.j jVar) {
        vc.c[] cVarArr = e2.u.f2053a;
        e2.v vVar = e2.s.f2037m;
        vc.c[] cVarArr2 = e2.u.f2053a;
        vc.c cVar = cVarArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        e2.h hVar = new e2.h(new x0(this, 0), new x0(this, 1));
        if (this.f7535v) {
            e2.v vVar2 = e2.s.f2045u;
            vc.c cVar2 = cVarArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            e2.v vVar3 = e2.s.f2044t;
            vc.c cVar3 = cVarArr2[11];
            vVar3.a(jVar, hVar);
        }
    }
}
