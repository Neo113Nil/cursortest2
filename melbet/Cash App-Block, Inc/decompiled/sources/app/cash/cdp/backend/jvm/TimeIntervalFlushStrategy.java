package app.cash.cdp.backend.jvm;

import app.cash.cdp.api.FlushStrategy;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class TimeIntervalFlushStrategy implements FlushStrategy {
    public final SharedFlowImpl reset;
    public final ChannelFlowTransformLatest triggers;

    public TimeIntervalFlushStrategy() {
        TimeUnit.SECONDS.getClass();
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        MutableSharedFlow$default.tryEmit(Unit.INSTANCE);
        this.reset = MutableSharedFlow$default;
        this.triggers = FlowKt.transformLatest(MutableSharedFlow$default, new TimeIntervalFlushStrategy$triggers$1(this, (Continuation) null));
    }

    @Override // app.cash.cdp.api.FlushStrategy
    public final Flow getTriggers() {
        return this.triggers;
    }

    @Override // app.cash.cdp.api.FlushStrategy
    public final void reset() {
        StateFlowKt.emitOrThrow(this.reset, Unit.INSTANCE);
    }
}
