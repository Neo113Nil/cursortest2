package com.squareup.cash.score.backend;

import androidx.webkit.internal.AssetHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.sync_values.CashCreditScoreSyncData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ RealScoreRepository this$0;

    /* renamed from: com.squareup.cash.score.backend.RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ RealScoreRepository this$0;

        /* renamed from: com.squareup.cash.score.backend.RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1$2$1, reason: invalid class name */
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

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, RealScoreRepository realScoreRepository, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = realScoreRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1 realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            RealScoreRepository realScoreRepository = this.this$0;
            Object obj2 = null;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
                                if (cashCreditScoreSyncData != null) {
                                    List list = cashCreditScoreSyncData.home_data;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : list) {
                                        if (AssetHelper.matchesAny(realScoreRepository.appVersion, ((CashCreditScoreHomeData) obj4).app_supports)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "Multiple matching CashCreditScoreHomeData: ");
                                        return null;
                                    }
                                    obj2 = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj3);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                default:
                    if (continuation instanceof RealScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1) {
                        realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1 = (RealScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1) continuation;
                        int i5 = realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                CashCreditScoreSyncData cashCreditScoreSyncData2 = (CashCreditScoreSyncData) obj;
                                if (cashCreditScoreSyncData2 != null) {
                                    List list2 = cashCreditScoreSyncData2.entry_point_data;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (AssetHelper.matchesAny(realScoreRepository.appVersion, ((CashCreditScoreEntryPointData) obj6).app_supports)) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                    if (arrayList2.size() >= 2) {
                                        realScoreRepository.errorReporter.report(new RealScoreRepository.MultipleScoreEntryPointsError(arrayList2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                    }
                                    obj2 = CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                                }
                                realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj5);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1 = new RealScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realScoreRepository$cashCreditScoreEntryPointData$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1(StateFlow stateFlow, RealScoreRepository realScoreRepository, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = stateFlow;
        this.this$0 = realScoreRepository;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealScoreRepository realScoreRepository = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, realScoreRepository, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, realScoreRepository, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
