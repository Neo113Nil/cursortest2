package app.cash.local.backend.real;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class RealLocalBrandProfileCheckedInSheetTracker {
    public final ReadonlyStateFlow handledSessionIds;
    public final StateFlowImpl mutableHandledSessionIds;

    public RealLocalBrandProfileCheckedInSheetTracker() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(EmptySet.INSTANCE);
        this.mutableHandledSessionIds = MutableStateFlow;
        this.handledSessionIds = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final ReadonlyStateFlow getHandledSessionIds() {
        return this.handledSessionIds;
    }

    public final boolean wasHandled(String str) {
        return ((Set) this.handledSessionIds.$$delegate_0.getValue()).contains(str);
    }
}
