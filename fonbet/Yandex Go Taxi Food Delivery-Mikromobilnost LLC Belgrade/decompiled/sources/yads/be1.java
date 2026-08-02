package yads;

import defpackage.cf81;
import defpackage.l071;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class be1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ l071 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(l071 l071Var, Continuation continuation) {
        super(2, continuation);
        this.c = l071Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new be1(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new be1(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
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
        cf81 cf81Var = this.c.b;
        this.b = 1;
        Object a = cf81Var.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
