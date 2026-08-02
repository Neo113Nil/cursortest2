package com.squareup.cash.money.views;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import com.miteksystems.misnap.camera.a.b;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewModel;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.GooglePayLoadingViewKt;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorViewModel;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.localization.views.LanguageDisclosureViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlinx.serialization.encoding.AbstractEncoder;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i7 = 4;
        switch (i6) {
            case 0:
                ((Integer) obj2).getClass();
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    HypeWelcomeUIKt.UninstalledTileLoadingShimmer(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, composer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(composer2, R.string.earnings_filter_bar_overflow), (Map) null, (Function1) null, false);
                break;
            case 2:
                Function1 function1 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function1);
                if ((m & 48) == 0) {
                    m |= ((GapComposer) composer3).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    NetEarningsInfoSheetViewKt.NetEarningsInfoSheetView(function1, gapComposer2, (m >> 3) & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel = (EarningsTimeframeSelectorSheetViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                earningsTimeframeSelectorSheetViewModel.getClass();
                function12.getClass();
                NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheetView(earningsTimeframeSelectorSheetViewModel, function12, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 4:
                Function1 function13 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                function13.getClass();
                AllowanceViewKt.DependentControlView((DependentControlViewModel) obj, function13, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 5:
                Composer composer4 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((Function1) obj2).getClass();
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, AllowanceViewKt.lambda$352973825, gapComposer3, 3072, 7);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                if (obj != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    break;
                } else {
                    Function1 function14 = (Function1) obj2;
                    int intValue5 = ((Integer) obj4).intValue();
                    function14.getClass();
                    SponsorDetailViewKt.ManagedAccountLoginQrCodeProviderView(function14, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    break;
                }
            case 7:
                Function1 function15 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                function15.getClass();
                AllowanceViewKt.U13CelebrationView((U13CelebrationViewModel) obj, function15, false, (Composer) obj3, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 8:
                Function1 function16 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                function16.getClass();
                ShareSheetViewKt.ShareSheetView((ShareSheetViewModel) obj, function16, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 9:
                Function1 function17 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                function17.getClass();
                AllowanceViewKt.ControlErrorDialog((ControlErrorViewModel) obj, function17, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 10:
                Function1 function18 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                function18.getClass();
                SponsorDetailViewKt.SponsorResourcesView((SponsorResourcesViewModel) obj, function18, (Composer) obj3, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 11:
                Function1 function19 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                function19.getClass();
                AllowanceViewKt.DependentControlsAndLimits((DependentControlsAndLimitsViewModel) obj, function19, null, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 12:
                Function1 function110 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                function110.getClass();
                AllowanceViewKt.ControlDisablingConfirmationDialog((ControlDisablingConfirmationViewModel) obj, function110, null, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 13:
                Function1 function111 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                function111.getClass();
                SponsorDetailViewKt.SetDependentCustomLimitErrorView((SetDependentCustomLimitErrorViewModel) obj, function111, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 14:
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((Unit) obj2).getClass();
                break;
            case 15:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                if (obj2 != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    break;
                } else {
                    ((Integer) obj4).getClass();
                    animatedContentScopeImpl.getClass();
                    GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                    gapComposer4.startReplaceGroup(1269451035);
                    gapComposer4.end(false);
                    break;
                }
            case 16:
                ((Integer) obj2).getClass();
                Composer composer5 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue13 & 1, (intValue13 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 8.0f);
                    String stringResource = Room.stringResource(gapComposer5, R.string.contact_methods_header);
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer5, m299paddingVpY3zN4, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 17:
                FavoritesMessageViewModel favoritesMessageViewModel = (FavoritesMessageViewModel) obj;
                Function1 function112 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                favoritesMessageViewModel.getClass();
                function112.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1309077625, new FormCashtag$8$$ExternalSyntheticLambda0(10, favoritesMessageViewModel, function112), composer6), composer6, 3072, 7);
                break;
            case 18:
                Composer composer7 = (Composer) obj3;
                int m2 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(m2 & 1, (m2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    GooglePayLoadingViewKt.GooglePayLoadingView(gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 19:
                String str = (String) obj;
                Long l = (Long) obj4;
                l.getClass();
                str.getClass();
                break;
            case 20:
                Function1 function113 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int m3 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function113);
                if ((m3 & 48) == 0) {
                    m3 |= ((GapComposer) composer8).changedInstance(function113) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer8;
                if (gapComposer7.shouldExecute(m3 & 1, (m3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    InstrumentAvatarUtilsKt.InstrumentSelectionLoadingView(function113, gapComposer7, (m3 >> 3) & 14);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 21:
                PerformanceViewModel performanceViewModel = (PerformanceViewModel) obj;
                Function1 function114 = (Function1) obj2;
                Composer composer9 = (Composer) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                performanceViewModel.getClass();
                function114.getClass();
                if ((intValue14 & 6) == 0) {
                    i = intValue14 | (((GapComposer) composer9).changed(performanceViewModel) ? 4 : 2);
                } else {
                    i = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i |= ((GapComposer) composer9).changedInstance(function114) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer9;
                if (gapComposer8.shouldExecute(i & 1, (i & 147) != 146)) {
                    ArcadeBordersKt.InvestingPerformance(performanceViewModel, function114, null, gapComposer8, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 22:
                InvestingKeyStatsDetailsViewModel investingKeyStatsDetailsViewModel = (InvestingKeyStatsDetailsViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                investingKeyStatsDetailsViewModel.getClass();
                function115.getClass();
                MarkdownHeaderKt.InvestingKeyStatsDetails(investingKeyStatsDetailsViewModel, function115, null, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 23:
                InvestingCategoryFilterViewModel investingCategoryFilterViewModel = (InvestingCategoryFilterViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                investingCategoryFilterViewModel.getClass();
                function116.getClass();
                InvestingCategoryDetailKt.InvestingCategoryFilter(investingCategoryFilterViewModel, function116, null, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 24:
                SectionMoreInfoViewModel sectionMoreInfoViewModel = (SectionMoreInfoViewModel) obj;
                Function1 function117 = (Function1) obj2;
                Composer composer10 = (Composer) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                sectionMoreInfoViewModel.getClass();
                function117.getClass();
                if ((intValue17 & 6) == 0) {
                    i2 = intValue17 | ((intValue17 & 8) == 0 ? ((GapComposer) composer10).changed(sectionMoreInfoViewModel) : ((GapComposer) composer10).changedInstance(sectionMoreInfoViewModel) ? 4 : 2);
                } else {
                    i2 = intValue17;
                }
                if ((intValue17 & 48) == 0) {
                    i2 |= ((GapComposer) composer10).changedInstance(function117) ? 32 : 16;
                }
                GapComposer gapComposer9 = (GapComposer) composer10;
                if (gapComposer9.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    b.MoreInfoSheet(sectionMoreInfoViewModel, function117, null, gapComposer9, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 25:
                PeriodSelectionViewModel periodSelectionViewModel = (PeriodSelectionViewModel) obj;
                Function1 function118 = (Function1) obj2;
                Composer composer11 = (Composer) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                periodSelectionViewModel.getClass();
                function118.getClass();
                if ((intValue18 & 6) == 0) {
                    i3 = intValue18 | ((intValue18 & 8) == 0 ? ((GapComposer) composer11).changed(periodSelectionViewModel) : ((GapComposer) composer11).changedInstance(periodSelectionViewModel) ? 4 : 2);
                } else {
                    i3 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i3 |= ((GapComposer) composer11).changedInstance(function118) ? 32 : 16;
                }
                GapComposer gapComposer10 = (GapComposer) composer11;
                if (gapComposer10.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function118, gapComposer10, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 26:
                InvestingOrderTypeSelectionViewModel investingOrderTypeSelectionViewModel = (InvestingOrderTypeSelectionViewModel) obj;
                Function1 function119 = (Function1) obj2;
                Composer composer12 = (Composer) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                investingOrderTypeSelectionViewModel.getClass();
                function119.getClass();
                if ((intValue19 & 6) == 0) {
                    i4 = intValue19 | ((intValue19 & 8) == 0 ? ((GapComposer) composer12).changed(investingOrderTypeSelectionViewModel) : ((GapComposer) composer12).changedInstance(investingOrderTypeSelectionViewModel) ? 4 : 2);
                } else {
                    i4 = intValue19;
                }
                if ((intValue19 & 48) == 0) {
                    i4 |= ((GapComposer) composer12).changedInstance(function119) ? 32 : 16;
                }
                GapComposer gapComposer11 = (GapComposer) composer12;
                if (gapComposer11.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    AbstractEncoder.OrderTypeSelection(investingOrderTypeSelectionViewModel, function119, gapComposer11, (i4 & 14) | 8 | (i4 & 112));
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 27:
                InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel = (InvestingRecurringFrequencyPickerViewModel) obj;
                Function1 function120 = (Function1) obj2;
                Composer composer13 = (Composer) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                investingRecurringFrequencyPickerViewModel.getClass();
                function120.getClass();
                if ((intValue20 & 6) == 0) {
                    i5 = intValue20 | ((intValue20 & 8) == 0 ? ((GapComposer) composer13).changed(investingRecurringFrequencyPickerViewModel) : ((GapComposer) composer13).changedInstance(investingRecurringFrequencyPickerViewModel) ? 4 : 2);
                } else {
                    i5 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i5 |= ((GapComposer) composer13).changedInstance(function120) ? 32 : 16;
                }
                GapComposer gapComposer12 = (GapComposer) composer13;
                if (gapComposer12.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    AutoInvestPurchaseKt.AutoInvestFrequencyPicker(investingRecurringFrequencyPickerViewModel, function120, null, gapComposer12, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 28:
                InviteErrorViewModel inviteErrorViewModel = (InviteErrorViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                inviteErrorViewModel.getClass();
                function121.getClass();
                InviteErrorDialogKt.InviteErrorDialog(inviteErrorViewModel, function121, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            default:
                LanguageDisclosureViewModel languageDisclosureViewModel = (LanguageDisclosureViewModel) obj;
                Function1 function122 = (Function1) obj2;
                int intValue22 = ((Integer) obj4).intValue();
                languageDisclosureViewModel.getClass();
                function122.getClass();
                LanguageDisclosureViewKt.LanguageDisclosureView(languageDisclosureViewModel, function122, (Composer) obj3, intValue22 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
