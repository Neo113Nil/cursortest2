package app.cash.cdp.backend.jvm;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.api.FlushTrigger;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class ActivityEventFlushStrategy implements FlushStrategy, UiActivitySetupTeardown {
    public final SharedFlowImpl _triggers = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ActivityEventFlushStrategy();
        }
    }

    @Override // app.cash.cdp.api.FlushStrategy
    public final Flow getTriggers() {
        return this._triggers;
    }

    @Override // app.cash.cdp.api.FlushStrategy
    public final void reset() {
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: app.cash.cdp.backend.jvm.ActivityEventFlushStrategy$setup$1$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(LifecycleOwner lifecycleOwner) {
                StateFlowKt.emitOrThrow(ActivityEventFlushStrategy.this._triggers, new FlushTrigger());
            }
        };
        lifecycle.addObserver(defaultLifecycleObserver);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(12, lifecycle, defaultLifecycleObserver));
    }
}
