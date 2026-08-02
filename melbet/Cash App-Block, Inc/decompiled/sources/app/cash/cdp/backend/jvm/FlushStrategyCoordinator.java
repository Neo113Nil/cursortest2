package app.cash.cdp.backend.jvm;

import coil3.memory.MemoryCacheService;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class FlushStrategyCoordinator implements UiSetupTeardown {
    public final MemoryCacheService eventFlusher;
    public final List flushStrategies;

    public FlushStrategyCoordinator(List list, MemoryCacheService memoryCacheService) {
        this.flushStrategies = list;
        this.eventFlusher = memoryCacheService;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGcmRegistrar$unregister$2((Continuation) null, this, 5), 1);
        return StateFlowKt.noOpTeardown;
    }
}
