package yads;

import defpackage.ep61;
import defpackage.gi81;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class pc extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ gi81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(gi81 gi81Var, Continuation continuation) {
        super(2, continuation);
        this.c = gi81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pc(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new pc(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
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
        ep61 ep61Var = this.c.e;
        this.b = 1;
        Object a = ep61Var.a(1000L, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
