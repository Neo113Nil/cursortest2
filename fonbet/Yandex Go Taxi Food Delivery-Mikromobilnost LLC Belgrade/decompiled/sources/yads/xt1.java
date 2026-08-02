package yads;

import android.content.Context;
import android.os.Build;
import defpackage.bm71;
import defpackage.m771;
import defpackage.mj71;
import defpackage.n291;
import defpackage.wfa1;
import defpackage.wls;
import defpackage.yc71;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class xt1 extends SuspendLambda implements wls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ n291 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(Context context, n291 n291Var, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = n291Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xt1(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        xt1 xt1Var = new xt1(this.b, this.c, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        xt1Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        Context context = this.b;
        Context context2 = this.c.a;
        bm71.a(context, wfa1.b(context2, new m771(context2)));
        Context context3 = this.b;
        Context context4 = this.c.a;
        yc71.a(context3, wfa1.b(context4, new m771(context4)));
        if (Build.VERSION.SDK_INT >= 30) {
            AtomicBoolean atomicBoolean = mj71.a;
            Context context5 = this.b;
            Context context6 = this.c.a;
            mj71.a(context5, wfa1.b(context6, new m771(context6)));
        }
        return zy11.a;
    }
}
