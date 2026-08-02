package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class StateFlowSerializer$toZiplineService$1 implements StateFlowZiplineService {
    public final /* synthetic */ StateFlow $this_toZiplineService;

    public StateFlowSerializer$toZiplineService$1(StateFlow stateFlow) {
        this.$this_toZiplineService = stateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // app.cash.zipline.internal.bridge.FlowZiplineService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowZiplineCollector flowZiplineCollector, ContinuationImpl continuationImpl) {
        StateFlowSerializer$toZiplineService$1$collect$1 stateFlowSerializer$toZiplineService$1$collect$1;
        int i;
        try {
            if (continuationImpl instanceof StateFlowSerializer$toZiplineService$1$collect$1) {
                stateFlowSerializer$toZiplineService$1$collect$1 = (StateFlowSerializer$toZiplineService$1$collect$1) continuationImpl;
                int i2 = stateFlowSerializer$toZiplineService$1$collect$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    stateFlowSerializer$toZiplineService$1$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = stateFlowSerializer$toZiplineService$1$collect$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = stateFlowSerializer$toZiplineService$1$collect$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow stateFlow = this.$this_toZiplineService;
                        FlowSerializer$toZiplineService$1$collect$2 flowSerializer$toZiplineService$1$collect$2 = new FlowSerializer$toZiplineService$1$collect$2(flowZiplineCollector, 1);
                        stateFlowSerializer$toZiplineService$1$collect$1.L$0 = flowZiplineCollector;
                        stateFlowSerializer$toZiplineService$1$collect$1.label = 1;
                        if (stateFlow.collect(flowSerializer$toZiplineService$1$collect$2, stateFlowSerializer$toZiplineService$1$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flowZiplineCollector = stateFlowSerializer$toZiplineService$1$collect$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            flowZiplineCollector.close();
            throw th;
        }
        stateFlowSerializer$toZiplineService$1$collect$1 = new StateFlowSerializer$toZiplineService$1$collect$1(this, continuationImpl);
        Object obj2 = stateFlowSerializer$toZiplineService$1$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateFlowSerializer$toZiplineService$1$collect$1.label;
    }

    @Override // app.cash.zipline.internal.bridge.StateFlowZiplineService
    public final Object getValue() {
        return this.$this_toZiplineService.getValue();
    }

    public final String toString() {
        return this.$this_toZiplineService.toString();
    }
}
