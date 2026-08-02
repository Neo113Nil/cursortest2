package I5;

import B7.h;
import I7.p;
import S0.l;
import S7.InterfaceC0408w;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class b extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f1323n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f1324u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Thread f1325v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Throwable f1326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Thread thread, Throwable th, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f1324u = cVar;
        this.f1325v = thread;
        this.f1326w = th;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new b(this.f1324u, this.f1325v, this.f1326w, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f1323n;
        if (i == 0) {
            Q3.b.s(obj);
            l lVar = this.f1324u.f1327a;
            this.f1323n = 1;
            if (lVar.H(this.f1325v, this.f1326w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
        }
        return v.f41073a;
    }
}
