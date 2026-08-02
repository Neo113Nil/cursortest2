package yads;

import defpackage.eq81;
import defpackage.fh71;
import defpackage.ny61;
import defpackage.vv81;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class xs2 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ fh71 c;
    public final /* synthetic */ vv81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(fh71 fh71Var, vv81 vv81Var, Continuation continuation) {
        super(2, continuation);
        this.c = fh71Var;
        this.d = vv81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xs2(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new xs2(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                b.b(obj);
                fh71 fh71Var = this.c;
                s41 s41Var = s41.c;
                this.b = 1;
                obj = fh71Var.c(s41Var, this);
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
            this.d.c.b((eq81) obj);
            vv81.y.remove(this.c);
            return zy11.a;
        } catch (Throwable th) {
            vv81.y.remove(this.c);
            throw th;
        }
    }
}
