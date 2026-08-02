package yads;

import defpackage.gi81;
import defpackage.is71;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class kc extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ is71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(is71 is71Var, Continuation continuation) {
        super(2, continuation);
        this.c = is71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kc(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new kc(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        gi81 gi81Var = this.c.a;
        this.b = 1;
        Object k0 = tje.k0(gi81Var.a, new tc(gi81Var, null), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
