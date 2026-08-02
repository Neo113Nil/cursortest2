package com.squareup.cash.db2.profile.documents;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.ArcadeInfoBlockerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.moneybot.views.rawmessages.RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import retrofit2.OkHttpCall;

/* loaded from: classes6.dex */
public final /* synthetic */ class DocumentQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ DocumentQueries$$ExternalSyntheticLambda0(RealOffersSearchPresenter realOffersSearchPresenter, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState6, State state) {
        this.f$0 = realOffersSearchPresenter;
        this.f$1 = coroutineScope;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
        this.f$5 = mutableState3;
        this.f$6 = mutableState4;
        this.f$8 = mutableState5;
        this.f$4 = parcelableSnapshotMutableIntState;
        this.f$7 = mutableState6;
        this.f$9 = state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ba, code lost:
    
        if (((java.lang.Boolean) r11.getValue()).booleanValue() == false) goto L75;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        Object obj2;
        int i = this.$r8$classId;
        int i2 = 2;
        Object obj3 = this.f$9;
        Object obj4 = this.f$7;
        Object obj5 = this.f$4;
        Object obj6 = this.f$8;
        Object obj7 = this.f$6;
        Object obj8 = this.f$5;
        Object obj9 = this.f$3;
        Object obj10 = this.f$2;
        Object obj11 = this.f$0;
        Object obj12 = this.f$1;
        final int i3 = 1;
        switch (i) {
            case 0:
                VersionData versionData = (VersionData) obj4;
                String str = (String) obj6;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj3;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj11, 1, (String) obj12);
                androidStatement.bindString(2, (String) obj10);
                androidStatement.bindString(3, (String) obj9);
                androidStatement.bindLong(4, (Long) obj5);
                androidStatement.bindString(5, (String) obj8);
                androidStatement.bindString(6, (String) obj7);
                androidStatement.bindBytes(7, versionData != null ? (byte[]) ((Local_tab_content.Adapter) instrumentQueries.instrumentAdapter).responseAdapter.encode(versionData) : null);
                androidStatement.bindString(8, str);
                break;
            case 1:
                RealOffersSearchPresenter realOffersSearchPresenter = (RealOffersSearchPresenter) obj11;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = realOffersSearchPresenter.isLoadingFullscreen$delegate;
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersSearchPresenter.analyticsHelper;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = realOffersSearchPresenter.isRestoringFromSearchMode$delegate;
                RealOffersAnalytics realOffersAnalytics = realOffersSearchPresenter.analytics;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = realOffersSearchPresenter.searchFilterTokens$delegate;
                CoroutineScope coroutineScope = (CoroutineScope) obj12;
                MutableState mutableState = (MutableState) obj10;
                MutableState mutableState2 = (MutableState) obj9;
                MutableState mutableState3 = (MutableState) obj8;
                MutableState mutableState4 = (MutableState) obj7;
                MutableState mutableState5 = (MutableState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                MutableState mutableState6 = (MutableState) obj4;
                State state = (State) obj3;
                OffersSearchViewEvent offersSearchViewEvent = (OffersSearchViewEvent) obj;
                offersSearchViewEvent.getClass();
                if (offersSearchViewEvent instanceof OffersAnalyticsViewEvent) {
                    RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, ((OffersAnalyticsViewEvent) offersSearchViewEvent).getAnalyticsActionEventSpecs());
                }
                if (!(offersSearchViewEvent instanceof OffersSearchViewEvent.SearchTextChanged)) {
                    if (!(offersSearchViewEvent instanceof ItemViewed)) {
                        Object obj13 = null;
                        r5 = null;
                        r5 = null;
                        String str2 = null;
                        if (!(offersSearchViewEvent instanceof OffersSearchViewEvent.FilterGroupClicked)) {
                            if (!offersSearchViewEvent.equals(OffersSearchViewEvent.ResetSearch.INSTANCE)) {
                                if (!offersSearchViewEvent.equals(OffersSearchViewEvent.ErrorRetryClicked.INSTANCE)) {
                                    if (!(offersSearchViewEvent instanceof OffersSearchViewEvent.FilterGroupApplied)) {
                                        if (!(offersSearchViewEvent instanceof OffersSearchViewEvent.FilterRowClicked)) {
                                            if (!(offersSearchViewEvent instanceof OfferItemClicked)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                JobKt.launch$default(coroutineScope, null, null, new RealMRIFactory$sign$2(offersSearchViewEvent, realOffersSearchPresenter, mutableState2, null, 18), 3);
                                            }
                                        } else {
                                            Iterator it = ((List) state.getValue()).iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (((Set) next).contains(((OffersSearchViewEvent.FilterRowClicked) offersSearchViewEvent).filterToken)) {
                                                        obj13 = next;
                                                    }
                                                }
                                            }
                                            Set set = (Set) obj13;
                                            if (set == null) {
                                                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data validation: ", ((OffersSearchViewEvent.FilterRowClicked) offersSearchViewEvent).filterToken, " cannot be found and applied"));
                                                break;
                                            } else {
                                                String str3 = ((OffersSearchViewEvent.FilterRowClicked) offersSearchViewEvent).filterToken;
                                                LinkedHashSet mutableSet = CollectionsKt.toMutableSet((Set) mutableState4.getValue());
                                                mutableSet.removeAll(set);
                                                if (str3 != null) {
                                                    mutableSet.add(str3);
                                                }
                                                mutableState6.setValue(Boolean.valueOf(!Intrinsics.areEqual((Set) mutableState4.getValue(), mutableSet)));
                                                parcelableSnapshotMutableState3.setValue(CollectionsKt.joinToString$default(mutableSet, ",", null, null, 0, null, null, 62));
                                                parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                                                mutableState.setValue("");
                                                str3.getClass();
                                                realOffersAnalyticsHelper.searchSourceScreen = "SEARCH";
                                                realOffersAnalyticsHelper.searchSourceSection = "SEARCH_RESULTS";
                                                realOffersAnalyticsHelper.searchSourceFilter = str3;
                                            }
                                        }
                                    } else {
                                        OffersSearchViewEvent.FilterGroupApplied filterGroupApplied = (OffersSearchViewEvent.FilterGroupApplied) offersSearchViewEvent;
                                        Set set2 = (Set) ((List) state.getValue()).get(filterGroupApplied.filterGroupIndex);
                                        String str4 = filterGroupApplied.selectedFilterToken;
                                        LinkedHashSet mutableSet2 = CollectionsKt.toMutableSet((Set) mutableState4.getValue());
                                        mutableSet2.removeAll(set2);
                                        if (str4 != null) {
                                            mutableSet2.add(str4);
                                        }
                                        mutableState6.setValue(Boolean.valueOf(!Intrinsics.areEqual((Set) mutableState4.getValue(), mutableSet2)));
                                        parcelableSnapshotMutableState3.setValue(CollectionsKt.joinToString$default(mutableSet2, ",", null, null, 0, null, null, 62));
                                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                                    }
                                } else if (((Boolean) mutableState5.getValue()).booleanValue()) {
                                    break;
                                } else {
                                    mutableState6.setValue(Boolean.TRUE);
                                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                                }
                            } else {
                                parcelableSnapshotMutableState3.setValue("");
                                mutableState.setValue("");
                                break;
                            }
                        } else {
                            List list2 = ((FilterGroupSection) mutableState3.getValue()).filter_group_items;
                            int i4 = ((OffersSearchViewEvent.FilterGroupClicked) offersSearchViewEvent).filterGroupIndex;
                            FilterGroupSection.FilterGroupItem filterGroupItem = (FilterGroupSection.FilterGroupItem) list2.get(i4);
                            BetterNavigator.ScreenNavigator screenNavigator = realOffersSearchPresenter.navigator;
                            Set set3 = (Set) mutableState4.getValue();
                            FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupItem.sheet;
                            if (sheet != null && (list = sheet.filter_items) != null) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (CollectionsKt.contains(set3, ((FilterGroupSection.FilterGroupItem.FilterItem) obj2).filter_token)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj2;
                                if (filterItem != null) {
                                    str2 = filterItem.filter_token;
                                }
                            }
                            screenNavigator.goTo(new OffersScreen$OffersFilterGroupSheetScreen(i4, str2));
                        }
                    } else {
                        RealOffersAnalytics.trackImpressionAnalyticsEvents$default(realOffersAnalytics, ((ItemViewed) offersSearchViewEvent).analyticsEventSpecs);
                    }
                } else {
                    String str5 = ((OffersSearchViewEvent.SearchTextChanged) offersSearchViewEvent).searchText;
                    mutableState.setValue(str5);
                    if (((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                        parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    } else if (((Boolean) mutableState2.getValue()).booleanValue() && str5.length() == 0) {
                        realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
                    }
                }
                break;
            case 2:
                SyncBusinessGrant.ActionType actionType = (SyncBusinessGrant.ActionType) obj6;
                String str6 = (String) obj9;
                SyncBusinessGrant.RenderingBehavior renderingBehavior = (SyncBusinessGrant.RenderingBehavior) obj4;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj3;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, (String) obj11, 1, (String) obj12);
                androidStatement2.bindLong(2, (Long) obj5);
                androidStatement2.bindLong(3, (Long) obj8);
                androidStatement2.bindLong(4, (Long) obj7);
                androidStatement2.bindString(5, (String) obj10);
                androidStatement2.bindString(6, actionType != null ? (String) ((EnumColumnAdapter) ((OkHttpCall.AnonymousClass1) gpsConfigQueries.gpsConfigAdapter).val$callback).encode(actionType) : null);
                androidStatement2.bindString(7, str6);
                androidStatement2.bindString(8, renderingBehavior != null ? (String) ((EnumColumnAdapter) ((OkHttpCall.AnonymousClass1) gpsConfigQueries.gpsConfigAdapter).this$0).encode(renderingBehavior) : null);
                break;
            default:
                InstitutionPickerState.Payload payload = (InstitutionPickerState.Payload) obj12;
                final String str7 = (String) obj11;
                final Function2 function2 = (Function2) obj10;
                Async async = (Async) obj9;
                Function0 function0 = (Function0) obj8;
                FocusRequester focusRequester = (FocusRequester) obj7;
                MutableState mutableState7 = (MutableState) obj6;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, InstitutionPickerScreenKt.lambda$973582777, 3);
                LazyListScope.item$default(lazyListScope, null, null, InstitutionPickerScreenKt.f805lambda$1974987728, 3);
                LazyListScope.stickyHeader$default(lazyListScope, "searchRow", new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(focusRequester, mutableState7, (Function1) obj5, 17), true, 2097204933), 2);
                LazyListScope.item$default(lazyListScope, null, null, InstitutionPickerScreenKt.lambda$1808967409, 3);
                boolean isBlank = StringsKt.isBlank((String) mutableState7.getValue());
                HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(17, (CoroutineScope) obj4, focusRequester, (LazyListState) obj3);
                int i5 = 20;
                if (!isBlank) {
                    int i6 = 19;
                    if (!(async instanceof Async.Fail)) {
                        if (!(async instanceof Async.Uninitialized) && !(async instanceof Async.Loading)) {
                            if (!(async instanceof Async.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                InstitutionResponse institutionResponse = (InstitutionResponse) ((Async.Success) async).value;
                                if (institutionResponse.data.isEmpty()) {
                                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i5, async, function0), true, 783719406), 3);
                                } else {
                                    final List list3 = institutionResponse.data;
                                    lazyListScope.items(list3.size(), new OverridingUtil.AnonymousClass7(11, new MarkdownParser$$ExternalSyntheticLambda0(22), list3), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list3, 19), new ComposableLambdaImpl(new Function4() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$$inlined$items$default$4
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj14, Object obj15, Object obj16, Object obj17) {
                                            int i7;
                                            int i8;
                                            int i9 = i3;
                                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                            List list4 = list3;
                                            String str8 = str7;
                                            final Function2 function22 = function2;
                                            char c = 1;
                                            final int i10 = 0;
                                            switch (i9) {
                                                case 0:
                                                    LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj14;
                                                    int intValue = ((Number) obj15).intValue();
                                                    Composer composer = (Composer) obj16;
                                                    int intValue2 = ((Number) obj17).intValue();
                                                    if ((intValue2 & 6) == 0) {
                                                        i7 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                                    } else {
                                                        i7 = intValue2;
                                                    }
                                                    if ((intValue2 & 48) == 0) {
                                                        i7 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                                    }
                                                    GapComposer gapComposer = (GapComposer) composer;
                                                    if (gapComposer.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                                                        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) list4.get(intValue);
                                                        gapComposer.startReplaceGroup(2090414815);
                                                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                                                        boolean areEqual = Intrinsics.areEqual(str8, financialConnectionsInstitution.id);
                                                        boolean equals = str8 != null ? str8.equals(financialConnectionsInstitution.id) : true;
                                                        boolean changed = gapComposer.changed(function22);
                                                        Object rememberedValue = gapComposer.rememberedValue();
                                                        if (changed || rememberedValue == neverEqualPolicy) {
                                                            rememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$2$2$1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj18) {
                                                                    int i11 = i10;
                                                                    Function2 function23 = function22;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) obj18;
                                                                            financialConnectionsInstitution2.getClass();
                                                                            function23.invoke(financialConnectionsInstitution2, Boolean.TRUE);
                                                                            break;
                                                                        default:
                                                                            FinancialConnectionsInstitution financialConnectionsInstitution3 = (FinancialConnectionsInstitution) obj18;
                                                                            financialConnectionsInstitution3.getClass();
                                                                            function23.invoke(financialConnectionsInstitution3, Boolean.FALSE);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                        }
                                                        InstitutionPickerScreenKt.InstitutionResultTile(m298padding3ABfNKs, financialConnectionsInstitution, areEqual, equals, (Function1) rememberedValue, gapComposer, 6);
                                                        gapComposer.end(false);
                                                    } else {
                                                        gapComposer.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj14;
                                                    int intValue3 = ((Number) obj15).intValue();
                                                    Composer composer2 = (Composer) obj16;
                                                    int intValue4 = ((Number) obj17).intValue();
                                                    if ((intValue4 & 6) == 0) {
                                                        i8 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                                    } else {
                                                        i8 = intValue4;
                                                    }
                                                    if ((intValue4 & 48) == 0) {
                                                        i8 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                                    }
                                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                                                        FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) list4.get(intValue3);
                                                        gapComposer2.startReplaceGroup(48291795);
                                                        Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                                                        boolean areEqual2 = Intrinsics.areEqual(str8, financialConnectionsInstitution2.id);
                                                        boolean equals2 = str8 != null ? str8.equals(financialConnectionsInstitution2.id) : true;
                                                        boolean changed2 = gapComposer2.changed(function22);
                                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                                            final char c2 = c == true ? 1 : 0;
                                                            rememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$2$2$1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj18) {
                                                                    int i11 = c2;
                                                                    Function2 function23 = function22;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            FinancialConnectionsInstitution financialConnectionsInstitution22 = (FinancialConnectionsInstitution) obj18;
                                                                            financialConnectionsInstitution22.getClass();
                                                                            function23.invoke(financialConnectionsInstitution22, Boolean.TRUE);
                                                                            break;
                                                                        default:
                                                                            FinancialConnectionsInstitution financialConnectionsInstitution3 = (FinancialConnectionsInstitution) obj18;
                                                                            financialConnectionsInstitution3.getClass();
                                                                            function23.invoke(financialConnectionsInstitution3, Boolean.FALSE);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                                        }
                                                        InstitutionPickerScreenKt.InstitutionResultTile(m298padding3ABfNKs2, financialConnectionsInstitution2, areEqual2, equals2, (Function1) rememberedValue2, gapComposer2, 6);
                                                        gapComposer2.end(false);
                                                    } else {
                                                        gapComposer2.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 802480018));
                                    if (Intrinsics.areEqual(institutionResponse.showManualEntry, Boolean.TRUE)) {
                                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(str7, function0, 5), true, -1239708726), 3);
                                    }
                                }
                            }
                        } else {
                            List list4 = CollectionsKt.toList(new IntRange(0, 10, 1));
                            lazyListScope.items(list4.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list4, 21), new ComposableLambdaImpl(new RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4(list4, i2), true, 802480018));
                        }
                    } else {
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i6, payload, function0), true, 1155988401), 3);
                    }
                } else {
                    final List list5 = payload.featuredInstitutions.data;
                    final int i7 = 0;
                    lazyListScope.items(list5.size(), new OverridingUtil.AnonymousClass7(12, new MarkdownParser$$ExternalSyntheticLambda0(21), list5), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list5, 20), new ComposableLambdaImpl(new Function4() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj14, Object obj15, Object obj16, Object obj17) {
                            int i72;
                            int i8;
                            int i9 = i7;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            List list42 = list5;
                            String str8 = str7;
                            final Function2 function22 = function2;
                            char c = 1;
                            final int i10 = 0;
                            switch (i9) {
                                case 0:
                                    LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj14;
                                    int intValue = ((Number) obj15).intValue();
                                    Composer composer = (Composer) obj16;
                                    int intValue2 = ((Number) obj17).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        i72 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                    } else {
                                        i72 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i72 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i72 & 1, (i72 & 147) != 146)) {
                                        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) list42.get(intValue);
                                        gapComposer.startReplaceGroup(2090414815);
                                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                                        boolean areEqual = Intrinsics.areEqual(str8, financialConnectionsInstitution.id);
                                        boolean equals = str8 != null ? str8.equals(financialConnectionsInstitution.id) : true;
                                        boolean changed = gapComposer.changed(function22);
                                        Object rememberedValue = gapComposer.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$2$2$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj18) {
                                                    int i11 = i10;
                                                    Function2 function23 = function22;
                                                    switch (i11) {
                                                        case 0:
                                                            FinancialConnectionsInstitution financialConnectionsInstitution22 = (FinancialConnectionsInstitution) obj18;
                                                            financialConnectionsInstitution22.getClass();
                                                            function23.invoke(financialConnectionsInstitution22, Boolean.TRUE);
                                                            break;
                                                        default:
                                                            FinancialConnectionsInstitution financialConnectionsInstitution3 = (FinancialConnectionsInstitution) obj18;
                                                            financialConnectionsInstitution3.getClass();
                                                            function23.invoke(financialConnectionsInstitution3, Boolean.FALSE);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer.updateRememberedValue(rememberedValue);
                                        }
                                        InstitutionPickerScreenKt.InstitutionResultTile(m298padding3ABfNKs, financialConnectionsInstitution, areEqual, equals, (Function1) rememberedValue, gapComposer, 6);
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj14;
                                    int intValue3 = ((Number) obj15).intValue();
                                    Composer composer2 = (Composer) obj16;
                                    int intValue4 = ((Number) obj17).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        i8 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                    } else {
                                        i8 = intValue4;
                                    }
                                    if ((intValue4 & 48) == 0) {
                                        i8 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                                        FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) list42.get(intValue3);
                                        gapComposer2.startReplaceGroup(48291795);
                                        Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                                        boolean areEqual2 = Intrinsics.areEqual(str8, financialConnectionsInstitution2.id);
                                        boolean equals2 = str8 != null ? str8.equals(financialConnectionsInstitution2.id) : true;
                                        boolean changed2 = gapComposer2.changed(function22);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                            final int c2 = c == true ? 1 : 0;
                                            rememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$searchResults$2$2$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj18) {
                                                    int i11 = c2;
                                                    Function2 function23 = function22;
                                                    switch (i11) {
                                                        case 0:
                                                            FinancialConnectionsInstitution financialConnectionsInstitution22 = (FinancialConnectionsInstitution) obj18;
                                                            financialConnectionsInstitution22.getClass();
                                                            function23.invoke(financialConnectionsInstitution22, Boolean.TRUE);
                                                            break;
                                                        default:
                                                            FinancialConnectionsInstitution financialConnectionsInstitution3 = (FinancialConnectionsInstitution) obj18;
                                                            financialConnectionsInstitution3.getClass();
                                                            function23.invoke(financialConnectionsInstitution3, Boolean.FALSE);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        InstitutionPickerScreenKt.InstitutionResultTile(m298padding3ABfNKs2, financialConnectionsInstitution2, areEqual2, equals2, (Function1) rememberedValue2, gapComposer2, 6);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 802480018));
                    LazyListScope.item$default(lazyListScope, "search_more", null, new ComposableLambdaImpl(new WorkTitleBarViewKt$$ExternalSyntheticLambda4(18, heroCardViewKt$$ExternalSyntheticLambda9, str7), true, 1112912850), 2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DocumentQueries$$ExternalSyntheticLambda0(InstitutionPickerState.Payload payload, String str, Function2 function2, Async async, Function0 function0, FocusRequester focusRequester, MutableState mutableState, Function1 function1, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.f$1 = payload;
        this.f$0 = str;
        this.f$2 = function2;
        this.f$3 = async;
        this.f$5 = function0;
        this.f$6 = focusRequester;
        this.f$8 = mutableState;
        this.f$4 = function1;
        this.f$7 = coroutineScope;
        this.f$9 = lazyListState;
    }

    public /* synthetic */ DocumentQueries$$ExternalSyntheticLambda0(String str, String str2, Long l, Long l2, Long l3, String str3, SyncBusinessGrant.ActionType actionType, String str4, SyncBusinessGrant.RenderingBehavior renderingBehavior, GpsConfigQueries gpsConfigQueries) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$4 = l;
        this.f$5 = l2;
        this.f$6 = l3;
        this.f$2 = str3;
        this.f$8 = actionType;
        this.f$3 = str4;
        this.f$7 = renderingBehavior;
        this.f$9 = gpsConfigQueries;
    }

    public /* synthetic */ DocumentQueries$$ExternalSyntheticLambda0(String str, String str2, String str3, String str4, Long l, String str5, String str6, VersionData versionData, String str7, InstrumentQueries instrumentQueries) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = l;
        this.f$5 = str5;
        this.f$6 = str6;
        this.f$7 = versionData;
        this.f$8 = str7;
        this.f$9 = instrumentQueries;
    }
}
