package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import defpackage.ebo;
import defpackage.hnr0;
import defpackage.ny61;
import defpackage.u271;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ ebo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ebo eboVar, Continuation continuation) {
        super(2, continuation);
        this.b = eboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            hnr0 actions = this.b.E.getCurrentFlow().getActions();
            if (actions == null) {
                return zy11.a;
            }
            u271 u271Var = new u271(this.b);
            this.a = 1;
            if (actions.collect(u271Var, this) == coroutineSingletons) {
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
