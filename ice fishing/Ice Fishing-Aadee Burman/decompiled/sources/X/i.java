package X;

import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import java.util.concurrent.atomic.AtomicInteger;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class i extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public n f3507n;

    /* renamed from: u, reason: collision with root package name */
    public int f3508u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S0.n f3509v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(S0.n nVar, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3509v = nVar;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new i(this.f3509v, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
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
        A7.a aVar = A7.a.f58n;
        int i = this.f3508u;
        S0.n nVar2 = this.f3509v;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            if (((AtomicInteger) nVar2.f2805x).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC0406y.g(((InterfaceC0404w) nVar2.f2802u).z());
            nVar = (n) nVar2.f2803v;
            U7.c cVar = (U7.c) nVar2.f2804w;
            this.f3507n = nVar;
            this.f3508u = 1;
            obj = cVar.b(this);
        } else if (i == 1) {
            nVar = this.f3507n;
            com.bumptech.glide.d.k(obj);
            this.f3507n = null;
            this.f3508u = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            if (((AtomicInteger) nVar2.f2805x).decrementAndGet() == 0) {
                return u7.v.f41350a;
            }
            AbstractC0406y.g(((InterfaceC0404w) nVar2.f2802u).z());
            nVar = (n) nVar2.f2803v;
            U7.c cVar2 = (U7.c) nVar2.f2804w;
            this.f3507n = nVar;
            this.f3508u = 1;
            obj = cVar2.b(this);
        }
    }
}
