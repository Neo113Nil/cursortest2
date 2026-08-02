package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class l9u extends aur implements pyc {
    public /* synthetic */ long j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ aqi o;
    public final /* synthetic */ aqi p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9u(Function0 function0, float f, float f2, Function1 function1, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(3, continuation);
        this.k = function0;
        this.l = f;
        this.m = f2;
        this.n = function1;
        this.o = aqiVar;
        this.p = aqiVar2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((enj) obj2).a;
        aqi aqiVar = this.o;
        aqi aqiVar2 = this.p;
        l9u l9uVar = new l9u(this.k, this.l, this.m, this.n, aqiVar, aqiVar2, (Continuation) obj3);
        l9uVar.j = j;
        return l9uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.k.invoke();
        Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (j >> 32)) - (this.l / 2));
        aqi aqiVar = this.o;
        aqiVar.setValue(valueOf);
        Float valueOf2 = Float.valueOf(yhn.c(((Number) aqiVar.getValue()).floatValue() / this.m, 0.0f, 1.0f));
        aqi aqiVar2 = this.p;
        aqiVar2.setValue(valueOf2);
        this.n.invoke(new Float(((Number) aqiVar2.getValue()).floatValue()));
        return Unit.a;
    }
}
