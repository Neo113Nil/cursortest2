package X;

import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class B extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3632n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B7.h f3633u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3634v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(I7.p pVar, Object obj, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3633u = (B7.h) pVar;
        this.f3634v = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B7.h, I7.p] */
    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new B(this.f3633u, this.f3634v, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [B7.h, I7.p] */
    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3632n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return obj;
        }
        Q3.b.s(obj);
        this.f3632n = 1;
        Object invoke = this.f3633u.invoke(this.f3634v, this);
        return invoke == aVar ? aVar : invoke;
    }
}
