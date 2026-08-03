package ud;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.a f6750h;

    public /* synthetic */ d(int i10, int i11, oc.a aVar) {
        this.f6749g = i11;
        this.f6750h = aVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6749g;
        r rVar = (r) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                g.d(this.f6750h, rVar, z.y(1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                g.c(this.f6750h, rVar, z.y(1));
                break;
            default:
                g.a(this.f6750h, rVar, z.y(1));
                break;
        }
        return o.f277a;
    }
}
