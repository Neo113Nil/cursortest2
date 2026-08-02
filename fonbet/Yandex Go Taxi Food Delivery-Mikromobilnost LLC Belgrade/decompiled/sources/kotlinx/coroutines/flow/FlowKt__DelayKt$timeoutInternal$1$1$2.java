package kotlinx.coroutines.flow;

import defpackage.e3n;
import defpackage.mvg;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements tls {

    /* renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f38$$v$c$kotlintimeDuration$timeout$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, Continuation continuation) {
        super(1, continuation);
        this.f38$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f38$$v$c$kotlintimeDuration$timeout$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((FlowKt__DelayKt$timeoutInternal$1$1$2) create((Continuation) obj)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) e3n.p(this.f38$$v$c$kotlintimeDuration$timeout$0)), null);
    }
}
