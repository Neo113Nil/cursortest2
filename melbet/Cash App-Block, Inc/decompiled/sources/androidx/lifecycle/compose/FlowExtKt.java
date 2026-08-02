package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.work.data.api.PayDataState;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public abstract class FlowExtKt {
    public static final MutableState collectAsStateWithLifecycle(Flow flow, PayDataState.Loading loading, GapComposer gapComposer, int i) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
        Lifecycle.State state = Lifecycle.State.STARTED;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Object[] objArr = {flow, lifecycle, state, emptyCoroutineContext};
        boolean changedInstance = gapComposer.changedInstance(lifecycle) | gapComposer.changed(state.ordinal()) | gapComposer.changedInstance(emptyCoroutineContext) | gapComposer.changedInstance(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            Object flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state, emptyCoroutineContext, flow, null);
            gapComposer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1);
            rememberedValue = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        return Updater.produceState(loading, objArr, (Function2) rememberedValue, gapComposer);
    }
}
