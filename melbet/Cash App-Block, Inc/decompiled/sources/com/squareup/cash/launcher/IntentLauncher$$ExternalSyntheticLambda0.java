package com.squareup.cash.launcher;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewEvent;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.components.InvestingHomeView$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.components.MyFirstStockAdapter;
import com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.dialogs.ConfirmCancelScheduledOrderDialog;
import com.squareup.cash.investing.components.stockmetric.ComposableStockMetricTypePickerSheet;
import com.squareup.cash.investing.presenters.TransferStockPresenter;
import com.squareup.cash.investing.presenters.categories.SelectionState;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewEvent;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewEvent;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewEvent;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestRecurringPurchaseViewModel;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewEvent;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.disclosure.DisclosureItemModel;
import com.squareup.cash.money.disclosure.DisclosureSection;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes6.dex */
public final /* synthetic */ class IntentLauncher$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ IntentLauncher$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object selectPortfolioMetricType;
        Object obj;
        String str;
        InvestingCategoryFilterViewModel.Content.FilterOption selection;
        boolean z;
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((IntentLauncher) obj3).launchPlayStore((String) obj2);
                return Unit.INSTANCE;
            case 1:
                Function1 function1 = (Function1) obj2;
                GrowToolsManagerViewModel.Loaded.Dialog dialog = ((GrowToolsManagerViewModel.Loaded) obj3).dialog;
                function1.invoke(dialog != null ? new GrowToolsManagerViewEvent.DialogDismissTapped(dialog.isError) : GrowToolsManagerViewEvent.Back.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                ((Function1) obj3).invoke((SelectPaymentInstrumentViewModel.PaymentInstrument) obj2);
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj3).invoke(new TransferOptionPickerViewEvent.OptionTapped(((TransferOptionPickerViewModel.Option) obj2).selection));
                return Unit.INSTANCE;
            case 4:
                StateFlowKt.emitOrThrow(((RealEntityPriceRefresher) obj3).tokenOperations, new RealEntityPriceRefresher.TokenOperation.RemoveAllOnce((List) obj2));
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj3).invoke(new InvestingStockDetailsViewEvent.CategoryClick(((InvestingDetailsCategorySectionContentModel.Cell) obj2).categoryToken));
                return Unit.INSTANCE;
            case 6:
                InvestingHomeViewModel.InvestingHomeRow.Header header = (InvestingHomeViewModel.InvestingHomeRow.Header) obj2;
                Ui.EventReceiver eventReceiver = ((InvestingHomeRowAdapter) obj3).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(header.id));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 7:
                ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel = (ColoredLearnMoreConfigurationModel) obj2;
                InvestingHomeView$$ExternalSyntheticLambda3 investingHomeView$$ExternalSyntheticLambda3 = ((MyFirstStockAdapter) obj3).onClick;
                coloredLearnMoreConfigurationModel.getClass();
                Boolean bool = Boolean.FALSE;
                String str2 = coloredLearnMoreConfigurationModel.learnMoreConfiguration.link_url;
                str2.getClass();
                investingHomeView$$ExternalSyntheticLambda3.invoke(bool, str2);
                return Unit.INSTANCE;
            case 8:
                FilterCategoriesViewModel.ChoiceRowModel choiceRowModel = (FilterCategoriesViewModel.ChoiceRowModel) obj2;
                Ui.EventReceiver eventReceiver2 = ((InvestingFilterCategoriesView) obj3).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new FilterCategoriesViewEvent.RowClick(choiceRowModel.token));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 9:
                ((Function0) obj3).invoke();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((DragWidgetState) obj2).expand$delegate;
                Boolean bool2 = Boolean.TRUE;
                parcelableSnapshotMutableState.setValue(bool2);
                return bool2;
            case 10:
                GraphState graphState = (GraphState) obj2;
                ((Function1) obj3).invoke(new InvestingCustomOrderViewEvent.PriceSet(graphState.currentPrice, ((PriceValue) graphState.selectedPrice$delegate.getValue()).value));
                return Unit.INSTANCE;
            case 11:
                CancelOrderViewModel cancelOrderViewModel = (CancelOrderViewModel) obj2;
                Ui.EventReceiver eventReceiver3 = ((ConfirmCancelScheduledOrderDialog) obj3).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(new CancelOrderViewEvent.Confirm(cancelOrderViewModel.flowToken, cancelOrderViewModel.paymentToken));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 12:
                ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$1 = (ArcadeMigrationUtilsKt$investingCryptoExchangeView$1) obj3;
                return Integer.valueOf((!arcadeMigrationUtilsKt$investingCryptoExchangeView$1.showKeypadOnStart || ((Boolean) ((MutableState) obj2).getValue()).booleanValue()) ? ((arcadeMigrationUtilsKt$investingCryptoExchangeView$1.isBuy || !arcadeMigrationUtilsKt$investingCryptoExchangeView$1.isCustomOrder) ? 479 : 519) + ((int) (((arcadeMigrationUtilsKt$investingCryptoExchangeView$1.getContext().getResources().getConfiguration().fontScale - 1.0f) * 8.0f) / 0.15f)) : 0);
            case 13:
                Function1 function12 = (Function1) obj3;
                DependentAutoInvestRecurringPurchaseViewModel dependentAutoInvestRecurringPurchaseViewModel = (DependentAutoInvestRecurringPurchaseViewModel) obj2;
                if (function12 != null) {
                    function12.invoke(new RecurringPreferenceId(dependentAutoInvestRecurringPurchaseViewModel.entityId));
                }
                return Unit.INSTANCE;
            case 14:
                Function0 function0 = (Function0) obj2;
                if (((Holding) obj3).enabled && function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj3).invoke(new InvestingSearchViewEvent.CategoryClicked(((InvestingCategoryTileContentModel) obj2).token));
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj3).invoke(new InvestingSettingsViewEvent.EntryClicked(((InvestingSettingsViewModel.Entry) obj2).f1167type));
                return Unit.INSTANCE;
            case 17:
                Function1 function13 = (Function1) obj3;
                StockMetricTypePickerViewModel.Option option = (StockMetricTypePickerViewModel.Option) obj2;
                int i2 = ComposableStockMetricTypePickerSheet.$r8$clinit;
                if (option instanceof StockMetricTypePickerViewModel.Option.FollowingOption) {
                    selectPortfolioMetricType = new StockMetricTypePickerViewEvent.SelectFollowingMetricType(((StockMetricTypePickerViewModel.Option.FollowingOption) option).metricType);
                } else {
                    if (!(option instanceof StockMetricTypePickerViewModel.Option.PortfolioOption)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    selectPortfolioMetricType = new StockMetricTypePickerViewEvent.SelectPortfolioMetricType(((StockMetricTypePickerViewModel.Option.PortfolioOption) option).metricType);
                }
                function13.invoke(selectPortfolioMetricType);
                return Unit.INSTANCE;
            case 18:
                TransferStockPresenter transferStockPresenter = (TransferStockPresenter) obj3;
                if (((Number) ((State) obj2).getValue()).longValue() > 0) {
                    return null;
                }
                AmountSheetSavedState amountSheetSavedState = transferStockPresenter.args.savedState;
                AmountSheetSavedState.AmountKeypadState amountKeypadState = amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState ? (AmountSheetSavedState.AmountKeypadState) amountSheetSavedState : null;
                if (amountKeypadState != null) {
                    return amountKeypadState.rawAmount;
                }
                return null;
            case 19:
                List list = (List) obj3;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                list.getClass();
                snapshotStateMap.getClass();
                List<InvestingCategoryFilterViewModel.Content.FilterSection> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (InvestingCategoryFilterViewModel.Content.FilterSection filterSection : list2) {
                    SelectionState selectionState = (SelectionState) snapshotStateMap.get(filterSection.token);
                    if (selectionState != null) {
                        List<InvestingCategoryFilterViewModel.Content.FilterOption> list3 = filterSection.options;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (InvestingCategoryFilterViewModel.Content.FilterOption filterOption : list3) {
                            if (filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) {
                                InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox checkbox = (InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) filterOption;
                                String str3 = checkbox.token;
                                if (selectionState instanceof SelectionState.MultiSelect) {
                                    z = ((SelectionState.MultiSelect) selectionState).tokens.contains(str3);
                                } else {
                                    if (!(selectionState instanceof SelectionState.GroupedSingleSelect)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    z = false;
                                }
                                String str4 = checkbox.title;
                                String str5 = checkbox.description;
                                str3.getClass();
                                str4.getClass();
                                selection = new InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox(str3, str4, str5, z);
                            } else {
                                if (!(filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Selection)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection2 = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection) filterOption;
                                List list4 = selection2.selectableOptions;
                                String str6 = selection2.token;
                                if (!(selectionState instanceof SelectionState.MultiSelect)) {
                                    if (!(selectionState instanceof SelectionState.GroupedSingleSelect)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    String str7 = (String) ((SelectionState.GroupedSingleSelect) selectionState).groups.get(str6);
                                    if (str7 != null) {
                                        Iterator it = list4.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj = it.next();
                                                if (((InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow) obj).token.equals(str7)) {
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow optionRow = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow) obj;
                                        if (optionRow != null) {
                                            str = optionRow.title;
                                            String str8 = selection2.title;
                                            String str9 = selection2.placeholder;
                                            str6.getClass();
                                            list4.getClass();
                                            selection = new InvestingCategoryFilterViewModel.Content.FilterOption.Selection(str6, str8, str9, str, list4);
                                        }
                                    }
                                }
                                str = null;
                                String str82 = selection2.title;
                                String str92 = selection2.placeholder;
                                str6.getClass();
                                list4.getClass();
                                selection = new InvestingCategoryFilterViewModel.Content.FilterOption.Selection(str6, str82, str92, str, list4);
                            }
                            arrayList2.add(selection);
                        }
                        String str10 = filterSection.token;
                        String str11 = filterSection.title;
                        str10.getClass();
                        str11.getClass();
                        filterSection = new InvestingCategoryFilterViewModel.Content.FilterSection(str10, str11, arrayList2);
                    }
                    arrayList.add(filterSection);
                }
                return arrayList;
            case 20:
                Function1 function14 = (Function1) obj2;
                String str12 = ((InviteContactsViewModel.PromotionUpsellViewModel) obj3).ctaClientRoute;
                if (str12 != null) {
                    function14.invoke(new InviteContactsViewEvent.TapPromotionUpSellCTA(str12));
                }
                return Unit.INSTANCE;
            case 21:
                InviteContactsViewModel.InviteConsentBottomSheetViewModel inviteConsentBottomSheetViewModel = (InviteContactsViewModel.InviteConsentBottomSheetViewModel) obj2;
                ((Function1) obj3).invoke(new InviteContactsViewEvent.ConsentAccepted(inviteConsentBottomSheetViewModel.phoneNumber, inviteConsentBottomSheetViewModel.aliases, inviteConsentBottomSheetViewModel.section));
                return Unit.INSTANCE;
            case 22:
                ((Function1) obj3).invoke((InviteContactsViewModel.Contact) obj2);
                return Unit.INSTANCE;
            case 23:
                ((Function1) obj3).invoke((LimitViewModel) obj2);
                return Unit.INSTANCE;
            case 24:
                Action action = (Action) obj3;
                Function1 function15 = (Function1) obj2;
                if (action != null) {
                    function15.invoke(action.eventToTrigger);
                }
                return Unit.INSTANCE;
            case 25:
                ((Function1) obj3).invoke(((MerchantBlockingViewModel.MerchantBlockingContentViewModel) obj2).helpItem.action);
                return Unit.INSTANCE;
            case 26:
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow = (MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow) obj2;
                boolean z2 = !merchantInfoRow.selected;
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category = merchantInfoRow.category;
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon merchantInfoIcon = merchantInfoRow.icon;
                String str13 = merchantInfoRow.title;
                String str14 = merchantInfoRow.description;
                str13.getClass();
                ((Function1) obj3).invoke(new MerchantInfoFeedbackViewEvent.RowSelected(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow(category, merchantInfoIcon, str13, str14, z2)));
                return Unit.INSTANCE;
            case 27:
                RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider = (RealAppletTileServerRecommendationProvider) obj3;
                return ((Boolean) realAppletTileServerRecommendationProvider.enabled$delegate.getValue()).booleanValue() ? FlowKt.stateIn(new InviteContactsPresenter$special$$inlined$map$1(realAppletTileServerRecommendationProvider.promotedAppletTileStore.getPromotedAppletTiles(), realAppletTileServerRecommendationProvider, 18), (CoroutineScope) obj2, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null) : new StateFlowKt$stateFlowOf$1(null);
            case 28:
                DisclosureItemModel disclosureItemModel = (DisclosureItemModel) obj3;
                DisclosureSectionProvider disclosureSectionProvider = (DisclosureSectionProvider) obj2;
                return StringsKt.isBlank(disclosureItemModel.text) ? EmptyList.INSTANCE : CollectionsKt__CollectionsJVMKt.listOf(new DisclosureSection(disclosureItemModel, (RealRouter) disclosureSectionProvider.router, (MoneyAnalyticsService) disclosureSectionProvider.moneyAnalyticsService));
            default:
                CardRegistry cardRegistry = (CardRegistry) obj2;
                ((Function1) obj3).invoke(new MoneyTabEvent.NavigateToWallet(cardRegistry != null ? (Integer) cardRegistry.activeHeroTagPage$delegate.getValue() : null));
                return Unit.INSTANCE;
        }
    }
}
