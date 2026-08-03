package m5;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f4890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(c cVar, int i10, int i11) {
        super(2);
        this.f4889g = i11;
        this.f4890h = cVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4889g) {
            case 0:
                r rVar = (r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    rVar.Y(1185192621);
                    c cVar = this.f4890h;
                    n5.d.c(cVar, rVar, 8);
                    rVar.q(false);
                    x4.f.m(cVar, rVar, 8);
                    hd.b.f2879a.b(cVar, rVar, 8);
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Number) obj2).intValue();
                int y10 = z.y(9);
                x4.f.m(this.f4890h, (r) obj, y10);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Number) obj2).intValue();
                int y11 = z.y(9);
                n5.d.a(this.f4890h, (r) obj, y11);
                break;
            case 3:
                ((Number) obj2).intValue();
                int y12 = z.y(9);
                n5.d.b(this.f4890h, (r) obj, y12);
                break;
            default:
                ((Number) obj2).intValue();
                int y13 = z.y(9);
                n5.d.c(this.f4890h, (r) obj, y13);
                break;
        }
        return o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, c cVar) {
        super(2);
        this.f4889g = 0;
        u0.d dVar2 = hd.b.f2879a;
        this.f4890h = cVar;
    }
}
