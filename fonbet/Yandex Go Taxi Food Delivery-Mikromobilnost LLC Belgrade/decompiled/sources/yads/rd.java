package yads;

import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.p881;
import defpackage.vb81;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes7.dex */
public final class rd extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ vb81 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(vb81 vb81Var, long j, Continuation continuation) {
        super(2, continuation);
        this.c = vb81Var;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new rd(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new rd(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            fyc b = gwk0.b();
            this.c.b.post(new p881(0, b));
            long j = this.d;
            qd qdVar = new qd(b, null);
            this.b = 1;
            obj = a.w(j, qdVar, this);
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
        return Boolean.valueOf(obj != null);
    }
}
