package W7;

import D.G;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class f extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3586n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f3588v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(G g9, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3588v = g9;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        f fVar = new f(this.f3588v, interfaceC5240d);
        fVar.f3587u = obj;
        return fVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((V7.c) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3586n;
        if (i == 0) {
            Q3.b.s(obj);
            V7.c cVar = (V7.c) this.f3587u;
            this.f3586n = 1;
            if (this.f3588v.p(cVar, this) == aVar) {
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
