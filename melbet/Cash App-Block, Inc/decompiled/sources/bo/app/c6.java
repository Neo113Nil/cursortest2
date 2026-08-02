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
public final class c6 extends SuspendLambda implements Function1 {
    public final /* synthetic */ g6 a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(g6 g6Var, long j, Continuation continuation) {
        super(1, continuation);
        this.a = g6Var;
        this.b = j;
    }

    public static final String a(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "TTL of ", " expired, reconnecting");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new c6(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new c6(this.a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(this.b, 0), 7, (Object) null);
        this.a.c.b();
        this.a.a(false);
        return Unit.INSTANCE;
    }
}
