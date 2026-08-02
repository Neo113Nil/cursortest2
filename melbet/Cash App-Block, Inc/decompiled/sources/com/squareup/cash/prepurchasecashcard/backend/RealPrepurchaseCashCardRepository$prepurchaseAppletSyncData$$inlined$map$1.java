package com.squareup.cash.prepurchasecashcard.backend;

import androidx.webkit.internal.AssetHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.lending.sync_values.CardsEntryPointData;
import com.squareup.lending.sync_values.CardsEntryPointData$EntryPoint$ToggleEntryPointData;
import com.squareup.lending.sync_values.PrepurchaseCashCardAppletSyncData;
import com.squareup.lending.sync_values.PrepurchaseCashCardData;
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

/* loaded from: classes6.dex */
public final class RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ RealPrepurchaseCashCardRepository this$0;

    /* renamed from: com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ RealPrepurchaseCashCardRepository this$0;

        /* renamed from: com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1$2$1, reason: invalid class name */
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

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = realPrepurchaseCashCardRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1 realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1;
            int i2;
            CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData;
            int i3 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = this.this$0;
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
                                PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
                                if (prepurchaseCashCardData != null) {
                                    List list = prepurchaseCashCardData.applet_sync_data_list;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : list) {
                                        if (AssetHelper.matchesAny(realPrepurchaseCashCardRepository.appVersion, ((PrepurchaseCashCardAppletSyncData) obj4).app_supports)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "Multiple matching PrepurchaseCashCardAppletData: ");
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
                    if (continuation instanceof RealPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1) {
                        realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1 = (RealPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1) continuation;
                        int i5 = realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                PrepurchaseCashCardData prepurchaseCashCardData2 = (PrepurchaseCashCardData) obj;
                                if (prepurchaseCashCardData2 != null) {
                                    List list2 = prepurchaseCashCardData2.cards_entry_points;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (AssetHelper.matchesAny(realPrepurchaseCashCardRepository.appVersion, ((CardsEntryPointData) obj6).app_supports)) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                    if (arrayList2.size() >= 2) {
                                        realPrepurchaseCashCardRepository.errorReporter.report(new RealPrepurchaseCashCardRepository.MultipleCardsEntryPointData(arrayList2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                    }
                                    CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) CollectionsKt.firstOrNull((List) arrayList2);
                                    if (cardsEntryPointData != null && (cardsEntryPointData$EntryPoint$ToggleEntryPointData = cardsEntryPointData.entry_point) != null) {
                                        obj2 = cardsEntryPointData$EntryPoint$ToggleEntryPointData.value;
                                    }
                                }
                                realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                    realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1 = new RealPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realPrepurchaseCashCardRepository$prepurchaseToggleEntryPointData$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1(StateFlow stateFlow, RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = stateFlow;
        this.this$0 = realPrepurchaseCashCardRepository;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, realPrepurchaseCashCardRepository, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, realPrepurchaseCashCardRepository, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
