package com.squareup.cash.sheet;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.ui.Ui;
import app.cash.directory.data.Directory$Section;
import app.cash.directory.data.DirectoryKt;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.SimpleExecutableQuery;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.DimensionKt;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.advertising.views.FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.cdf.alertbannernotification.AlertBannerNotificationInteractTap;
import com.squareup.cash.cdf.alertbannernotification.Screen;
import com.squareup.cash.cdf.alertbannernotification.State;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.viewmodels.ScoreHomeSheet;
import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.securityhub.views.EducationCardKt;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.storage.RealSessionedLink;
import com.squareup.cash.storage.SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch;
import com.squareup.cash.storage.SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.transactionpicker.views.ArcadeTransactionPickerViewKt;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewEvent$BannerClicked;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.upsell.viewmodels.NullStateViewEvent$SwipeViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.views.NullStateSwipeView;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.DeviceLockModel;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.protos.cash.ui.Image;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class BottomSheet$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BottomSheet$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float coerceIn;
        StorageLink.Sandboxed sandboxed;
        Screen screen;
        State state;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 17;
        int i4 = 13;
        int i5 = 11;
        int i6 = 10;
        final int i7 = 2;
        final int i8 = 0;
        final int i9 = 1;
        StorageLink.Sandboxed sandboxed2 = null;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                BottomSheet bottomSheet = (BottomSheet) obj3;
                ColorDrawable colorDrawable = (ColorDrawable) obj2;
                float floatValue = ((Float) obj).floatValue();
                int i10 = bottomSheet.lastSheetTopBound;
                BottomSheetConfig bottomSheetConfig = bottomSheet.sheetConfig;
                if (i10 == 0 || colorDrawable.getAlpha() == 0) {
                    bottomSheet.lastSheetTopBound = bottomSheet.getSheetTopBound$overlays();
                }
                if (bottomSheet.getSheetTopBound$overlays() == bottomSheet.lastSheetTopBound || floatValue == RecyclerView.DECELERATION_RATE) {
                    if (bottomSheetConfig == null || bottomSheetConfig.getInitialHeight() == 0) {
                        coerceIn = RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f);
                    } else {
                        Integer num = bottomSheet.peekHeight;
                        float intValue = num != null ? num.intValue() : bottomSheetConfig.getInitialHeight();
                        coerceIn = RangesKt___RangesKt.coerceIn(((bottomSheet.getSheetY$overlays() - bottomSheet.getHeight()) + intValue) / intValue, RecyclerView.DECELERATION_RATE, 1.0f);
                    }
                    colorDrawable.setAlpha((int) (((-255.0f) * coerceIn) + 255.0f));
                }
                if (floatValue == RecyclerView.DECELERATION_RATE && bottomSheet.getSheetTopBound$overlays() != bottomSheet.lastSheetTopBound) {
                    bottomSheet.lastSheetTopBound = bottomSheet.getSheetTopBound$overlays();
                }
                colorDrawable.invalidateSelf();
                return Unit.INSTANCE;
            case 1:
                Function1 function1 = (Function1) obj3;
                ScoreHomeSheet scoreHomeSheet = (ScoreHomeSheet) obj2;
                CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
                if (action == null) {
                    function1.invoke(ScoreHomeViewEvent.DismissSheet.INSTANCE);
                } else {
                    function1.invoke(new ScoreHomeViewEvent.Action(action, new ScoreHomeViewEvent.Action.Source.RecommendationOverlay(((ScoreHomeSheet.RecommendationSheet) scoreHomeSheet).data)));
                }
                return Unit.INSTANCE;
            case 2:
                final BookletViewModel bookletViewModel = (BookletViewModel) obj3;
                final Function1 function12 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, "page_header", null, new ComposableLambdaImpl(new ButtonGroupKt$$ExternalSyntheticLambda11(bookletViewModel, 21), true, -1571719086), 2);
                LazyListScope.item$default(lazyListScope, "feature_cards", null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.securityhub.views.BookletViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i11 = i8;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Function1 function13 = function12;
                        BookletViewModel bookletViewModel2 = bookletViewModel;
                        switch (i11) {
                            case 0:
                                Composer composer = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((LazyItemScopeImpl) obj4).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
                                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer.startReusableNode();
                                    if (gapComposer.inserting) {
                                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    gapComposer.startReplaceGroup(-1756038847);
                                    for (BookletFeatureCardViewModel bookletFeatureCardViewModel : bookletViewModel2.featureCards) {
                                        boolean changedInstance = gapComposer.changedInstance(bookletFeatureCardViewModel) | gapComposer.changed(function13);
                                        Object rememberedValue = gapComposer.rememberedValue();
                                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(17, (Object) bookletFeatureCardViewModel, function13);
                                            gapComposer.updateRememberedValue(rememberedValue);
                                        }
                                        EducationCardKt.BookletFeatureCard(bookletFeatureCardViewModel, null, (Function0) rememberedValue, gapComposer, 0);
                                    }
                                    gapComposer.end(false);
                                    gapComposer.end(true);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer2 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                ((LazyItemScopeImpl) obj4).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                                    String str = bookletViewModel2.relatedSectionTitle;
                                    List list = bookletViewModel2.relatedBooklets;
                                    boolean changed = gapComposer2.changed(function13);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(5, function13);
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    EducationCardKt.RelatedBookletsSection(str, list, (Function1) rememberedValue2, null, gapComposer2, 0);
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue4 = ((Integer) obj6).intValue();
                                ((LazyItemScopeImpl) obj4).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                    String str2 = bookletViewModel2.supportSectionTitle;
                                    List list2 = bookletViewModel2.supportRows;
                                    boolean changed2 = gapComposer3.changed(function13);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(4, function13);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    EducationCardKt.SecurityEducationSupportSection(str2, list2, (Function1) rememberedValue3, null, gapComposer3, 0);
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, -483868229), 2);
                if (!bookletViewModel.relatedBooklets.isEmpty()) {
                    LazyListScope.item$default(lazyListScope, "related_section", null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.securityhub.views.BookletViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i11 = i9;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Function1 function13 = function12;
                            BookletViewModel bookletViewModel2 = bookletViewModel;
                            switch (i11) {
                                case 0:
                                    Composer composer = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
                                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer.startReusableNode();
                                        if (gapComposer.inserting) {
                                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        gapComposer.startReplaceGroup(-1756038847);
                                        for (BookletFeatureCardViewModel bookletFeatureCardViewModel : bookletViewModel2.featureCards) {
                                            boolean changedInstance = gapComposer.changedInstance(bookletFeatureCardViewModel) | gapComposer.changed(function13);
                                            Object rememberedValue = gapComposer.rememberedValue();
                                            if (changedInstance || rememberedValue == neverEqualPolicy) {
                                                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(17, (Object) bookletFeatureCardViewModel, function13);
                                                gapComposer.updateRememberedValue(rememberedValue);
                                            }
                                            EducationCardKt.BookletFeatureCard(bookletFeatureCardViewModel, null, (Function0) rememberedValue, gapComposer, 0);
                                        }
                                        gapComposer.end(false);
                                        gapComposer.end(true);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                                        String str = bookletViewModel2.relatedSectionTitle;
                                        List list = bookletViewModel2.relatedBooklets;
                                        boolean changed = gapComposer2.changed(function13);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(5, function13);
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        EducationCardKt.RelatedBookletsSection(str, list, (Function1) rememberedValue2, null, gapComposer2, 0);
                                        gapComposer2.end(true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                        String str2 = bookletViewModel2.supportSectionTitle;
                                        List list2 = bookletViewModel2.supportRows;
                                        boolean changed2 = gapComposer3.changed(function13);
                                        Object rememberedValue3 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(4, function13);
                                            gapComposer3.updateRememberedValue(rememberedValue3);
                                        }
                                        EducationCardKt.SecurityEducationSupportSection(str2, list2, (Function1) rememberedValue3, null, gapComposer3, 0);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, true, -535255785), 2);
                }
                if (!bookletViewModel.supportRows.isEmpty()) {
                    LazyListScope.item$default(lazyListScope, "support_section", null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.securityhub.views.BookletViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i11 = i7;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Function1 function13 = function12;
                            BookletViewModel bookletViewModel2 = bookletViewModel;
                            switch (i11) {
                                case 0:
                                    Composer composer = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
                                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer.startReusableNode();
                                        if (gapComposer.inserting) {
                                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        gapComposer.startReplaceGroup(-1756038847);
                                        for (BookletFeatureCardViewModel bookletFeatureCardViewModel : bookletViewModel2.featureCards) {
                                            boolean changedInstance = gapComposer.changedInstance(bookletFeatureCardViewModel) | gapComposer.changed(function13);
                                            Object rememberedValue = gapComposer.rememberedValue();
                                            if (changedInstance || rememberedValue == neverEqualPolicy) {
                                                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(17, (Object) bookletFeatureCardViewModel, function13);
                                                gapComposer.updateRememberedValue(rememberedValue);
                                            }
                                            EducationCardKt.BookletFeatureCard(bookletFeatureCardViewModel, null, (Function0) rememberedValue, gapComposer, 0);
                                        }
                                        gapComposer.end(false);
                                        gapComposer.end(true);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                                        String str = bookletViewModel2.relatedSectionTitle;
                                        List list = bookletViewModel2.relatedBooklets;
                                        boolean changed = gapComposer2.changed(function13);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(5, function13);
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        EducationCardKt.RelatedBookletsSection(str, list, (Function1) rememberedValue2, null, gapComposer2, 0);
                                        gapComposer2.end(true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((LazyItemScopeImpl) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                        String str2 = bookletViewModel2.supportSectionTitle;
                                        List list2 = bookletViewModel2.supportRows;
                                        boolean changed2 = gapComposer3.changed(function13);
                                        Object rememberedValue3 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(4, function13);
                                            gapComposer3.updateRememberedValue(rememberedValue3);
                                        }
                                        EducationCardKt.SecurityEducationSupportSection(str2, list2, (Function1) rememberedValue3, null, gapComposer3, 0);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, true, -875048640), 2);
                }
                LazyListScope.item$default(lazyListScope, "bottom_spacer", null, EducationCardKt.f656lambda$1819241958, 2);
                return Unit.INSTANCE;
            case 3:
                RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) obj3;
                Function1 function13 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.item$default(lazyListScope2, "page_header", null, new ComposableLambdaImpl(new ButtonGroupKt$$ExternalSyntheticLambda11(recoveryGuideViewModel, 23), true, -96567949), 2);
                Iterator it = recoveryGuideViewModel.sections.iterator();
                while (true) {
                    int i11 = i8;
                    if (!it.hasNext()) {
                        LazyListScope.item$default(lazyListScope2, "bottom_spacer", null, EducationCardKt.lambda$1142398620, 2);
                        return Unit.INSTANCE;
                    }
                    Object next = it.next();
                    i8 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    RecoveryGuideSectionViewModel recoveryGuideSectionViewModel = (RecoveryGuideSectionViewModel) next;
                    LazyListScope.item$default(lazyListScope2, Recorder$$ExternalSyntheticOutline2.m("section_", recoveryGuideSectionViewModel.id.name()), null, new ComposableLambdaImpl(new RecoveryGuideViewKt$$ExternalSyntheticLambda5(recoveryGuideViewModel, recoveryGuideSectionViewModel, function13, i11, 0), true, -427622316), 2);
                }
            case 4:
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.item$default(lazyListScope3, "page_header", null, EducationCardKt.lambda$6182298, 2);
                LazyListScope.item$default(lazyListScope3, "protections", null, new ComposableLambdaImpl(new ShareSheetViewKt$$ExternalSyntheticLambda1(24, obj3, obj2), true, -1455706173), 2);
                LazyListScope.item$default(lazyListScope3, "bottom_spacer", null, EducationCardKt.lambda$1459475810, 2);
                return Unit.INSTANCE;
            case 5:
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj3;
                SearchResults searchResults = (SearchResults) obj2;
                ((TransactionWrapper) obj).getClass();
                rewardSlotQueries.driver.execute(202296561, "DELETE FROM productsResultsSection", null);
                int i12 = 15;
                rewardSlotQueries.notifyQueries(202296561, new RealSheetState$$ExternalSyntheticLambda0(i12));
                SqlDriver sqlDriver = rewardSlotQueries.driver;
                sqlDriver.execute(-2080069667, "DELETE FROM productsResultsItem", null);
                rewardSlotQueries.notifyQueries(-2080069667, new RealSheetState$$ExternalSyntheticLambda0(8));
                sqlDriver.execute(-1695661476, "DELETE FROM productsResultsPaginationToken", null);
                rewardSlotQueries.notifyQueries(-1695661476, new RealSheetState$$ExternalSyntheticLambda0(i4));
                sqlDriver.execute(880576398, "INSERT OR REPLACE INTO productsResultsPaginationToken\nVALUES (?)", new RealSandboxer$$ExternalSyntheticLambda1(searchResults.paginationToken, i12));
                rewardSlotQueries.notifyQueries(880576398, new RealSheetState$$ExternalSyntheticLambda0(12));
                for (Directory$Section directory$Section : searchResults.sections) {
                    String name = directory$Section.f908type.name();
                    Text text = directory$Section.title;
                    Text text2 = directory$Section.subtitle;
                    SearchCommonMessageSection searchCommonMessageSection = directory$Section.searchMessageSection;
                    Section.Layout layout = directory$Section.layout;
                    Button button = directory$Section.footerButton;
                    name.getClass();
                    final RewardSlotQueries rewardSlotQueries2 = rewardSlotQueries;
                    sqlDriver.execute(2055095028, "INSERT INTO productsResultsSection (type, title, subtitle, message, layout, footerButton)\nVALUES (?, ?, ?, ?, ?, ?)", new SliderKt$$ExternalSyntheticLambda4(name, text, text2, searchCommonMessageSection, layout, button, rewardSlotQueries2, 5));
                    rewardSlotQueries2.notifyQueries(2055095028, new RealSheetState$$ExternalSyntheticLambda0(14));
                    RealSheetState$$ExternalSyntheticLambda0 realSheetState$$ExternalSyntheticLambda0 = new RealSheetState$$ExternalSyntheticLambda0(i5);
                    sqlDriver.getClass();
                    SqlDriver sqlDriver2 = sqlDriver;
                    final long longValue = ((Number) new SimpleExecutableQuery(-1060414022, sqlDriver2, "ShopProductsSearch.sq", "lastInsertedSectionId", "SELECT last_insert_rowid()", realSheetState$$ExternalSyntheticLambda0).executeAsOne()).longValue();
                    int i13 = 0;
                    for (Object obj4 : directory$Section.items) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Directory$Section.Item item = (Directory$Section.Item) obj4;
                        if (!(item instanceof Directory$Section.Item.CardItem)) {
                            if (item instanceof Directory$Section.Item.SimpleItem) {
                                a$$ExternalSyntheticBUOutline0.m$1("Only CardItem type is supported");
                                return null;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        final long j = i13;
                        Directory$Section.Item.CardItem cardItem = (Directory$Section.Item.CardItem) item;
                        Directory$Section.Item.SimpleItem.ItemText itemText = cardItem.title;
                        final Text text3 = itemText != null ? DirectoryKt.toText(itemText) : null;
                        Directory$Section.Item.SimpleItem.ItemText itemText2 = cardItem.subheader;
                        final Text text4 = itemText2 != null ? DirectoryKt.toText(itemText2) : null;
                        Directory$Section.Item.SimpleItem.ItemText itemText3 = cardItem.captionLeft;
                        final Text text5 = itemText3 != null ? DirectoryKt.toText(itemText3) : null;
                        Directory$Section.Item.SimpleItem.ItemText itemText4 = cardItem.captionRight;
                        final Text text6 = itemText4 != null ? DirectoryKt.toText(itemText4) : null;
                        final String str = cardItem.actionUrl;
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("actionUrl cannot be null");
                            return null;
                        }
                        final Image image = cardItem.picture;
                        final Metadata metadata = cardItem.metadata;
                        sqlDriver2.execute(-1696806556, "INSERT INTO productsResultsItem (sectionId, position, title, subtitle, captionLeft, captionRight, actionUrl, picture, metadata)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.shopping.db.ShopProductsSearchQueries$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                AndroidStatement androidStatement = (AndroidStatement) obj5;
                                androidStatement.getClass();
                                androidStatement.bindLong(0, Long.valueOf(longValue));
                                androidStatement.bindLong(1, Long.valueOf(j));
                                Text text7 = text3;
                                RewardSlotQueries rewardSlotQueries3 = rewardSlotQueries2;
                                androidStatement.bindBytes(2, text7 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zza).encode(text7) : null);
                                Text text8 = text4;
                                androidStatement.bindBytes(3, text8 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zzb).encode(text8) : null);
                                Text text9 = text5;
                                androidStatement.bindBytes(4, text9 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zzc).encode(text9) : null);
                                Text text10 = text6;
                                androidStatement.bindBytes(5, text10 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zze).encode(text10) : null);
                                androidStatement.bindString(6, str);
                                Image image2 = image;
                                androidStatement.bindBytes(7, image2 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zzd).encode(image2) : null);
                                Metadata metadata2 = metadata;
                                androidStatement.bindBytes(8, metadata2 != null ? (byte[]) ((WireAdapter) ((zzlj) rewardSlotQueries3.rewardSlotAdapter).zzf).encode(metadata2) : null);
                                return Unit.INSTANCE;
                            }
                        });
                        rewardSlotQueries2.notifyQueries(-1696806556, new RealSheetState$$ExternalSyntheticLambda0(i2));
                        i13 = i14;
                        i5 = 11;
                    }
                    sqlDriver = sqlDriver2;
                    rewardSlotQueries = rewardSlotQueries2;
                }
                return Unit.INSTANCE;
            case 6:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((Category$Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).prefix_iconAdapter.encode((Metadata.EntityType) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                return Unit.INSTANCE;
            case 7:
                AutofillFooterViewModel autofillFooterViewModel = (AutofillFooterViewModel) obj3;
                Function1 function14 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                String str2 = autofillFooterViewModel.address;
                if (str2 != null) {
                    FilterBarScope.legacyChip$default(filterBarScope, new BrandsSearchView$$ExternalSyntheticLambda6(17, function14), null, false, false, null, str2, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str2, 4), true, -751773579), 30);
                }
                String str3 = autofillFooterViewModel.cardText;
                if (str3 != null) {
                    FilterBarScope.legacyChip$default(filterBarScope, new BrandsSearchView$$ExternalSyntheticLambda6(18, function14), null, false, false, null, str3, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str3, 5), true, 1428275358), 30);
                }
                return Unit.INSTANCE;
            case 8:
                RealStablecoinNullStateCarouselPresenter realStablecoinNullStateCarouselPresenter = (RealStablecoinNullStateCarouselPresenter) obj3;
                MutableState mutableState = (MutableState) obj2;
                NullStateViewEvent$SwipeViewEvent nullStateViewEvent$SwipeViewEvent = (NullStateViewEvent$SwipeViewEvent) obj;
                nullStateViewEvent$SwipeViewEvent.getClass();
                if (nullStateViewEvent$SwipeViewEvent instanceof NullStateViewEvent$SwipeViewEvent.SwipeToPage) {
                    int i15 = ((NullStateViewEvent$SwipeViewEvent.SwipeToPage) nullStateViewEvent$SwipeViewEvent).index;
                    mutableState.setValue(Integer.valueOf(i15 == realStablecoinNullStateCarouselPresenter.pages.size() - 1 ? R.string.stablecoin_get_started_button : R.string.stablecoin_next_button_label));
                    realStablecoinNullStateCarouselPresenter.viewedPages.add(Integer.valueOf(i15));
                } else {
                    if (!(nullStateViewEvent$SwipeViewEvent instanceof NullStateViewEvent$SwipeViewEvent.TapSwipeViewButton)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realStablecoinNullStateCarouselPresenter.onboardedValue.blockingSet(Boolean.TRUE);
                    realStablecoinNullStateCarouselPresenter.userPressedCTA = true;
                }
                return Unit.INSTANCE;
            case 9:
                NullStateSwipeView nullStateSwipeView = (NullStateSwipeView) obj;
                nullStateSwipeView.getClass();
                nullStateSwipeView.setEventReceiver(new FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0(1, (Function1) obj3));
                nullStateSwipeView.setModel((NullStateViewModel$SwipeViewModel$Content) obj2);
                return Unit.INSTANCE;
            case 10:
                RealSessionedLink realSessionedLink = (RealSessionedLink) obj3;
                ((TransactionWrapper) obj).getClass();
                String str4 = ((SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete) obj2).associatedAccountToken;
                SessionQueries sessionQueries = realSessionedLink.storageLinkQueries;
                StorageLink activeLink = realSessionedLink.getActiveLink();
                if (activeLink instanceof StorageLink.Sandboxed) {
                    PlatformKt.vacuum(sessionQueries, realSessionedLink.sandboxer);
                    Countries.linkAccountToStorage(sessionQueries, str4, (StorageLink.Sandboxed) activeLink);
                }
                return realSessionedLink.getActiveLink();
            case 11:
                ((TransactionWrapper) obj).getClass();
                String str5 = ((SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) obj3).associatedAccountToken;
                SessionQueries sessionQueries2 = ((RealSessionedLink) obj2).storageLinkQueries;
                StorageLink storageLink = Countries.getStorageLink(sessionQueries2, str5);
                if (storageLink.equals(StorageLink.Legacy.INSTANCE)) {
                    sandboxed = Countries.getOrCreateOnboardingLink(sessionQueries2);
                    Countries.linkAccountToStorage(sessionQueries2, str5, sandboxed);
                } else {
                    if (!(storageLink instanceof StorageLink.Sandboxed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return sandboxed2;
                    }
                    sandboxed = (StorageLink.Sandboxed) storageLink;
                }
                sandboxed2 = sandboxed;
                sessionQueries2.setActiveLink(Long.valueOf(sandboxed2.id));
                return sandboxed2;
            case 12:
                GestureImageView gestureImageView = (GestureImageView) obj;
                gestureImageView.getClass();
                Context context = gestureImageView.getContext();
                context.getClass();
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                builder.data = ((ChatImageDetailViewModel) obj2).imageUrl;
                ImageRequests_androidKt.target(builder, gestureImageView);
                builder.listener = new ToolbarTuckTargets(gestureImageView, gestureImageView);
                ((RealImageLoader) obj3).enqueue(builder.build());
                return Unit.INSTANCE;
            case 13:
                ChatContentViewModel.DisclaimerViewModel disclaimerViewModel = (ChatContentViewModel.DisclaimerViewModel) obj2;
                String str6 = (String) obj;
                str6.getClass();
                Ui.EventReceiver eventReceiver = ((ChatView) obj3).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new ChatViewEvent.LaunchUrl(disclaimerViewModel.messageToken, str6));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 14:
                return new SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen(((ArticlePresenter) obj3).args.data, (ArrayList) obj2, (AskedQuestion) obj);
            case 15:
                SupportDisputeTrackerViewModel.Loaded loaded = (SupportDisputeTrackerViewModel.Loaded) obj3;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                LazyListScope.item$default(lazyListScope4, null, null, ScreenshotReviewViewKt.f698lambda$1890950155, 3);
                LazyListScope.items$default(lazyListScope4, loaded.disputes.size(), null, new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(i6, loaded, (Function1) obj2), true, -1173139060), 6);
                if (loaded.showListLoadingSpinner) {
                    LazyListScope.item$default(lazyListScope4, null, null, ScreenshotReviewViewKt.lambda$551363642, 3);
                }
                return Unit.INSTANCE;
            case 16:
                Function1 function15 = (Function1) obj3;
                SupportActivityItemLoader.State.Success success = (SupportActivityItemLoader.State.Success) obj2;
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj;
                activityItemViewEvent.getClass();
                if (activityItemViewEvent.equals(ActivityItemViewEvent.AvatarClicked.INSTANCE) || activityItemViewEvent.equals(ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                    function15.invoke(new ArticleViewEvent.ActivityTransactionClicked(success.activityItem));
                }
                return Unit.INSTANCE;
            case 17:
                ((DisposableEffectScope) obj).getClass();
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i2, (CardLockPresenter) obj3, (MutableState) obj2);
            case 18:
                ((DisposableEffectScope) obj).getClass();
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i6, (ThreeDsPresenter) obj3, (MutableState) obj2);
            case 19:
                String str7 = (String) obj2;
                int intValue2 = ((Integer) obj).intValue();
                TransactionViewModel transactionViewModel = (TransactionViewModel) ((LazyPagingItems) obj3).get(intValue2);
                if (transactionViewModel != null) {
                    return Long.valueOf(transactionViewModel.id);
                }
                return str7 + intValue2;
            case 20:
                TextSetter textSetter = (TextSetter) obj3;
                Function1 function16 = (Function1) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new TaxReturnsViewKt$$ExternalSyntheticLambda5(textSetter, i6), true, 243660133), 3);
                ArcadeTransactionPickerViewKt.buildTransactionSection(lazyListScope5, "Outstanding", R.string.transactions_outstanding, (LazyPagingItems) textSetter.textSwitcher, new HeroCardNullStateKt$$ExternalSyntheticLambda8(16, function16));
                ArcadeTransactionPickerViewKt.buildTransactionSection(lazyListScope5, "Complete", R.string.transactions_complete, (LazyPagingItems) textSetter.scannerText, new HeroCardNullStateKt$$ExternalSyntheticLambda8(i3, function16));
                return Unit.INSTANCE;
            case 21:
                Function1 function17 = (Function1) obj3;
                RecurringReloadConfigurationViewModel.Keypad keypad = (RecurringReloadConfigurationViewModel.Keypad) obj2;
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    function17.invoke(Moneys.parseMoneyFromString$default(((AmountEvent.AmountChanged) amountEvent).rawAmount, keypad.getCurrency()));
                }
                return Unit.INSTANCE;
            case 22:
                RealAlertBannerPresenter realAlertBannerPresenter = (RealAlertBannerPresenter) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                AlertBannerViewEvent$BannerClicked alertBannerViewEvent$BannerClicked = (AlertBannerViewEvent$BannerClicked) obj;
                alertBannerViewEvent$BannerClicked.getClass();
                AdversityBanner adversityBanner = (AdversityBanner) mutableState2.getValue();
                if (adversityBanner != null) {
                    Analytics analytics = (Analytics) realAlertBannerPresenter.analytics;
                    int ordinal = ((AlertBannerScreen) realAlertBannerPresenter.screen).ordinal();
                    if (ordinal == 0) {
                        screen = Screen.ACTIVITY_TAB;
                    } else if (ordinal == 1) {
                        screen = Screen.MONEY_TAB;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screen = Screen.PAYMENT_PAD;
                    }
                    AdversityBanner.Style style = adversityBanner.style;
                    style.getClass();
                    int ordinal2 = style.ordinal();
                    if (ordinal2 == 0) {
                        state = State.WARNING;
                    } else if (ordinal2 == 1) {
                        state = State.INFO;
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        state = State.SUCCESS;
                    }
                    analytics.track(new AlertBannerNotificationInteractTap(screen, state), null);
                }
                RealRouter realRouter = (RealRouter) realAlertBannerPresenter.router;
                AdversityBanner adversityBanner2 = (AdversityBanner) mutableState2.getValue();
                adversityBanner2.getClass();
                String str8 = adversityBanner2.client_route_url;
                str8.getClass();
                realRouter.route(alertBannerViewEvent$BannerClicked.routingParams, str8);
                return Unit.INSTANCE;
            case 23:
                BadgedLayout badgedLayout = (BadgedLayout) obj2;
                Drawable drawable = (Drawable) obj;
                drawable.getClass();
                if (((AvatarBadgeViewModel.CardUrl) obj3).equals(badgedLayout.currentBadgeViewModel)) {
                    badgedLayout.setBadgeDrawable(drawable);
                }
                return Unit.INSTANCE;
            case 24:
                AvatarBadgeViewModel.IconUrl iconUrl = (AvatarBadgeViewModel.IconUrl) obj3;
                BadgedLayout badgedLayout2 = (BadgedLayout) obj2;
                Drawable drawable2 = (Drawable) obj;
                drawable2.getClass();
                if (iconUrl.equals(badgedLayout2.currentBadgeViewModel)) {
                    Context context2 = badgedLayout2.getContext();
                    context2.getClass();
                    ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context2);
                    ColorModel colorModel = iconUrl.backgroundColor;
                    Integer forTheme = colorModel != null ? DimensionKt.forTheme(colorModel, findThemeInfo) : null;
                    if (forTheme != null) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(1);
                        gradientDrawable.setColor(forTheme.intValue());
                        badgedLayout2.setBadgeDrawable(new LayerDrawable(new Drawable[]{gradientDrawable, drawable2}));
                    } else {
                        badgedLayout2.setBadgeDrawable(drawable2);
                    }
                }
                return Unit.INSTANCE;
            case 25:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj3);
                androidStatement2.bindBytes(1, (byte[]) obj2);
                return Unit.INSTANCE;
            case 26:
                WalletHomeScreen walletHomeScreen = (WalletHomeScreen) obj3;
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj2;
                app.cash.broadway.screen.Screen screen2 = (app.cash.broadway.screen.Screen) obj;
                screen2.getClass();
                if (screen2.equals(walletHomeScreen)) {
                    cardSchemePresenter.copyId$delegate.setValue(walletHomeScreen.copyId);
                } else {
                    cardSchemePresenter.navigator.goTo(screen2);
                }
                return Unit.INSTANCE;
            case 27:
                CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) obj3;
                Function0 function0 = (Function0) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                CardAppletTileViewModel.Installed installed = cardAppletTileViewModel instanceof CardAppletTileViewModel.Installed ? (CardAppletTileViewModel.Installed) cardAppletTileViewModel : null;
                if (installed != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, installed.appletContentDescription);
                }
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, ((CardAppletTileViewModel.WithCardUi) cardAppletTileViewModel).getOnClickContentDescription(), new AlertBannerKt$$ExternalSyntheticLambda2(13, function0));
                return Unit.INSTANCE;
            case 28:
                DeviceLockModel deviceLockModel = (DeviceLockModel) obj3;
                Function2 function2 = (Function2) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!deviceLockModel.isDisabled) {
                    function2.invoke(deviceLockModel.id, bool);
                }
                return Unit.INSTANCE;
            default:
                ((DisposableEffectScope) obj).getClass();
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i5, (CardTextureState) obj3, (CardNuxState) obj2);
        }
    }
}
