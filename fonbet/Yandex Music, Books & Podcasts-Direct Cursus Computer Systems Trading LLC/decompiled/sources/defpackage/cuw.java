package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class cuw extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ float k;
    public final /* synthetic */ fuw l;
    public final /* synthetic */ long m;
    public final /* synthetic */ b9r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuw(float f, fuw fuwVar, long j, b9r b9rVar, Continuation continuation) {
        super(2, continuation);
        this.k = f;
        this.l = fuwVar;
        this.m = j;
        this.n = b9rVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        cuw cuwVar = new cuw(this.k, this.l, this.m, this.n, continuation);
        cuwVar.j = obj;
        return cuwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cuw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var = (mm6) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        fuw fuwVar = this.l;
        float c = yhn.c(this.k, 1.0f, fuwVar.a);
        long b = fuw.b(this.l, c, this.m, 0L);
        ynn a = fuw.a(fuwVar, c);
        float c2 = yhn.c(enj.e(b), a.a, a.c);
        fuw fuwVar2 = this.l;
        b9r b9rVar = this.n;
        x97.y(mm6Var, null, null, new buw(fuwVar2, c2, b9rVar, a, null, 0), 3);
        x97.y(mm6Var, null, null, new buw(this.l, yhn.c(enj.f(b), a.b, a.d), b9rVar, a, null, 1), 3);
        return x97.y(mm6Var, null, null, new zp5(fuwVar, c, b9rVar, null, 5), 3);
    }
}
