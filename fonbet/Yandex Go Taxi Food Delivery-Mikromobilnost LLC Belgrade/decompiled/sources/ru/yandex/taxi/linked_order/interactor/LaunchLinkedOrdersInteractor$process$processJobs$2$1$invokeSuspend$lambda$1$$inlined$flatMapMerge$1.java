package ru.yandex.taxi.linked_order.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sny;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1", f = "LaunchLinkedOrdersInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1 launchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1 = new LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1(continuation, this.this$0);
        launchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1.L$0 = obj;
        return launchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchLinkedOrdersInteractor$process$processJobs$2$1$invokeSuspend$lambda$1$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        eVar.getClass();
        return new rol0(new LaunchLinkedOrdersInteractor$loadAndPollActive$1(eVar, (sny) obj2, null));
    }
}
