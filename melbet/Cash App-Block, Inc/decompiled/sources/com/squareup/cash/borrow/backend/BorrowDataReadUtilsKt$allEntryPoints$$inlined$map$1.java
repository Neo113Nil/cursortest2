package com.squareup.cash.borrow.backend;

import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StateFlow $this_unsafeTransform$inlined;

    public /* synthetic */ BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(StateFlow stateFlow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        StateFlow stateFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = stateFlow.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 24), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = stateFlow.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 8), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = stateFlow.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 25), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = stateFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 29), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = stateFlow.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, 23), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
