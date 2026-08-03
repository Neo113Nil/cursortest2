package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f8953a = new i0(i.f8959a, y0.c.f8428p);

    public static final i0 a(d dVar, y0.e eVar, m0.r rVar, int i10) {
        if (pc.j.a(dVar, i.f8959a) && eVar.equals(y0.c.f8428p)) {
            rVar.X(-849160037);
            rVar.q(false);
            return f8953a;
        }
        rVar.X(-849109166);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && rVar.f(dVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !rVar.f(eVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object M = rVar.M();
        if (z12 || M == m0.l.f4646a) {
            M = new i0(dVar, eVar);
            rVar.i0(M);
        }
        i0 i0Var = (i0) M;
        rVar.q(false);
        return i0Var;
    }
}
