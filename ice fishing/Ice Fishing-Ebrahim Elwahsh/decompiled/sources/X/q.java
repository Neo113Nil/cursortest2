package X;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class q extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3581n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3582u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3583v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D d2, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3583v = d2;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        q qVar = new q(this.f3583v, interfaceC5133d);
        qVar.f3582u = obj;
        return qVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((R7.c) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3581n;
        q7.v vVar = q7.v.f40183a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return vVar;
        }
        com.bumptech.glide.f.r(obj);
        R7.c cVar = (R7.c) this.f3582u;
        D d2 = this.f3583v;
        E e6 = (E) d2.f3541e.E();
        if (!(e6 instanceof C0401a)) {
            d2.f3543g.d(new j(e6));
        }
        o oVar = new o(e6, null);
        this.f3581n = 1;
        d2.f3541e.j(new R7.f(new kotlin.jvm.internal.p(), new R7.i(1, cVar), oVar), this);
        return enumC5179a;
    }
}
