package yads;

import android.content.Context;
import defpackage.d881;
import defpackage.ny61;
import defpackage.tg81;
import defpackage.tk81;
import defpackage.tse;
import defpackage.wls;
import defpackage.z081;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class t42 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ tk81 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ d881 e;
    public final /* synthetic */ tg81 f;
    public final /* synthetic */ z081 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t42(tk81 tk81Var, Context context, d881 d881Var, tg81 tg81Var, z081 z081Var, Continuation continuation) {
        super(2, continuation);
        this.c = tk81Var;
        this.d = context;
        this.e = d881Var;
        this.f = tg81Var;
        this.g = z081Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t42(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((t42) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            tk81 tk81Var = this.c;
            Context context = this.d;
            d881 d881Var = this.e;
            tg81 tg81Var = this.f;
            z081 z081Var = this.g;
            this.b = 1;
            if (tk81Var.a(context, d881Var, tg81Var, z081Var, this) == coroutineSingletons) {
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
