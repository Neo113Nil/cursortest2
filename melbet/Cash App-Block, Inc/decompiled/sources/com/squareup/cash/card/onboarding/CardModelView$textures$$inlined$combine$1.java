package com.squareup.cash.card.onboarding;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$RewardMetadata;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$textures$$inlined$combine$1 implements Flow {
    public final /* synthetic */ Flow[] $flowArray$inlined;
    public final /* synthetic */ int $r8$classId;

    /* renamed from: com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function0 {
        public final /* synthetic */ Flow[] $flowArray;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(Flow[] flowArr, int i) {
            this.$r8$classId = i;
            this.$flowArray = flowArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new Object[this.$flowArray.length];
                case 1:
                    return new Pair[this.$flowArray.length];
                case 2:
                    return new Activities[this.$flowArray.length];
                case 3:
                    return new FamilyHomePresenter.DependentDetails[this.$flowArray.length];
                case 4:
                    return new List[this.$flowArray.length];
                case 5:
                    return new Boolean[this.$flowArray.length];
                case 6:
                    return new FilterDetails[this.$flowArray.length];
                case 7:
                    return new AppletTileSectionProvider.Element[this.$flowArray.length];
                case 8:
                    return new Pair[this.$flowArray.length];
                case 9:
                    return new OffersAnalyticsHelper$RewardMetadata[this.$flowArray.length];
                case 10:
                    return new NotificationChannelToggleState[this.$flowArray.length];
                case 11:
                    return new RealShareTargetsManager$TargetPreparationState[this.$flowArray.length];
                default:
                    return new String[this.$flowArray.length];
            }
        }
    }

    /* renamed from: com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ FlowCollector L$0;
        public /* synthetic */ Object[] L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            FlowCollector flowCollector = (FlowCollector) obj;
            Object[] objArr = (Object[]) obj2;
            Continuation continuation = (Continuation) obj3;
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, continuation, 0);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                case 1:
                    AnonymousClass3 anonymousClass32 = new AnonymousClass3(3, continuation, 1);
                    anonymousClass32.L$0 = flowCollector;
                    anonymousClass32.L$1 = objArr;
                    return anonymousClass32.invokeSuspend(Unit.INSTANCE);
                case 2:
                    AnonymousClass3 anonymousClass33 = new AnonymousClass3(3, continuation, 2);
                    anonymousClass33.L$0 = flowCollector;
                    anonymousClass33.L$1 = objArr;
                    return anonymousClass33.invokeSuspend(Unit.INSTANCE);
                case 3:
                    AnonymousClass3 anonymousClass34 = new AnonymousClass3(3, continuation, 3);
                    anonymousClass34.L$0 = flowCollector;
                    anonymousClass34.L$1 = objArr;
                    return anonymousClass34.invokeSuspend(Unit.INSTANCE);
                case 4:
                    AnonymousClass3 anonymousClass35 = new AnonymousClass3(3, continuation, 4);
                    anonymousClass35.L$0 = flowCollector;
                    anonymousClass35.L$1 = objArr;
                    return anonymousClass35.invokeSuspend(Unit.INSTANCE);
                case 5:
                    AnonymousClass3 anonymousClass36 = new AnonymousClass3(3, continuation, 5);
                    anonymousClass36.L$0 = flowCollector;
                    anonymousClass36.L$1 = objArr;
                    return anonymousClass36.invokeSuspend(Unit.INSTANCE);
                case 6:
                    AnonymousClass3 anonymousClass37 = new AnonymousClass3(3, continuation, 6);
                    anonymousClass37.L$0 = flowCollector;
                    anonymousClass37.L$1 = objArr;
                    return anonymousClass37.invokeSuspend(Unit.INSTANCE);
                case 7:
                    AnonymousClass3 anonymousClass38 = new AnonymousClass3(3, continuation, 7);
                    anonymousClass38.L$0 = flowCollector;
                    anonymousClass38.L$1 = objArr;
                    return anonymousClass38.invokeSuspend(Unit.INSTANCE);
                case 8:
                    AnonymousClass3 anonymousClass39 = new AnonymousClass3(3, continuation, 8);
                    anonymousClass39.L$0 = flowCollector;
                    anonymousClass39.L$1 = objArr;
                    return anonymousClass39.invokeSuspend(Unit.INSTANCE);
                case 9:
                    AnonymousClass3 anonymousClass310 = new AnonymousClass3(3, continuation, 9);
                    anonymousClass310.L$0 = flowCollector;
                    anonymousClass310.L$1 = objArr;
                    return anonymousClass310.invokeSuspend(Unit.INSTANCE);
                case 10:
                    AnonymousClass3 anonymousClass311 = new AnonymousClass3(3, continuation, 10);
                    anonymousClass311.L$0 = flowCollector;
                    anonymousClass311.L$1 = objArr;
                    return anonymousClass311.invokeSuspend(Unit.INSTANCE);
                default:
                    AnonymousClass3 anonymousClass312 = new AnonymousClass3(3, continuation, 11);
                    anonymousClass312.L$0 = flowCollector;
                    anonymousClass312.L$1 = objArr;
                    return anonymousClass312.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = false;
            boolean z2 = false;
            switch (this.$r8$classId) {
                case 0:
                    FlowCollector flowCollector = this.L$0;
                    Object[] objArr = this.L$1;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector.emit(objArr, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    FlowCollector flowCollector2 = this.L$0;
                    Object[] objArr2 = this.L$1;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Map map = MapsKt__MapsKt.toMap((Pair[]) objArr2);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector2.emit(map, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    FlowCollector flowCollector3 = this.L$0;
                    Object[] objArr3 = this.L$1;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list = ArraysKt___ArraysKt.toList((FamilyHomePresenter.DependentDetails[]) objArr3);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector3.emit(list, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    FlowCollector flowCollector4 = this.L$0;
                    Object[] objArr4 = this.L$1;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ArrayList flatten = CollectionsKt__IterablesKt.flatten(ArraysKt___ArraysKt.toList((List[]) objArr4));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector4.emit(flatten, this) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 4:
                    FlowCollector flowCollector5 = this.L$0;
                    Object[] objArr5 = this.L$1;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean[] boolArr = (Boolean[]) objArr5;
                        int length = boolArr.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                z = true;
                            } else if (boolArr[i6].booleanValue()) {
                                i6++;
                            }
                        }
                        Boolean valueOf = Boolean.valueOf(z);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector5.emit(valueOf, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 5:
                    FlowCollector flowCollector6 = this.L$0;
                    Object[] objArr6 = this.L$1;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector6.emit((FilterDetails[]) objArr6, this) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowCollector flowCollector7 = this.L$0;
                        List asList = ArraysKt___ArraysJvmKt.asList(this.L$1);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector7.emit(asList, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 7:
                    FlowCollector flowCollector8 = this.L$0;
                    Object[] objArr7 = this.L$1;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list2 = ArraysKt___ArraysKt.toList((Pair[]) objArr7);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector8.emit(list2, this) == coroutineSingletons8) {
                            break;
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    FlowCollector flowCollector9 = this.L$0;
                    Object[] objArr8 = this.L$1;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        OffersAnalyticsHelper$RewardMetadata[] offersAnalyticsHelper$RewardMetadataArr = (OffersAnalyticsHelper$RewardMetadata[]) objArr8;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(offersAnalyticsHelper$RewardMetadataArr.length);
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                        for (OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata : offersAnalyticsHelper$RewardMetadataArr) {
                            linkedHashMap.put(offersAnalyticsHelper$RewardMetadata.token, offersAnalyticsHelper$RewardMetadata);
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector9.emit(linkedHashMap, this) == obj2) {
                            break;
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 9:
                    FlowCollector flowCollector10 = this.L$0;
                    Object[] objArr9 = this.L$1;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        NotificationChannelToggleState[] notificationChannelToggleStateArr = (NotificationChannelToggleState[]) objArr9;
                        int length2 = notificationChannelToggleStateArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length2) {
                                if (notificationChannelToggleStateArr[i12] == NotificationChannelToggleState.DisabledByGroup) {
                                    z2 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector10.emit(valueOf2, this) == coroutineSingletons9) {
                            break;
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 10:
                    FlowCollector flowCollector11 = this.L$0;
                    Object[] objArr10 = this.L$1;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealShareTargetsManager$TargetPreparationState[] realShareTargetsManager$TargetPreparationStateArr = (RealShareTargetsManager$TargetPreparationState[]) objArr10;
                        ArrayList arrayList = new ArrayList(realShareTargetsManager$TargetPreparationStateArr.length);
                        for (RealShareTargetsManager$TargetPreparationState realShareTargetsManager$TargetPreparationState : realShareTargetsManager$TargetPreparationStateArr) {
                            arrayList.add(realShareTargetsManager$TargetPreparationState.getTarget());
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector11.emit(arrayList, this) == obj3) {
                            break;
                        }
                    } else if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowCollector flowCollector12 = this.L$0;
                        String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.toList(this.L$1), "", null, null, 0, null, null, 62);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (flowCollector12.emit(joinToString$default, this) == coroutineSingletons10) {
                            break;
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardModelView$textures$$inlined$combine$1(Flow[] flowArr, int i) {
        this.$r8$classId = i;
        this.$flowArray$inlined = flowArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 5;
        int i3 = 6;
        int i4 = 7;
        int i5 = 8;
        int i6 = 9;
        int i7 = 10;
        int i8 = 11;
        Continuation continuation2 = null;
        Flow[] flowArr = this.$flowArray$inlined;
        int i9 = 3;
        switch (i) {
            case 0:
                int i10 = 0;
                Object combineInternal = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i10), new AnonymousClass3(i9, continuation2, i10), flowCollector, flowArr);
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                int i11 = 1;
                Object combineInternal2 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i11), new AnonymousClass3(i9, continuation2, i11), flowCollector, flowArr);
                if (combineInternal2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object combineInternal3 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i9), new AnonymousClass3(i9, continuation2, 2), flowCollector, flowArr);
                if (combineInternal3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object combineInternal4 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i2), new AnonymousClass3(i9, continuation2, 4), flowCollector, flowArr);
                if (combineInternal4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object combineInternal5 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i3), new AnonymousClass3(i9, continuation2, i2), flowCollector, flowArr);
                if (combineInternal5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object combineInternal6 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i4), new AnonymousClass3(i9, continuation2, i3), flowCollector, flowArr);
                if (combineInternal6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object combineInternal7 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i5), new AnonymousClass3(i9, continuation2, i4), flowCollector, flowArr);
                if (combineInternal7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object combineInternal8 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i6), new AnonymousClass3(i9, continuation2, i5), flowCollector, flowArr);
                if (combineInternal8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object combineInternal9 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i7), new AnonymousClass3(i9, continuation2, i6), flowCollector, flowArr);
                if (combineInternal9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object combineInternal10 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, i8), new AnonymousClass3(i9, continuation2, i7), flowCollector, flowArr);
                if (combineInternal10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object combineInternal11 = CombineKt.combineInternal(continuation, new AnonymousClass2(flowArr, 12), new AnonymousClass3(i9, continuation2, i8), flowCollector, flowArr);
                if (combineInternal11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
