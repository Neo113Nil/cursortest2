package com.squareup.cash.gps.db;

import android.content.Context;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.lifecycle.LifecycleOwner;
import app.cash.local.views.LocalViewFactory;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandCollectionSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.libraries.places.internal.zzbsy;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.zxing.Result;
import com.mikepenz.markdown.compose.elements.MarkdownCheckBoxKt$MarkdownCheckBox$1;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.blockers.views.FormBlockerView;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.clientsync.pipeline.InvitationSyncEntityStorageObserver;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.education.stories.backend.real.EducationStoryEntity;
import com.squareup.cash.education.stories.db.Education_story;
import com.squareup.cash.education.stories.db.Education_story_scene_data;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter$models$1$1;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.investing.backend.real.categories.InvestmentCategorySyncEntityStorageObserver;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.categories.FilterGroupAdapter;
import com.squareup.cash.investing.components.categories.InvestingFilterGroupCarouselView;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselView;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import com.squareup.cash.invitations.InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$targetZoomForClusterStateChange$1;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.MapEngineEvent;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.overlays.OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.GraphView;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.Period;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final /* synthetic */ class GpsConfigQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ GpsConfigQueries$$ExternalSyntheticLambda3(GoogleMapEngine googleMapEngine, CashMapViewModel cashMapViewModel, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 29;
        this.f$0 = cashMapViewModel;
        this.f$1 = function1;
        this.f$2 = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.squareup.protos.franklin.api.FormBlocker$Element$OptionPickerElement$Option$ConfirmationDialog] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.foundation.lazy.LazyListScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r4;
        int i;
        int i2 = this.$r8$classId;
        int i3 = 28;
        int i4 = 11;
        int i5 = 12;
        int i6 = 13;
        int i7 = 9;
        int i8 = 10;
        int i9 = 5;
        int i10 = 3;
        final int i11 = 0;
        ?? r11 = 0;
        Float f = null;
        r11 = null;
        Float f2 = null;
        PriceValue priceValue = null;
        r11 = 0;
        final int i12 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i2) {
            case 0:
                GpsConsentStatus gpsConsentStatus = (GpsConsentStatus) obj4;
                Boolean bool = (Boolean) obj3;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, gpsConsentStatus != null ? (String) ((EnumListAdapter) gpsConfigQueries.gpsConfigAdapter).enumColumnAdapter.encode(gpsConsentStatus) : null);
                androidStatement.bindBoolean(1, bool);
                return Unit.INSTANCE;
            case 1:
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj4;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).client_scenarioAdapter.encode((ClientScenario) obj3));
                androidStatement2.bindBytes(1, (byte[]) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).scenario_planAdapter.encode((com.squareup.protos.franklin.common.scenarios.ScenarioPlan) obj2));
                return Unit.INSTANCE;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                FormBlockerView create = ((FormBlockerView$Factory$Impl) ((LocalViewFactory) obj4).addressSearcher).create(context);
                create.setModel((FormViewModel) obj3);
                create.setEventReceiver(new ShopHubResultsListKt$$ExternalSyntheticLambda21(i9, (Function1) obj2));
                return create;
            case 3:
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj3;
                Function1 function1 = (Function1) obj2;
                ?? r1 = (LazyListScope) obj;
                r1.getClass();
                PhysicalDepositAddressEntryViewModel.Results results = ((PhysicalDepositAddressEntryViewModel) obj4).results;
                results.getClass();
                if (results.isRecentSectionVisible) {
                    String str = results.recentSectionHeaderText;
                    str.getClass();
                    r4 = 0;
                    LazyListScope.stickyHeader$default(r1, null, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str, 2), true, 300076111), 3);
                    ArrayList arrayList = results.recentResults;
                    r1.items(arrayList.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(7, arrayList), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList, searchBarKeyboardState, function1, 7), true, 802480018));
                } else {
                    r4 = 0;
                }
                if (results.isResultsSectionVisible) {
                    String str2 = results.resultsSectionHeaderText;
                    str2.getClass();
                    LazyListScope.stickyHeader$default(r1, r4, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str2, 2), true, 300076111), 3);
                    List list = results.searchResults;
                    r1.items(list.size(), r4, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 16), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, searchBarKeyboardState, function1, 8), true, 802480018));
                }
                return Unit.INSTANCE;
            case 4:
                Result result = (Result) obj4;
                WandScene$ring$3 wandScene$ring$3 = (WandScene$ring$3) obj2;
                TransactionWrapper transactionWrapper = (TransactionWrapper) obj;
                transactionWrapper.getClass();
                StoryQueries storyQueries = (StoryQueries) result.text;
                storyQueries.driver.execute(-1865418500, "DELETE FROM education_story", null);
                storyQueries.notifyQueries(-1865418500, new StoryQueries$$ExternalSyntheticLambda0(16));
                StoryQueries storyQueries2 = (StoryQueries) result.resultMetadata;
                storyQueries2.driver.execute(-379284293, "DELETE FROM education_story_scene_data", null);
                storyQueries2.notifyQueries(-379284293, new StoryQueries$$ExternalSyntheticLambda0(15));
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    EducationStoryEntity educationStoryEntity = (EducationStoryEntity) it.next();
                    Education_story education_story = educationStoryEntity.story;
                    final String str3 = education_story.id;
                    final String str4 = education_story.slug;
                    final long j = education_story.published_at_millis;
                    final String str5 = education_story.title;
                    final String str6 = education_story.thumbnail;
                    final Long l = education_story.primaryColor;
                    final String str7 = education_story.url;
                    WandScene$ring$3 wandScene$ring$32 = wandScene$ring$3;
                    final long j2 = education_story.priority;
                    storyQueries.getClass();
                    str7.getClass();
                    str5.getClass();
                    Iterator it2 = it;
                    storyQueries.driver.execute(-1129058445, "INSERT OR REPLACE INTO education_story\nVALUES (?,?,?,?,?,?,?,?)", new Function1() { // from class: com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            AndroidStatement androidStatement3 = (AndroidStatement) obj5;
                            Request$Priority$EnumUnboxingLocalUtility.m(androidStatement3, 0, str3, 1, str7);
                            androidStatement3.bindString(2, str4);
                            androidStatement3.bindString(3, str5);
                            androidStatement3.bindString(4, str6);
                            androidStatement3.bindLong(5, l);
                            androidStatement3.bindLong(6, Long.valueOf(j));
                            androidStatement3.bindLong(7, Long.valueOf(j2));
                            return Unit.INSTANCE;
                        }
                    });
                    storyQueries.notifyQueries(-1129058445, new StoryQueries$$ExternalSyntheticLambda0(17));
                    for (Education_story_scene_data education_story_scene_data : educationStoryEntity.sceneData) {
                        storyQueries2.driver.execute(-637533164, "INSERT INTO education_story_scene_data (scene_index, backgroundColor, storyId)\nVALUES (?,?,?)", new CaptureCheckFaceKt$$ExternalSyntheticLambda7(education_story_scene_data.scene_index, education_story_scene_data.backgroundColor, education_story_scene_data.storyId, 5));
                        storyQueries2.notifyQueries(-637533164, new StoryQueries$$ExternalSyntheticLambda0(14));
                    }
                    wandScene$ring$3 = wandScene$ring$32;
                    it = it2;
                }
                WandScene$ring$3 wandScene$ring$33 = wandScene$ring$3;
                AndroidSqliteDriver.Transaction transaction = transactionWrapper.transaction;
                if (transaction.ownerThreadId == Thread.currentThread().getId()) {
                    transaction.postCommitHooks.add(wandScene$ring$33);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
                return null;
            case 5:
                ((DisposableEffectScope) obj).getClass();
                return new OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1(3, (EducationStoryPresenter) obj4, (HttpUrl) obj3, (ParcelableSnapshotMutableIntState) obj2);
            case 6:
                FamilyPendingRequestsSection familyPendingRequestsSection = (FamilyPendingRequestsSection) obj4;
                FamilyHomeViewModel familyHomeViewModel = (FamilyHomeViewModel) obj3;
                Function1 function12 = (Function1) obj2;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_header", new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(familyHomeViewModel, function12, familyPendingRequestsSection, lazyScaffoldContentScope, 29), true, -1898294965), 1);
                if (familyPendingRequestsSection != null) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_pending_requests", new ComposableLambdaImpl(new ArcadeModal2Kt$$ExternalSyntheticLambda0(14, familyPendingRequestsSection, function12), true, -1535089464), 1);
                }
                familyHomeViewModel.getClass();
                function12.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, null, "family_member_section", new ComposableLambdaImpl(new ArcadeModal2Kt$$ExternalSyntheticLambda0(i5, familyHomeViewModel.membersSection, function12), true, -187494201), 1);
                LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_pending_invites", new ComposableLambdaImpl(new FamilyHomeViewKt$$ExternalSyntheticLambda3(familyHomeViewModel, function12, i12), true, 1064118786), 1);
                FormBlocker.Element.UpsellElement upsellElement = familyHomeViewModel.upsellElement;
                if (upsellElement != null) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_upsell_top_spacer", AllowanceViewKt.f412lambda$2018991892, 1);
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_upsell", new ComposableLambdaImpl(new FamilyHomeViewKt$$ExternalSyntheticLambda10(upsellElement, function12, 0), true, -672595101), 1);
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_upsell_bottom_spacer", AllowanceViewKt.f402lambda$1183607260, 1);
                }
                int i13 = 0;
                for (Object obj5 : familyHomeViewModel.listSections) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    FamilyListSection familyListSection = (FamilyListSection) obj5;
                    if (i13 == 0) {
                        LazyListScope.item$default(lazyScaffoldContentScope, null, "family_home_list_section_top_spacer", AllowanceViewKt.lambda$314428914, 1);
                    }
                    LazyListScope.item$default(lazyScaffoldContentScope, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i13, "family_home_list_section_"), new ComposableLambdaImpl(new ArcadeModal2Kt$$ExternalSyntheticLambda0(i6, familyListSection, function12), true, 1940140525), 1);
                    LazyListScope.item$default(lazyScaffoldContentScope, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i13, "family_home_list_section_spacer_"), AllowanceViewKt.f416lambda$667063402, 1);
                    i13 = i14;
                }
                return Unit.INSTANCE;
            case 7:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationX(-((WalletMetrics) obj4).cardOffsetXPx);
                reusableGraphicsLayerScope.setTranslationY(((Number) ((Animatable) obj3).getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) ((Animatable) obj2).getValue()).floatValue());
                return Unit.INSTANCE;
            case 8:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                ((DisposableEffectScope) obj).getClass();
                MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = new MenuHostHelper$$ExternalSyntheticLambda1(4, (Context) obj3, (Function1) obj2);
                lifecycleOwner.getLifecycle().addObserver(menuHostHelper$$ExternalSyntheticLambda1);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(lifecycleOwner, menuHostHelper$$ExternalSyntheticLambda1, i3);
            case 9:
                FormBlocker.Element.OptionPickerElement.Option option = (FormBlocker.Element.OptionPickerElement.Option) obj4;
                Function1 function13 = (Function1) obj3;
                ArcadeFormOptionPickerView arcadeFormOptionPickerView = (ArcadeFormOptionPickerView) obj2;
                ((Boolean) obj).getClass();
                FormBlocker.Element.OptionPickerElement.Option.Selectability selectability = option.selectability;
                if (selectability != null) {
                    FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable selectable = selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable ? (FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable) selectability : null;
                    FormBlocker.Element.OptionPickerElement.Option.Selectable value = selectable != null ? selectable.getValue() : null;
                    if (value != null) {
                        r11 = value.confirmation_dialog;
                    }
                }
                if (r11 != 0) {
                    String str8 = arcadeFormOptionPickerView.formElementId;
                    String str9 = option.id;
                    str9.getClass();
                    function13.invoke(new FormViewEvent.UpdateResultEvent.ConfirmableOptionClick(str8, new SubmitFormRequest.ElementResult.OptionPickerResult(str9)));
                } else {
                    String str10 = option.id;
                    str10.getClass();
                    arcadeFormOptionPickerView.selectedOptionId$delegate.setValue(str10);
                }
                return Unit.INSTANCE;
            case 10:
                ((ActivityFeedCallbackEvent$RefreshFeed) obj).getClass();
                JobKt.launch$default((CoroutineScope) obj4, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2((ActivitySectionPresenter) obj3, (FormattedPaymentHistoryActivityItem) obj2, r11, 23), 3);
                return Unit.INSTANCE;
            case 11:
                ((GlobalSearchViewEvent.LoadMore) obj).getClass();
                JobKt.launch$default((CoroutineScope) obj4, null, null, new ActivitySectionPresenter$models$1$1((ActivitySectionPresenter) obj3, (MutableState) obj2, r11, i12), 3);
                return Unit.INSTANCE;
            case 12:
                RowSectionPresenter rowSectionPresenter = (RowSectionPresenter) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                MutableState mutableState = (MutableState) obj2;
                GlobalSearchViewEvent.RowSectionEvent rowSectionEvent = (GlobalSearchViewEvent.RowSectionEvent) obj;
                rowSectionEvent.getClass();
                if (rowSectionEvent.equals(GlobalSearchViewEvent.LoadMore.INSTANCE)) {
                    rowSectionPresenter.handleSelectEvent(rowSectionEvent, null, null, coroutineScope);
                    JobKt.launch$default(coroutineScope, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(rowSectionPresenter, mutableState, r11, 25), 3);
                } else if (rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowClicked) {
                    GlobalSearchViewEvent.RowSectionEvent.RowClicked rowClicked = (GlobalSearchViewEvent.RowSectionEvent.RowClicked) rowSectionEvent;
                    rowSectionPresenter.handleSelectEvent(rowSectionEvent, rowClicked.item, rowClicked.actionUrl, coroutineScope);
                } else if (rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked) {
                    GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked accessoryClicked = (GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked) rowSectionEvent;
                    rowSectionPresenter.handleSelectEvent(rowSectionEvent, accessoryClicked.item, accessoryClicked.actionUrl, coroutineScope);
                } else {
                    if (!(rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowViewed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(rowSectionPresenter, rowSectionEvent, r11, 26), 3);
                }
                return Unit.INSTANCE;
            case 13:
                Function0 function0 = (Function0) obj3;
                Function1 function14 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                int i15 = 0;
                for (Object obj6 : ((GlobalSearchViewModel) obj4).sections) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    GlobalSearchViewModel.Section section = (GlobalSearchViewModel.Section) obj6;
                    String title = section.getTitle();
                    if (title != null) {
                        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(section.getKey(), " header");
                        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new ClusterItemKt$$ExternalSyntheticLambda1(i15, title), true, -1981465907);
                        i = 2;
                        LazyListScope.item$default(lazyListScope, m$1, null, composableLambdaImpl, 2);
                    } else {
                        i = 2;
                    }
                    if (section instanceof GlobalSearchViewModel.QabSection) {
                        LazyListScope.item$default(lazyListScope, "qab", null, new ComposableLambdaImpl(new MoneyTabBookletKt$$ExternalSyntheticLambda4(8, section, function0), true, -756930210), i);
                    } else if (section instanceof GlobalSearchViewModel.SearchPrompt) {
                        LazyListScope.item$default(lazyListScope, "search prompt", null, new ComposableLambdaImpl(new GlobalSearchFeedKt$$ExternalSyntheticLambda4(section, 0), true, 1455427157), i);
                    } else if (section instanceof GlobalSearchViewModel.RowSection) {
                        GlobalSearchFeedKt$$ExternalSyntheticLambda5 globalSearchFeedKt$$ExternalSyntheticLambda5 = new GlobalSearchFeedKt$$ExternalSyntheticLambda5(function0, section, 0);
                        ArrayList arrayList2 = ((GlobalSearchViewModel.RowSection) section).items;
                        lazyListScope.items(arrayList2.size(), new VerifyCheckDepositPresenter$models$3$2(i9, new GpsConfigQueries$$ExternalSyntheticLambda1(25), arrayList2), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(8, arrayList2), new ComposableLambdaImpl(new MarkdownCheckBoxKt$MarkdownCheckBox$1(2, arrayList2, globalSearchFeedKt$$ExternalSyntheticLambda5), true, 802480018));
                        QuickAccessBarKt.SectionTrailer(lazyListScope, section);
                    } else {
                        if (section instanceof GlobalSearchViewModel.ActivitySection) {
                            ArrayList arrayList3 = ((GlobalSearchViewModel.ActivitySection) section).items;
                            lazyListScope.items(arrayList3.size(), new VerifyCheckDepositPresenter$models$3$2(6, new GpsConfigQueries$$ExternalSyntheticLambda1(26), arrayList3), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(9, arrayList3), new ComposableLambdaImpl(new AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3(arrayList3, i12), true, 802480018));
                            QuickAccessBarKt.SectionTrailer(lazyListScope, section);
                        } else if (section instanceof GlobalSearchViewModel.NoResults) {
                            LazyListScope.item$default(lazyListScope, "no results", null, QuickAccessBarKt.lambda$452413528, 2);
                        } else {
                            if (!(section instanceof GlobalSearchViewModel.SearchError)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            LazyListScope.item$default(lazyListScope, "search error", null, new ComposableLambdaImpl(new ErrorView$$ExternalSyntheticLambda3(19, function14), true, 1549731417), 2);
                        }
                        i15 = i16;
                    }
                    i15 = i16;
                }
                return Unit.INSTANCE;
            case 14:
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj4;
                ((DisposableEffectScope) obj).getClass();
                MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda12 = new MenuHostHelper$$ExternalSyntheticLambda1(5, (EngineSurfaceTarget) obj3, (EngineSurfaceViewTarget) obj2);
                lifecycleOwner2.getLifecycle().addObserver(menuHostHelper$$ExternalSyntheticLambda12);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(2, lifecycleOwner2, menuHostHelper$$ExternalSyntheticLambda12);
            case 15:
                InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) obj4;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.items$default(lazyListScope2, ready.instruments.size(), new ActivityItemLayout$$ExternalSyntheticLambda4(21), new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(ready, (Function1) obj3, (ParcelableSnapshotMutableIntState) obj2, i8), true, 799968066), 4);
                return Unit.INSTANCE;
            case 16:
                InvestmentCategorySyncEntityStorageObserver investmentCategorySyncEntityStorageObserver = (InvestmentCategorySyncEntityStorageObserver) obj4;
                SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj3;
                final String str11 = (String) obj2;
                ((TransactionWrapper) obj).getClass();
                CategoryQueries categoryQueries = investmentCategorySyncEntityStorageObserver.entityInCategoryQueries;
                String str12 = syncInvestmentCategory.token;
                str12.getClass();
                categoryQueries.deleteForCategory(str12);
                StoryQueries storyQueries3 = investmentCategorySyncEntityStorageObserver.filtersForCategoryQueries;
                String str13 = syncInvestmentCategory.token;
                str13.getClass();
                storyQueries3.deleteForCategory(str13);
                final CategoryQueries categoryQueries2 = investmentCategorySyncEntityStorageObserver.categoryQueries;
                final CategoryToken categoryToken = new CategoryToken(str13);
                String str14 = syncInvestmentCategory.name;
                if (str14 == null) {
                    str14 = "";
                }
                final String str15 = str14;
                final String str16 = syncInvestmentCategory.description;
                final String str17 = syncInvestmentCategory.filter_description;
                final SyncInvestmentCategory.PrefixIcon prefixIcon = syncInvestmentCategory.prefix_icon;
                final String str18 = syncInvestmentCategory.image_url;
                final String str19 = syncInvestmentCategory.accent_color;
                final String str20 = syncInvestmentCategory.parent_category_token;
                final SyncInvestmentCategory.CategoryType categoryType = syncInvestmentCategory.f1390type;
                categoryType.getClass();
                final Color color = syncInvestmentCategory.category_color;
                Integer num = syncInvestmentCategory.ui_ordering;
                final int intValue = num != null ? num.intValue() : 0;
                categoryQueries2.getClass();
                str11.getClass();
                categoryQueries2.driver.execute(-918647514, "INSERT OR REPLACE INTO category\n  (token, entity_id, name, description, filter_description, prefix_icon, image_url, accent_color, parent_category_token, type, category_color, ui_order)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.categories.CategoryQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        AndroidStatement androidStatement3 = (AndroidStatement) obj7;
                        androidStatement3.getClass();
                        Category$Adapter category$Adapter = CategoryQueries.this.categoryAdapter;
                        category$Adapter.getClass();
                        androidStatement3.bindString(0, categoryToken.value);
                        androidStatement3.bindString(1, str11);
                        androidStatement3.bindString(2, str15);
                        androidStatement3.bindString(3, str16);
                        androidStatement3.bindString(4, str17);
                        SyncInvestmentCategory.PrefixIcon prefixIcon2 = prefixIcon;
                        androidStatement3.bindString(5, prefixIcon2 != null ? (String) category$Adapter.prefix_iconAdapter.encode(prefixIcon2) : null);
                        androidStatement3.bindString(6, str18);
                        androidStatement3.bindString(7, str19);
                        androidStatement3.bindString(8, str20);
                        androidStatement3.bindString(9, (String) category$Adapter.typeAdapter.encode(categoryType));
                        Color color2 = color;
                        androidStatement3.bindBytes(10, color2 != null ? (byte[]) category$Adapter.category_colorAdapter.encode(color2) : null);
                        androidStatement3.bindLong(11, Long.valueOf(intValue));
                        return Unit.INSTANCE;
                    }
                });
                categoryQueries2.notifyQueries(-918647514, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(6));
                for (String str21 : syncInvestmentCategory.investment_entity_tokens) {
                    categoryQueries.getClass();
                    str21.getClass();
                    categoryQueries.driver.execute(-1296027986, "INSERT INTO entity_in_category\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str13, str21, 22));
                    categoryQueries.notifyQueries(-1296027986, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(9));
                }
                for (String str22 : syncInvestmentCategory.ui_filter_group_tokens) {
                    str22.getClass();
                    storyQueries3.driver.execute(1368219476, "INSERT INTO filter_for_category\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str13, str22, 23));
                    storyQueries3.notifyQueries(1368219476, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(16));
                }
                return Unit.INSTANCE;
            case 17:
                InvitationSyncEntityStorageObserver invitationSyncEntityStorageObserver = (InvitationSyncEntityStorageObserver) obj4;
                SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj3;
                String str23 = (String) obj2;
                ((TransactionWrapper) obj).getClass();
                StoryQueries storyQueries4 = (StoryQueries) invitationSyncEntityStorageObserver.contactQueries;
                String str24 = syncInvestmentFilterGroup.token;
                str24.getClass();
                storyQueries4.deleteForFilter(str24);
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) invitationSyncEntityStorageObserver.invitationEntityQueries;
                String str25 = syncInvestmentFilterGroup.token;
                str25.getClass();
                FilterToken filterToken = new FilterToken(str25);
                String str26 = syncInvestmentFilterGroup.name;
                str26.getClass();
                Boolean bool2 = syncInvestmentFilterGroup.can_select_multiple_categories;
                List list2 = syncInvestmentFilterGroup.subfilters;
                List list3 = syncInvestmentFilterGroup.category_map;
                String str27 = syncInvestmentFilterGroup.name_plural;
                SyncInvestmentFilterGroup.JoinType joinType = syncInvestmentFilterGroup.joinType;
                rewardSlotQueries.getClass();
                str23.getClass();
                rewardSlotQueries.driver.execute(380605869, "INSERT OR REPLACE INTO filter_group\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new KeypadViewKt$$ExternalSyntheticLambda0(rewardSlotQueries, filterToken, str23, str26, bool2, list2, list3, str27, joinType));
                rewardSlotQueries.notifyQueries(380605869, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(14));
                for (String str28 : syncInvestmentFilterGroup.category_tokens) {
                    storyQueries4.getClass();
                    str28.getClass();
                    storyQueries4.driver.execute(1292768234, "INSERT INTO category_in_filter_group\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str25, str28, 21));
                    storyQueries4.notifyQueries(1292768234, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(5));
                }
                return Unit.INSTANCE;
            case 18:
                InvestingStockSelectionViewModel.Loaded loaded = (InvestingStockSelectionViewModel.Loaded) obj4;
                Function1 function15 = (Function1) obj3;
                RealImageLoader realImageLoader = (RealImageLoader) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.stickyHeader$default(lazyListScope3, null, new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(i3, loaded, function15), true, 957977852), 3);
                InvestingStockSelectionViewModel.SearchResultModel searchResults = loaded.getSearchResults();
                if (searchResults instanceof InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection) {
                    ArrayList arrayList4 = ((InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection) searchResults).results;
                    lazyListScope3.items(arrayList4.size(), new VerifyCheckDepositPresenter$models$3$2(7, new MyFirstConfigurationView$$ExternalSyntheticLambda2(i9), arrayList4), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(10, arrayList4), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(arrayList4, loaded, realImageLoader, function15, 0), true, 802480018));
                } else {
                    if (!(searchResults instanceof InvestingStockSelectionViewModel.SearchResultModel.LabeledSections)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Map map = ((InvestingStockSelectionViewModel.SearchResultModel.LabeledSections) searchResults).results;
                    for (Object obj7 : map.entrySet()) {
                        int i17 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Map.Entry entry = (Map.Entry) obj7;
                        InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header header = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header) entry.getKey();
                        List list4 = (List) entry.getValue();
                        LazyListScope.stickyHeader$default(lazyListScope3, null, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(header, 14), true, -2123302976), i10);
                        lazyListScope3.items(list4.size(), new VerifyCheckDepositPresenter$models$3$2(8, new GpsConfigQueries$$ExternalSyntheticLambda2(header, 25), list4), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list4, 21), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(list4, loaded, realImageLoader, function15, 2), true, 802480018));
                        if (i11 < CollectionsKt__CollectionsKt.getIndices(map.entrySet()).last) {
                            LazyListScope.item$default(lazyListScope3, null, null, ArcadeBordersKt.lambda$720889743, 3);
                        }
                        i11 = i17;
                        i10 = 3;
                    }
                }
                return Unit.INSTANCE;
            case 19:
                FilterGroupCarousel filterGroupCarousel = (FilterGroupCarousel) obj4;
                InvestingFilterGroupCarouselView investingFilterGroupCarouselView = (InvestingFilterGroupCarouselView) obj;
                investingFilterGroupCarouselView.getClass();
                BrandCollectionSheetViewKt$$ExternalSyntheticLambda0 brandCollectionSheetViewKt$$ExternalSyntheticLambda0 = new BrandCollectionSheetViewKt$$ExternalSyntheticLambda0((View) obj3, (Function1) obj2, 1);
                filterGroupCarousel.getClass();
                FilterGroupAdapter filterGroupAdapter = investingFilterGroupCarouselView.adapter;
                filterGroupAdapter.mDiffer.submitList(filterGroupCarousel.filterGroups, null);
                filterGroupAdapter.listener = brandCollectionSheetViewKt$$ExternalSyntheticLambda0;
                return Unit.INSTANCE;
            case 20:
                InvestingGraphContentModel investingGraphContentModel = (InvestingGraphContentModel) obj4;
                GraphState graphState = (GraphState) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                GraphView graphView = (GraphView) obj;
                graphView.getClass();
                InvestingGraphAdapter investingGraphAdapter = graphView.graphAdapter;
                investingGraphContentModel.getClass();
                zzbsy zzbsyVar = graphView.styler;
                InvestingGraphContentModel.Loaded loaded2 = investingGraphContentModel instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel : null;
                zzbsyVar.zzg = loaded2 != null ? Boolean.valueOf(loaded2.trendDirectionIsPositive()) : Boolean.TRUE;
                zzbsyVar.zza = InvestingGraphTabsViewKt.asColorInt(investingGraphContentModel.getAccentColor(), graphView);
                graphView.updateStyling();
                investingGraphAdapter.setContent(investingGraphContentModel);
                TransformingSequence map2 = SequencesKt___SequencesKt.map(CollectionsKt.asSequence(investingGraphAdapter.content.getPoints()), new PoolsListViewKt$$ExternalSyntheticLambda6(i4));
                Function1 function16 = map2.transformer;
                Comparable maxOrNull = SequencesKt___SequencesKt.maxOrNull(map2);
                maxOrNull.getClass();
                graphView.maxPrice = ((PriceValue) maxOrNull).value;
                Iterator it3 = map2.sequence.iterator();
                if (it3.hasNext()) {
                    ?? r42 = (Comparable) function16.invoke(it3.next());
                    while (true) {
                        priceValue = r42;
                        while (it3.hasNext()) {
                            r42 = (Comparable) function16.invoke(it3.next());
                            if (priceValue.compareTo(r42) > 0) {
                                break;
                            }
                        }
                    }
                }
                priceValue.getClass();
                graphView.minPrice = priceValue.value;
                ((PriceValue) SequencesKt___SequencesKt.last(map2)).getClass();
                int roundToInt = MathKt__MathJVMKt.roundToInt(graphState.m3582pointForPricenM2_iWI(graphView.maxPrice));
                int roundToInt2 = MathKt__MathJVMKt.roundToInt(graphState.m3582pointForPricenM2_iWI(graphView.minPrice));
                if (parcelableSnapshotMutableIntState.getIntValue() == 0) {
                    parcelableSnapshotMutableIntState.setIntValue(Math.abs(roundToInt - roundToInt2));
                }
                graphView.setTop(roundToInt);
                graphView.setBottom(roundToInt2);
                return Unit.INSTANCE;
            case 21:
                final InvestingStockCarouselView investingStockCarouselView = (InvestingStockCarouselView) obj4;
                String str29 = (String) obj3;
                String str30 = (String) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = investingStockCarouselView.currentPage$delegate;
                if (parcelableSnapshotMutableIntState2.getIntValue() < investingStockCarouselView.pageCount$delegate.getIntValue() - 1) {
                    createListBuilder.add(new CustomAccessibilityAction(str29, new Function0() { // from class: com.squareup.cash.investing.components.discovery.InvestingStockCarouselView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i18 = i11;
                            boolean z = false;
                            InvestingStockCarouselView investingStockCarouselView2 = investingStockCarouselView;
                            switch (i18) {
                                case 0:
                                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = investingStockCarouselView2.currentPage$delegate;
                                    int intValue2 = parcelableSnapshotMutableIntState3.getIntValue() + 1;
                                    if (intValue2 < investingStockCarouselView2.pageAdapter.pages.size()) {
                                        investingStockCarouselView2.stocksViewPager.setCurrentItem(intValue2, true);
                                        parcelableSnapshotMutableIntState3.setIntValue(intValue2);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                default:
                                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = investingStockCarouselView2.currentPage$delegate;
                                    int intValue3 = parcelableSnapshotMutableIntState4.getIntValue() - 1;
                                    if (intValue3 >= 0) {
                                        investingStockCarouselView2.stocksViewPager.setCurrentItem(intValue3, true);
                                        parcelableSnapshotMutableIntState4.setIntValue(intValue3);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    }));
                }
                if (parcelableSnapshotMutableIntState2.getIntValue() > 0) {
                    createListBuilder.add(new CustomAccessibilityAction(str30, new Function0() { // from class: com.squareup.cash.investing.components.discovery.InvestingStockCarouselView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i18 = i12;
                            boolean z = false;
                            InvestingStockCarouselView investingStockCarouselView2 = investingStockCarouselView;
                            switch (i18) {
                                case 0:
                                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = investingStockCarouselView2.currentPage$delegate;
                                    int intValue2 = parcelableSnapshotMutableIntState3.getIntValue() + 1;
                                    if (intValue2 < investingStockCarouselView2.pageAdapter.pages.size()) {
                                        investingStockCarouselView2.stocksViewPager.setCurrentItem(intValue2, true);
                                        parcelableSnapshotMutableIntState3.setIntValue(intValue2);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                default:
                                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = investingStockCarouselView2.currentPage$delegate;
                                    int intValue3 = parcelableSnapshotMutableIntState4.getIntValue() - 1;
                                    if (intValue3 >= 0) {
                                        investingStockCarouselView2.stocksViewPager.setCurrentItem(intValue3, true);
                                        parcelableSnapshotMutableIntState4.setIntValue(intValue3);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    }));
                }
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                return Unit.INSTANCE;
            case 22:
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                ArrayList arrayList5 = ((CategoryTile$CategoryCarousel) obj4).tiles;
                lazyListScope4.items(arrayList5.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(11, arrayList5), new ComposableLambdaImpl(new ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3(arrayList5, (Function1) obj3, (RealImageLoader) obj2, i12), true, 802480018));
                return Unit.INSTANCE;
            case 23:
                Function1 function17 = (Function1) obj3;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                ArrayList arrayList6 = ((SecurityCarousel) obj4).tiles;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((InvestingSecurityTileContentModel) it4.next()).ticker);
                }
                lazyListScope5.items(arrayList6.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(12, arrayList6), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(arrayList6, arrayList7, function17, realImageLoader2, 3), true, 802480018));
                return Unit.INSTANCE;
            case 24:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) obj4);
                androidStatement3.bindBytes(1, (byte[]) ((BlockersConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).target_balance_amountAdapter.encode((CurrentPrice) obj2));
                return Unit.INSTANCE;
            case 25:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                ScenarioPlan.Adapter adapter = (ScenarioPlan.Adapter) ((RewardSlotQueries) obj4).rewardSlotAdapter;
                androidStatement4.bindString(0, (String) adapter.client_scenarioAdapter.encode((HistoricalRange) obj3));
                androidStatement4.bindBytes(1, (byte[]) adapter.scenario_planAdapter.encode((BalanceHistory) obj2));
                return Unit.INSTANCE;
            case 26:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) ((EnumColumnAdapter) ((InvestmentEntityQueries) obj4).investment_holdingAdapter.closeBits).encode((SyncInvestmentHolding.InvestmentHoldingState) obj3));
                androidStatement5.bindString(1, (String) obj2);
                return Unit.INSTANCE;
            case 27:
                String str31 = (String) obj3;
                Function1 function18 = (Function1) obj2;
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                ArrayList arrayList8 = new ArrayList();
                ListIterator listIterator = ((AbstractPersistentList) obj4).listIterator(0);
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    if (((Period) next).label != null) {
                        arrayList8.add(next);
                    }
                }
                lazyListScope6.items(arrayList8.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(13, arrayList8), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList8, str31, function18, i7), true, 802480018));
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Function1) obj4).invoke(new InviteContactsViewEvent.SearchFocusChanged(booleanValue));
                if (booleanValue) {
                    JobKt.launch$default(coroutineScope2, null, null, new InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1(collapsingToolbarScaffoldState, null, 0), 3);
                }
                return Unit.INSTANCE;
            default:
                CashMapViewModel cashMapViewModel = (CashMapViewModel) obj4;
                Function1 function19 = (Function1) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                Cluster cluster = (Cluster) obj;
                cluster.getClass();
                Collection items = cluster.getItems();
                items.getClass();
                Collection collection = items;
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((GoogleMapEngine.GoogleClusterItemAdapter) it5.next()).cashItem.getViewModel());
                }
                ClusterManager clusterManager = (ClusterManager) mutableState2.getValue();
                if (clusterManager != null) {
                    if (cashMapViewModel.locationViewModel.zoom < 20.0f) {
                        TransformingSequence map3 = SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new IntRange(((int) Math.floor(r0)) + 1, 20, 1), 1), GoogleMapEngine$targetZoomForClusterStateChange$1.INSTANCE);
                        Iterator it6 = map3.sequence.iterator();
                        while (it6.hasNext()) {
                            ?? invoke = map3.transformer.invoke(it6.next());
                            Set clusters = clusterManager.mAlgorithm.mAlgorithm.getClusters(((Number) invoke).floatValue());
                            if (!(clusters instanceof Collection) || !clusters.isEmpty()) {
                                Iterator it7 = clusters.iterator();
                                while (it7.hasNext()) {
                                    Collection items2 = ((Cluster) it7.next()).getItems();
                                    items2.getClass();
                                    Collection items3 = cluster.getItems();
                                    items3.getClass();
                                    if (items2.size() == items3.size()) {
                                        ArrayList arrayList10 = new ArrayList(items3);
                                        Collection collection2 = items2;
                                        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                                            Iterator it8 = collection2.iterator();
                                            while (it8.hasNext()) {
                                                if (!arrayList10.remove(it8.next())) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f = invoke;
                            Float f3 = f;
                            f2 = Float.valueOf(f3 != null ? f3.floatValue() : 20.0f);
                        }
                        Float f32 = f;
                        f2 = Float.valueOf(f32 != null ? f32.floatValue() : 20.0f);
                    }
                }
                if (f2 != null) {
                    function19.invoke(new MapEngineEvent.ClusterClicked(cluster.getPosition().latitude, cluster.getPosition().longitude, arrayList9, f2.floatValue()));
                } else {
                    function19.invoke(new MapEngineEvent.MaxZoomClusterClicked(arrayList9));
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ GpsConfigQueries$$ExternalSyntheticLambda3(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
