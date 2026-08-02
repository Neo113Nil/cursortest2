package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ug61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements tls {
    public int a;
    public final /* synthetic */ BaseActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseActivity baseActivity, Continuation continuation) {
        super(1, continuation);
        this.b = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new b(this.b, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new b(this.b, (Continuation) obj).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            n4u0 n4u0Var = (n4u0) this.b.getViewModel().x.getValue();
            ug61 ug61Var = new ug61(this.b, 0);
            this.a = 1;
            if (n4u0Var.collect(ug61Var, this) == coroutineSingletons) {
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
