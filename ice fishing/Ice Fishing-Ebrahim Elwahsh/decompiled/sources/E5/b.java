package E5;

import E7.p;
import O7.InterfaceC0397w;
import S0.s;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class b extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f825n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f826u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Thread f827v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Throwable f828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Thread thread, Throwable th, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f826u = cVar;
        this.f827v = thread;
        this.f828w = th;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new b(this.f826u, this.f827v, this.f828w, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f825n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            s sVar = this.f826u.f829a;
            this.f825n = 1;
            if (sVar.n(this.f827v, this.f828w, this) == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
        }
        return v.f40183a;
    }
}
