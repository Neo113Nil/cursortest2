package yads;

import defpackage.ay71;
import defpackage.ny61;
import defpackage.q971;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.a;

/* loaded from: classes7.dex */
public final class ca1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ q971 c;
    public final /* synthetic */ ay71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(q971 q971Var, ay71 ay71Var, Continuation continuation) {
        super(2, continuation);
        this.c = q971Var;
        this.d = ay71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ca1(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new ca1(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = this.c.o;
            ay71 ay71Var = this.d;
            this.b = 1;
            if (aVar.o(ay71Var, this) == coroutineSingletons) {
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
