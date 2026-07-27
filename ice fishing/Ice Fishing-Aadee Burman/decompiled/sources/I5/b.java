package I5;

import B7.h;
import I7.p;
import S0.s;
import S7.InterfaceC0404w;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f1293n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f1294u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Thread f1295v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Throwable f1296w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Thread thread, Throwable th, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f1294u = cVar;
        this.f1295v = thread;
        this.f1296w = th;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new b(this.f1294u, this.f1295v, this.f1296w, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f1293n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            s sVar = this.f1294u.f1297a;
            this.f1293n = 1;
            if (sVar.o(this.f1295v, this.f1296w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return v.f41350a;
    }
}
