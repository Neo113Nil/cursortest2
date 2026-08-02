package ru.yandex.taxi.layers.experiments;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/layers/experiments/ScreenModeMapProvidersExperiment;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperimentProvider$experiment$1", f = "ScreenModeMapProvidersExperimentProvider.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ScreenModeMapProvidersExperimentProvider$experiment$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenModeMapProvidersExperimentProvider$experiment$1(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScreenModeMapProvidersExperimentProvider$experiment$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScreenModeMapProvidersExperimentProvider$experiment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        t1b0 t1b0Var = this.this$0.a;
        this.label = 1;
        Object b = t1b0Var.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
