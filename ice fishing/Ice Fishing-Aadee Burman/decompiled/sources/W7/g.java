package W7;

import D.H;
import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class g extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3427n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H f3428u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.c f3429v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(H h9, V7.c cVar, Object obj, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3428u = h9;
        this.f3429v = cVar;
        this.f3430w = obj;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new g(this.f3428u, this.f3429v, this.f3430w, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3427n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            V7.g gVar = (V7.g) this.f3428u.f440y;
            this.f3427n = 1;
            if (gVar.invoke(this.f3429v, this.f3430w, this) == aVar) {
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
