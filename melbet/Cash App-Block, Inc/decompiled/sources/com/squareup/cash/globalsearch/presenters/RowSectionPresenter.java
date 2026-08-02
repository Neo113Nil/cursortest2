package com.squareup.cash.globalsearch.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.globalsearch.analytics.api.GlobalSearchAnalyticsContext$Item;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RowSectionPresenter implements SectionPresenter {
    public final Analytics analytics;
    public final RealGlobalSearchAnalyticsContext analyticsContext;
    public final RealGlobalSearchAnalyticsHelper analyticsHelper;
    public final RealClientRouteParser clientRouteParser;
    public final RealRouter router;
    public final GlobalSearchScreen screen;
    public final RealGlobalSearchRepository.RealSectionHandle sectionHandle;

    public RowSectionPresenter(BetterNavigator.ScreenNavigator screenNavigator, GlobalSearchScreen globalSearchScreen, RealGlobalSearchRepository.RealSectionHandle realSectionHandle, RealRouter$Factory$Impl realRouter$Factory$Impl, RealClientRouteParser realClientRouteParser, Analytics analytics, RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext) {
        globalSearchScreen.getClass();
        this.screen = globalSearchScreen;
        this.sectionHandle = realSectionHandle;
        this.clientRouteParser = realClientRouteParser;
        this.analytics = analytics;
        this.analyticsHelper = realGlobalSearchAnalyticsHelper;
        this.analyticsContext = realGlobalSearchAnalyticsContext;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public final void handleSelectEvent(GlobalSearchViewEvent.RowSectionEvent rowSectionEvent, GlobalSearchViewModel.Item item, String str, CoroutineScope coroutineScope) {
        GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item;
        if (item != null) {
            globalSearchAnalyticsContext$Item = this.analyticsContext.getItem(item.key);
        } else {
            globalSearchAnalyticsContext$Item = null;
        }
        JobKt.launch$default(coroutineScope, null, null, new RowSectionPresenter$handleSelectEvent$1(this, item, globalSearchAnalyticsContext$Item, rowSectionEvent, str, null), 3);
    }

    @Override // com.squareup.cash.globalsearch.presenters.SectionPresenter
    public final GlobalSearchViewModel.Section models(GapComposer gapComposer) {
        GlobalSearchViewModel.SectionTrailer sectionTrailer;
        GlobalSearchViewModel.SectionTrailer warningModal;
        boolean changed;
        Object rememberedValue;
        gapComposer.startReplaceGroup(-428231483);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Object obj2 = (CoroutineScope) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        RealGlobalSearchRepository.RealSectionHandle realSectionHandle = this.sectionHandle;
        boolean changed2 = gapComposer.changed(realSectionHandle);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == obj) {
            rememberedValue4 = StateFlowKt.mapState(realSectionHandle.section, RowSectionPresenter$models$lambda$3$$inlined$section$1.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        GlobalSearchViewModel.Modal modal = ((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).warning;
        String str = ((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).title;
        String str2 = ((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).title;
        List list = ((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).items;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel = (GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel) list.get(i);
            arrayList.add(new GlobalSearchViewModel.Item(globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.metadataJson, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.avatar, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.title, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.subtitle, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.actionUrl, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.entityId, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.entityType, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.accessory, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.titleIcon, Recorder$$ExternalSyntheticOutline2.m(((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).title, "-", globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.entityId)));
            i++;
            collectAsState = collectAsState;
        }
        if (((GlobalSearchResponseSectionModel.Rows) collectAsState.getValue()).showLoadMore) {
            warningModal = GlobalSearchViewModel.SectionTrailer.LoadMoreButton.INSTANCE;
        } else if (((Boolean) mutableState.getValue()).booleanValue()) {
            warningModal = GlobalSearchViewModel.SectionTrailer.LoadingSpinner.INSTANCE;
        } else {
            if (modal == null) {
                sectionTrailer = null;
                changed = gapComposer.changed(this) | gapComposer.changedInstance(obj2);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == obj) {
                    rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(12, this, obj2, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GlobalSearchViewModel.RowSection rowSection = new GlobalSearchViewModel.RowSection(str, str2, arrayList, sectionTrailer, (Function1) rememberedValue);
                gapComposer.end(false);
                return rowSection;
            }
            warningModal = new GlobalSearchViewModel.SectionTrailer.WarningModal(modal);
        }
        sectionTrailer = warningModal;
        changed = gapComposer.changed(this) | gapComposer.changedInstance(obj2);
        rememberedValue = gapComposer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(12, this, obj2, mutableState);
        gapComposer.updateRememberedValue(rememberedValue);
        GlobalSearchViewModel.RowSection rowSection2 = new GlobalSearchViewModel.RowSection(str, str2, arrayList, sectionTrailer, (Function1) rememberedValue);
        gapComposer.end(false);
        return rowSection2;
    }
}
