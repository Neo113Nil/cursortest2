package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qub extends aur implements ryc {
    public /* synthetic */ cvf j;
    public /* synthetic */ cvf k;
    public final /* synthetic */ aqi l;
    public final /* synthetic */ aqi m;
    public final /* synthetic */ aqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qub(aqi aqiVar, aqi aqiVar2, aqi aqiVar3, Continuation continuation) {
        super(4, continuation);
        this.l = aqiVar;
        this.m = aqiVar2;
        this.n = aqiVar3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        aqi aqiVar = this.m;
        aqi aqiVar2 = this.n;
        qub qubVar = new qub(this.l, aqiVar, aqiVar2, (Continuation) obj4);
        qubVar.j = (cvf) obj2;
        qubVar.k = (cvf) obj3;
        return qubVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        cvf cvfVar = this.j;
        cvf cvfVar2 = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        sj2.j(this.l, this.m, this.n, cvfVar.a, cvfVar2.a);
        return Unit.a;
    }
}
