package androidx.paging;

import androidx.work.Worker$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            ConflatedEventBus$special$$inlined$mapNotNull$1$2$1 conflatedEventBus$special$$inlined$mapNotNull$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            Continuation continuation2 = null;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                MulticastedPagingData multicastedPagingData = (MulticastedPagingData) obj;
                                FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new DiskLruCache$launchCleanup$1(multicastedPagingData, continuation2, 12), (SafeFlow) multicastedPagingData.accumulated.authenticationTag), new MulticastedPagingData$asPagingData$2(multicastedPagingData, continuation2, 0));
                                PagingData pagingData = multicastedPagingData.parent;
                                PagingData pagingData2 = new PagingData(flowKt__MergeKt$flatMapMerge$$inlined$map$1, pagingData.uiReceiver, pagingData.hintReceiver, new Worker$$ExternalSyntheticLambda0(multicastedPagingData, 13));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(pagingData2, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                default:
                    if (continuation instanceof ConflatedEventBus$special$$inlined$mapNotNull$1$2$1) {
                        conflatedEventBus$special$$inlined$mapNotNull$1$2$1 = (ConflatedEventBus$special$$inlined$mapNotNull$1$2$1) continuation;
                        int i5 = conflatedEventBus$special$$inlined$mapNotNull$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            conflatedEventBus$special$$inlined$mapNotNull$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = conflatedEventBus$special$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = conflatedEventBus$special$$inlined$mapNotNull$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Object obj4 = ((Pair) obj).second;
                                if (obj4 != null) {
                                    conflatedEventBus$special$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(obj4, conflatedEventBus$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    conflatedEventBus$special$$inlined$mapNotNull$1$2$1 = new ConflatedEventBus$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj32 = conflatedEventBus$special$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = conflatedEventBus$special$$inlined$mapNotNull$1$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CachedPagingDataKt$cachedIn$$inlined$map$1(Flow flow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((SafeFlow) flow).collect(new AnonymousClass2(flowCollector, 0), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            default:
                ((StateFlowImpl) flow).collect(new AnonymousClass2(flowCollector, 1), continuation);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }
}
