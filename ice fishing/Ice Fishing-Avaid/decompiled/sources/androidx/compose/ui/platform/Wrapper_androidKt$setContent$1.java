package androidx.compose.ui.platform;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Wrapper.android.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* synthetic */ class Wrapper_androidKt$setContent$1 implements LifecycleRetainedValuesStoreOwner.FrameEndScheduler, FunctionAdapter {
    final /* synthetic */ CompositionContext $tmp0;

    Wrapper_androidKt$setContent$1(CompositionContext compositionContext) {
        this.$tmp0 = compositionContext;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof LifecycleRetainedValuesStoreOwner.FrameEndScheduler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, CompositionContext.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler
    public final CancellationHandle scheduleFrameEndCallback(Function0<Unit> function0) {
        return this.$tmp0.scheduleFrameEndCallback(function0);
    }
}
