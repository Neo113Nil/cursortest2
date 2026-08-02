package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class auw extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fuw k;
    public final /* synthetic */ float l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auw(fuw fuwVar, float f, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.k = fuwVar;
        this.l = f;
        this.m = j;
        this.n = j2;
        this.o = j3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        auw auwVar = new auw(this.k, this.l, this.m, this.n, this.o, continuation);
        auwVar.j = obj;
        return auwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((auw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var = (mm6) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        String j = enj.j(this.n);
        long j2 = this.m;
        String j3 = enj.j(j2);
        StringBuilder sb = new StringBuilder("applyGesture: pan - ");
        sb.append(j);
        sb.append(", zoom - ");
        float f = this.l;
        sb.append(f);
        sb.append(", position - ");
        Continuation continuation = null;
        v3w.m(sb, j3, 3, null, null);
        fuw fuwVar = this.k;
        float c = yhn.c(fuwVar.c() * f, 0.9f, fuwVar.a);
        x97.y(mm6Var, null, null, new c90(fuwVar, c, null, 6), 3);
        ynn a = fuw.a(fuwVar, c);
        fuwVar.e.h(new Float(a.a), new Float(a.c));
        fuwVar.f.h(new Float(a.b), new Float(a.d));
        if (f == 1.0f) {
            long b = fuw.b(this.k, c, this.m, this.n);
            x97.y(mm6Var, null, null, new ztw(fuwVar, b, continuation, 0), 3);
            x97.y(mm6Var, null, null, new ztw(fuwVar, b, continuation, 1), 3);
        }
        x8a x8aVar = fuwVar.k;
        if (f == 1.0f) {
            x8aVar.a(this.o, j2);
        } else {
            x8aVar.f();
        }
        return Unit.a;
    }
}
