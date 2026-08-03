package yc;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends f1 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8874k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8875l;

    public /* synthetic */ l0(int i10, Object obj) {
        this.f8874k = i10;
        this.f8875l = obj;
    }

    @Override // yc.z0
    public final void d(Throwable th) {
        switch (this.f8874k) {
            case 0:
                ((k0) this.f8875l).a();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((z0) this.f8875l).d(th);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                g1 g1Var = (g1) this.f8875l;
                Object M = k().M();
                if (!(M instanceof p)) {
                    g1Var.resumeWith(a0.y(M));
                    break;
                } else {
                    g1Var.resumeWith(v6.a.s(((p) M).f8889a));
                    break;
                }
            default:
                ((g) this.f8875l).resumeWith(ac.o.f277a);
                break;
        }
    }
}
