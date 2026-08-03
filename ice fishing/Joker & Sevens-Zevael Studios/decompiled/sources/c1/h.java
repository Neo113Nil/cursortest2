package c1;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import pc.k;
import v1.i0;
import v1.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f1210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j0 j0Var, int i10) {
        super(1);
        this.f1209g = i10;
        this.f1210h = j0Var;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1209g) {
            case 0:
                i0.i((i0) obj, this.f1210h, 0, 0);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                i0.g((i0) obj, this.f1210h, 0, 0);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                i0.g((i0) obj, this.f1210h, 0, 0);
                break;
            case 3:
                i0.g((i0) obj, this.f1210h, 0, 0);
                break;
            case 4:
                i0.j((i0) obj, this.f1210h, 0, 0);
                break;
            case 5:
                i0.g((i0) obj, this.f1210h, 0, 0);
                break;
            case 6:
                i0.i((i0) obj, this.f1210h, 0, 0);
                break;
            case 7:
                i0.i((i0) obj, this.f1210h, 0, 0);
                break;
            default:
                i0.i((i0) obj, this.f1210h, 0, 0);
                break;
        }
        return o.f277a;
    }
}
