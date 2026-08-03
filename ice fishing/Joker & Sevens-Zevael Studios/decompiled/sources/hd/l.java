package hd;

import ac.o;
import m0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.a f2907h;

    public /* synthetic */ l(k5.a aVar, int i10) {
        this.f2906g = i10;
        this.f2907h = aVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2906g;
        o oVar = o.f277a;
        k5.a aVar = this.f2907h;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !rVar.B()) {
                    u0.d dVar = b.f2879a;
                    m5.h.b(aVar, rVar, 24576);
                    break;
                } else {
                    rVar.S();
                    break;
                }
            default:
                r rVar2 = (r) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !rVar2.B()) {
                    ee.b.a(u0.e.e(-9127849, new l(aVar, 0), rVar2), rVar2, 6);
                    break;
                } else {
                    rVar2.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
