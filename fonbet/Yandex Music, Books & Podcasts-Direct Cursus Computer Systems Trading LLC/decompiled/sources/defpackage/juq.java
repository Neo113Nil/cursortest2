package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class juq extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ float m;
    public final /* synthetic */ aqi n;
    public final /* synthetic */ sdr o;
    public final /* synthetic */ mm6 p;
    public final /* synthetic */ cpa q;
    public final /* synthetic */ aqi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juq(boolean z, float f, aqi aqiVar, sdr sdrVar, mm6 mm6Var, cpa cpaVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.l = z;
        this.m = f;
        this.n = aqiVar;
        this.o = sdrVar;
        this.p = mm6Var;
        this.q = cpaVar;
        this.r = aqiVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        juq juqVar = new juq(this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
        juqVar.k = obj;
        return juqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((juq) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pfm pfmVar = (pfm) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            iuq iuqVar = new iuq(this.l, this.m, this.n, this.o, null);
            p3e p3eVar = new p3e(27, this.p, this.q, this.r);
            this.k = null;
            this.j = 1;
            if (g6s.e(pfmVar, null, iuqVar, p3eVar, this, 3) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
