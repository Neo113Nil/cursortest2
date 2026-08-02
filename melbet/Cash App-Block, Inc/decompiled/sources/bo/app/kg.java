package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class kg extends SuspendLambda implements Function1 {
    public final /* synthetic */ mg a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ v9 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(mg mgVar, y9 y9Var, v9 v9Var, long j, long j2, Continuation continuation) {
        super(1, continuation);
        this.a = mgVar;
        this.b = y9Var;
        this.c = v9Var;
        this.d = j;
        this.e = j2;
    }

    public static final String a(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Performing triggered action after a delay of ", " ms.");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new kg(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((kg) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(this.e, 9), 7, (Object) null);
        y9 y9Var = this.b;
        mg mgVar = this.a;
        y9Var.a(mgVar.a, mgVar.c, this.c, this.d);
        return Unit.INSTANCE;
    }
}
