package com.squareup.cash.boost.backend;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class RealBoostRepository$getAllOrderedBoosts$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealBoostRepository$getAllOrderedBoosts$$inlined$map$1(RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 19), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, 16), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
