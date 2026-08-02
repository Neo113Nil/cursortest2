package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class x0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Braze d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(boolean z, boolean z2, boolean z3, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = braze;
        this.e = function0;
        this.f = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x0(this.a, this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new com.braze.c(this.a, this.b, this.c, this.d, this.e, this.f, null));
        return Unit.INSTANCE;
    }
}
