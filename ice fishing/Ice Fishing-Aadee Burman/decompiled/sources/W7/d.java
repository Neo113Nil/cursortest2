package W7;

import D.H;
import S7.AbstractC0406y;
import S7.EnumC0405x;
import S7.InterfaceC0404w;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class d extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3417n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3418u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3419v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f3420w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H h9, V7.c cVar, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3419v = cVar;
        this.f3420w = h9;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        d dVar = new d(this.f3420w, this.f3419v, interfaceC5267d);
        dVar.f3418u = obj;
        return dVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3417n;
        u7.v vVar = u7.v.f41350a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return vVar;
        }
        com.bumptech.glide.d.k(obj);
        InterfaceC0404w interfaceC0404w = (InterfaceC0404w) this.f3418u;
        H h9 = this.f3420w;
        int i6 = h9.f436u;
        if (i6 == -3) {
            i6 = -2;
        }
        EnumC0405x enumC0405x = EnumC0405x.f3003v;
        I7.p eVar = new e(h9, null);
        U7.o oVar = new U7.o(AbstractC0406y.p(interfaceC0404w, (InterfaceC5272i) h9.f437v), U7.j.a(i6, (U7.a) h9.f438w, 4));
        oVar.W(enumC0405x, oVar, eVar);
        this.f3417n = 1;
        Object a9 = V7.o.a(this.f3419v, oVar, true, this);
        if (a9 != aVar) {
            a9 = vVar;
        }
        return a9 == aVar ? aVar : vVar;
    }
}
