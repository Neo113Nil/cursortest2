package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f3406a = new x2(k.f3394p);

    public static final f1.g0 a(int i10, m0.r rVar) {
        k0 k0Var = (k0) rVar.j(f3406a);
        switch (v.f.d(i10)) {
            case 0:
                return k0Var.f3403e;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return b(k0Var.f3403e);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return k0Var.f3399a;
            case 3:
                return b(k0Var.f3399a);
            case 4:
                return d0.e.f1563a;
            case 5:
                return k0Var.f3402d;
            case 6:
                d0.d dVar = k0Var.f3402d;
                float f10 = (float) 0.0d;
                return d0.d.b(dVar, new d0.b(f10), null, new d0.b(f10), 6);
            case 7:
                return b(k0Var.f3402d);
            case 8:
                return k0Var.f3401c;
            case 9:
                return f1.d0.f2219a;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return k0Var.f3400b;
            default:
                throw new ac.d();
        }
    }

    public static final d0.d b(d0.d dVar) {
        float f10 = (float) 0.0d;
        return d0.d.b(dVar, null, new d0.b(f10), new d0.b(f10), 3);
    }
}
