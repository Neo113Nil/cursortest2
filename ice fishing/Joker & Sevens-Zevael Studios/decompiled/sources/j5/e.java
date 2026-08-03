package j5;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import m0.r;
import m0.z;
import pc.p;
import v1.p0;
import v1.s0;
import x.x0;
import x.z0;
import x1.m1;
import y0.n;
import y1.l0;
import y1.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3539i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3540j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        super(2);
        this.f3537g = i10;
        this.f3539i = obj;
        this.f3538h = obj2;
        this.f3540j = obj3;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3537g) {
            case 0:
                ((Number) obj2).intValue();
                d.b((List) this.f3539i, (u0.d) this.f3538h, (u0.d) this.f3540j, (r) obj, z.y(441));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                r rVar = (r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    ((m5.c) this.f3539i).f4879b.a((String) this.f3540j, (u0.d) this.f3538h, rVar, 512);
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                r rVar2 = (r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar2.B()) {
                    rVar2.S();
                } else {
                    ((u0.d) this.f3538h).d((u.i) this.f3539i, (k5.a) this.f3540j, rVar2, 72);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                p0.a((s0) this.f3539i, (n) this.f3538h, (oc.e) this.f3540j, (r) obj, z.y(9));
                break;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                p pVar = (p) this.f3539i;
                float f10 = floatValue - pVar.f5680g;
                z0 z0Var = (z0) this.f3538h;
                x0 x0Var = (x0) this.f3540j;
                long g8 = z0Var.g(z0Var.c(f10));
                z0 z0Var2 = x0Var.f7935a;
                pVar.f5680g += z0Var.c(z0Var.f(z0.a(z0Var2, z0Var2.f7958h, g8, 1)));
                break;
            case 5:
                r rVar3 = (r) obj;
                int intValue = ((Number) obj2).intValue();
                if (rVar3.P(intValue & 1, (intValue & 3) != 2)) {
                    y0.a((y1.r) this.f3539i, (l0) this.f3538h, (oc.e) this.f3540j, rVar3, 0);
                } else {
                    rVar3.S();
                }
                break;
            default:
                ((Number) obj2).intValue();
                y0.a((m1) this.f3539i, (l0) this.f3538h, (oc.e) this.f3540j, (r) obj, z.y(1));
                break;
        }
        return o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, oc.e eVar, int i10, int i11) {
        super(2);
        this.f3537g = i11;
        this.f3539i = obj;
        this.f3538h = obj2;
        this.f3540j = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m5.c cVar, String str, u0.d dVar) {
        super(2);
        this.f3537g = 1;
        this.f3539i = cVar;
        this.f3540j = str;
        this.f3538h = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u0.d dVar, u.i iVar, k5.a aVar) {
        super(2);
        this.f3537g = 2;
        this.f3538h = dVar;
        this.f3539i = iVar;
        this.f3540j = aVar;
    }
}
