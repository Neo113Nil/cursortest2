package com.squareup.cash.crypto.backend.balance;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class CryptoBalanceRepoKt$asMoney$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 $this_unsafeTransform$inlined;

    public /* synthetic */ CryptoBalanceRepoKt$asMoney$$inlined$map$1(RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 7), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
