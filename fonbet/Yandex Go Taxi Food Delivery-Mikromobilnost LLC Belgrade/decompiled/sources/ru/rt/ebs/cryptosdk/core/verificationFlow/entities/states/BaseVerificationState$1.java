package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.hnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.BaseVerificationState$1", f = "BaseVerificationState.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseVerificationState$1 extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ IVerificationFlow b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationState$1(IVerificationFlow iVerificationFlow, a aVar, Continuation continuation) {
        super(2, continuation);
        this.b = iVerificationFlow;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseVerificationState$1(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new BaseVerificationState$1(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            hnr0 actions = this.b.getActions();
            if (actions == null) {
                return zy11.a;
            }
            xw4 xw4Var = new xw4(5, this.c);
            this.a = 1;
            if (actions.collect(xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
