package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.q;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.ScootersOrderSelectorFactory$multiOrderExperiment$1", f = "ScootersOrderSelectorFactory.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOrderSelectorFactory$multiOrderExperiment$1 extends SuspendLambda implements tls {
    final /* synthetic */ q $scootersMultiOrderExperimentRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOrderSelectorFactory$multiOrderExperiment$1(q qVar, Continuation continuation) {
        super(1, continuation);
        this.$scootersMultiOrderExperimentRepository = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersOrderSelectorFactory$multiOrderExperiment$1(this.$scootersMultiOrderExperimentRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersOrderSelectorFactory$multiOrderExperiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        q qVar = this.$scootersMultiOrderExperimentRepository;
        this.label = 1;
        Object b = qVar.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
