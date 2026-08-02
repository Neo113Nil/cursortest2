package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.n271;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements tls {
    public int a;
    public final /* synthetic */ BaseFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BaseFragment baseFragment, Continuation continuation) {
        super(1, continuation);
        this.b = baseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new f(this.b, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new f(this.b, (Continuation) obj).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            n4u0 n4u0Var = (n4u0) this.b.getViewModel().x.getValue();
            n271 n271Var = new n271(this.b, 0);
            this.a = 1;
            if (n4u0Var.collect(n271Var, this) == coroutineSingletons) {
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
