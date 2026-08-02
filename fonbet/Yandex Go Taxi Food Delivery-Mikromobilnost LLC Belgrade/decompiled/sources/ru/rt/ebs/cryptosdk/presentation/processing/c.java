package ru.rt.ebs.cryptosdk.presentation.processing;

import defpackage.eg41;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.p6f0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ p6f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p6f0 p6f0Var, Continuation continuation) {
        super(2, continuation);
        this.b = p6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r7.startProcessingStateUpdatingIfNotStarted(r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            IFlow currentFlow = this.b.E.getCurrentFlow();
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ny61.A();
                return null;
            }
            b.b(obj);
        }
        n4u0 processingState = this.b.E.getCurrentFlow().getProcessingState();
        if (processingState == null) {
            return zy11.a;
        }
        eg41 eg41Var = new eg41(11, this.b);
        this.a = 2;
    }
}
