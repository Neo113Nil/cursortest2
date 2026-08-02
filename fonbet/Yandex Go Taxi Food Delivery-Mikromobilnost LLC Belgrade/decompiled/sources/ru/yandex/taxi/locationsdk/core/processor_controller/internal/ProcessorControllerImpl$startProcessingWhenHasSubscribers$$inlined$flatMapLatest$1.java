package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import defpackage.euh;
import defpackage.j10;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wbz;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.processor_controller.internal.ProcessorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1", f = "ProcessorControllerImpl.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class ProcessorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ wbz $processor$inlined;
    final /* synthetic */ Object $strategy$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1(Continuation continuation, d dVar, Object obj, wbz wbzVar) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$strategy$inlined = obj;
        this.$processor$inlined = wbzVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProcessorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1 processorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1 = new ProcessorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$strategy$inlined, this.$processor$inlined);
        processorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        processorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1.L$1 = obj2;
        return processorControllerImpl$startProcessingWhenHasSubscribers$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                d dVar = this.this$0;
                Object obj2 = this.$strategy$inlined;
                wbz wbzVar = this.$processor$inlined;
                dVar.getClass();
                tprVar = ru.yandex.taxi.locationsdk.core.utils.a.a(new j10(new euh(new jqr(wbzVar.b(), new ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$1(dVar, obj2, null), 3), 1), dVar, obj2, 4), dVar.g, "ProcessorControllerImpl/processorFlow");
            } else {
                tprVar = pvn.a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
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
