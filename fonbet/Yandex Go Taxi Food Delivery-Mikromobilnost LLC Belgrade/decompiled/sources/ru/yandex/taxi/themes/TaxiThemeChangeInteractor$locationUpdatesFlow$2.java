package ru.yandex.taxi.themes;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pay0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzzs;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.themes.TaxiThemeChangeInteractor$locationUpdatesFlow$2", f = "TaxiThemeChangeInteractor.kt", l = {190}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiThemeChangeInteractor$locationUpdatesFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeChangeInteractor$locationUpdatesFlow$2(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiThemeChangeInteractor$locationUpdatesFlow$2 taxiThemeChangeInteractor$locationUpdatesFlow$2 = new TaxiThemeChangeInteractor$locationUpdatesFlow$2(continuation, this.this$0);
        taxiThemeChangeInteractor$locationUpdatesFlow$2.L$0 = obj;
        return taxiThemeChangeInteractor$locationUpdatesFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiThemeChangeInteractor$locationUpdatesFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pay0 pay0Var = this.this$0.c;
            double floatValue = ((Number) pay0Var.b.getValue(pay0Var, pay0.e[1])).floatValue();
            pay0 pay0Var2 = this.this$0.c;
            zzs zzsVar = new zzs(floatValue, ((Number) pay0Var2.c.getValue(pay0Var2, r6[2])).floatValue(), 0, null, null, 28);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(zzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
