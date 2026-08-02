package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vzv;
import defpackage.wls;
import defpackage.wzv;
import defpackage.xrr;
import defpackage.z5u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.model.GroupType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz5u0;", "stateUpdate", "Lzy11;", "<anonymous>", "(Lz5u0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.ProcessorImpl$startProcessing$2", f = "ProcessorImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ProcessorImpl$startProcessing$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorImpl$startProcessing$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProcessorImpl$startProcessing$2 processorImpl$startProcessing$2 = new ProcessorImpl$startProcessing$2(this.this$0, continuation);
        processorImpl$startProcessing$2.L$0 = obj;
        return processorImpl$startProcessing$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProcessorImpl$startProcessing$2) create((z5u0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z5u0 z5u0Var = (z5u0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xrr xrrVar = this.this$0.f;
        wzv wzvVar = z5u0Var.b;
        boolean z = (wzvVar instanceof vzv) && ((vzv) wzvVar).a.b == GroupType.Primary;
        this.L$0 = null;
        this.label = 1;
        if (xrrVar.b) {
            ((r0) xrrVar.A).emit(Boolean.valueOf(z), this);
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
