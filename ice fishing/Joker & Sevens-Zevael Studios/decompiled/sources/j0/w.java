package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.g f3487h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3488i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3489j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3490k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3491l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j5.j jVar, u0.d dVar, u0.d dVar2, b0.p0 p0Var, int i10) {
        super(2);
        this.f3486g = 1;
        this.f3489j = jVar;
        this.f3487h = dVar;
        this.f3490k = dVar2;
        this.f3491l = p0Var;
        this.f3488i = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3486g) {
            case 0:
                ((Number) obj2).intValue();
                x.a((j) this.f3489j, (k0) this.f3490k, (s0) this.f3491l, (u0.d) this.f3487h, (m0.r) obj, m0.z.y(this.f3488i | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Number) obj2).intValue();
                j5.d.c((j5.j) this.f3489j, (u0.d) this.f3487h, (u0.d) this.f3490k, (b0.p0) this.f3491l, (m0.r) obj, m0.z.y(this.f3488i | 1));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Number) obj2).intValue();
                m5.c cVar = (m5.c) this.f3489j;
                y0.n nVar = (y0.n) this.f3490k;
                v.x xVar = (v.x) this.f3491l;
                i7.b.d(cVar, nVar, xVar, this.f3487h, (m0.r) obj, m0.z.y(this.f3488i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                bc.a0.d((m5.c) this.f3489j, (a0.a0) this.f3490k, (oc.c) this.f3491l, (u0.d) this.f3487h, (m0.r) obj, m0.z.y(this.f3488i | 1));
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, Object obj3, oc.g gVar, int i10, int i11) {
        super(2);
        this.f3486g = i11;
        this.f3489j = obj;
        this.f3490k = obj2;
        this.f3491l = obj3;
        this.f3487h = gVar;
        this.f3488i = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m5.c cVar, a0.a0 a0Var, oc.c cVar2, u0.d dVar, int i10) {
        super(2);
        this.f3486g = 3;
        this.f3489j = cVar;
        this.f3490k = a0Var;
        this.f3491l = cVar2;
        this.f3487h = dVar;
        this.f3488i = i10;
    }
}
