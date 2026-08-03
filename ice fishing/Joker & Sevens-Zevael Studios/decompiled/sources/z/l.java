package z;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements v1.e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f8977b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f8978c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8979a;

    public /* synthetic */ l(int i10) {
        this.f8979a = i10;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        switch (this.f8979a) {
            case 0:
                return o0Var.H(s2.a.j(j3), s2.a.i(j3), bc.w.f1068g, k.f8968h);
            default:
                return o0Var.H(s2.a.f(j3) ? s2.a.h(j3) : 0, s2.a.e(j3) ? s2.a.g(j3) : 0, bc.w.f1068g, k.f8970j);
        }
    }
}
