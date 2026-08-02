package X;

import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import java.util.concurrent.atomic.AtomicInteger;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class i extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public n f3669n;

    /* renamed from: u, reason: collision with root package name */
    public int f3670u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S0.n f3671v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(S0.n nVar, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3671v = nVar;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new i(this.f3671v, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0055 -> B:6:0x0058). Please report as a decompilation issue!!! */
    @Override // B7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n nVar;
        A7.a aVar = A7.a.f215n;
        int i = this.f3670u;
        S0.n nVar2 = this.f3671v;
        if (i == 0) {
            Q3.b.s(obj);
            if (((AtomicInteger) nVar2.f2934x).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC0410y.g(((InterfaceC0408w) nVar2.f2931u).z());
            nVar = (n) nVar2.f2932v;
            U7.c cVar = (U7.c) nVar2.f2933w;
            this.f3669n = nVar;
            this.f3670u = 1;
            obj = cVar.b(this);
        } else if (i == 1) {
            nVar = this.f3669n;
            Q3.b.s(obj);
            this.f3669n = null;
            this.f3670u = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            if (((AtomicInteger) nVar2.f2934x).decrementAndGet() == 0) {
                return u7.v.f41073a;
            }
            AbstractC0410y.g(((InterfaceC0408w) nVar2.f2931u).z());
            nVar = (n) nVar2.f2932v;
            U7.c cVar2 = (U7.c) nVar2.f2933w;
            this.f3669n = nVar;
            this.f3670u = 1;
            obj = cVar2.b(this);
        }
    }
}
