package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class Wrapper_androidKt$setContent$1 implements LifecycleRetainedValuesStoreOwner.FrameEndScheduler, FunctionAdapter {
    public final /* synthetic */ CompositionContext $tmp0;

    public Wrapper_androidKt$setContent$1(CompositionContext compositionContext) {
        this.$tmp0 = compositionContext;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof LifecycleRetainedValuesStoreOwner.FrameEndScheduler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 0, CompositionContext.class, this.$tmp0, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
