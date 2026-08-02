package X;

import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class o extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3682n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f3683u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E e9, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3683u = e9;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        o oVar = new o(this.f3683u, interfaceC5240d);
        oVar.f3682n = obj;
        return oVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((E) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        Q3.b.s(obj);
        E e9 = (E) this.f3682n;
        E e10 = this.f3683u;
        boolean z6 = false;
        if (!(e10 instanceof C0412a) && !(e10 instanceof g) && e9 == e10) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
