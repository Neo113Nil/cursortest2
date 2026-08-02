package yads;

import android.content.Context;
import defpackage.ei71;
import defpackage.f971;
import defpackage.ny61;
import defpackage.tg81;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class h32 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ ei71 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ tg81 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(ei71 ei71Var, Context context, tg81 tg81Var, Continuation continuation) {
        super(2, continuation);
        this.c = ei71Var;
        this.d = context;
        this.e = tg81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h32(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((h32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            f971 f971Var = this.c.b;
            Context context = this.d;
            tg81 tg81Var = this.e;
            this.b = 1;
            if (f971Var.a(context, tg81Var, this) == coroutineSingletons) {
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
