package z;

import java.util.WeakHashMap;
import m0.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, int i11) {
        super(i10);
        this.f9030g = i11;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f9030g;
        z0 z0Var = m0.l.f4646a;
        switch (i10) {
            case 0:
                m0.r rVar = (m0.r) obj2;
                ((Number) obj3).intValue();
                rVar.X(359872873);
                WeakHashMap weakHashMap = p0.f9003u;
                p0 e10 = b.e(rVar);
                boolean f10 = rVar.f(e10);
                Object M = rVar.M();
                if (f10 || M == z0Var) {
                    M = new x(e10.f9006c);
                    rVar.i0(M);
                }
                x xVar = (x) M;
                rVar.q(false);
                return xVar;
            default:
                m0.r rVar2 = (m0.r) obj2;
                ((Number) obj3).intValue();
                rVar2.X(359872873);
                WeakHashMap weakHashMap2 = p0.f9003u;
                p0 e11 = b.e(rVar2);
                boolean f11 = rVar2.f(e11);
                Object M2 = rVar2.M();
                if (f11 || M2 == z0Var) {
                    M2 = new x(e11.f9010g);
                    rVar2.i0(M2);
                }
                x xVar2 = (x) M2;
                rVar2.q(false);
                return xVar2;
        }
    }
}
