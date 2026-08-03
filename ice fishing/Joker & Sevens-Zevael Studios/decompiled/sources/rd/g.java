package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6144i;

    public /* synthetic */ g(int i10, int i11, oc.a aVar) {
        this.f6142g = i11;
        this.f6143h = aVar;
        this.f6144i = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6142g) {
            case 0:
                ((Integer) obj2).intValue();
                x4.f.o((oc.a) this.f6143h, (m0.r) obj, m0.z.y(this.f6144i | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Integer) obj2).intValue();
                x4.f.w((oc.a) this.f6143h, (m0.r) obj, m0.z.y(this.f6144i | 1));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Integer) obj2).intValue();
                uc.e.d((oc.a) this.f6143h, (m0.r) obj, m0.z.y(this.f6144i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int y10 = m0.z.y(1);
                uc.e.c(this.f6144i, (zd.c) this.f6143h, (m0.r) obj, y10);
                break;
        }
        return ac.o.f277a;
    }

    public /* synthetic */ g(int i10, zd.c cVar, int i11) {
        this.f6142g = 3;
        this.f6144i = i10;
        this.f6143h = cVar;
    }
}
