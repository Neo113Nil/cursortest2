package androidx.room.coroutines;

import androidx.compose.runtime.AbstractApplier;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.DistinctFlowImpl$collect$2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FlowUtil$createFlow$$inlined$map$1 implements Flow {
    public final /* synthetic */ Object $block$inlined;
    public final /* synthetic */ Object $db$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public FlowUtil$createFlow$$inlined$map$1(Object obj, Flow flow, Function3 function3) {
        this.$r8$classId = 3;
        this.$db$inlined = obj;
        this.$this_unsafeTransform$inlined = flow;
        this.$block$inlined = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        DistinctFlowImpl$collect$2 distinctFlowImpl$collect$2;
        int i3 = this.$r8$classId;
        int i4 = 2;
        Object obj = this.$block$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        Object obj2 = this.$db$inlined;
        switch (i3) {
            case 0:
                Object collect = flow.collect(new DistinctFlowImpl$collect$2(flowCollector, (RoomDatabase) obj2, (TransactorKt$$ExternalSyntheticLambda0) obj, i4), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((SafeFlow) flow).collect(new DistinctFlowImpl$collect$2(flowCollector, (CoroutineContext) obj2, obj, 3), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flow.collect(new DistinctFlowImpl$collect$2(flowCollector, (AbstractApplier) obj2, (RealFeatureFlagManager) obj, 4), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                if (continuation instanceof FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) {
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) continuation;
                    int i5 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                        if (i != 0) {
                            Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj3);
                            m.element = obj2;
                            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = flowCollector;
                            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = m;
                            i2 = 0;
                            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = 0;
                            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 1;
                            if (flowCollector.emit(obj2, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                                ref$ObjectRef = m;
                            }
                        } else if (i == 1) {
                            int i6 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0;
                            ref$ObjectRef = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3;
                            FlowCollector flowCollector2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2;
                            SafeTrace.throwOnFailure(obj3);
                            i2 = i6;
                            flowCollector = flowCollector2;
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            break;
                        }
                        distinctFlowImpl$collect$2 = new DistinctFlowImpl$collect$2(ref$ObjectRef, (Function3) obj, flowCollector);
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = null;
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = i2;
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 2;
                        if (flow.collect(distinctFlowImpl$collect$2, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                        }
                    }
                }
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj32 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                }
                distinctFlowImpl$collect$2 = new DistinctFlowImpl$collect$2(ref$ObjectRef, (Function3) obj, flowCollector);
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = i2;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 2;
                if (flow.collect(distinctFlowImpl$collect$2, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FlowUtil$createFlow$$inlined$map$1(Flow flow, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$db$inlined = obj;
        this.$block$inlined = obj2;
    }
}
