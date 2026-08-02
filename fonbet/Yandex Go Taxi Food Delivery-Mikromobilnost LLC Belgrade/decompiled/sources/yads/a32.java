package yads;

import defpackage.eg41;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.v881;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class a32 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ tpr c;
    public final /* synthetic */ v881 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(tpr tprVar, v881 v881Var, Continuation continuation) {
        super(2, continuation);
        this.c = tprVar;
        this.d = v881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a32(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new a32(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.c;
            eg41 eg41Var = new eg41(15, this.d);
            this.b = 1;
            if (tprVar.collect(eg41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
