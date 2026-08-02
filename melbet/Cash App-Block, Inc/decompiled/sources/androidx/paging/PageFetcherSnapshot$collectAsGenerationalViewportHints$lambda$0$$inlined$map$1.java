package androidx.paging;

import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import com.squareup.util.coroutines.StateFlowKt$combineUndispatched$1$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $generationId$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1(Flow flow, int i, int i2) {
        this.$r8$classId = i2;
        this.$this_unsafeTransform$inlined = flow;
        this.$generationId$inlined = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = this.$generationId$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new StateFlowKt$combineUndispatched$1$1$1$1(flowCollector, i2, 1), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new StateFlowKt$combineUndispatched$1$1$1$1(flowCollector, i2, 2), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
