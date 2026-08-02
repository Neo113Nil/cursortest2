package com.squareup.cash.data.contacts;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1(FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 1), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 23), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
