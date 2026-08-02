package com.squareup.cash.recipients.data;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.api.DiscoveryHeader;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.api.data.SearchResult;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.db.OwnedHoldings;
import com.squareup.cash.investing.db.SelectDiscoveries;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.payments.backend.real.RealOfflineManager$isDuplicatePayment$$inlined$map$1$2$1;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealCustomerStore$getCustomersForIds$$inlined$map$1 implements Flow {
    public final /* synthetic */ List $customerIds$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ List $customerIds$inlined;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1$2$1, reason: invalid class name */
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

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, List list, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$customerIds$inlined = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0363  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x036f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03ea  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x03f8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            FamilyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1 familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1;
            int i2;
            Object obj2;
            RealInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1 realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1;
            int i3;
            CoroutineSingletons coroutineSingletons;
            Iterator it;
            RealInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1 realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1;
            int i4;
            Iterator it2;
            Image image;
            RealInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1 realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1;
            int i5;
            RealCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1 realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1;
            int i6;
            RealOfflineManager$isDuplicatePayment$$inlined$map$1$2$1 realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1;
            int i7;
            int i8 = this.$r8$classId;
            int i9 = 4;
            boolean z = false;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            List list = this.$customerIds$inlined;
            switch (i8) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.label;
                        if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i10 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                List list2 = (List) obj;
                                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                                for (Object obj4 : list2) {
                                    linkedHashMap.put(((ActivityRecipient) obj4).customer_id, obj4);
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    ActivityRecipient activityRecipient = (ActivityRecipient) linkedHashMap.get((String) it3.next());
                                    if (activityRecipient != null) {
                                        arrayList.add(activityRecipient);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(RecipientUtil.createRecipient((ActivityRecipient) it4.next(), false));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList2, anonymousClass1) == coroutineSingletons2) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof FamilyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1) {
                        familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1 = (FamilyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1) continuation;
                        int i11 = familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.label;
                        if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                            familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                            Object obj5 = familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                List list3 = (List) obj;
                                List list4 = list;
                                int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                                for (Object obj6 : list4) {
                                    String str = (String) obj6;
                                    Iterator it5 = list3.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj2 = it5.next();
                                            if (Intrinsics.areEqual(((com.squareup.cash.db.contacts.Recipient) obj2).customerId, str)) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    linkedHashMap2.put(obj6, (com.squareup.cash.db.contacts.Recipient) obj2);
                                }
                                familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(linkedHashMap2, familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1 = new FamilyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = familyHomePresenter$mapTokensToRecipients$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    break;
                case 2:
                    if (continuation instanceof RealInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1) {
                        realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1 = (RealInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1) continuation;
                        int i12 = realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.label;
                        if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                PolledData polledData = (PolledData) obj;
                                Map map = (Map) polledData.value;
                                boolean z2 = polledData.isStale;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                Iterator it6 = list.iterator();
                                while (it6.hasNext()) {
                                    SelectDiscoveries selectDiscoveries = (SelectDiscoveries) it6.next();
                                    DiscoveryHeader discoveryHeader = new DiscoveryHeader(selectDiscoveries.category_index, selectDiscoveries.category, selectDiscoveries.category_description);
                                    Object obj8 = linkedHashMap3.get(discoveryHeader);
                                    if (obj8 == null) {
                                        obj8 = new ArrayList();
                                        linkedHashMap3.put(discoveryHeader, obj8);
                                    }
                                    List list5 = (List) obj8;
                                    long j = selectDiscoveries.id;
                                    String str2 = selectDiscoveries.token;
                                    InvestmentEntityToken investmentEntityToken = new InvestmentEntityToken(str2);
                                    String str3 = selectDiscoveries.display_name;
                                    Image image2 = selectDiscoveries.icon;
                                    if (image2 == null) {
                                        String str4 = selectDiscoveries.icon_url;
                                        if (str4 != null) {
                                            it = it6;
                                            coroutineSingletons = coroutineSingletons4;
                                            image2 = new Image(str4, str4, 4);
                                        } else {
                                            coroutineSingletons = coroutineSingletons4;
                                            it = it6;
                                            image2 = null;
                                        }
                                    } else {
                                        coroutineSingletons = coroutineSingletons4;
                                        it = it6;
                                    }
                                    CurrentPrice currentPrice = (CurrentPrice) map.get(new InvestmentEntityToken(str2));
                                    String str5 = selectDiscoveries.symbol;
                                    Color color = selectDiscoveries.entity_color;
                                    if (color == null) {
                                        String str6 = selectDiscoveries.color;
                                        str6.getClass();
                                        color = ColorsKt.toColor(str6);
                                    }
                                    Color color2 = color;
                                    boolean z3 = selectDiscoveries.delisted;
                                    Money marketCap = RealInvestmentEntitiesKt.marketCap((CurrentPrice) map.get(new InvestmentEntityToken(str2)), selectDiscoveries.outstanding_shares);
                                    SyncInvestmentEntity.ReleaseStage releaseStage = selectDiscoveries.release_stage;
                                    if (releaseStage == null) {
                                        releaseStage = SyncInvestmentEntity.ReleaseStage.RELEASED;
                                    }
                                    list5.add(new InvestmentEntityWithPrice.Unowned(j, investmentEntityToken, str3, image2, currentPrice, str5, color2, z3, marketCap, releaseStage));
                                    it6 = it;
                                    coroutineSingletons4 = coroutineSingletons;
                                }
                                CoroutineSingletons coroutineSingletons5 = coroutineSingletons4;
                                PolledData polledData2 = new PolledData(linkedHashMap3, z2);
                                realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(polledData2, realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1 = new RealInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realInvestmentEntities$discoveryStocks$lambda$0$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof RealInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1) {
                        realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1 = (RealInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1) continuation;
                        int i13 = realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.label;
                        if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                PolledData polledData3 = (PolledData) obj;
                                Map map2 = (Map) polledData3.value;
                                boolean z4 = polledData3.isStale;
                                List list6 = list;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                Iterator it7 = list6.iterator();
                                while (it7.hasNext()) {
                                    OwnedHoldings ownedHoldings = (OwnedHoldings) it7.next();
                                    long j2 = ownedHoldings.id;
                                    String str7 = ownedHoldings.token;
                                    InvestmentEntityToken investmentEntityToken2 = new InvestmentEntityToken(str7);
                                    String str8 = ownedHoldings.display_name;
                                    Image image3 = ownedHoldings.icon;
                                    if (image3 == null) {
                                        String str9 = ownedHoldings.icon_url;
                                        it2 = it7;
                                        image = str9 != null ? new Image(str9, str9, i9) : null;
                                    } else {
                                        it2 = it7;
                                        image = image3;
                                    }
                                    CurrentPrice currentPrice2 = (CurrentPrice) map2.get(new InvestmentEntityToken(str7));
                                    String str10 = ownedHoldings.symbol;
                                    Color color3 = ownedHoldings.entity_color;
                                    if (color3 == null) {
                                        String str11 = ownedHoldings.color;
                                        str11.getClass();
                                        color3 = ColorsKt.toColor(str11);
                                    }
                                    Color color4 = color3;
                                    boolean z5 = ownedHoldings.delisted;
                                    Money marketCap2 = RealInvestmentEntitiesKt.marketCap((CurrentPrice) map2.get(new InvestmentEntityToken(str7)), ownedHoldings.outstanding_shares);
                                    SyncInvestmentEntity.ReleaseStage releaseStage2 = ownedHoldings.release_stage;
                                    if (releaseStage2 == null) {
                                        releaseStage2 = SyncInvestmentEntity.ReleaseStage.RELEASED;
                                    }
                                    arrayList3.add(new InvestmentEntityWithPrice.Following(j2, investmentEntityToken2, str8, image, currentPrice2, str10, color4, z5, marketCap2, releaseStage2));
                                    it7 = it2;
                                    i9 = 4;
                                }
                                PolledData polledData4 = new PolledData(arrayList3, z4);
                                realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(polledData4, realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1 = new RealInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realInvestmentEntities$followingStocks$lambda$0$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof RealInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1) {
                        realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1 = (RealInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1) continuation;
                        int i14 = realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.label;
                        if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                boolean z6 = ((PolledData) obj).isStale;
                                List list7 = list;
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                Iterator it8 = list7.iterator();
                                while (it8.hasNext()) {
                                    arrayList4.add(new InvestmentEntityToken(((Investment_holding) it8.next()).token));
                                }
                                PolledData polledData5 = new PolledData(arrayList4, z6);
                                realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(polledData5, realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj10);
                            }
                            break;
                        }
                    }
                    realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1 = new RealInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realInvestmentEntities$ownedTokens$lambda$0$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof RealCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1) {
                        realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1 = (RealCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1) continuation;
                        int i15 = realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.label;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.label = i15 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                Map map3 = (Map) ((PolledData) obj).value;
                                List<Investment_entity> list8 = list;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                for (Investment_entity investment_entity : list8) {
                                    arrayList5.add(new SearchResult.InvestmentEntitySearchResult(RealInvestmentEntitiesKt.asUnowned(investment_entity, (CurrentPrice) map3.get(new InvestmentEntityToken(investment_entity.token)))));
                                }
                                realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList5, realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1 = new RealCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realCategoryBackend$performSearch$lambda$1$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                default:
                    if (continuation instanceof RealOfflineManager$isDuplicatePayment$$inlined$map$1$2$1) {
                        realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1 = (RealOfflineManager$isDuplicatePayment$$inlined$map$1$2$1) continuation;
                        int i16 = realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.label;
                        if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                            realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                List list9 = (List) obj;
                                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                    Iterator it9 = list9.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            if (CollectionsKt.intersect(list, CollectionsKt.toSet(((InitiatePaymentRequest) it9.next()).payment_getters)).size() == list.size()) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                Boolean valueOf = Boolean.valueOf(z);
                                realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj12);
                            }
                            break;
                        }
                    }
                    realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1 = new RealOfflineManager$isDuplicatePayment$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realOfflineManager$isDuplicatePayment$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealCustomerStore$getCustomersForIds$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, List list, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
        this.$customerIds$inlined = list;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        List list = this.$customerIds$inlined;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, list, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, list, 6), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
