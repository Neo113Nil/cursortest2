package yads;

import defpackage.dj71;
import defpackage.gi81;
import defpackage.kl81;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vo81;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class tc extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ gi81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(gi81 gi81Var, Continuation continuation) {
        super(2, continuation);
        this.c = gi81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tc(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new tc(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            gi81 gi81Var = this.c;
            this.b = 1;
            obj = tje.k0(gi81Var.a, new sc(gi81Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        dj71 dj71Var = (dj71) obj;
        return (dj71Var.a == null && dj71Var.b == null) ? kl81.a : new vo81(dj71Var);
    }
}
