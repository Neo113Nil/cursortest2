package m5;

import ac.o;
import b0.v;
import java.util.List;
import m0.l;
import m0.r;
import m0.v1;
import m0.x2;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4891g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f4892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f4893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4894j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, String str, d dVar) {
        super(2);
        u0.d dVar2 = hd.b.f2879a;
        this.f4892h = list;
        this.f4894j = str;
        this.f4893i = dVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4891g;
        o oVar = o.f277a;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !rVar.B()) {
                    c cVar = (c) rVar.j(h.f4895a);
                    x2 x2Var = n5.g.f5070a;
                    rVar.Y(-2143933045);
                    v0.c cVar2 = (v0.c) rVar.j(n5.g.f5070a);
                    i iVar = (i) rVar.j(k.f4898a);
                    d dVar = this.f4893i;
                    Object[] objArr = {iVar, cVar2, cVar, dVar};
                    rVar.Y(-568225417);
                    boolean z10 = false;
                    for (int i11 = 0; i11 < 4; i11++) {
                        z10 |= rVar.f(objArr[i11]);
                    }
                    Object M = rVar.M();
                    boolean z11 = z10;
                    String str = this.f4894j;
                    if (z11 || M == l.f4646a) {
                        iVar.getClass();
                        pc.j.e(cVar2, "stateHolder");
                        v vVar = new v(str, cVar2, dVar, cVar, 1);
                        ae.b bVar = new ae.b(j.f4897g);
                        pc.v.c(1, vVar);
                        M = new v0.j(bVar, vVar);
                        rVar.i0(M);
                    }
                    rVar.q(false);
                    c cVar3 = (c) v0.k.b(new Object[0], (v0.i) M, str, new n5.f(this.f4892h, str, cVar2, dVar, cVar), rVar, 72, 0);
                    rVar.q(false);
                    rVar.Y(1621646237);
                    c cVar4 = cVar3.f4880c;
                    n5.d.b(cVar3, rVar, 8);
                    rVar.q(false);
                    v1 a6 = h.f4895a.a(cVar3);
                    u0.d dVar2 = hd.b.f2879a;
                    z.a(a6, u0.e.b(rVar, -184665941, new f(dVar, cVar3)), rVar, 56);
                    n5.d.a(cVar3, rVar, 8);
                    break;
                } else {
                    rVar.S();
                    break;
                }
                break;
            default:
                ((Number) obj2).intValue();
                u0.d dVar3 = hd.b.f2879a;
                h.a(this.f4892h, this.f4893i, this.f4894j, (r) obj, z.y(24585));
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, d dVar, String str, int i10) {
        super(2);
        u0.d dVar2 = hd.b.f2879a;
        this.f4892h = list;
        this.f4893i = dVar;
        this.f4894j = str;
    }
}
