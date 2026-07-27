package W7;

import D.H;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class f extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3424n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3425u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f3426v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(H h9, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3426v = h9;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        f fVar = new f(this.f3426v, interfaceC5267d);
        fVar.f3425u = obj;
        return fVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((V7.c) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3424n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            V7.c cVar = (V7.c) this.f3425u;
            this.f3424n = 1;
            if (this.f3426v.o(cVar, this) == aVar) {
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
