package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.favorites.viewmodels.FavoriteViewModel;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSaleChipViewModel;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.pools.presenters.PoolContributeWithNotePresenter;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeBoostToken$delegate;
    public final /* synthetic */ MutableState $browseListingViewModel$delegate;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$2$1(MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$browseListingViewModel$delegate = mutableState;
        this.$activeBoostToken$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$activeBoostToken$delegate;
        MutableState mutableState2 = this.$browseListingViewModel$delegate;
        switch (i) {
            case 0:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 0);
            case 1:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 1);
            case 2:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 2);
            case 3:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 3);
            case 4:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 4);
            case 5:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 5);
            case 6:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 6);
            case 7:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 7);
            case 8:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 8);
            case 9:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 9);
            case 10:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 10);
            case 11:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 11);
            case 12:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 12);
            case 13:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 13);
            case 14:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 14);
            default:
                return new OffersHomePresenter$models$2$1(mutableState2, mutableState, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 0;
        String str3 = null;
        MutableState mutableState = this.$activeBoostToken$delegate;
        MutableState mutableState2 = this.$browseListingViewModel$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomeListingViewModel offersHomeListingViewModel = (OffersHomeListingViewModel) mutableState2.getValue();
                OffersHomeListingViewModel.Loaded loaded = offersHomeListingViewModel instanceof OffersHomeListingViewModel.Loaded ? (OffersHomeListingViewModel.Loaded) offersHomeListingViewModel : null;
                if (loaded == null) {
                    break;
                } else {
                    AbstractPersistentList abstractPersistentList = loaded.items;
                    String str4 = (String) mutableState.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList, 10));
                    ListIterator listIterator = abstractPersistentList.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object obj2 = (OffersHomeListItemViewModel) listIterator.next();
                        if (obj2 instanceof OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) {
                            OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel cLOClusterSectionViewModel = (OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) obj2;
                            AbstractPersistentList abstractPersistentList2 = cLOClusterSectionViewModel.offersList;
                            ArrayList arrayList2 = new ArrayList();
                            ListIterator listIterator2 = abstractPersistentList2.listIterator(i3);
                            while (listIterator2.hasNext()) {
                                Object next = listIterator2.next();
                                if (next instanceof ClusterItem.CLOClusterItemViewModel) {
                                    arrayList2.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, i2));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ClusterItem.CLOClusterItemViewModel cLOClusterItemViewModel = (ClusterItem.CLOClusterItemViewModel) it.next();
                                boolean z = (str4 == null || !str4.equals(cLOClusterItemViewModel.boostToken)) ? i3 : 1;
                                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = cLOClusterItemViewModel.avatar;
                                StyledText styledText = cLOClusterItemViewModel.title;
                                StyledText styledText2 = cLOClusterItemViewModel.subTitle;
                                String str5 = cLOClusterItemViewModel.actionUrl;
                                String str6 = cLOClusterItemViewModel.offerToken;
                                OffersItemToken offersItemToken = cLOClusterItemViewModel.itemToken;
                                OffersSaleChipViewModel offersSaleChipViewModel = cLOClusterItemViewModel.saleChip;
                                ImmutableList immutableList = cLOClusterItemViewModel.tapEventSpecs;
                                OffersAnalyticsEventSpec offersAnalyticsEventSpec = cLOClusterItemViewModel.impressionEventSpec;
                                String str7 = cLOClusterItemViewModel.boostToken;
                                str6.getClass();
                                immutableList.getClass();
                                str7.getClass();
                                arrayList3.add(new ClusterItem.CLOClusterItemViewModel(legacyOffersAvatarViewModel, styledText, styledText2, str5, str6, offersItemToken, offersSaleChipViewModel, immutableList, offersAnalyticsEventSpec, str7, z));
                                i3 = 0;
                            }
                            AbstractPersistentList persistentList = Tags.toPersistentList(arrayList3);
                            str = null;
                            obj2 = OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel.copy$default(cLOClusterSectionViewModel, persistentList, null, 27);
                        } else if (obj2 instanceof OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) {
                            OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel clusterSectionViewModel = (OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) obj2;
                            AbstractPersistentList abstractPersistentList3 = clusterSectionViewModel.offersList;
                            ArrayList arrayList4 = new ArrayList();
                            boolean z2 = false;
                            ListIterator listIterator3 = abstractPersistentList3.listIterator(0);
                            while (listIterator3.hasNext()) {
                                Object next2 = listIterator3.next();
                                if (next2 instanceof ClusterItem.ClusterItemViewModel) {
                                    arrayList4.add(next2);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                ClusterItem.ClusterItemViewModel clusterItemViewModel = (ClusterItem.ClusterItemViewModel) it2.next();
                                boolean z3 = (str4 == null || !str4.equals(clusterItemViewModel.boostToken)) ? z2 : true;
                                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel2 = clusterItemViewModel.avatar;
                                StyledText styledText3 = clusterItemViewModel.title;
                                StyledText styledText4 = clusterItemViewModel.subTitle;
                                String str8 = clusterItemViewModel.actionUrl;
                                String str9 = clusterItemViewModel.offerToken;
                                OffersItemToken offersItemToken2 = clusterItemViewModel.itemToken;
                                Iterator it3 = it2;
                                OffersSaleChipViewModel offersSaleChipViewModel2 = clusterItemViewModel.saleChip;
                                ImmutableList immutableList2 = clusterItemViewModel.tapEventSpecs;
                                OffersAnalyticsEventSpec offersAnalyticsEventSpec2 = clusterItemViewModel.impressionEventSpec;
                                String str10 = clusterItemViewModel.boostToken;
                                str9.getClass();
                                immutableList2.getClass();
                                arrayList5.add(new ClusterItem.ClusterItemViewModel(legacyOffersAvatarViewModel2, styledText3, styledText4, str8, str9, offersItemToken2, offersSaleChipViewModel2, immutableList2, offersAnalyticsEventSpec2, str10, z3));
                                it2 = it3;
                                z2 = false;
                            }
                            str = null;
                            obj2 = OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel.copy$default(clusterSectionViewModel, Tags.toPersistentList(arrayList5), null, 27);
                        } else {
                            str = null;
                        }
                        arrayList.add(obj2);
                        str3 = str;
                        i2 = 10;
                        i3 = 0;
                    }
                    OffersHomeListingViewModel.Loaded copy$default = OffersHomeListingViewModel.Loaded.copy$default(loaded, str3, Tags.toPersistentList(arrayList), 5);
                    if (Intrinsics.areEqual(copy$default.items, abstractPersistentList)) {
                        break;
                    } else {
                        mutableState2.setValue(copy$default);
                        break;
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue((BitcoinDisplayUnits) mutableState2.getValue());
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProfileAlias profileAlias = (ProfileAlias) CollectionsKt.firstOrNull((List) mutableState2.getValue());
                if (profileAlias == null || (str2 = profileAlias.canonical_text) == null) {
                    str2 = "No email available";
                }
                mutableState.setValue(str2);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i4 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                if (((String) mutableState2.getValue()) != null) {
                    mutableState.setValue((String) mutableState2.getValue());
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list = (List) mutableState2.getValue();
                List list2 = (List) mutableState.getValue();
                list.getClass();
                list2.getClass();
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((SectionViewModel) it4.next()).favorites, arrayList6);
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    FavoriteViewModel favoriteViewModel = (FavoriteViewModel) it5.next();
                    linkedHashMap.put(favoriteViewModel.customerId, new Pair(Boolean.valueOf(favoriteViewModel.isFavorited), Boolean.valueOf(favoriteViewModel.isRequestInFlight)));
                }
                List<SectionViewModel> list3 = list;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (SectionViewModel sectionViewModel : list3) {
                    List<FavoriteViewModel> list4 = sectionViewModel.favorites;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (FavoriteViewModel favoriteViewModel2 : list4) {
                        String str11 = favoriteViewModel2.customerId;
                        boolean z4 = favoriteViewModel2.isFavorited;
                        Pair pair = (Pair) linkedHashMap.get(str11);
                        if (pair != null && ((Boolean) pair.first).booleanValue() != z4 && ((Boolean) pair.second).booleanValue()) {
                            favoriteViewModel2 = FavoriteViewModel.copy$default(favoriteViewModel2, false, z4, 3999);
                        } else if (pair != null && ((Boolean) pair.first).booleanValue() == z4 && ((Boolean) pair.second).booleanValue()) {
                            favoriteViewModel2 = FavoriteViewModel.copy$default(favoriteViewModel2, true, false, 4063);
                        }
                        arrayList8.add(favoriteViewModel2);
                    }
                    arrayList7.add(SectionViewModel.copy$default(sectionViewModel, arrayList8));
                }
                mutableState.setValue(arrayList7);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    break;
                } else {
                    mutableState2.setValue(Boolean.FALSE);
                    mutableState.setValue(new InvestingCustomOrderViewEvent.SelectedPrice(null));
                    break;
                }
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomeListingViewModel offersHomeListingViewModel2 = (OffersHomeListingViewModel) mutableState2.getValue();
                OffersHomeListingViewModel.Loaded loaded2 = offersHomeListingViewModel2 instanceof OffersHomeListingViewModel.Loaded ? (OffersHomeListingViewModel.Loaded) offersHomeListingViewModel2 : null;
                if (loaded2 == null) {
                    break;
                } else {
                    AbstractPersistentList abstractPersistentList4 = loaded2.items;
                    OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel = (OffersHomeListItemViewModel.HeroOffersTileViewModel) mutableState.getValue();
                    heroOffersTileViewModel.getClass();
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList4, 10));
                    ListIterator listIterator4 = abstractPersistentList4.listIterator(0);
                    while (listIterator4.hasNext()) {
                        OffersHomeListItemViewModel offersHomeListItemViewModel = (OffersHomeListItemViewModel) listIterator4.next();
                        if (offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel) {
                            offersHomeListItemViewModel = heroOffersTileViewModel;
                        }
                        arrayList9.add(offersHomeListItemViewModel);
                    }
                    OffersHomeListingViewModel.Loaded copy$default2 = OffersHomeListingViewModel.Loaded.copy$default(loaded2, null, Tags.toPersistentList(arrayList9), 5);
                    if (Intrinsics.areEqual(copy$default2.items, abstractPersistentList4)) {
                        break;
                    } else {
                        mutableState2.setValue(copy$default2);
                        break;
                    }
                }
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomeListingViewModel offersHomeListingViewModel3 = (OffersHomeListingViewModel) mutableState2.getValue();
                OffersHomeListingViewModel.Loaded loaded3 = offersHomeListingViewModel3 instanceof OffersHomeListingViewModel.Loaded ? (OffersHomeListingViewModel.Loaded) offersHomeListingViewModel3 : null;
                if (loaded3 == null) {
                    break;
                } else {
                    String str12 = (String) mutableState.getValue();
                    str12.getClass();
                    AbstractPersistentList abstractPersistentList5 = loaded3.items;
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList5, 10));
                    ListIterator listIterator5 = abstractPersistentList5.listIterator(0);
                    while (listIterator5.hasNext()) {
                        Object obj3 = (OffersHomeListItemViewModel) listIterator5.next();
                        if (obj3 instanceof OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) {
                            obj3 = OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel.copy$default((OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) obj3, null, str12, 23);
                        } else if (obj3 instanceof OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) {
                            obj3 = OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel.copy$default((OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) obj3, null, str12, 23);
                        } else if (obj3 instanceof OffersHomeListItemViewModel.CategoryTilesSectionViewModel) {
                            OffersHomeListItemViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel = (OffersHomeListItemViewModel.CategoryTilesSectionViewModel) obj3;
                            String str13 = categoryTilesSectionViewModel.id;
                            OffersAnalyticsEventSpec offersAnalyticsEventSpec3 = categoryTilesSectionViewModel.impressionEventSpec;
                            OffersHeaderViewModel offersHeaderViewModel = categoryTilesSectionViewModel.header;
                            AbstractPersistentList abstractPersistentList6 = categoryTilesSectionViewModel.tiles;
                            str13.getClass();
                            abstractPersistentList6.getClass();
                            obj3 = new OffersHomeListItemViewModel.CategoryTilesSectionViewModel(str13, str12, offersAnalyticsEventSpec3, offersHeaderViewModel, abstractPersistentList6);
                        }
                        arrayList10.add(obj3);
                    }
                    mutableState2.setValue(OffersHomeListingViewModel.Loaded.copy$default(loaded3, str12, Tags.toPersistentList(arrayList10), 4));
                    break;
                }
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, null, null, null, false, false, (PaymentPadTheme) mutableState.getValue(), false, false, null, 3839));
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, null, null, null, false, false, null, false, Intrinsics.areEqual((Boolean) mutableState.getValue(), Boolean.TRUE), null, 3071));
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, !((Boolean) mutableState.getValue()).booleanValue(), false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777183));
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue((PaymentConfigurationStep) mutableState2.getValue());
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Boolean bool = (Boolean) mutableState2.getValue();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, booleanValue ? ((PaymentRouterData) mutableState.getValue()).scheduleSelection : null, null, booleanValue, 6291455));
                    break;
                } else {
                    break;
                }
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AbstractPersistentList abstractPersistentList7 = PoolContributeWithNotePresenter.quickAmounts;
                PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) mutableState2.getValue();
                PoolContributeWithNoteViewModel.Review review = poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.Review ? (PoolContributeWithNoteViewModel.Review) poolContributeWithNoteViewModel : null;
                if (review != null) {
                    mutableState2.setValue(PoolContributeWithNoteViewModel.Review.copy$default(review, (InstrumentSelectionRowViewModel) mutableState.getValue(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE));
                }
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MapBuilder mapBuilder = new MapBuilder();
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                Map map = (Map) mutableState2.getValue();
                if (map != null) {
                    mapBuilder.putAll(map);
                }
                HashMap hashMap = (HashMap) mutableState.getValue();
                if (hashMap != null) {
                    mapBuilder.putAll(hashMap);
                }
                mutableState2.setValue(mapBuilder.build());
                break;
            default:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str14 = (String) mutableState2.getValue();
                if (str14 != null) {
                    mutableState.setValue(new ScreenshotReviewViewModel.ViewingScreenshot(((ScreenshotReviewViewModel) mutableState.getValue()).getScreenshotList(), str14));
                } else {
                    mutableState.setValue(new ScreenshotReviewViewModel.Loaded(((ScreenshotReviewViewModel) mutableState.getValue()).getScreenshotList(), false));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
