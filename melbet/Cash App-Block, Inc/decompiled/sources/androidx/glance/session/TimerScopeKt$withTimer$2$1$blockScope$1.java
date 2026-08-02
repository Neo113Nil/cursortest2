package androidx.glance.session;

import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.paging.FlowExtKt$simpleScan$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class TimerScopeKt$withTimer$2$1$blockScope$1 implements CoroutineScope {
    public final /* synthetic */ CoroutineScope $$delegate_0;
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ DifferentialMotionFlingController$$ExternalSyntheticLambda0 $timeSource;
    public final /* synthetic */ AtomicReference $timerJob;
    public final /* synthetic */ CoroutineScope $timerScope;
    public final AtomicReference deadline = new AtomicReference(null);

    public TimerScopeKt$withTimer$2$1$blockScope$1(CoroutineScope coroutineScope, DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0, CoroutineScope coroutineScope2, Function2 function2, AtomicReference atomicReference) {
        this.$timeSource = differentialMotionFlingController$$ExternalSyntheticLambda0;
        this.$timerScope = coroutineScope2;
        this.$block = function2;
        this.$timerJob = atomicReference;
        this.$$delegate_0 = coroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    /* renamed from: getTimeLeft-UwyO8pc, reason: not valid java name */
    public final long m1128getTimeLeftUwyO8pc() {
        Long l = (Long) this.deadline.get();
        if (l == null) {
            Duration.Companion.getClass();
            return Duration.INFINITE;
        }
        long longValue = l.longValue();
        this.$timeSource.getClass();
        long currentTimeMillis = longValue - System.currentTimeMillis();
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(currentTimeMillis, DurationUnit.MILLISECONDS);
    }

    /* renamed from: startTimer-LRDsOJo, reason: not valid java name */
    public final void m1129startTimerLRDsOJo(long j) {
        if (Duration.m4167getInWholeMillisecondsimpl(j) <= 0) {
            JobKt.cancel(this.$timerScope, new TimeoutCancellationException("Timed out immediately", this.$block.hashCode()));
            return;
        }
        if (Duration.m4164compareToLRDsOJo(m1128getTimeLeftUwyO8pc(), j) < 0) {
            return;
        }
        this.$timeSource.getClass();
        this.deadline.set(Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(j) + System.currentTimeMillis()));
        DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0 = this.$timeSource;
        CoroutineScope coroutineScope = this.$timerScope;
        Job job = (Job) this.$timerJob.getAndSet(JobKt.launch$default(coroutineScope, null, null, new FlowExtKt$simpleScan$1(this, differentialMotionFlingController$$ExternalSyntheticLambda0, coroutineScope, this.$block, (Continuation) null, 23), 3));
        if (job != null) {
            job.cancel(null);
        }
    }
}
