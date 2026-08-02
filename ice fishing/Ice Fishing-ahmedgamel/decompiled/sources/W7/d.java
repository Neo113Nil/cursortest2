package W7;

import D.G;
import S7.AbstractC0410y;
import S7.EnumC0409x;
import S7.InterfaceC0408w;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class d extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3579n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3580u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3581v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f3582w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(G g9, V7.c cVar, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3581v = cVar;
        this.f3582w = g9;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        d dVar = new d(this.f3582w, this.f3581v, interfaceC5240d);
        dVar.f3580u = obj;
        return dVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3579n;
        u7.v vVar = u7.v.f41073a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return vVar;
        }
        Q3.b.s(obj);
        InterfaceC0408w interfaceC0408w = (InterfaceC0408w) this.f3580u;
        G g9 = this.f3582w;
        int i4 = g9.f333u;
        if (i4 == -3) {
            i4 = -2;
        }
        EnumC0409x enumC0409x = EnumC0409x.f3086v;
        I7.p eVar = new e(g9, null);
        U7.o oVar = new U7.o(AbstractC0410y.p(interfaceC0408w, (InterfaceC5245i) g9.f334v), U7.j.a(i4, (U7.a) g9.f335w, 4));
        oVar.W(enumC0409x, oVar, eVar);
        this.f3579n = 1;
        Object a9 = V7.o.a(this.f3581v, oVar, true, this);
        if (a9 != aVar) {
            a9 = vVar;
        }
        return a9 == aVar ? aVar : vVar;
    }
}
