package yads;

import defpackage.aw81;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ud71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class vu0 extends SuspendLambda implements wls {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aw81 d;
    public final /* synthetic */ ud71 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(aw81 aw81Var, ud71 ud71Var, Continuation continuation) {
        super(2, continuation);
        this.d = aw81Var;
        this.e = ud71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        vu0 vu0Var = new vu0(this.d, this.e, continuation);
        vu0Var.c = obj;
        return vu0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((vu0) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                b.b(obj);
                aw81 aw81Var = this.d;
                ud71 ud71Var = this.e;
                this.b = 1;
                obj = aw81Var.a(ud71Var, this);
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
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            failure = bool;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
