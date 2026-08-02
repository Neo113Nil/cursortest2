package app.cash.redwood.treehouse;

import app.cash.zipline.internal.bridge.StateFlowSerializer$toStateFlow$1$collect$1;
import app.cash.zipline.internal.bridge.StateFlowZiplineService;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SequentialStateFlow implements StateFlow {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object stateFlowValue;

    public SequentialStateFlow(StateFlow stateFlow) {
        stateFlow.getClass();
        this.stateFlowValue = FlowKt.MutableStateFlow(stateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        SequentialStateFlow$collect$1 sequentialStateFlow$collect$1;
        int i;
        StateFlowSerializer$toStateFlow$1$collect$1 stateFlowSerializer$toStateFlow$1$collect$1;
        int i2;
        int i3 = this.$r8$classId;
        Object obj = this.stateFlowValue;
        Continuation continuation2 = null;
        switch (i3) {
            case 0:
                if (continuation instanceof SequentialStateFlow$collect$1) {
                    sequentialStateFlow$collect$1 = (SequentialStateFlow$collect$1) continuation;
                    int i4 = sequentialStateFlow$collect$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        sequentialStateFlow$collect$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = sequentialStateFlow$collect$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = sequentialStateFlow$collect$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            SequentialStateFlow$collect$2 sequentialStateFlow$collect$2 = new SequentialStateFlow$collect$2(flowCollector, continuation2, 0);
                            sequentialStateFlow$collect$1.label = 1;
                            if (FlowKt.collectLatest((StateFlowImpl) obj, sequentialStateFlow$collect$2, sequentialStateFlow$collect$1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("stateFlow.collect never returns");
                        break;
                    }
                }
                sequentialStateFlow$collect$1 = new SequentialStateFlow$collect$1(this, continuation);
                Object obj22 = sequentialStateFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sequentialStateFlow$collect$1.label;
                if (i != 0) {
                }
                a$$ExternalSyntheticBUOutline0.m$1("stateFlow.collect never returns");
            default:
                if (continuation instanceof StateFlowSerializer$toStateFlow$1$collect$1) {
                    stateFlowSerializer$toStateFlow$1$collect$1 = (StateFlowSerializer$toStateFlow$1$collect$1) continuation;
                    int i5 = stateFlowSerializer$toStateFlow$1$collect$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        stateFlowSerializer$toStateFlow$1$collect$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = stateFlowSerializer$toStateFlow$1$collect$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = stateFlowSerializer$toStateFlow$1$collect$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ChannelFlowBuilder channelFlow = FlowKt.channelFlow(new ZiplineLoader$ModuleJob$run$3((StateFlowZiplineService) obj, continuation2, 29));
                            stateFlowSerializer$toStateFlow$1$collect$1.label = 1;
                            if (channelFlow.collect(flowCollector, stateFlowSerializer$toStateFlow$1$collect$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        break;
                    }
                }
                stateFlowSerializer$toStateFlow$1$collect$1 = new StateFlowSerializer$toStateFlow$1$collect$1(this, continuation);
                Object obj32 = stateFlowSerializer$toStateFlow$1$collect$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = stateFlowSerializer$toStateFlow$1$collect$1.label;
                if (i2 != 0) {
                }
                Path$$ExternalSyntheticBUOutline0.m$2();
        }
        return null;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        switch (this.$r8$classId) {
            case 0:
                return CollectionsKt__CollectionsJVMKt.listOf(getValue());
            default:
                return CollectionsKt__CollectionsJVMKt.listOf(((StateFlowZiplineService) this.stateFlowValue).getValue());
        }
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        switch (this.$r8$classId) {
            case 0:
                return ((StateFlow) ((StateFlowImpl) this.stateFlowValue).getValue()).getValue();
            default:
                return ((StateFlowZiplineService) this.stateFlowValue).getValue();
        }
    }

    public SequentialStateFlow(StateFlowZiplineService stateFlowZiplineService) {
        this.stateFlowValue = stateFlowZiplineService;
    }
}
