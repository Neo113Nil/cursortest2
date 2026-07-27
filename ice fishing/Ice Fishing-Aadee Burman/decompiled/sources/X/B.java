package X;

import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class B extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3470n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B7.h f3471u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3472v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(I7.p pVar, Object obj, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3471u = (B7.h) pVar;
        this.f3472v = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B7.h, I7.p] */
    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new B(this.f3471u, this.f3472v, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [B7.h, I7.p] */
    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3470n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return obj;
        }
        com.bumptech.glide.d.k(obj);
        this.f3470n = 1;
        Object invoke = this.f3471u.invoke(this.f3472v, this);
        return invoke == aVar ? aVar : invoke;
    }
}
