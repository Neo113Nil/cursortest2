package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class iuq extends aur implements pyc {
    public int j;
    public /* synthetic */ pqm k;
    public /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ float n;
    public final /* synthetic */ aqi o;
    public final /* synthetic */ sdr p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuq(boolean z, float f, aqi aqiVar, sdr sdrVar, Continuation continuation) {
        super(3, continuation);
        this.m = z;
        this.n = f;
        this.o = aqiVar;
        this.p = sdrVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((enj) obj2).a;
        aqi aqiVar = this.o;
        sdr sdrVar = this.p;
        iuq iuqVar = new iuq(this.m, this.n, aqiVar, sdrVar, (Continuation) obj3);
        iuqVar.k = (pqm) obj;
        iuqVar.l = j;
        return iuqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pqm pqmVar = this.k;
        long j = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        aqi aqiVar = this.o;
        try {
            if (i == 0) {
                qgg.h0(obj);
                aqiVar.setValue(new Float((this.m ? this.n - enj.e(j) : enj.e(j)) - ((Number) this.p.getValue()).floatValue()));
                this.k = null;
                this.l = j;
                this.j = 1;
                if (pqmVar.a(this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
        } catch (d6d unused) {
            aqiVar.setValue(new Float(0.0f));
        }
        return Unit.a;
    }
}
