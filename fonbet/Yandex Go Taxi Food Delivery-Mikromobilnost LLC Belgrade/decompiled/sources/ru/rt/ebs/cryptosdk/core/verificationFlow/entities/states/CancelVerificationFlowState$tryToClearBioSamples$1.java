package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.CancelVerificationFlowState$tryToClearBioSamples$1", f = "CancelVerificationFlowState.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CancelVerificationFlowState$tryToClearBioSamples$1 extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ sls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelVerificationFlowState$tryToClearBioSamples$1(b bVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.b = bVar;
        this.c = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelVerificationFlowState$tryToClearBioSamples$1(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new CancelVerificationFlowState$tryToClearBioSamples$1(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                IEbsController iEbsController = this.b.g;
                this.a = 1;
                if (iEbsController.clearBioSamples(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (Throwable unused) {
        }
        this.c.invoke();
        return zy11.a;
    }
}
