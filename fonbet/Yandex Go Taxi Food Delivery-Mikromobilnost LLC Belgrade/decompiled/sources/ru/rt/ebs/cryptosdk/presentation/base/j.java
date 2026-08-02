package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.eci0;
import defpackage.eg41;
import defpackage.ny61;
import defpackage.vc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class j extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ vc5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vc5 vc5Var, Continuation continuation) {
        super(2, continuation);
        this.b = vc5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vc5 vc5Var = this.b;
            eci0 eci0Var = vc5Var.z;
            eg41 eg41Var = new eg41(14, vc5Var);
            this.a = 1;
            if (eci0Var.a.collect(eg41Var, this) == coroutineSingletons) {
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
