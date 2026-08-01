package W7;

import D.H;
import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class j extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3440n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3441u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f3442v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ V7.c f3443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(H h9, V7.c cVar, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3442v = h9;
        this.f3443w = cVar;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        j jVar = new j(this.f3442v, this.f3443w, interfaceC5267d);
        jVar.f3441u = obj;
        return jVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3440n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            InterfaceC0404w interfaceC0404w = (InterfaceC0404w) this.f3441u;
            kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
            H h9 = this.f3442v;
            V7.l lVar = (V7.l) h9.f439x;
            i iVar = new i(rVar, interfaceC0404w, h9, this.f3443w);
            this.f3440n = 1;
            if (lVar.p(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return u7.v.f41353a;
    }
}
