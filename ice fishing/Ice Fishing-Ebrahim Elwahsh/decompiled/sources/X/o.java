package X;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class o extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3576n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f3577u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E e6, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3577u = e6;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        o oVar = new o(this.f3577u, interfaceC5133d);
        oVar.f3576n = obj;
        return oVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((E) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        com.bumptech.glide.f.r(obj);
        E e6 = (E) this.f3576n;
        E e9 = this.f3577u;
        boolean z8 = false;
        if (!(e9 instanceof C0401a) && !(e9 instanceof g) && e6 == e9) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
