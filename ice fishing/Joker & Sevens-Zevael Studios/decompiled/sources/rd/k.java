package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6154h;

    public /* synthetic */ k(int i10, int i11, int i12) {
        this.f6153g = i12;
        this.f6154h = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6153g;
        m0.r rVar = (m0.r) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                x4.f.t(this.f6154h, rVar, m0.z.y(1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                x4.f.e(this.f6154h, rVar, m0.z.y(1));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                x4.f.l(this.f6154h, rVar, m0.z.y(1));
                break;
            default:
                u2.b.a(this.f6154h, rVar, m0.z.y(1));
                break;
        }
        return ac.o.f277a;
    }
}
