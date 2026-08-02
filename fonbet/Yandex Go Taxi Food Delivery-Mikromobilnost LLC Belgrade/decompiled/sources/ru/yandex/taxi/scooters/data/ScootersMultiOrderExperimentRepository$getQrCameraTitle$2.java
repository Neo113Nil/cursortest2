package ru.yandex.taxi.scooters.data;

import defpackage.f9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/common_models/net/FormattedText;", "Lru/yandex/taxi/scooters/experiments/ScootersMultiOrderExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersMultiOrderExperimentRepository$getQrCameraTitle$2", f = "ScootersMultiOrderExperimentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersMultiOrderExperimentRepository$getQrCameraTitle$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersMultiOrderExperimentRepository$getQrCameraTitle$2 scootersMultiOrderExperimentRepository$getQrCameraTitle$2 = new ScootersMultiOrderExperimentRepository$getQrCameraTitle$2(2, continuation);
        scootersMultiOrderExperimentRepository$getQrCameraTitle$2.L$0 = obj;
        return scootersMultiOrderExperimentRepository$getQrCameraTitle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMultiOrderExperimentRepository$getQrCameraTitle$2) create((ScootersMultiOrderExperiment) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersMultiOrderExperiment scootersMultiOrderExperiment = (ScootersMultiOrderExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return f9s.e(scootersMultiOrderExperiment.e.a, scootersMultiOrderExperiment);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
