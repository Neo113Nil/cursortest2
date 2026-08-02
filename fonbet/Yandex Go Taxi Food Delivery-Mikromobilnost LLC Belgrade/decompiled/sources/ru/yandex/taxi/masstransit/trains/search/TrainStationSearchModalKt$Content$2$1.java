package ru.yandex.taxi.masstransit.trains.search;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.search.TrainStationSearchModalKt$Content$2$1", f = "TrainStationSearchModal.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainStationSearchModalKt$Content$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $destinationFocusRequester;
    final /* synthetic */ tpr $sideEffectFlow;
    final /* synthetic */ yur $sourceFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationSearchModalKt$Content$2$1(tpr tprVar, yur yurVar, yur yurVar2, Continuation continuation) {
        super(2, continuation);
        this.$sideEffectFlow = tprVar;
        this.$sourceFocusRequester = yurVar;
        this.$destinationFocusRequester = yurVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainStationSearchModalKt$Content$2$1(this.$sideEffectFlow, this.$sourceFocusRequester, this.$destinationFocusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrainStationSearchModalKt$Content$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$sideEffectFlow;
            p9g0 p9g0Var = new p9g0(27, this.$sourceFocusRequester, this.$destinationFocusRequester);
            this.label = 1;
            if (tprVar.collect(p9g0Var, this) == coroutineSingletons) {
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
