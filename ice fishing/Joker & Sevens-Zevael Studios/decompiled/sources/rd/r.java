package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6183i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6184j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6185k;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f6181g = i11;
        this.f6184j = obj;
        this.f6183i = obj2;
        this.f6185k = obj3;
        this.f6182h = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6181g) {
            case 0:
                ((Integer) obj2).getClass();
                x4.f.f((y) this.f6184j, (oc.a) this.f6183i, (oc.c) this.f6185k, (m0.r) obj, m0.z.y(this.f6182h | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Integer) obj2).getClass();
                int y10 = m0.z.y(1);
                x4.f.h((qd.h) this.f6184j, this.f6182h, (oc.a) this.f6183i, (oc.a) this.f6185k, (m0.r) obj, y10);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Integer) obj2).intValue();
                int y11 = m0.z.y(this.f6182h) | 1;
                ((u0.d) this.f6184j).c(this.f6183i, this.f6185k, (m0.r) obj, y11);
                break;
            default:
                ((Integer) obj2).intValue();
                int y12 = m0.z.y(this.f6182h | 1);
                ((v0.d) this.f6184j).a(this.f6183i, (oc.e) this.f6185k, (m0.r) obj, y12);
                break;
        }
        return ac.o.f277a;
    }

    public /* synthetic */ r(qd.h hVar, int i10, oc.a aVar, oc.a aVar2, int i11) {
        this.f6181g = 1;
        this.f6184j = hVar;
        this.f6182h = i10;
        this.f6183i = aVar;
        this.f6185k = aVar2;
    }
}
