package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqm0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsqm0;", "current", "Lzy11;", "<anonymous>", "(Lsqm0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersCurrentActiveOrdersInteractor$makePolling$2", f = "ScootersCurrentActiveOrdersInteractor.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCurrentActiveOrdersInteractor$makePolling$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentActiveOrdersInteractor$makePolling$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCurrentActiveOrdersInteractor$makePolling$2 scootersCurrentActiveOrdersInteractor$makePolling$2 = new ScootersCurrentActiveOrdersInteractor$makePolling$2(this.this$0, continuation);
        scootersCurrentActiveOrdersInteractor$makePolling$2.L$0 = obj;
        return scootersCurrentActiveOrdersInteractor$makePolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCurrentActiveOrdersInteractor$makePolling$2) create((sqm0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sqm0 sqm0Var = (sqm0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            if (e.a(eVar, sqm0Var, this) == coroutineSingletons) {
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
