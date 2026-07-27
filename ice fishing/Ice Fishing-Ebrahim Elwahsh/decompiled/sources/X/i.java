package X;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import java.util.concurrent.atomic.AtomicInteger;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class i extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public n f3563n;

    /* renamed from: u, reason: collision with root package name */
    public int f3564u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S0.n f3565v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(S0.n nVar, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3565v = nVar;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new i(this.f3565v, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
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
    @Override // x7.AbstractC5217a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n nVar;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3564u;
        S0.n nVar2 = this.f3565v;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            if (((AtomicInteger) nVar2.f2917w).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC0399y.g(((InterfaceC0397w) nVar2.f2914n).z());
            nVar = (n) nVar2.f2915u;
            Q7.c cVar = (Q7.c) nVar2.f2916v;
            this.f3563n = nVar;
            this.f3564u = 1;
            obj = cVar.c(this);
        } else if (i == 1) {
            nVar = this.f3563n;
            com.bumptech.glide.f.r(obj);
            this.f3563n = null;
            this.f3564u = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            if (((AtomicInteger) nVar2.f2917w).decrementAndGet() == 0) {
                return q7.v.f40183a;
            }
            AbstractC0399y.g(((InterfaceC0397w) nVar2.f2914n).z());
            nVar = (n) nVar2.f2915u;
            Q7.c cVar2 = (Q7.c) nVar2.f2916v;
            this.f3563n = nVar;
            this.f3564u = 1;
            obj = cVar2.c(this);
        }
    }
}
