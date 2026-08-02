package com.squareup.cash.money.booklet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.instantapps.InstantApps;
import com.google.android.material.color.MaterialColors;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda14;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.history.payments.viewmodels.BarColorState;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfileTransactionsBarViewModel;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewModel;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewModel;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.PaymentReceiptDialogView;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.investing.components.InvestingHomeView;
import com.squareup.cash.investing.components.InvestingHomeView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetViewV2;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchRow;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.invitations.InviteContactsHeaderViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.views.arcade.LimitsInlineMessageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.MapMarkerProperties;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBodyViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.util.Strings;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.Regions;
import com.squareup.wire.AndroidMessage;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import net.idrnd.face.iad.capture.internal.s;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabBookletKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda4(GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel, Function1 function1) {
        this.$r8$classId = 4;
        this.f$1 = twoColumnCardViewModel;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$investing$components$categories$InvestingCategoryDetailKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
        int i = 0;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        List list = ((InvestingCategoryDetailViewModel.Content) investingCategoryDetailViewModel).searchResult;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if ((((InvestingSearchRow) it.next()) instanceof SearchResult.StockResult) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
        boolean changedInstance = gapComposer2.changedInstance(investingCategoryDetailViewModel) | gapComposer2.changed(i) | gapComposer2.changed(function1);
        Object rememberedValue = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(investingCategoryDetailViewModel, i, function1, 17);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue, composer, 6, 510);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$custom$order$CustomOrderDragWidgetKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f$0;
        DragWidgetState dragWidgetState = (DragWidgetState) this.f$1;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        String stringResource = Room.stringResource(composer, R.string.investing_components_custom_order_drag_widget_content_description);
        String stringResource2 = Room.stringResource(composer, R.string.investing_components_custom_order_drag_widget_expand);
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(stringResource) | gapComposer.changed(stringResource2) | gapComposer.changed(function0) | gapComposer.changed(dragWidgetState);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            BankingConfigQueries$$ExternalSyntheticLambda0 bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(stringResource, stringResource2, function0, dragWidgetState, 17);
            gapComposer.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
            rememberedValue = bankingConfigQueries$$ExternalSyntheticLambda0;
        }
        CustomOrderKt.CollapsedWidget(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), gapComposer, 0);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$dependent$DependentWelcomeNullStateViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f$0;
        DependentWelcomeViewModel dependentWelcomeViewModel = (DependentWelcomeViewModel) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            coil3.size.SizeKt.ButtonCta(function0, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(1772409282, new FormView$$ExternalSyntheticLambda0(dependentWelcomeViewModel, 23), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentLearnMoreSheetViewV2$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel = (DividendReinvestmentLearnMoreSheetViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = DividendReinvestmentLearnMoreSheetViewV2.$r8$clinit;
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues);
            dividendReinvestmentLearnMoreSheetViewModel.getClass();
            MarkdownExtensionKt.DividendReinvestmentLearnMore(dividendReinvestmentLearnMoreSheetViewModel, function1, padding, gapComposer, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$settings$InvestingSettingsViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        InvestingSettingsViewModel investingSettingsViewModel = (InvestingSettingsViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = investingSettingsViewModel.title;
            long j = MooncakeTheme.getColors(gapComposer).background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            NavigationIconType navigationIconType = NavigationIconType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3654ToolbarA_Dysh8(str, m177backgroundbw27NRU, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24576, 364);
            gapComposer.startReplaceGroup(-246348373);
            for (InvestingSettingsViewModel.Section section : investingSettingsViewModel.sections) {
                Modifier.Companion companion2 = companion;
                GapComposer gapComposer2 = gapComposer;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion2, 20.0f, 24.0f, RecyclerView.DECELERATION_RATE, 8.0f, 4), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, section.title, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(-246338837);
                Iterator it = section.entries.iterator();
                while (it.hasNext()) {
                    s.EntryRow((InvestingSettingsViewModel.Entry) it.next(), function1, gapComposer, 0);
                }
                gapComposer.end(false);
                companion = companion2;
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$invitations$InviteContactsBodyKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) this.f$0;
        InviteContactsHeaderViewModel inviteContactsHeaderViewModel = (InviteContactsHeaderViewModel) this.f$1;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((CollapsingToolbarScopeInstance) obj).getClass();
        float progress = collapsingToolbarScaffoldState.toolbarState.getProgress();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier road = CollapsingToolbarScopeInstance.road(AlphaKt.alpha(companion, progress));
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, road);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
        Updater.m576setimpl(composer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
        Updater.m576setimpl(composer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
        Integer valueOf = Integer.valueOf(hashCode);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
        Updater.m576setimpl(composer, valueOf, composeUiNode$Companion$SetModifier$13);
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
        Updater.m575reconcileimpl(composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
        Updater.m576setimpl(composer, materializeModifier, composeUiNode$Companion$SetModifier$14);
        String str = inviteContactsHeaderViewModel.headerText;
        if (str == null) {
            str = "";
        }
        Countries.PageHeader(str, (Modifier) null, InviteErrorDialogKt.lambda$1145761081, inviteContactsHeaderViewModel.cashCustomerContactsText, composer, MLKEMEngine.KyberPolyBytes, 2);
        SpacerKt.Spacer(composer, SizeKt.m277height3ABfNKs(companion, 16.0f));
        gapComposer2.end(true);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
        Modifier materializeModifier2 = PlatformKt.materializeModifier(composer, companion);
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
        Updater.m576setimpl(composer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
        Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer, composeUiNode$Companion$SetModifier$13, composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
        Updater.m576setimpl(composer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$invitations$InviteContactsPresenter$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        String format2;
        ArrayList arrayList = (ArrayList) this.f$0;
        InviteContactsPresenter inviteContactsPresenter = (InviteContactsPresenter) this.f$1;
        String str = (String) obj;
        RegisterInvitationsRequest.EnhancedAlias.Type type2 = (RegisterInvitationsRequest.EnhancedAlias.Type) obj2;
        InvitationConfig.InvitationTreatment invitationTreatment = (InvitationConfig.InvitationTreatment) obj3;
        str.getClass();
        type2.getClass();
        return Boolean.valueOf(arrayList.add(new RegisterInvitationsRequest.EnhancedAlias(type2, Aliases.hash(str), (type2 != RegisterInvitationsRequest.EnhancedAlias.Type.SMS || (format2 = PhoneNumbers.format(str, Regions.toCountry(inviteContactsPresenter.args.blockersData.region).name(), null)) == null) ? str : format2, invitationTreatment, ByteString.EMPTY)));
    }

    private final Object invoke$com$squareup$cash$limits$views$arcade$LimitsInlineMessageKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        LimitsMessageViewModel limitsMessageViewModel = (LimitsMessageViewModel) this.f$1;
        InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inlineMessageButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inlineMessageButtonScope) ? 4 : 2;
        }
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            inlineMessageButtonScope.PrimaryButton(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(1787408415, new LimitsInlineMessageKt$$ExternalSyntheticLambda0(limitsMessageViewModel, i), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$maps$engine$googlemaps$GoogleMapEngine$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$1;
        GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter = (GoogleMapEngine.GoogleClusterItemAdapter) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        googleClusterItemAdapter.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((GapComposer) composer).changed(googleClusterItemAdapter) : ((GapComposer) composer).changedInstance(googleClusterItemAdapter) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MapMarkerProperties();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MapMarkerProperties mapMarkerProperties = (MapMarkerProperties) rememberedValue;
            Updater.CompositionLocalProvider(MapMarkerPropertiesKt.LocalMapMarkerProperties.defaultProvidedValue$runtime(mapMarkerProperties), Expect_jvmKt.rememberComposableLambda(-1815290057, new LocalHomeViewKt$$ExternalSyntheticLambda0(mapMarkerProperties, str != null && str.equals(googleClusterItemAdapter.cashItem.getViewModel().getToken()), composableLambdaImpl, googleClusterItemAdapter, 20), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$merchant$views$MerchantBlockingViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            MerchantBlockingViewModel.MerchantBlockingContentViewModel merchantBlockingContentViewModel = (MerchantBlockingViewModel.MerchantBlockingContentViewModel) merchantBlockingViewModel.content.invoke();
            if (merchantBlockingContentViewModel == null) {
                gapComposer.startReplaceGroup(-1380320653);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1380320652);
                Icons icons = Icons.NavigationHelp;
                String str = merchantBlockingContentViewModel.helpItem.accessibilityText;
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(merchantBlockingContentViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(25, function1, merchantBlockingContentViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TransactorKt.IconAction(titleBarActionScope, icons, str, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$merchant$views$MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel = (MerchantInfoFeedbackViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Strings.m3984LoadableSheetContentosbwsH8(merchantInfoFeedbackViewModel, merchantInfoFeedbackViewModel.content instanceof Loadable.Loading, 280.0f, null, null, Expect_jvmKt.rememberComposableLambda(156666324, new MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5(paddingValues, function1, i), gapComposer), gapComposer, 196992, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$merchant$views$MerchantProfileViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        Loadable loadable = (Loadable) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        GenericContainerViewModel.PlaceholderContainerViewModel placeholderContainerViewModel = (GenericContainerViewModel.PlaceholderContainerViewModel) obj;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        placeholderContainerViewModel.getClass();
        AndroidMessage androidMessage = placeholderContainerViewModel.decodedProtoData;
        GapComposer gapComposer = (GapComposer) composer;
        if ((androidMessage instanceof GenericProfileElement.ActivityElement ? (GenericProfileElement.ActivityElement) androidMessage : null) == null) {
            gapComposer.startReplaceGroup(-50769985);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-50769984);
            MerchantProfileViewKt.PaymentHistory(((MerchantBodyViewModel) ((Loadable.Loaded) loadable).value).paymentHistory, function1, gapComposer, 6);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier wrapContentHeight;
        Function1 function1;
        Modifier wrapContentHeight2;
        Modifier.Companion companion;
        long j;
        int i = this.$r8$classId;
        int i2 = 5;
        int i3 = 14;
        int i4 = 18;
        int i5 = 19;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        char c = 1;
        switch (i) {
            case 0:
                Function1 function12 = (Function1) obj5;
                MoneyTabBookletViewModel moneyTabBookletViewModel = (MoneyTabBookletViewModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(24, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-287846338, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(moneyTabBookletViewModel, i4), gapComposer), gapComposer, 1573248, 58);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                GenericComponentViewModel.BaseCardViewModel baseCardViewModel = (GenericComponentViewModel.BaseCardViewModel) obj4;
                Function1 function13 = (Function1) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion2, 20.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer2.startReplaceGroup(-2140113345);
                    for (GenericBaseViewModel genericBaseViewModel : baseCardViewModel.elements) {
                        wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        InstantApps.GenericBaseElement(genericBaseViewModel, wrapContentHeight, function13, gapComposer2, 48);
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                GenericComponentViewModel.CompactCardViewModel compactCardViewModel = (GenericComponentViewModel.CompactCardViewModel) obj4;
                Function1 function14 = (Function1) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 18.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    GenericComponentViewModel.TwoColumnViewModel twoColumnViewModel = compactCardViewModel.header;
                    if (twoColumnViewModel == null) {
                        gapComposer3.startReplaceGroup(-1260715929);
                    } else {
                        gapComposer3.startReplaceGroup(-1260715928);
                        RetryKt.TwoColumnWidget(twoColumnViewModel, null, false, function14, gapComposer3, 0, 6);
                    }
                    gapComposer3.end(false);
                    GenericBaseViewModel.TextViewModel textViewModel = compactCardViewModel.description;
                    if (textViewModel == null) {
                        gapComposer3.startReplaceGroup(-1260635050);
                    } else {
                        gapComposer3.startReplaceGroup(-1260635049);
                        MaterialColors.GenericText(textViewModel, SizeKt.wrapContentWidth$default(companion2, null, 3), gapComposer3, 48);
                    }
                    gapComposer3.end(false);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                GenericComponentViewModel.DetailedCardViewModel detailedCardViewModel = (GenericComponentViewModel.DetailedCardViewModel) obj4;
                Function1 function15 = (Function1) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion2, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, m298padding3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    GenericComponentViewModel.TwoColumnViewModel twoColumnViewModel2 = detailedCardViewModel.header;
                    GenericBaseViewModel genericBaseViewModel2 = detailedCardViewModel.body;
                    if (twoColumnViewModel2 == null) {
                        gapComposer4.startReplaceGroup(-81297484);
                        gapComposer4.end(false);
                        function1 = function15;
                    } else {
                        gapComposer4.startReplaceGroup(-81297483);
                        RetryKt.TwoColumnWidget(twoColumnViewModel2, null, false, function15, gapComposer4, MLKEMEngine.KyberPolyBytes, 2);
                        function1 = function15;
                        gapComposer4.end(false);
                    }
                    GenericBaseViewModel genericBaseViewModel3 = detailedCardViewModel.title;
                    if (genericBaseViewModel3 == null) {
                        gapComposer4.startReplaceGroup(-81181079);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-81181078);
                        InstantApps.GenericBaseElement(genericBaseViewModel3, SizeKt.fillMaxWidth(companion2, 1.0f), function1, gapComposer4, 48);
                        gapComposer4.end(false);
                    }
                    if (genericBaseViewModel2 != null) {
                        re$$ExternalSyntheticOutline0.m(gapComposer4, -81044678, companion2, 16.0f, gapComposer4);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-80987979);
                        gapComposer4.end(false);
                    }
                    if (genericBaseViewModel2 == null) {
                        gapComposer4.startReplaceGroup(-80964823);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-80964822);
                        InstantApps.GenericBaseElement(genericBaseViewModel2, SizeKt.fillMaxWidth(companion2, 1.0f), function1, gapComposer4, 48);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel = (GenericComponentViewModel.TwoColumnCardViewModel) obj4;
                Function1 function16 = (Function1) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    wrapContentHeight2 = SizeKt.wrapContentHeight(SpacerKt.m298padding3ABfNKs(companion2, 24.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, wrapContentHeight2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    GenericComponentViewModel.TwoColumnViewModel twoColumnViewModel3 = twoColumnCardViewModel.header;
                    if (twoColumnViewModel3 == null) {
                        gapComposer5.startReplaceGroup(-1824512342);
                    } else {
                        gapComposer5.startReplaceGroup(-1824512341);
                        RetryKt.TwoColumnWidget(twoColumnViewModel3, null, false, null, gapComposer5, MLKEMEngine.KyberPolyBytes, 10);
                    }
                    gapComposer5.end(false);
                    LottieUtilsKt.TwoColumnRow(twoColumnCardViewModel, function16, gapComposer5, 0);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                GenericComponentViewModel.CellActivityViewModel cellActivityViewModel = (GenericComponentViewModel.CellActivityViewModel) obj4;
                Function1 function17 = (Function1) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    GenericBaseViewModel genericBaseViewModel4 = cellActivityViewModel.avatar;
                    if (genericBaseViewModel4 == null) {
                        gapComposer6.startReplaceGroup(-1919919870);
                    } else {
                        gapComposer6.startReplaceGroup(-1919919869);
                        InstantApps.GenericBaseElement(genericBaseViewModel4, companion2, function17, gapComposer6, 48);
                    }
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                GenericContainerViewModel.CardContainerViewModel cardContainerViewModel = (GenericContainerViewModel.CardContainerViewModel) obj4;
                Function1 function18 = (Function1) obj5;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, m298padding3ABfNKs3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    gapComposer7.startReplaceGroup(791878223);
                    Iterator it = cardContainerViewModel.components.iterator();
                    while (it.hasNext()) {
                        ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) it.next(), null, false, function18, gapComposer7, MLKEMEngine.KyberPolyBytes);
                    }
                    gapComposer7.end(false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                GlobalSearchViewModel.SectionTrailer.WarningModal warningModal = (GlobalSearchViewModel.SectionTrailer.WarningModal) obj5;
                GlobalSearchViewModel.Section section = (GlobalSearchViewModel.Section) obj4;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    SpacerKt.Spacer(gapComposer8, SizeKt.m277height3ABfNKs(companion2, 8.0f));
                    GlobalSearchViewModel.Modal modal = warningModal.modal;
                    String str = modal.mainText;
                    String str2 = modal.buttonText;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    boolean changedInstance = gapComposer8.changedInstance(section) | gapComposer8.changedInstance(GlobalSearchViewEvent.LoadMore.INSTANCE);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GlobalSearchFeedKt$$ExternalSyntheticLambda14(section, 1);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    QuickAccessBarKt.WarningModal(lazyItemScopeImpl, str, str3, (Function0) rememberedValue2, gapComposer8, intValue8 & 14);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                GlobalSearchViewModel.Section section2 = (GlobalSearchViewModel.Section) obj5;
                Function0 function0 = (Function0) obj4;
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                lazyItemScopeImpl2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(lazyItemScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, companion2);
                    GlobalSearchViewModel.QabSection qabSection = (GlobalSearchViewModel.QabSection) section2;
                    boolean changed2 = gapComposer9.changed(function0) | gapComposer9.changedInstance(section2);
                    Object rememberedValue3 = gapComposer9.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new GlobalSearchFeedKt$$ExternalSyntheticLambda5(function0, section2, 1);
                        gapComposer9.updateRememberedValue(rememberedValue3);
                    }
                    QuickAccessBarKt.QuickAccessBar(qabSection, animateItem$default, (Function1) rememberedValue3, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function19 = (Function1) obj5;
                ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel = (ProfilePaymentHistoryViewModel) obj4;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    String stringResource = Room.stringResource(gapComposer10, R.string.profile_payment_history_title);
                    boolean changed3 = gapComposer10.changed(function19);
                    Object rememberedValue4 = gapComposer10.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ErrorView$$ExternalSyntheticLambda4(11, function19);
                        gapComposer10.updateRememberedValue(rememberedValue4);
                    }
                    embeddedHeaderScope.DefaultHeaderWithoutSpace((intValue10 << 9) & 7168, 2, gapComposer10, stringResource, null, (Function0) rememberedValue4);
                    ProfileTransactionsBarViewModel profileTransactionsBarViewModel = ((ProfilePaymentHistoryViewModel.Data) profilePaymentHistoryViewModel).transactionsBarViewModel;
                    if (profileTransactionsBarViewModel == null) {
                        gapComposer10.startReplaceGroup(592079422);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(592079423);
                        String str4 = profileTransactionsBarViewModel.totalTransactionAmountLabel;
                        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                        if (str4 == null) {
                            gapComposer10.startReplaceGroup(-105829167);
                            gapComposer10.end(false);
                            companion = companion3;
                        } else {
                            gapComposer10.startReplaceGroup(-105829166);
                            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
                            companion = companion3;
                            TextStyle textStyle = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).hero;
                            Colors colors = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer10, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                            gapComposer10.end(false);
                        }
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
                        String str5 = profileTransactionsBarViewModel.totalTransactionDescriptionLabel;
                        TextStyle textStyle2 = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        BarColorState barColorState = profileTransactionsBarViewModel.transactionBarColor;
                        barColorState.getClass();
                        int ordinal = barColorState.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                gapComposer10.startReplaceGroup(-1954847325);
                                Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                                } else {
                                    gapComposer10.startReplaceGroup(-1762997739);
                                    gapComposer10.end(false);
                                }
                                j = colors2.semantic.text.disabled;
                                gapComposer10.end(false);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer10, m302paddingqDBjuR0$default2, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                PaymentHistoryWidgetKt.ProfileTransactionsBar(profileTransactionsBarViewModel, gapComposer10, 0);
                                gapComposer10.end(false);
                            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, -1954849151, false);
                            }
                        }
                        gapComposer10.startReplaceGroup(-1954843327);
                        Colors colors3 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j = colors3.semantic.text.subtle;
                        gapComposer10.end(false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer10, m302paddingqDBjuR0$default2, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                        PaymentHistoryWidgetKt.ProfileTransactionsBar(profileTransactionsBarViewModel, gapComposer10, 0);
                        gapComposer10.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel = (CancelPendingSupPaymentViewModel) obj4;
                Function1 function110 = (Function1) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    String str6 = cancelPendingSupPaymentViewModel.secondaryButtonText;
                    if (str6 == null) {
                        gapComposer11.startReplaceGroup(-1967325309);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(-1967325308);
                        ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion2, 1.0f);
                        boolean changed4 = gapComposer11.changed(function110);
                        Object rememberedValue5 = gapComposer11.rememberedValue();
                        if (changed4 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new ErrorView$$ExternalSyntheticLambda4(i3, function110);
                            gapComposer11.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, horizontalWeight, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1763832949, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str6, 21), gapComposer11), gapComposer11, 1573248, 56);
                        gapComposer11.end(false);
                    }
                    String str7 = cancelPendingSupPaymentViewModel.primaryButtonText;
                    if (str7 == null) {
                        gapComposer11.startReplaceGroup(-1967064475);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(-1967064474);
                        ButtonProminence buttonProminence3 = ButtonProminence.SUBTLE;
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion2, 1.0f);
                        boolean changed5 = gapComposer11.changed(function110);
                        Object rememberedValue6 = gapComposer11.rememberedValue();
                        if (changed5 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new ErrorView$$ExternalSyntheticLambda4(15, function110);
                            gapComposer11.updateRememberedValue(rememberedValue6);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, horizontalWeight2, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(1567352556, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str7, 22), gapComposer11), gapComposer11, 1573248, 56);
                        gapComposer11.end(false);
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function111 = (Function1) obj5;
                PaymentReceiptDialogViewModel paymentReceiptDialogViewModel = (PaymentReceiptDialogViewModel) obj4;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                int i6 = PaymentReceiptDialogView.$r8$clinit;
                modalButtonScope.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    boolean changed6 = gapComposer12.changed(function111);
                    Object rememberedValue7 = gapComposer12.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ErrorView$$ExternalSyntheticLambda4(i5, function111);
                        gapComposer12.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue7, null, false, Expect_jvmKt.rememberComposableLambda(-731531878, new FormView$$ExternalSyntheticLambda0(paymentReceiptDialogViewModel, 7), gapComposer12), gapComposer12, (57344 & (intValue12 << 12)) | 3072, 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                AppUpgradeViewModel appUpgradeViewModel = (AppUpgradeViewModel) obj4;
                Function1 function112 = (Function1) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String str8 = appUpgradeViewModel.negativeButtonText;
                    if (str8 == null) {
                        gapComposer13.startReplaceGroup(1928197956);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(1928197957);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                        boolean changed7 = gapComposer13.changed(function112);
                        Object rememberedValue8 = gapComposer13.rememberedValue();
                        if (changed7 || rememberedValue8 == neverEqualPolicy) {
                            rememberedValue8 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(c == true ? 1 : 0, function112);
                            gapComposer13.updateRememberedValue(rememberedValue8);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-112234866, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str8, 23), gapComposer13), gapComposer13, 1572912, 60);
                        gapComposer13.end(false);
                    }
                    String str9 = appUpgradeViewModel.secondaryButtonText;
                    if (str9 == null) {
                        gapComposer13.startReplaceGroup(1928348709);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(1928348710);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                        boolean changed8 = gapComposer13.changed(function112);
                        Object rememberedValue9 = gapComposer13.rememberedValue();
                        if (changed8 || rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(2, function112);
                            gapComposer13.updateRememberedValue(rememberedValue9);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1461241929, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str9, 24), gapComposer13), gapComposer13, 1572912, 60);
                        gapComposer13.end(false);
                    }
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    boolean changed9 = gapComposer13.changed(function112);
                    Object rememberedValue10 = gapComposer13.rememberedValue();
                    if (changed9 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(3, function112);
                        gapComposer13.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth3, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(253491814, new FormView$$ExternalSyntheticLambda0(appUpgradeViewModel, 9), gapComposer13), gapComposer13, 1573296, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Function0 function02 = (Function0) obj5;
                InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    coil3.size.SizeKt.ButtonCta(function02, SizeKt.fillMaxWidth(companion2, 1.0f), null, false, true, null, Expect_jvmKt.rememberComposableLambda(-1016729887, new FormView$$ExternalSyntheticLambda0(ready, 12), gapComposer14), gapComposer14, 1597488, 44);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                InvestingHomeViewModel investingHomeViewModel = (InvestingHomeViewModel) obj5;
                InvestingHomeView investingHomeView = (InvestingHomeView) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    InvestingHomeViewModel.MenuIcon menuIcon = investingHomeViewModel.getMenuIcon();
                    if (menuIcon instanceof InvestingHomeViewModel.MenuIcon.Hidden) {
                        gapComposer15.startReplaceGroup(-1751828649);
                        gapComposer15.end(false);
                    } else {
                        if (!(menuIcon instanceof InvestingHomeViewModel.MenuIcon.Settings)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer15, -1751829922, false);
                        }
                        gapComposer15.startReplaceGroup(1527944856);
                        Icons icons = Icons.NavigationMore;
                        String stringResource2 = Room.stringResource(gapComposer15, R.string.investing_components_title_bar_action_more);
                        boolean changedInstance2 = gapComposer15.changedInstance(investingHomeView);
                        Object rememberedValue11 = gapComposer15.rememberedValue();
                        if (changedInstance2 || rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new InvestingHomeView$$ExternalSyntheticLambda2(investingHomeView, 3);
                            gapComposer15.updateRememberedValue(rememberedValue11);
                        }
                        TransactorKt.IconAction(titleBarActionScope, icons, stringResource2, (Function0) rememberedValue11, null, null, null, null, null, null, false, gapComposer15, (intValue15 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer15.end(false);
                    }
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                InvestingStockSelectionViewModel.Loaded loaded = (InvestingStockSelectionViewModel.Loaded) obj4;
                Function1 function113 = (Function1) obj5;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    boolean z = ((InvestingStockSelectionViewModel.Loaded.MultiSelect) loaded).getMultiselectParameters().ctaButtonEnabled;
                    boolean changed10 = gapComposer16.changed(function113);
                    Object rememberedValue12 = gapComposer16.rememberedValue();
                    if (changed10 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(27, function113);
                        gapComposer16.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue12, fillMaxWidth4, buttonProminence5, false, z, null, Expect_jvmKt.rememberComposableLambda(1099620965, new FormView$$ExternalSyntheticLambda0(loaded, 17), gapComposer16), gapComposer16, 1573296, 40);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return invoke$com$squareup$cash$investing$components$categories$InvestingCategoryDetailKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 17:
                Function1 function114 = (Function1) obj5;
                InvestingCategoryFilterViewModel investingCategoryFilterViewModel = (InvestingCategoryFilterViewModel) obj4;
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    boolean changed11 = gapComposer17.changed(function114);
                    Object rememberedValue13 = gapComposer17.rememberedValue();
                    if (changed11 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new InvestingNewsKt$$ExternalSyntheticLambda0(r12, function114);
                        gapComposer17.updateRememberedValue(rememberedValue13);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue13, adaptiveStackScope2.horizontalWeight(companion2, 1.0f), null, false, false, null, InvestingCategoryDetailKt.f446lambda$732679268, gapComposer17, 1572864, 60);
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    boolean z2 = ((InvestingCategoryFilterViewModel.Content) investingCategoryFilterViewModel).isValid;
                    Modifier horizontalWeight3 = adaptiveStackScope2.horizontalWeight(companion2, 1.0f);
                    boolean changed12 = gapComposer17.changed(function114);
                    Object rememberedValue14 = gapComposer17.rememberedValue();
                    if (changed12 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new InvestingNewsKt$$ExternalSyntheticLambda0(i2, function114);
                        gapComposer17.updateRememberedValue(rememberedValue14);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, horizontalWeight3, buttonProminence6, false, z2, null, Expect_jvmKt.rememberComposableLambda(1955577363, new FormView$$ExternalSyntheticLambda0(investingCategoryFilterViewModel, i5), gapComposer17), gapComposer17, 1573248, 40);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                return invoke$com$squareup$cash$investing$components$custom$order$CustomOrderDragWidgetKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$investing$components$dependent$DependentWelcomeNullStateViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$investing$components$drip$DividendReinvestmentLearnMoreSheetViewV2$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$investing$components$settings$InvestingSettingsViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$invitations$InviteContactsBodyKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$invitations$InviteContactsPresenter$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$limits$views$arcade$LimitsInlineMessageKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$maps$engine$googlemaps$GoogleMapEngine$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$merchant$views$MerchantBlockingViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$merchant$views$MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$merchant$views$MerchantProfileViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            default:
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj5;
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                float f = mo833measureBRTryo0.height;
                float max = Math.max(f / 4.0f, ((Number) ((State) obj4).getValue()).floatValue() * f);
                cardNestedScrollExpander.maxRevealScale$delegate.setFloatValue(8.0f);
                cardNestedScrollExpander.cardHeight$delegate.setValue(Float.valueOf(max));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, (int) max, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 14));
        }
    }

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda4(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
