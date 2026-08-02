package ru.yandex.taxi.themes;

import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pay0;
import defpackage.rme0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzzs;", "it", "Lzy11;", "<anonymous>", "(Lzzs;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.themes.TaxiThemeChangeInteractor$autoThemeFlow$1", f = "TaxiThemeChangeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiThemeChangeInteractor$autoThemeFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeChangeInteractor$autoThemeFlow$1(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiThemeChangeInteractor$autoThemeFlow$1 taxiThemeChangeInteractor$autoThemeFlow$1 = new TaxiThemeChangeInteractor$autoThemeFlow$1(continuation, this.this$0);
        taxiThemeChangeInteractor$autoThemeFlow$1.L$0 = obj;
        return taxiThemeChangeInteractor$autoThemeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiThemeChangeInteractor$autoThemeFlow$1 taxiThemeChangeInteractor$autoThemeFlow$1 = (TaxiThemeChangeInteractor$autoThemeFlow$1) create((zzs) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiThemeChangeInteractor$autoThemeFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar = (zzs) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pay0 pay0Var = this.this$0.c;
        float f = (float) zzsVar.a;
        rme0 rme0Var = pay0Var.b;
        kgx[] kgxVarArr = pay0.e;
        rme0Var.setValue(pay0Var, kgxVarArr[1], Float.valueOf(f));
        pay0 pay0Var2 = this.this$0.c;
        pay0Var2.c.setValue(pay0Var2, kgxVarArr[2], Float.valueOf((float) zzsVar.b));
        return zy11.a;
    }
}
