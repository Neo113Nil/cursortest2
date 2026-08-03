package m0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4751i;

    public /* synthetic */ s(int i10, int i11, Object obj, Object obj2) {
        this.f4749g = i11;
        this.f4750h = obj;
        this.f4751i = obj2;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4749g) {
            case 0:
                x4.q qVar = (x4.q) this.f4750h;
                m2 m2Var = (m2) this.f4751i;
                int intValue = ((Integer) obj).intValue();
                if (obj2 instanceof j) {
                    ((o0.e) qVar.f8347f).b((j) obj2);
                } else if (obj2 instanceof f2) {
                    f2 f2Var = (f2) obj2;
                    if (!(f2Var.f4585a instanceof o)) {
                        t.f(m2Var, intValue, obj2);
                        qVar.d(f2Var);
                    }
                } else if (obj2 instanceof x1) {
                    t.f(m2Var, intValue, obj2);
                    ((x1) obj2).d();
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Integer) obj2).getClass();
                v6.a.f((td.d) this.f4750h, (m5.c) this.f4751i, (r) obj, z.y(65));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Integer) obj2).getClass();
                v6.a.i((String) this.f4750h, (y0.n) this.f4751i, (r) obj, z.y(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                v6.a.g((String) this.f4750h, (oc.a) this.f4751i, (r) obj, z.y(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ud.g.b((String) this.f4750h, (String) this.f4751i, (r) obj, z.y(55));
                break;
            default:
                ((Integer) obj2).getClass();
                uc.e.e((zd.e) this.f4750h, (oc.a) this.f4751i, (r) obj, z.y(1));
                break;
        }
        return ac.o.f277a;
    }

    public /* synthetic */ s(x4.q qVar, m2 m2Var) {
        this.f4749g = 0;
        this.f4750h = qVar;
        this.f4751i = m2Var;
    }
}
