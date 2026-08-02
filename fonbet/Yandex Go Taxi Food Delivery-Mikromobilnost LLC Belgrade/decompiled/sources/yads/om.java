package yads;

import android.content.Context;
import defpackage.c271;
import defpackage.dj81;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class om extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ dj81 c;
    public final /* synthetic */ yo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(dj81 dj81Var, yo yoVar, Continuation continuation) {
        super(2, continuation);
        this.c = dj81Var;
        this.d = yoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new om(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new om(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
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
        dj81 dj81Var = this.c;
        c271 c271Var = dj81Var.C;
        Context context = dj81Var.a;
        yo yoVar = this.d;
        this.b = 1;
        Object a = c271Var.a(context, yoVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
