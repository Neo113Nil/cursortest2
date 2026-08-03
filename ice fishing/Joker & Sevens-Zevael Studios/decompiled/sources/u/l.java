package u;

import m0.d1;
import v.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements v1.q {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f6614a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f6615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f6616c;

    public l(m mVar, y0 y0Var, d1 d1Var) {
        this.f6616c = mVar;
        this.f6614a = y0Var;
        this.f6615b = d1Var;
    }

    @Override // v1.q
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        v1.j0 e10 = d0Var.e(j3);
        m mVar = this.f6616c;
        long e11 = o0Var.t() ? i7.b.e(e10.f7085g, e10.f7086h) : ((s2.k) this.f6614a.a(new b0.l0(7, mVar, this), new a0.a0(23, mVar)).getValue()).f6395a;
        return o0Var.H((int) (e11 >> 32), (int) (4294967295L & e11), bc.w.f1068g, new k(mVar, e10, e11));
    }
}
