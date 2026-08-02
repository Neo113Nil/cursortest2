package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Strategy", "Lkotlin/Pair;", "Lwbz;", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.processor_controller.internal.ProcessorControllerImpl$createOutputLocationFlow$1", f = "ProcessorControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ProcessorControllerImpl$createOutputLocationFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorControllerImpl$createOutputLocationFlow$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProcessorControllerImpl$createOutputLocationFlow$1 processorControllerImpl$createOutputLocationFlow$1 = new ProcessorControllerImpl$createOutputLocationFlow$1(continuation, this.this$0);
        processorControllerImpl$createOutputLocationFlow$1.L$0 = obj;
        return processorControllerImpl$createOutputLocationFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProcessorControllerImpl$createOutputLocationFlow$1 processorControllerImpl$createOutputLocationFlow$1 = (ProcessorControllerImpl$createOutputLocationFlow$1) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        processorControllerImpl$createOutputLocationFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.i = pair;
        fyc fycVar = this.this$0.j;
        zy11 zy11Var = zy11.a;
        fycVar.T(zy11Var);
        return zy11Var;
    }
}
