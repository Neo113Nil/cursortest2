package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.hvo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfvo0;", "<anonymous>", "()Lfvo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1", f = "ScootersDetailedOrderActionListFactory.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1 extends SuspendLambda implements tls {
    final /* synthetic */ hvo0 $scootersShareLocationOnRideExperimentRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1(hvo0 hvo0Var, Continuation continuation) {
        super(1, continuation);
        this.$scootersShareLocationOnRideExperimentRepository = hvo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1(this.$scootersShareLocationOnRideExperimentRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        hvo0 hvo0Var = this.$scootersShareLocationOnRideExperimentRepository;
        this.label = 1;
        Object b = hvo0Var.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
