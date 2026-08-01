package W7;

import D.H;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3421n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3422u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f3423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(H h9, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3423v = h9;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        e eVar = new e(this.f3423v, interfaceC5267d);
        eVar.f3422u = obj;
        return eVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((U7.p) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3421n;
        u7.v vVar = u7.v.f41353a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return vVar;
        }
        com.bumptech.glide.d.k(obj);
        U7.p pVar = (U7.p) this.f3422u;
        this.f3421n = 1;
        H h9 = this.f3423v;
        h9.getClass();
        Object o6 = h9.o(new u(pVar), this);
        if (o6 != aVar) {
            o6 = vVar;
        }
        return o6 == aVar ? aVar : vVar;
    }
}
