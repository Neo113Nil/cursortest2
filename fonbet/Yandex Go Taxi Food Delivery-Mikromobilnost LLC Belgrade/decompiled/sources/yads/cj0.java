package yads;

import defpackage.e471;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class cj0 extends SuspendLambda implements wls {
    public final /* synthetic */ e471 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(e471 e471Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = e471Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new cj0(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        cj0 cj0Var = new cj0(this.b, this.c, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cj0Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        e471 e471Var = this.b;
        String str = this.c;
        AtomicBoolean atomicBoolean = e471.e;
        e471Var.d.a(2000, str);
        return zy11.a;
    }
}
