package b0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0.d f866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0.d dVar, int i10) {
        super(2);
        this.f865g = 0;
        this.f866h = dVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f865g) {
            case 0:
                ((Number) obj2).intValue();
                int y10 = m0.z.y(7);
                a.a.c(this.f866h, (m0.r) obj, y10);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m0.r rVar = (m0.r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    this.f866h.invoke(rVar, 0);
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                m0.r rVar2 = (m0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar2.B()) {
                    rVar2.S();
                } else {
                    z.r a6 = z.q.a(z.i.f8960b, y0.c.f8430r, rVar2, 0);
                    int o7 = m0.z.o(rVar2);
                    r1 l10 = rVar2.l();
                    y0.n o10 = uc.e.o(rVar2, y0.k.f8442a);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar);
                    } else {
                        rVar2.l0();
                    }
                    m0.z.w(a6, rVar2, x1.i.f8079e);
                    m0.z.w(l10, rVar2, x1.i.f8078d);
                    x1.h hVar = x1.i.f8080f;
                    if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar2, o7, hVar);
                    }
                    m0.z.w(o10, rVar2, x1.i.f8077c);
                    this.f866h.b(z.s.f9029a, rVar2, 6);
                    rVar2.q(true);
                }
                break;
            case 3:
                m0.r rVar3 = (m0.r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar3.B()) {
                    rVar3.S();
                } else {
                    this.f866h.invoke(rVar3, 6);
                }
                break;
            default:
                m0.r rVar4 = (m0.r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar4.B()) {
                    rVar4.S();
                } else {
                    this.f866h.invoke(rVar4, 0);
                }
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(u0.d dVar, int i10, byte b2) {
        super(2);
        this.f865g = i10;
        this.f866h = dVar;
    }
}
