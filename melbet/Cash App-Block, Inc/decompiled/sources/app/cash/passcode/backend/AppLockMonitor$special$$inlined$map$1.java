package app.cash.passcode.backend;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import com.squareup.util.coroutines.DerivedStateFlow;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;

/* loaded from: classes.dex */
public final class AppLockMonitor$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DerivedStateFlow $this_unsafeTransform$inlined;

    public /* synthetic */ AppLockMonitor$special$$inlined$map$1(DerivedStateFlow derivedStateFlow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = derivedStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        DerivedStateFlow derivedStateFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                derivedStateFlow.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 3), continuation);
                break;
            default:
                derivedStateFlow.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector, 13), continuation);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
