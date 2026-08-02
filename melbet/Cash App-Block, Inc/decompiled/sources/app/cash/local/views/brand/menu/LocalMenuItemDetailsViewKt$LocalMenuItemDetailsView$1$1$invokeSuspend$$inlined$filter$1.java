package app.cash.local.views.brand.menu;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes3.dex */
public final class LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $scrollToErrorConsumed$delegate$inlined;
    public final /* synthetic */ SafeFlow $this_unsafeTransform$inlined;

    public /* synthetic */ LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1(SafeFlow safeFlow, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = safeFlow;
        this.$scrollToErrorConsumed$delegate$inlined = mutableState;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$scrollToErrorConsumed$delegate$inlined;
        SafeFlow safeFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = safeFlow.collect(new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector, mutableState, 2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = safeFlow.collect(new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector, mutableState, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
