package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.di9;
import defpackage.n271;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements tls {
    public int a;
    public final /* synthetic */ BaseFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BaseFragment baseFragment, Continuation continuation) {
        super(1, continuation);
        this.b = baseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new h(this.b, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new h(this.b, (Continuation) obj).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            di9 di9Var = this.b.getViewModel().B;
            n271 n271Var = new n271(this.b, i2);
            this.a = 1;
            if (di9Var.collect(n271Var, this) == coroutineSingletons) {
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
