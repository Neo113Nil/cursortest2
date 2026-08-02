package yads;

import android.content.Context;
import defpackage.ei71;
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
public final class g32 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ ei71 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ tg81 e;
    public final /* synthetic */ z081 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g32(ei71 ei71Var, Context context, tg81 tg81Var, z081 z081Var, Continuation continuation) {
        super(2, continuation);
        this.c = ei71Var;
        this.d = context;
        this.e = tg81Var;
        this.f = z081Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g32(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((g32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tk81 tk81Var = this.c.c;
        Context context = this.d;
        tg81 tg81Var = this.e;
        z081 z081Var = this.f;
        this.b = 1;
        Object b = tk81Var.b(true, context, tg81Var, z081Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
