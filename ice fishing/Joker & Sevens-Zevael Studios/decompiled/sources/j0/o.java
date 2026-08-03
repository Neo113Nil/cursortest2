package j0;

import v.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f3417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(0);
        this.f3416g = i10;
        this.f3417h = pVar;
    }

    @Override // oc.a
    public final Object invoke() {
        int i10 = this.f3416g;
        p pVar = this.f3417h;
        switch (i10) {
            case 0:
                return g0.f3335a;
            default:
                if (((f0) x1.f.i(pVar, h0.f3342b)) == null) {
                    i0.p pVar2 = pVar.A;
                    if (pVar2 != null) {
                        pVar.s0(pVar2);
                    }
                } else if (pVar.A == null) {
                    f8.c cVar = new f8.c(19, pVar);
                    o oVar = new o(pVar, 0);
                    y.i iVar = pVar.f3427w;
                    boolean z10 = pVar.f3428x;
                    float f10 = pVar.f3429y;
                    h1 h1Var = i0.o.f2986a;
                    i0.p cVar2 = i0.t.f2997a ? new i0.c(iVar, z10, f10, cVar, oVar) : new i0.b(iVar, z10, f10, cVar, oVar);
                    pVar.r0(cVar2);
                    pVar.A = cVar2;
                }
                return ac.o.f277a;
        }
    }
}
