package ru.yandex.taxi.polling;

import defpackage.kbn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$startCollect$2", f = "LocationsFlowRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$startCollect$2 extends SuspendLambda implements wls {
    final /* synthetic */ kbn $config;
    final /* synthetic */ Long $maxCountCoordinates;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationsFlowRepository$startCollect$2(e eVar, kbn kbnVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$config = kbnVar;
        this.$maxCountCoordinates = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationsFlowRepository$startCollect$2 locationsFlowRepository$startCollect$2 = new LocationsFlowRepository$startCollect$2(this.this$0, this.$config, this.$maxCountCoordinates, continuation);
        locationsFlowRepository$startCollect$2.L$0 = obj;
        return locationsFlowRepository$startCollect$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationsFlowRepository$startCollect$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            kbn kbnVar = this.$config;
            Long l = this.$maxCountCoordinates;
            this.L$0 = null;
            this.label = 1;
            if (e.b(eVar, tseVar, kbnVar, l, this) == coroutineSingletons) {
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
