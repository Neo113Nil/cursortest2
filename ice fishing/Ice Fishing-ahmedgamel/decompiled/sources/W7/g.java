package W7;

import D.G;
import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class g extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3589n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f3590u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3591v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3592w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(G g9, V7.c cVar, Object obj, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3590u = g9;
        this.f3591v = cVar;
        this.f3592w = obj;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new g(this.f3590u, this.f3591v, this.f3592w, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3589n;
        if (i == 0) {
            Q3.b.s(obj);
            V7.g gVar = (V7.g) this.f3590u.f337y;
            this.f3589n = 1;
            if (gVar.invoke(this.f3591v, this.f3592w, this) == aVar) {
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
