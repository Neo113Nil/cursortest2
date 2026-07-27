package X;

import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class q extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3525n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3526u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3527v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D d2, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3527v = d2;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        q qVar = new q(this.f3527v, interfaceC5267d);
        qVar.f3526u = obj;
        return qVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((V7.c) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3525n;
        u7.v vVar = u7.v.f41350a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return vVar;
        }
        com.bumptech.glide.d.k(obj);
        V7.c cVar = (V7.c) this.f3526u;
        D d2 = this.f3527v;
        E e9 = (E) d2.f3485e.E();
        if (!(e9 instanceof C0408a)) {
            d2.f3487g.p(new j(e9));
        }
        o oVar = new o(e9, null);
        this.f3525n = 1;
        d2.f3485e.p(new V7.f(new kotlin.jvm.internal.p(), new V7.i(1, cVar), oVar), this);
        return aVar;
    }
}
