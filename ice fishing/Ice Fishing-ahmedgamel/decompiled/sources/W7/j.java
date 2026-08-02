package W7;

import D.G;
import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class j extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3602n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3603u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f3604v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ V7.c f3605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(G g9, V7.c cVar, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3604v = g9;
        this.f3605w = cVar;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        j jVar = new j(this.f3604v, this.f3605w, interfaceC5240d);
        jVar.f3603u = obj;
        return jVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3602n;
        if (i == 0) {
            Q3.b.s(obj);
            InterfaceC0408w interfaceC0408w = (InterfaceC0408w) this.f3603u;
            kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
            G g9 = this.f3604v;
            V7.l lVar = (V7.l) g9.f336x;
            i iVar = new i(rVar, interfaceC0408w, g9, this.f3605w);
            this.f3602n = 1;
            if (lVar.l(iVar, this) == aVar) {
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
