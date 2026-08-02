package yads;

import defpackage.ak61;
import defpackage.ny61;
import defpackage.uy71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class yx1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ ak61 c;
    public final /* synthetic */ uy71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx1(ak61 ak61Var, uy71 uy71Var, Continuation continuation) {
        super(2, continuation);
        this.c = ak61Var;
        this.d = uy71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yx1(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new yx1(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
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
        ak61 ak61Var = this.c;
        uy71 uy71Var = this.d;
        this.b = 1;
        Object b = ak61.b(ak61Var, uy71Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
