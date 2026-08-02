package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1", f = "BaseVerificationFlow.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1 extends SuspendLambda implements tls {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.a = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1(this.a, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1 baseVerificationFlow$scheduleInitialProcessingStateUpdating$1 = new BaseVerificationFlow$scheduleInitialProcessingStateUpdating$1(this.a, (Continuation) obj);
        zy11 zy11Var = zy11.a;
        baseVerificationFlow$scheduleInitialProcessingStateUpdating$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        a aVar = this.a;
        aVar.getClass();
        GlobalProcessingState globalProcessingState = GlobalProcessingState.ADDITIONAL;
        BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1 baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1 = new BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1(aVar, null);
        pzt0 pzt0Var = aVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        sjh sjhVar = uyj.a;
        aVar.g = tje.N(bvf0.a(o400.a), null, null, new BaseVerificationFlow$scheduleProcessingStateUpdating$1(aVar, globalProcessingState, baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1, null), 3);
        return zy11.a;
    }
}
