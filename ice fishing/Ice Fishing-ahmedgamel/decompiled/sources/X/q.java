package X;

import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class q extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3687n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3688u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3689v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D d9, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3689v = d9;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        q qVar = new q(this.f3689v, interfaceC5240d);
        qVar.f3688u = obj;
        return qVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((V7.c) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3687n;
        u7.v vVar = u7.v.f41073a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return vVar;
        }
        Q3.b.s(obj);
        V7.c cVar = (V7.c) this.f3688u;
        D d9 = this.f3689v;
        E e9 = (E) d9.f3647e.E();
        if (!(e9 instanceof C0412a)) {
            d9.f3649g.l(new j(e9));
        }
        o oVar = new o(e9, null);
        this.f3687n = 1;
        d9.f3647e.l(new V7.f(new kotlin.jvm.internal.p(), new V7.i(1, cVar), oVar), this);
        return aVar;
    }
}
