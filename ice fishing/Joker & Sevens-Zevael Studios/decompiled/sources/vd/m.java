package vd;

import java.util.List;
import m0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends pc.k implements oc.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f7347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.c f7349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, int i10, oc.c cVar) {
        super(4);
        this.f7347g = list;
        this.f7348h = i10;
        this.f7349i = cVar;
    }

    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        a0.c cVar = (a0.c) obj;
        int intValue = ((Number) obj2).intValue();
        r rVar = (r) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i10 = (rVar.f(cVar) ? 4 : 2) | intValue2;
        } else {
            i10 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i10 |= rVar.d(intValue) ? 32 : 16;
        }
        if ((i10 & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            qd.k kVar = (qd.k) this.f7347g.get(intValue);
            rVar.X(327060573);
            boolean z10 = this.f7348h >= kVar.f5868d;
            rVar.X(1118933169);
            oc.c cVar2 = this.f7349i;
            boolean f10 = rVar.f(cVar2) | rVar.f(kVar);
            Object M = rVar.M();
            if (f10 || M == m0.l.f4646a) {
                M = new l(cVar2, kVar);
                rVar.i0(M);
            }
            rVar.q(false);
            u2.b.c(kVar, z10, (oc.a) M, rVar, 0);
            rVar.q(false);
        }
        return ac.o.f277a;
    }
}
