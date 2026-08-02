package com.squareup.cash.data.contacts;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SessionManagerKt$special$$inlined$filterIsInstance$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2(SessionManagerKt$special$$inlined$filterIsInstance$1 sessionManagerKt$special$$inlined$filterIsInstance$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = sessionManagerKt$special$$inlined$filterIsInstance$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        SessionManagerKt$special$$inlined$filterIsInstance$1 sessionManagerKt$special$$inlined$filterIsInstance$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = sessionManagerKt$special$$inlined$filterIsInstance$1.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 29), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = sessionManagerKt$special$$inlined$filterIsInstance$1.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 2), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = sessionManagerKt$special$$inlined$filterIsInstance$1.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
