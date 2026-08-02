package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class z0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Braze f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(boolean z, Object obj, boolean z2, boolean z3, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = obj;
        this.d = z2;
        this.e = z3;
        this.f = braze;
        this.g = function2;
        this.h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        DeferredCoroutine async$default = JobKt.async$default(ne.a, null, null, new com.braze.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, null), 3);
        this.a = 1;
        Object awaitInternal = async$default.awaitInternal(this);
        return awaitInternal == coroutineSingletons ? coroutineSingletons : awaitInternal;
    }
}
