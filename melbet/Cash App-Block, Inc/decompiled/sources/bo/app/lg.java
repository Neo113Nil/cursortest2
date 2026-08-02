package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class lg extends SuspendLambda implements Function1 {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ mg b;
    public final /* synthetic */ v9 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(y9 y9Var, mg mgVar, v9 v9Var, long j, Continuation continuation) {
        super(1, continuation);
        this.a = y9Var;
        this.b = mgVar;
        this.c = v9Var;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new lg(this.a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lg) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        y9 y9Var = this.a;
        mg mgVar = this.b;
        y9Var.a(mgVar.a, mgVar.c, this.c, this.d);
        return Unit.INSTANCE;
    }
}
