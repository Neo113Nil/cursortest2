package n0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.f2;
import m0.m2;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f5027d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f5028e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f5029f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f5030g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5031c;

    static {
        int i10 = 1;
        f5027d = new r(i10, 2, 0);
        int i11 = 1;
        f5028e = new r(i11, i11, 1);
        f5029f = new r(i10, 2, 2);
        int i12 = 1;
        f5030g = new r(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11, int i12) {
        super(i10, i11);
        this.f5031c = i12;
    }

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        switch (this.f5031c) {
            case 0:
                Object invoke = ((oc.a) k0Var.b(0)).invoke();
                m0.a aVar = (m0.a) k0Var.b(1);
                int a6 = k0Var.a(0);
                aVar.getClass();
                m2Var.T(m2Var.c(aVar), invoke);
                cVar.g(a6, invoke);
                cVar.d(invoke);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m0.a aVar2 = (m0.a) k0Var.b(0);
                int a8 = k0Var.a(0);
                cVar.o();
                aVar2.getClass();
                cVar.c(a8, m2Var.C(m2Var.c(aVar2)));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Object b2 = k0Var.b(0);
                m0.a aVar3 = (m0.a) k0Var.b(1);
                int a10 = k0Var.a(0);
                if (b2 instanceof f2) {
                    f2 f2Var = (f2) b2;
                    ((o0.e) qVar.f8346e).b(f2Var);
                    ((s.h0) qVar.f8345d).a(f2Var);
                }
                Object J = m2Var.J(m2Var.c(aVar3), a10, b2);
                if (!(J instanceof f2)) {
                    if (J instanceof x1) {
                        ((x1) J).d();
                        break;
                    }
                } else {
                    qVar.d((f2) J);
                    break;
                }
                break;
            default:
                Object b10 = k0Var.b(0);
                int a11 = k0Var.a(0);
                if (b10 instanceof f2) {
                    f2 f2Var2 = (f2) b10;
                    ((o0.e) qVar.f8346e).b(f2Var2);
                    ((s.h0) qVar.f8345d).a(f2Var2);
                }
                Object J2 = m2Var.J(m2Var.f4677t, a11, b10);
                if (!(J2 instanceof f2)) {
                    if (J2 instanceof x1) {
                        ((x1) J2).d();
                        break;
                    }
                } else {
                    qVar.d((f2) J2);
                    break;
                }
                break;
        }
    }

    @Override // n0.i0
    public m0.a b(k0 k0Var) {
        switch (this.f5031c) {
            case 0:
                return (m0.a) k0Var.b(1);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (m0.a) k0Var.b(0);
            default:
                return super.b(k0Var);
        }
    }
}
