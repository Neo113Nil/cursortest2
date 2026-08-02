package androidx.room;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2 implements FlowCollector {
    public final /* synthetic */ FlowCollector $$this$flow;
    public final /* synthetic */ Ref$ObjectRef $currentVersions;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $resolvedTableNames;
    public final /* synthetic */ Object $tableIds;

    public TriggerBasedInvalidationTracker$createFlow$1$2(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector) {
        this.$currentVersions = ref$ObjectRef;
        this.$resolvedTableNames = coroutineScope;
        this.$tableIds = channelFlowTransformLatest;
        this.$$this$flow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r10.emit(r2, r4) == r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r10.emit(r2, r4) == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(int[] iArr, Continuation continuation) {
        TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 triggerBasedInvalidationTracker$createFlow$1$2$emit$1;
        int i;
        TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2 = this;
        int[] iArr2 = iArr;
        String[] strArr = (String[]) triggerBasedInvalidationTracker$createFlow$1$2.$resolvedTableNames;
        if (continuation instanceof TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) {
            triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = (TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) continuation;
            int i2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
                Object obj2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef = triggerBasedInvalidationTracker$createFlow$1$2.$currentVersions;
                    Object obj3 = ref$ObjectRef.element;
                    FlowCollector flowCollector = triggerBasedInvalidationTracker$createFlow$1$2.$$this$flow;
                    if (obj3 == null) {
                        Set set = ArraysKt___ArraysKt.toSet(strArr);
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0 = triggerBasedInvalidationTracker$createFlow$1$2;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$1 = iArr2;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = 1;
                    } else {
                        int[] iArr3 = (int[]) triggerBasedInvalidationTracker$createFlow$1$2.$tableIds;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj4 = obj2;
                            Object obj5 = ref$ObjectRef.element;
                            if (obj5 == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                return obj4;
                            }
                            int i6 = iArr3[i4];
                            if (((int[]) obj5)[i6] != iArr2[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            obj2 = obj4;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set set2 = CollectionsKt.toSet(arrayList);
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0 = triggerBasedInvalidationTracker$createFlow$1$2;
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$1 = iArr2;
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int[] iArr4 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$1;
                    TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$22 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    iArr2 = iArr4;
                    triggerBasedInvalidationTracker$createFlow$1$2 = triggerBasedInvalidationTracker$createFlow$1$22;
                }
                triggerBasedInvalidationTracker$createFlow$1$2.$currentVersions.element = iArr2;
                return Unit.INSTANCE;
            }
        }
        triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(triggerBasedInvalidationTracker$createFlow$1$2, continuation);
        Object obj6 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        triggerBasedInvalidationTracker$createFlow$1$2.$currentVersions.element = iArr2;
        return Unit.INSTANCE;
    }

    public TriggerBasedInvalidationTracker$createFlow$1$2(Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector, String[] strArr, int[] iArr) {
        this.$currentVersions = ref$ObjectRef;
        this.$$this$flow = flowCollector;
        this.$resolvedTableNames = strArr;
        this.$tableIds = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
        int i;
        switch (this.$r8$classId) {
            case 0:
                return emit((int[]) obj, continuation);
            default:
                if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                    int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                        Ref$ObjectRef ref$ObjectRef = this.$currentVersions;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Job job = (Job) ref$ObjectRef.element;
                            if (job != null) {
                                job.cancel(new ChildCancelledException("Child of the scoped flow was cancelled"));
                                channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = obj;
                                channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                                if (job.join(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                        }
                        ref$ObjectRef.element = JobKt.launch$default((CoroutineScope) this.$resolvedTableNames, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3((ChannelFlowTransformLatest) this.$tableIds, this.$$this$flow, obj, null), 1);
                        return Unit.INSTANCE;
                    }
                }
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
                Object obj22 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef2 = this.$currentVersions;
                if (i != 0) {
                }
                ref$ObjectRef2.element = JobKt.launch$default((CoroutineScope) this.$resolvedTableNames, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3((ChannelFlowTransformLatest) this.$tableIds, this.$$this$flow, obj, null), 1);
                return Unit.INSTANCE;
        }
    }
}
