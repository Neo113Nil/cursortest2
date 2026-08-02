package com.squareup.cash.boost.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.boost.db.Slots;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List $slots$inlined;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ RealBoostProvider this$0;

    /* renamed from: com.squareup.cash.boost.backend.RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2(FlowCollector flowCollector, RealBoostProvider realBoostProvider, List list, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = realBoostProvider;
        this.$slots$inlined = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1 realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        List list = this.$slots$inlined;
        RealBoostProvider realBoostProvider = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
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
                            RewardWithSelection rewardWithSelection = (RewardWithSelection) obj;
                            String str = ((Slots) list.get(0)).selected_reward_token;
                            realBoostProvider.getClass();
                            RewardSlotState rewardSlotState = RewardSlotState.OCCUPIED;
                            String str2 = rewardWithSelection.token;
                            String str3 = rewardWithSelection.category;
                            UiRewardAvatars uiRewardAvatars = rewardWithSelection.avatars;
                            String str4 = rewardWithSelection.title;
                            String str5 = rewardWithSelection.main_text;
                            List list2 = rewardWithSelection.program_detail_rows;
                            String str6 = rewardWithSelection.footer_text;
                            List list3 = rewardWithSelection.boost_detail_rows;
                            List list4 = rewardWithSelection.boost_attributes;
                            String str7 = rewardWithSelection.full_title_text;
                            Long l = rewardWithSelection.expiration_date_time_ms;
                            Long l2 = rewardWithSelection.activation_date_time_ms;
                            String str8 = rewardWithSelection.discount_text;
                            boolean z = rewardWithSelection.draggable;
                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Slots(rewardSlotState, str, str2, str3, uiRewardAvatars, str4, str5, list2, str6, list3, list4, str7, l, l2, str8, rewardWithSelection.reward_selection_state, Boolean.valueOf(z), rewardWithSelection.affiliate_link_url, rewardWithSelection.user_agent, rewardWithSelection.offerly_token, Boolean.valueOf(rewardWithSelection.is_custom_offer), rewardWithSelection.boost_detail_bottom_upsell, Boolean.valueOf(rewardWithSelection.redeemable_with_cash_app_pay), Boolean.valueOf(rewardWithSelection.redeemable_with_cash_card), rewardWithSelection.app_links));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(listOf, anonymousClass1) == coroutineSingletons) {
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
                if (continuation instanceof RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1) {
                    realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1 = (RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i5 = realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            long millis = realBoostProvider.clock.millis();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : (List) obj) {
                                Long l3 = ((RewardWithSelection) obj4).expiration_date_time_ms;
                                if ((l3 != null ? l3.longValue() : Long.MAX_VALUE) > millis) {
                                    arrayList.add(obj4);
                                }
                            }
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                linkedHashMap.put(((RewardWithSelection) next).token, next);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                RewardWithSelection rewardWithSelection2 = (RewardWithSelection) linkedHashMap.get((String) it2.next());
                                if (rewardWithSelection2 != null) {
                                    arrayList2.add(rewardWithSelection2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                RewardWithSelection rewardWithSelection3 = (RewardWithSelection) it3.next();
                                if (rewardWithSelection3.is_custom_offer) {
                                    arrayList3.add(rewardWithSelection3);
                                } else if (!rewardWithSelection3.redeemable_with_cash_app_pay || rewardWithSelection3.redeemable_with_cash_card) {
                                    arrayList5.add(rewardWithSelection3);
                                } else {
                                    arrayList4.add(rewardWithSelection3);
                                }
                            }
                            Map mapOf = MapsKt__MapsKt.mapOf(new Pair(BoostCategory.CUSTOM, arrayList3), new Pair(BoostCategory.CAP, arrayList4), new Pair(BoostCategory.REGULAR, arrayList5));
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : mapOf.entrySet()) {
                                if (!((List) entry.getValue()).isEmpty()) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashMap2, realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
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
                realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1 = new RealBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realBoostProvider$getCategorizedBoosts$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
