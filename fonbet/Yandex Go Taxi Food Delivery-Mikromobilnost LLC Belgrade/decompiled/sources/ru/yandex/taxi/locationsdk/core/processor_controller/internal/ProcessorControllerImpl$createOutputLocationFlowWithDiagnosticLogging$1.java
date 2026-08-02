package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vbz;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvbz;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lvbz;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.processor_controller.internal.ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1", f = "ProcessorControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $strategy;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1(d dVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$strategy = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1 processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1 = new ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1(this.this$0, this.$strategy, continuation);
        processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1.L$0 = obj;
        return processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1 processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1 = (ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1) create((vbz) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return zy11.a;
    }
}
