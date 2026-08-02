package W7;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class w extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3623n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3624u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3625v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(V7.c cVar, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3625v = cVar;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        w wVar = new w(this.f3625v, interfaceC5240d);
        wVar.f3624u = obj;
        return wVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create(obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3623n;
        if (i == 0) {
            Q3.b.s(obj);
            Object obj2 = this.f3624u;
            this.f3623n = 1;
            if (this.f3625v.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
        }
        return u7.v.f41073a;
    }
}
