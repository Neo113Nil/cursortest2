package W7;

import D.G;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3583n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3584u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f3585v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(G g9, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3585v = g9;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        e eVar = new e(this.f3585v, interfaceC5240d);
        eVar.f3584u = obj;
        return eVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((U7.p) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3583n;
        u7.v vVar = u7.v.f41073a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return vVar;
        }
        Q3.b.s(obj);
        U7.p pVar = (U7.p) this.f3584u;
        this.f3583n = 1;
        G g9 = this.f3585v;
        g9.getClass();
        Object p9 = g9.p(new u(pVar), this);
        if (p9 != aVar) {
            p9 = vVar;
        }
        return p9 == aVar ? aVar : vVar;
    }
}
