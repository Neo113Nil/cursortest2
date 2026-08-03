package sd;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m5.c f6480h;

    public /* synthetic */ c(m5.c cVar, int i10) {
        this.f6479g = i10;
        this.f6480h = cVar;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f6479g) {
            case 0:
                this.f6480h.d(rd.e.f6134g);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f6480h.d(td.c.f6550g);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f6480h.c();
                break;
            case 3:
                this.f6480h.c();
                break;
            default:
                this.f6480h.c();
                break;
        }
        return o.f277a;
    }
}
