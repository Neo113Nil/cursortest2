package ru.yandex.taxi.experiments;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.ExperimentProviderKt$fullExperimentFlow$1", f = "ExperimentProvider.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ExperimentProviderKt$fullExperimentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ qqo $this_fullExperimentFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentProviderKt$fullExperimentFlow$1(qqo qqoVar, Continuation continuation) {
        super(2, continuation);
        this.$this_fullExperimentFlow = qqoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExperimentProviderKt$fullExperimentFlow$1 experimentProviderKt$fullExperimentFlow$1 = new ExperimentProviderKt$fullExperimentFlow$1(this.$this_fullExperimentFlow, continuation);
        experimentProviderKt$fullExperimentFlow$1.L$0 = obj;
        return experimentProviderKt$fullExperimentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentProviderKt$fullExperimentFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object b = this.$this_fullExperimentFlow.b();
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(b, this) == coroutineSingletons) {
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
