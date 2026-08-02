package com.squareup.cash.maps.views;

import androidx.camera.core.impl.utils.MatrixExt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselView;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.components.ordertype.autoinvest.DependentAutoInvestInfoBottomSheetView;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.DependentAutoInvestInfoViewModel;
import com.squareup.cash.investing.viewmodels.search.SearchRowHeader;
import com.squareup.cash.invitations.InviteContactsReferralRulesViewModel;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.LoadingAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.banners.presenters.KybBannerItem;
import com.squareup.cash.money.booklet.CardSection;
import com.squareup.cash.money.booklet.HeaderSection;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.booklet.HeroSection;
import com.squareup.cash.money.booklet.ListUnorderedCardSection;
import com.squareup.cash.money.booklet.ListUnorderedSection;
import com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.face.iad.capture.internal.e4;
import org.commonmark.internal.util.LinkScanner;
import retrofit2.DefaultMethodSupport;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        String str;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                CashMapViewModel cashMapViewModel = (CashMapViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Icons icons = Icons.Send24;
                    String stringResource = Room.stringResource(gapComposer, R.string.center_location_description);
                    if (cashMapViewModel.userLocationInBoundary) {
                        gapComposer.startReplaceGroup(2142426828);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.accent.ocean;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2142506219);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.icon.standard;
                        gapComposer.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, stringResource, (Modifier) null, j, gapComposer, 6, 4);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                InstrumentSelectionBlockerViewModel.Content.InstrumentSection instrumentSection = (InstrumentSelectionBlockerViewModel.Content.InstrumentSection) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, instrumentSection.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                InvestingDetailsCategorySectionContentModel.Cell cell = (InvestingDetailsCategorySectionContentModel.Cell) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cell.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LinkScanner linkScanner = (LinkScanner) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ArcadeBordersKt.InvestingAvatar(linkScanner, null, null, null, gapComposer4, 0, 14);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                MyInvestmentsContentModel myInvestmentsContentModel = (MyInvestmentsContentModel) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(8.0f), Alignment.Companion.Top, gapComposer5, 6);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
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
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ArcadeBordersKt.MyInvestmentAmountSection(myInvestmentsContentModel.getInvestedText(), Room.stringResource(gapComposer5, R.string.investing_components_stat_total_invested), null, Alignment.Companion.Start, gapComposer5, 3072);
                    if (myInvestmentsContentModel instanceof MyInvestmentsContentModel.KnownNetProfit) {
                        str = ((MyInvestmentsContentModel.KnownNetProfit) myInvestmentsContentModel).netProfitText;
                    } else {
                        if (!(myInvestmentsContentModel instanceof MyInvestmentsContentModel.UnknownNetProfit)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = "…";
                    }
                    ArcadeBordersKt.MyInvestmentAmountSection(str, Room.stringResource(gapComposer5, R.string.investing_components_stat_total_gain), null, Alignment.Companion.End, gapComposer5, 3072);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selection.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((InvestingStockCarouselView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Holding holding = (Holding) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, holding.percent, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = (InvestingPlaceholderGraphViewModel) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i2 = InvestingPlaceholderGraphView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    investingPlaceholderGraphViewModel.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "$0.00", (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel = (DependentAutoInvestInfoViewModel) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i3 = DependentAutoInvestInfoBottomSheetView.$r8$clinit;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AutoInvestPurchaseKt.DependentAutoInvestInfoBottomSheet(dependentAutoInvestInfoViewModel, null, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                e4.InvestingSearchHeaderView((SearchRowHeader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj);
                gapComposer10.startReplaceGroup(-2110663812);
                InvestingState investingStates = ((RealInvestingStateManager) ((MetadataRepo) obj3).mMetadataList).investingStates(gapComposer10);
                gapComposer10.end(false);
                return investingStates;
            case 12:
                InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str2 = inviteContactsReferralRulesViewModel.enableReferralTextSubtitle;
                    if (str2 == null) {
                        gapComposer11.startReplaceGroup(196608679);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(196608680);
                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer11.end(false);
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                LimitsMessageViewModel limitsMessageViewModel = (LimitsMessageViewModel) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((LimitsMessageViewModel.CardUpsell) limitsMessageViewModel).titleText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                LimitsSectionType limitsSectionType = (LimitsSectionType) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    int ordinal = limitsSectionType.ordinal();
                    Trace.m1191Iconww6aTOc(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? Icons.TransferP2P24 : Icons.Investing24 : Icons.CurrencyBtc24 : Icons.CardBasic24 : Icons.TransferP2P24 : Icons.ContactAdd24, (String) null, (Modifier) null, 0L, gapComposer13, 48, 12);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                MarkerLocation markerLocation = (MarkerLocation) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, markerLocation.getTitle(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                GapComposer gapComposer15 = (GapComposer) ((Composer) obj);
                gapComposer15.startReplaceGroup(1740022103);
                TextStyle textStyle = ((InstalledBalanceAppletTileLayoutConfig) obj3).titleStyle;
                gapComposer15.end(false);
                return textStyle;
            case 17:
                ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj);
                gapComposer16.startReplaceGroup(668375750);
                TextStyle textStyle2 = ((InstalledServiceAppletTileLayoutConfig) obj3).titleStyle;
                gapComposer16.end(false);
                return textStyle2;
            case 18:
                ((Integer) obj2).getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj);
                gapComposer17.startReplaceGroup(-229807211);
                TextStyle textStyle3 = ((LoadingAppletTileLayoutConfig) obj3).titleStyle;
                gapComposer17.end(false);
                return textStyle3;
            case 19:
                ((Integer) obj2).getClass();
                SharedUIKt.BalanceAppletChart((InvestingGraphContentModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((AppletTileItem) obj3).UI((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((KybBannerItem) obj3).UI((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                DefaultMethodSupport.CardSection((CardSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                HeaderSectionKt.HeaderSection((HeaderSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                EarningTool.Tool.HeroSection((HeroSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                EarningsHomeUi.Section.AbstractC0087Section.ListUnorderedCardSection((ListUnorderedCardSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                EarningsTimeFrame.TimeFrame.ListUnorderedSection((ListUnorderedSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                Node node = (Node) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    MatrixExt.GenieNodeView(node, companion, gapComposer18, 48);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ForEach forEach = (ForEach) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (gapComposer19.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    MatrixExt.GenieNodeView(forEach.template, companion, gapComposer19, 48);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.MerchantCardView((MoneybotScaffold.Evidence.MerchantCard) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda5(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
