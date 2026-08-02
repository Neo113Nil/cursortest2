package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ukn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/yandex/taxi/scooters/experiments/g0;", "<anonymous>", "()Lru/yandex/taxi/scooters/experiments/g0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory$scootersExperiment$1", f = "ScootersDetailedOrderActionListFactory.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$scootersExperiment$1 extends SuspendLambda implements tls {
    final /* synthetic */ ukn0 $scootersExperimentProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$scootersExperiment$1(ukn0 ukn0Var, Continuation continuation) {
        super(1, continuation);
        this.$scootersExperimentProvider = ukn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersDetailedOrderActionListFactory$scootersExperiment$1(this.$scootersExperimentProvider, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersDetailedOrderActionListFactory$scootersExperiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ukn0 ukn0Var = this.$scootersExperimentProvider;
        this.label = 1;
        Object b = ukn0Var.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
