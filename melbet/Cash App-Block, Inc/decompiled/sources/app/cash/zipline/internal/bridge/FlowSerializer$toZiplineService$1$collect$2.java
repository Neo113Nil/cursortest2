package app.cash.zipline.internal.bridge;

import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final /* synthetic */ class FlowSerializer$toZiplineService$1$collect$2 implements FlowCollector, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowZiplineCollector $tmp0;

    public /* synthetic */ FlowSerializer$toZiplineService$1$collect$2(FlowZiplineCollector flowZiplineCollector, int i) {
        this.$r8$classId = i;
        this.$tmp0 = flowZiplineCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FlowZiplineCollector flowZiplineCollector = this.$tmp0;
        switch (i) {
            case 0:
                Object emit = flowZiplineCollector.emit(obj, continuation);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object emit2 = flowZiplineCollector.emit(obj, continuation);
                if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
        }
        return new FunctionReferenceImpl(2, 0, FlowZiplineCollector.class, this.$tmp0, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }
}
