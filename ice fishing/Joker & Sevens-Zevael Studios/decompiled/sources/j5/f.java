package j5;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.d1;
import m0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends pc.k implements oc.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3542h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        super(4);
        this.f3541g = i10;
        this.f3542h = obj;
        this.f3543i = obj2;
    }

    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        switch (this.f3541g) {
            case 0:
                String str = (String) obj;
                r rVar = (r) obj3;
                int intValue = ((Number) obj4).intValue();
                pc.j.e(str, "suffixKey");
                pc.j.e((oc.e) obj2, "$anonymous$parameter$1$");
                if ((intValue & 14) == 0) {
                    intValue |= rVar.f(str) ? 4 : 2;
                }
                if ((intValue & 651) == 130 && rVar.B()) {
                    rVar.S();
                } else {
                    ((u0.d) this.f3542h).d(str, (u0.d) this.f3543i, rVar, Integer.valueOf((intValue & 14) | 48));
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                String str2 = (String) obj;
                oc.e eVar = (oc.e) obj2;
                r rVar2 = (r) obj3;
                int intValue2 = ((Number) obj4).intValue();
                pc.j.e(str2, "suffix");
                pc.j.e(eVar, "content");
                if ((intValue2 & 14) == 0) {
                    i10 = (rVar2.f(str2) ? 4 : 2) | intValue2;
                } else {
                    i10 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    i10 |= rVar2.h(eVar) ? 32 : 16;
                }
                if ((i10 & 731) == 146 && rVar2.B()) {
                    rVar2.S();
                } else {
                    String str3 = (String) this.f3542h;
                    m5.c cVar = (m5.c) this.f3543i;
                    rVar2.Y(645671963);
                    String str4 = str3 + ':' + str2;
                    cVar.f4884g.add(str4);
                    cVar.f4879b.a(str4, eVar, rVar2, (i10 & 112) | 512);
                    rVar2.q(false);
                }
                break;
            default:
                u.i iVar = (u.i) obj;
                k5.a aVar = (k5.a) obj2;
                r rVar3 = (r) obj3;
                ((Number) obj4).intValue();
                pc.j.e(iVar, "$this$AnimatedContent");
                pc.j.e(aVar, "screen");
                rVar3.Y(-1728395422);
                u.r rVar4 = iVar.f6604a;
                rVar4.a().f6826d.getValue();
                rVar4.a().c();
                rVar3.q(false);
                ((m5.c) this.f3543i).e("transition", aVar, u0.e.b(rVar3, -213849240, new e((u0.d) this.f3542h, iVar, aVar)), rVar3, 4550, 0);
                break;
        }
        return o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m5.c cVar, d1 d1Var, u0.d dVar) {
        super(4);
        this.f3541g = 2;
        this.f3543i = cVar;
        this.f3542h = dVar;
    }
}
