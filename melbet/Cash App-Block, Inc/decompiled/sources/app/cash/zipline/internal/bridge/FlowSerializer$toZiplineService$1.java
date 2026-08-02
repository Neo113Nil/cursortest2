package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowSerializer$toZiplineService$1 implements FlowZiplineService {
    public final /* synthetic */ Flow $this_toZiplineService;

    public FlowSerializer$toZiplineService$1(Flow flow) {
        this.$this_toZiplineService = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // app.cash.zipline.internal.bridge.FlowZiplineService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowZiplineCollector flowZiplineCollector, ContinuationImpl continuationImpl) {
        FlowSerializer$toZiplineService$1$collect$1 flowSerializer$toZiplineService$1$collect$1;
        int i;
        try {
            if (continuationImpl instanceof FlowSerializer$toZiplineService$1$collect$1) {
                flowSerializer$toZiplineService$1$collect$1 = (FlowSerializer$toZiplineService$1$collect$1) continuationImpl;
                int i2 = flowSerializer$toZiplineService$1$collect$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flowSerializer$toZiplineService$1$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = flowSerializer$toZiplineService$1$collect$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowSerializer$toZiplineService$1$collect$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = this.$this_toZiplineService;
                        FlowSerializer$toZiplineService$1$collect$2 flowSerializer$toZiplineService$1$collect$2 = new FlowSerializer$toZiplineService$1$collect$2(flowZiplineCollector, 0);
                        flowSerializer$toZiplineService$1$collect$1.L$0 = flowZiplineCollector;
                        flowSerializer$toZiplineService$1$collect$1.label = 1;
                        if (flow.collect(flowSerializer$toZiplineService$1$collect$2, flowSerializer$toZiplineService$1$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flowZiplineCollector = flowSerializer$toZiplineService$1$collect$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    flowZiplineCollector.close();
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            flowZiplineCollector.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            flowZiplineCollector.close();
            throw th;
        }
        flowSerializer$toZiplineService$1$collect$1 = new FlowSerializer$toZiplineService$1$collect$1(this, continuationImpl);
        Object obj2 = flowSerializer$toZiplineService$1$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowSerializer$toZiplineService$1$collect$1.label;
    }

    public final String toString() {
        return this.$this_toZiplineService.toString();
    }
}
