package com.squareup.cash.invitations;

import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$includingEmail$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__MergeKt$flatMapConcat$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ InviteContactsPresenter$includingEmail$$inlined$map$1(FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 20), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
