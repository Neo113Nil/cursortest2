package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import defpackage.k171;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class lr2 extends SuspendLambda implements wls {
    public final /* synthetic */ k171 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr2(k171 k171Var, Continuation continuation) {
        super(2, continuation);
        this.b = k171Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lr2(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        lr2 lr2Var = new lr2(this.b, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lr2Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        new CallbackStackTraceMarker(new bp3(this.b));
        return zy11.a;
    }
}
