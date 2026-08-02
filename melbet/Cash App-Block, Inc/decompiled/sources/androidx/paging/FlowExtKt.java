package androidx.paging;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.paging.LoadState;
import androidx.paging.ViewportHint;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes3.dex */
public abstract class FlowExtKt {
    public static final Object NULL = new Object();

    public static final ReadonlySharedFlow cachedIn(Flow flow, CoroutineScope coroutineScope) {
        flow.getClass();
        coroutineScope.getClass();
        Continuation continuation = null;
        int i = 2;
        Flow simpleChannelFlow = simpleChannelFlow(new FlowExtKt$simpleRunningReduce$1(flow, new AnchoredDraggableNode$drag$2(continuation, coroutineScope, i), continuation, 1));
        int i2 = 3;
        int i3 = 0;
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(i2, continuation, i3);
        simpleChannelFlow.getClass();
        return FlowKt.shareIn(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CachedPagingDataKt$cachedIn$4(i, continuation, i3), new CachedPagingDataKt$cachedIn$$inlined$map$1(new SafeFlow(new FlowExtKt$simpleRunningReduce$1(simpleChannelFlow, cachedPagingDataKt$cachedIn$2, continuation, i3)), i3)), new CachedPagingDataKt$cachedIn$5(i2, continuation, i3)), coroutineScope, SharingStarted.Companion.Lazily, 1);
    }

    public static final LoadState computeHelperState(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        return loadState4 == null ? loadState3 : loadState instanceof LoadState.Loading ? (((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState : loadState4;
    }

    public static final boolean shouldPrioritizeOver(ViewportHint viewportHint, ViewportHint viewportHint2, LoadType loadType) {
        viewportHint.getClass();
        if (viewportHint2 == null || ((viewportHint2 instanceof ViewportHint.Initial) && (viewportHint instanceof ViewportHint.Access))) {
            return true;
        }
        if ((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) {
            return false;
        }
        return (viewportHint.originalPageOffsetFirst == viewportHint2.originalPageOffsetFirst && viewportHint.originalPageOffsetLast == viewportHint2.originalPageOffsetLast && viewportHint2.presentedItemsBeyondAnchor$paging_common(loadType) <= viewportHint.presentedItemsBeyondAnchor$paging_common(loadType)) ? false : true;
    }

    public static final Flow simpleChannelFlow(Function2 function2) {
        return FlowKt.buffer$default(new SafeFlow(new SimpleChannelFlowKt$simpleChannelFlow$1(function2, null, 0)), -2, 2);
    }
}
