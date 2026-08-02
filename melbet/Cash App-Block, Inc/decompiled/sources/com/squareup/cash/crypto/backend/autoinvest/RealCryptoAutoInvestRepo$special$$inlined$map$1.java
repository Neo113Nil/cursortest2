package com.squareup.cash.crypto.backend.autoinvest;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class RealCryptoAutoInvestRepo$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;
    public final /* synthetic */ RealCryptoAutoInvestRepo this$0;

    public /* synthetic */ RealCryptoAutoInvestRepo$special$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, RealCryptoAutoInvestRepo realCryptoAutoInvestRepo, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
        this.this$0 = realCryptoAutoInvestRepo;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = this.this$0;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, realCryptoAutoInvestRepo, 4), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, realCryptoAutoInvestRepo, 5), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
