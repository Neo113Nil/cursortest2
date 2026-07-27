package W7;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class w extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3461n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3462u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3463v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(V7.c cVar, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3463v = cVar;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        w wVar = new w(this.f3463v, interfaceC5267d);
        wVar.f3462u = obj;
        return wVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create(obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3461n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            Object obj2 = this.f3462u;
            this.f3461n = 1;
            if (this.f3463v.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return u7.v.f41350a;
    }
}
