package com.squareup.cash.amountchooser.views;

import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletActivityListEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletNotificationViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletInfoSheetView;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletNotificationView;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.CreditSectionHeaderKt$WhenMappings;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.TransactionRowKt$$ExternalSyntheticLambda4;
import com.squareup.cash.agents.applets.presenters.AgentsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.agents.applets.presenters.RealAgentsAppletTileRepository;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.ui.ReceiptSection;
import dev.zacsweers.metro.Provider;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class AtmPickerGridKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AtmPickerGridKt$$ExternalSyntheticLambda4(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel, Function1 function1) {
        this.$r8$classId = 20;
        this.f$0 = transactionRowViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04e8  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        int i2 = 15;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Color color = null;
        int i3 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i4 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Icons icons = (Icons) obj4;
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changedInstance = gapComposer.changedInstance(item);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ContextKt$$ExternalSyntheticLambda1(item, i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), 0L, gapComposer, 48, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ReceiptUiKt.LocationRow((ReceiptSection.LocationRow) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ReceiptUiKt.Upsell((ReceiptSection.Upsell) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                Reward$Adapter reward$Adapter = ((AfterpayAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) ((Provider) reward$Adapter.avatarsAdapter).invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
                RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((Provider) reward$Adapter.app_linksAdapter).invoke();
                KeyValue keyValue = (KeyValue) ((RealPasscodeFlowStarter.MetroFactory) reward$Adapter.program_detail_rowsAdapter).invoke();
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
                realAfterpayAppletRepository.getClass();
                factory.getClass();
                moneyAnalyticsService.getClass();
                realUuidGenerator.getClass();
                realAfterpayAppletAnalytics.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new AfterpayAppletTilePresenter(navigator, realAfterpayAppletRepository, factory, moneyAnalyticsService, realUuidGenerator, keyValue, realAfterpayAppletAnalytics, promotedAppletTilePresenter$Factory$Impl)), coroutineScope, (LifecycleOwner) obj3);
                return new FamilyAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 1), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 2));
            case 4:
                AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel = (AfterpayAppletActivityListEmbeddedViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AfterpaySearchViewKt.AfterpayAppletActivityEmbeddedList(afterpayAppletActivityListEmbeddedViewModel.activityListViewModel, afterpayAppletActivityListEmbeddedViewModel.footerSection, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                FooterSection footerSection = (FooterSection) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (footerSection == null) {
                    gapComposer3.startReplaceGroup(1087316241);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(1087316242);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                    ModalKt.HorizontalDivider(0, 1, gapComposer3, null);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                    boolean changed = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SwipeToDismissKt$$ExternalSyntheticLambda4(i2, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    AfterpaySearchViewKt.AfterpayAppletFooter(footerSection, (Function2) rememberedValue2, gapComposer3, 0);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletFooter((FooterSection) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletHomeLoading((Loading) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel = (AfterpayAppletInfoSheetViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i5 = AfterpayAppletInfoSheetView.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AfterpaySearchViewKt.AfterpayAppletInfoSheetContent(null, afterpayAppletInfoSheetViewModel, function13, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.LoadedMerchantSheetView((AfterpayAppletMerchantSheetViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.ErrorMerchantSheetView((AfterpayAppletMerchantSheetViewModel.Error) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                AfterpayAppletNotificationViewModel afterpayAppletNotificationViewModel = (AfterpayAppletNotificationViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i6 = AfterpayAppletNotificationView.$r8$clinit;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = afterpayAppletNotificationViewModel.title;
                    String str2 = afterpayAppletNotificationViewModel.subtitle;
                    Long l = afterpayAppletNotificationViewModel.timeUntilDismissMillis;
                    boolean changed2 = gapComposer5.changed(function14);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ReceiptUiKt$$ExternalSyntheticLambda3(19, function14);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    AfterpaySearchViewKt.AfterpayAppletNotificationOverlay(str, str2, l, (Function0) rememberedValue3, gapComposer5, 0);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel = (AfterpayAppletPurchasesEmbeddedViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else if (afterpayAppletPurchasesEmbeddedViewModel instanceof AfterpayAppletPurchasesEmbeddedViewModel.Default) {
                    gapComposer6.startReplaceGroup(-438324769);
                    AfterpaySearchViewKt.AfterpayPurchasesContent((AfterpayAppletPurchasesEmbeddedViewModel.Default) afterpayAppletPurchasesEmbeddedViewModel, function15, null, gapComposer6, 0);
                    gapComposer6.end(false);
                } else {
                    if (!(afterpayAppletPurchasesEmbeddedViewModel instanceof AfterpayAppletPurchasesEmbeddedViewModel.Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -291236215, false);
                    }
                    gapComposer6.startReplaceGroup(-438169273);
                    AfterpayAppletPurchasesEmbeddedViewModel.Error error = (AfterpayAppletPurchasesEmbeddedViewModel.Error) afterpayAppletPurchasesEmbeddedViewModel;
                    String str3 = error.screenTitle;
                    String str4 = error.titleText;
                    String str5 = error.subtitleText;
                    String str6 = error.buttonText;
                    boolean changed3 = gapComposer6.changed(function15);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ReceiptUiKt$$ExternalSyntheticLambda3(20, function15);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function0 = (Function0) rememberedValue4;
                    boolean changed4 = gapComposer6.changed(function15);
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ReceiptUiKt$$ExternalSyntheticLambda3(21, function15);
                        gapComposer6.updateRememberedValue(rememberedValue5);
                    }
                    AfterpaySearchViewKt.AfterpayAppletError(str3, str4, str5, str6, null, function0, (Function0) rememberedValue5, null, gapComposer6, 0, 144);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel = (AfterpayAppletUpsellSheetViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AfterpaySearchViewKt.AfterpayAppletUpsellSheet(afterpayAppletUpsellSheetViewModel, function16, null, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.SheetButton((AfterpayAppletUpsellSheetViewModel.CtaButton) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType appletCreditLineType = (AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType) obj4;
                String str7 = (String) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer8, 48);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    int i7 = appletCreditLineType == null ? -1 : CreditSectionHeaderKt$WhenMappings.$EnumSwitchMapping$0[appletCreditLineType.ordinal()];
                    if (i7 == 1) {
                        gapComposer8.startReplaceGroup(-335718763);
                        Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        j = colors.base.brandAzureH2;
                    } else if (i7 != 2) {
                        gapComposer8.startReplaceGroup(-1817248108);
                        gapComposer8.end(false);
                        if (color != null) {
                            gapComposer8.startReplaceGroup(-1817213047);
                        } else {
                            gapComposer8.startReplaceGroup(-1817213046);
                            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 8.0f), RoundedCornerShapeKt.CircleShape), color.value, ColorKt.RectangleShape), gapComposer8, 0);
                        }
                        gapComposer8.end(false);
                        if (str7 != null) {
                            gapComposer8.startReplaceGroup(-1817110747);
                            gapComposer8.end(false);
                        } else {
                            gapComposer8.startReplaceGroup(-1817110746);
                            SpacerKt.Spacer(gapComposer8, SizeKt.m290width3ABfNKs(companion, 4.0f));
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                            gapComposer8.end(false);
                        }
                        gapComposer8.end(true);
                    } else {
                        gapComposer8.startReplaceGroup(-335716402);
                        Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        j = colors2.semantic.text.brand;
                    }
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer8, false, j);
                    if (color != null) {
                    }
                    gapComposer8.end(false);
                    if (str7 != null) {
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                LegalSectionKt.LegalSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.Legal) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                String str8 = (String) obj4;
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader standaloneHeader = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, LegalSectionKt.toColor(standaloneHeader.header.displayEffect, gapComposer9), (Composer) gapComposer9, (Modifier) null, ((Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                AfterpayCardKt.CardFooterContent((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj4;
                String str9 = (String) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.startReplaceGroup(2035712688);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState2 = AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON;
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    if (toggleState != toggleState2) {
                        ((DefaultSizes) gapComposer10.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        modifier = SpacerKt.m302paddingqDBjuR0$default(modifier, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    }
                    gapComposer10.end(false);
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CardMessageQueries$$ExternalSyntheticLambda1(17);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer10, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue6), (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) obj4;
                final Function1 function17 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean changedInstance2 = gapComposer11.changedInstance(transactionRowViewModel) | gapComposer11.changed(function17);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                        final Object[] objArr3 = objArr == true ? 1 : 0;
                        rememberedValue7 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.TransactionRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = objArr3;
                                Function1 function18 = function17;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel2 = transactionRowViewModel;
                                switch (i8) {
                                    case 0:
                                        List list = transactionRowViewModel2.impressionEventSpec;
                                        if (list != null) {
                                            function18.invoke(new ItemViewed(list, null));
                                        }
                                        break;
                                    default:
                                        Tap.Url url = transactionRowViewModel2.tapAction;
                                        if (url != null) {
                                            function18.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(url, url.getAnalyticsTapEventsSpec()));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    Modifier onVisible$default = VisibleKt.onVisible$default(companion, (Function0) rememberedValue7);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1986181608, new BalanceFeedKt$$ExternalSyntheticLambda9(transactionRowViewModel, 22), gapComposer11);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2111241453, new TransactionRowKt$$ExternalSyntheticLambda4(transactionRowViewModel, objArr2 == true ? 1 : 0), gapComposer11);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(331185137, new BrandSheetViewKt$$ExternalSyntheticLambda1(25, (Object) transactionRowViewModel, (Object) function17), gapComposer11);
                    boolean changedInstance3 = gapComposer11.changedInstance(transactionRowViewModel) | gapComposer11.changed(function17);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.homesection.v3.TransactionRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i4;
                                Function1 function18 = function17;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel2 = transactionRowViewModel;
                                switch (i8) {
                                    case 0:
                                        List list = transactionRowViewModel2.impressionEventSpec;
                                        if (list != null) {
                                            function18.invoke(new ItemViewed(list, null));
                                        }
                                        break;
                                    default:
                                        Tap.Url url = transactionRowViewModel2.tapAction;
                                        if (url != null) {
                                            function18.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(url, url.getAnalyticsTapEventsSpec()));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    CellDefaultKt.m3388CellActivity6RhP_wg(rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue8, onVisible$default, null, Expect_jvmKt.rememberComposableLambda(1510812398, new TransactionRowKt$$ExternalSyntheticLambda4(transactionRowViewModel, i3), gapComposer11), null, false, 0L, gapComposer11, 1573302, 928);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AfterpayAppletRetroOrderSelectionViewModel afterpayAppletRetroOrderSelectionViewModel = (AfterpayAppletRetroOrderSelectionViewModel) obj4;
                Function1 function18 = (Function1) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                } else if (afterpayAppletRetroOrderSelectionViewModel instanceof AfterpayAppletRetroOrderSelectionViewModel.Loaded) {
                    gapComposer12.startReplaceGroup(-59019982);
                    AeMode.Companion.LoadedAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Loaded) afterpayAppletRetroOrderSelectionViewModel, function18, gapComposer12, 0);
                    gapComposer12.end(false);
                } else if (afterpayAppletRetroOrderSelectionViewModel instanceof AfterpayAppletRetroOrderSelectionViewModel.Error) {
                    gapComposer12.startReplaceGroup(-59017615);
                    AeMode.Companion.ErrorAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Error) afterpayAppletRetroOrderSelectionViewModel, function18, gapComposer12, 0);
                    gapComposer12.end(false);
                } else {
                    if (!(afterpayAppletRetroOrderSelectionViewModel instanceof AfterpayAppletRetroOrderSelectionViewModel.Loading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -59021000, false);
                    }
                    gapComposer12.startReplaceGroup(-59015213);
                    AeMode.Companion.LoadingAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Loading) afterpayAppletRetroOrderSelectionViewModel, function18, gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AeMode.Companion.ErrorAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Error) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                AeMode.Companion.LoadedAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                AeMode.Companion.LoadingAppletRetroOrderSelectionView((AfterpayAppletRetroOrderSelectionViewModel.Loading) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                AnalyticsMappersKt.CallToActionView((AfterpayAppletUpsellCardViewModel.CallToAction) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UninstalledUI((AgentsAppletTileViewModel.Uninstalled) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                Navigator navigator2 = (Navigator) obj;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                navigator2.getClass();
                coroutineScope2.getClass();
                LoadTimeClock.MetroFactory metroFactory = ((AgentsAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                RealAgentsAppletTileRepository realAgentsAppletTileRepository = (RealAgentsAppletTileRepository) metroFactory.clock.invoke();
                FlowStarter flowStarter = (FlowStarter) metroFactory.observabilityManager.invoke();
                realAgentsAppletTileRepository.getClass();
                flowStarter.getClass();
                Presenter.Binding start$default2 = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realAgentsAppletTileRepository, flowStarter, navigator2)), coroutineScope2, (LifecycleOwner) obj3);
                return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default2).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default2, 3));
            case 28:
                ((Integer) obj2).getClass();
                AgentsHomeViewKt.AgentCard((AgentCardViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                CellDefault cellDefault = (CellDefault) obj4;
                String str10 = (String) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Icons arcadeIcon = ArcadeComponentProtoBindingKt.toArcadeIcon(cellDefault.body_icon);
                    if (arcadeIcon != null) {
                        gapComposer13.startReplaceGroup(-933072321);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer13, 48);
                        int hashCode3 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer13.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer13, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer13.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer13.startReusableNode();
                        if (gapComposer13.inserting) {
                            gapComposer13.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer13.useNode();
                        }
                        Updater.m576setimpl(gapComposer13, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer13, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer13, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        Trace.m1191Iconww6aTOc(arcadeIcon, (String) null, (Modifier) null, 0L, gapComposer13, 48, 12);
                        ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 4.0f, gapComposer13);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str10, (Map) null, (Function1) null, false);
                        gapComposer13.end(true);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-932817222);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str10, (Map) null, (Function1) null, false);
                        gapComposer13.end(false);
                    }
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AtmPickerGridKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ AtmPickerGridKt$$ExternalSyntheticLambda4(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
