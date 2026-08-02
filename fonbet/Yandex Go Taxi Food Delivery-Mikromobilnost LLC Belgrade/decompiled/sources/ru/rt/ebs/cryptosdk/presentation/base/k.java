package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.ny61;
import defpackage.vc5;
import defpackage.wls;
import defpackage.xs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.a;

/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ vc5 b;
    public final /* synthetic */ xs11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vc5 vc5Var, xs11 xs11Var, Continuation continuation) {
        super(2, continuation);
        this.b = vc5Var;
        this.c = xs11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.b.A;
            xs11 xs11Var = this.c;
            this.a = 1;
            if (aVar.o(xs11Var, this) == coroutineSingletons) {
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
