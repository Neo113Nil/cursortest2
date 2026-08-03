package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f3293g = new b0(3);

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        v1.g0 g0Var = (v1.g0) obj;
        long j3 = ((s2.a) obj3).f6381a;
        int D = g0Var.D(e0.f3318a);
        int i10 = D * 2;
        v1.j0 e10 = ((v1.d0) obj2).e(s2.b.h(0, i10, j3));
        int i11 = e10.f7086h - i10;
        return g0Var.H(e10.f7085g, i11, bc.w.f1068g, new g5.c(D, 2, e10));
    }
}
