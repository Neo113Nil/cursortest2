package w;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final k f7446h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f7447i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f7448j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f7449k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7450g;

    static {
        int i10 = 1;
        f7446h = new k(i10, 0);
        f7447i = new k(i10, 1);
        f7448j = new k(i10, 2);
        f7449k = new k(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f7450g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10 = this.f7450g;
        ac.o oVar = ac.o.f277a;
        switch (i10) {
            case 0:
                ((x1.i0) obj).a();
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return oVar;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                e2.f fVar = e2.f.f1954b;
                vc.c[] cVarArr = e2.u.f2053a;
                e2.v vVar = e2.s.f2027c;
                vc.c cVar = e2.u.f2053a[1];
                vVar.a((e2.j) obj, fVar);
                return oVar;
            default:
                return new b1(((Number) obj).intValue());
        }
    }
}
