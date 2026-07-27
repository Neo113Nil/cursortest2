package S7;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class w extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3027n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3028u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ R7.c f3029v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(R7.c cVar, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3029v = cVar;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        w wVar = new w(this.f3029v, interfaceC5133d);
        wVar.f3028u = obj;
        return wVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create(obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3027n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            Object obj2 = this.f3028u;
            this.f3027n = 1;
            if (this.f3029v.a(obj2, this) == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
        }
        return q7.v.f40183a;
    }
}
