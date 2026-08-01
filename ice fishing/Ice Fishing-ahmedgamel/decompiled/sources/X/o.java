package X;

import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class o extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3520n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f3521u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E e9, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3521u = e9;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        o oVar = new o(this.f3521u, interfaceC5267d);
        oVar.f3520n = obj;
        return oVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((E) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        com.bumptech.glide.d.k(obj);
        E e9 = (E) this.f3520n;
        E e10 = this.f3521u;
        boolean z3 = false;
        if (!(e10 instanceof C0408a) && !(e10 instanceof g) && e9 == e10) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
