package com.squareup.cash.session.backend;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class SessionManagerKt$special$$inlined$filterIsInstance$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DistinctFlowImpl $this_unsafeTransform$inlined;

    public /* synthetic */ SessionManagerKt$special$$inlined$filterIsInstance$1(DistinctFlowImpl distinctFlowImpl, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = distinctFlowImpl;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        DistinctFlowImpl distinctFlowImpl = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = distinctFlowImpl.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 29), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = distinctFlowImpl.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 24), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
