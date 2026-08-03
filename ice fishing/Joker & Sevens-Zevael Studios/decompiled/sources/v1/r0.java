package v1;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f7120h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i10) {
        super(2);
        this.f7119g = i10;
        this.f7120h = s0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7119g) {
            case 0:
                this.f7120h.a().f7053h = (m0.v) obj2;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                x1.g0 g0Var = (x1.g0) obj;
                x xVar = new x(this.f7120h.a(), (oc.e) obj2);
                if (!pc.j.a(g0Var.A, xVar)) {
                    g0Var.A = xVar;
                    g0Var.C();
                }
                break;
            default:
                x1.g0 g0Var2 = (x1.g0) obj;
                s0 s0Var = this.f7120h;
                x4.l lVar = s0Var.f7123a;
                a0 a0Var = g0Var2.K;
                if (a0Var == null) {
                    a0Var = new a0(g0Var2, lVar);
                    g0Var2.K = a0Var;
                }
                s0Var.f7124b = a0Var;
                s0Var.a().d();
                a0 a6 = s0Var.a();
                if (a6.f7054i != lVar) {
                    a6.f7054i = lVar;
                    a6.e(false);
                    x1.g0.T(a6.f7052g, false, 7);
                }
                break;
        }
        return ac.o.f277a;
    }
}
