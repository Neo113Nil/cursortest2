package S7;

import D.H;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class e extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f2987n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2988u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f2989v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(H h9, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f2989v = h9;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        e eVar = new e(this.f2989v, interfaceC5133d);
        eVar.f2988u = obj;
        return eVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((Q7.p) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f2987n;
        q7.v vVar = q7.v.f40183a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return vVar;
        }
        com.bumptech.glide.f.r(obj);
        Q7.p pVar = (Q7.p) this.f2988u;
        this.f2987n = 1;
        H h9 = this.f2989v;
        h9.getClass();
        Object p6 = h9.p(new u(pVar), this);
        if (p6 != enumC5179a) {
            p6 = vVar;
        }
        return p6 == enumC5179a ? enumC5179a : vVar;
    }
}
