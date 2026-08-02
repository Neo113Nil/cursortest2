package ru.rt.ebs.cryptosdk.presentation.error.verification;

import defpackage.e831;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ e831 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e831 e831Var, Continuation continuation) {
        super(2, continuation);
        this.b = e831Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            IFlow currentFlow = this.b.E.getCurrentFlow();
            this.a = 1;
            if (currentFlow.cancelProcessingStateUpdating(this) == coroutineSingletons) {
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
