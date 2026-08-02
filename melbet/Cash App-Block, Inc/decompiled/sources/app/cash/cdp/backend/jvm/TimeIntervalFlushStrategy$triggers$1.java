package app.cash.cdp.backend.jvm;

import app.cash.broadway.presenter.Presenter;
import app.cash.cdp.api.FlushTrigger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class TimeIntervalFlushStrategy$triggers$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ FlowCollector L$0;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeIntervalFlushStrategy$triggers$1(TimeIntervalFlushStrategy timeIntervalFlushStrategy, Continuation continuation) {
        super(3, continuation);
        this.this$0 = timeIntervalFlushStrategy;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        switch (this.$r8$classId) {
            case 0:
                TimeIntervalFlushStrategy$triggers$1 timeIntervalFlushStrategy$triggers$1 = new TimeIntervalFlushStrategy$triggers$1((TimeIntervalFlushStrategy) this.this$0, (Continuation) obj3);
                timeIntervalFlushStrategy$triggers$1.L$0 = flowCollector;
                timeIntervalFlushStrategy$triggers$1.invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                TimeIntervalFlushStrategy$triggers$1 timeIntervalFlushStrategy$triggers$12 = new TimeIntervalFlushStrategy$triggers$1(3, (Continuation) obj3);
                timeIntervalFlushStrategy$triggers$12.L$0 = flowCollector;
                timeIntervalFlushStrategy$triggers$12.this$0 = obj2;
                return timeIntervalFlushStrategy$triggers$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r0.emit(r10, r9) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(60000, r9) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:27:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        FlushTrigger flushTrigger = new FlushTrigger();
                        this.L$0 = flowCollector;
                        this.label = 2;
                        break;
                    } else if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Waiting 60 ", TimeUnit.SECONDS.name(), " for timed flush strategy."), new Object[0]);
                this.L$0 = flowCollector;
                this.label = 1;
                break;
            default:
                FlowCollector flowCollector2 = this.L$0;
                Object obj2 = this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow models = ((Presenter.Binding) obj2).getModels();
                    this.L$0 = null;
                    this.this$0 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect = models.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector2, 10), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TimeIntervalFlushStrategy$triggers$1(int i, Continuation continuation) {
        super(i, continuation);
    }
}
