package m0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4512i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ac.c f4513j;

    public /* synthetic */ a0(Object obj, ac.c cVar, int i10, int i11) {
        this.f4510g = i11;
        this.f4512i = obj;
        this.f4513j = cVar;
        this.f4511h = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4510g) {
            case 0:
                ((Integer) obj2).getClass();
                z.a((v1) this.f4512i, (u0.d) this.f4513j, (r) obj, z.y(this.f4511h | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Integer) obj2).intValue();
                z.b((v1[]) this.f4512i, (oc.e) this.f4513j, (r) obj, z.y(this.f4511h | 1));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Integer) obj2).intValue();
                x4.f.q((List) this.f4512i, (oc.c) this.f4513j, (r) obj, z.y(this.f4511h | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                x4.f.v((y0.n) this.f4512i, (oc.a) this.f4513j, (r) obj, z.y(this.f4511h | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int y10 = z.y(this.f4511h) | 1;
                ((u0.d) this.f4513j).e(this.f4512i, (r) obj, y10);
                break;
        }
        return ac.o.f277a;
    }

    public /* synthetic */ a0(u0.d dVar, Object obj, int i10) {
        this.f4510g = 4;
        this.f4513j = dVar;
        this.f4512i = obj;
        this.f4511h = i10;
    }
}
