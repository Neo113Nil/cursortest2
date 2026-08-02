package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import defpackage.ebo;
import defpackage.eg41;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ ebo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ebo eboVar, Continuation continuation) {
        super(2, continuation);
        this.b = eboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            n4u0 processingState = this.b.E.getCurrentFlow().getProcessingState();
            if (processingState == null) {
                return zy11.a;
            }
            eg41 eg41Var = new eg41(10, this.b);
            this.a = 1;
            if (processingState.collect(eg41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
