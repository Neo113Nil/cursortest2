package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r f9024a = new r(i.f8960b, y0.c.f8430r);

    public static final r a(g gVar, y0.d dVar, m0.r rVar, int i10) {
        if (pc.j.a(gVar, i.f8960b) && dVar.equals(y0.c.f8430r)) {
            rVar.X(345884104);
            rVar.q(false);
            return f9024a;
        }
        rVar.X(345937951);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && rVar.f(gVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !rVar.f(dVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object M = rVar.M();
        if (z12 || M == m0.l.f4646a) {
            M = new r(gVar, dVar);
            rVar.i0(M);
        }
        r rVar2 = (r) M;
        rVar.q(false);
        return rVar2;
    }
}
