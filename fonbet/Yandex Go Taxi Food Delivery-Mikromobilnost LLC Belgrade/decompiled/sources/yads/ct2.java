package yads;

import defpackage.fh71;
import defpackage.gg81;
import defpackage.ny61;
import defpackage.vw71;
import defpackage.vz71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ct2 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ fh71 c;
    public final /* synthetic */ vz71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(fh71 fh71Var, vz71 vz71Var, Continuation continuation) {
        super(2, continuation);
        this.c = fh71Var;
        this.d = vz71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ct2(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new ct2(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            fh71 fh71Var = this.c;
            gg81 gg81Var = ((vw71) this.d).a;
            this.b = 1;
            if (fh71.a(fh71Var, gg81Var, this) == coroutineSingletons) {
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
