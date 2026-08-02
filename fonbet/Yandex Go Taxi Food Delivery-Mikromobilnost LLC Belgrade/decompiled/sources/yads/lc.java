package yads;

import defpackage.is71;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.vo81;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class lc extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ is71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(is71 is71Var, Continuation continuation) {
        super(2, continuation);
        this.c = is71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lc(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new lc(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            qoh qohVar = this.c.c;
            this.b = 1;
            obj = qohVar.s(this);
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
        vo81 vo81Var = obj instanceof vo81 ? (vo81) obj : null;
        if (vo81Var != null) {
            return vo81Var.a;
        }
        return null;
    }
}
