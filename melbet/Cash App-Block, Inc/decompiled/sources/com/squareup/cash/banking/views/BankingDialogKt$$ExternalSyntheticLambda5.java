package com.squareup.cash.banking.views;

import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateMapMutableKeysIterator;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.arcade.components.timeline.RenderedRow;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.treehouse.BottomSheetBinding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionItemViewModel;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionViewModel;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BankingDialogViewEvent;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault$Action$ClientRouteAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewEvent;
import com.squareup.cash.billssubscriptions.viewmodels.model.CategoryFilter;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewEvent$BoostLinkClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.money.applets.sections.AppletTileSection;
import com.squareup.cash.money.disclosure.DisclosureItem;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.IntRange;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.SharedFlowImpl;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingDialogKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.squareup.cash.arcade.components.timeline.RenderedRow$Collapsed] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Tap tap;
        Object obj;
        RenderedRow.VisibleItem collapsed;
        int i = this.$r8$classId;
        int i2 = 0;
        String str = null;
        str = null;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) obj3).invoke(new BankingDialogViewEvent.ButtonClicked(((BankingDialogViewModel) obj2).primaryButton.clientScenario));
                return Unit.INSTANCE;
            case 1:
                Function1 function1 = (Function1) obj3;
                Tap tap2 = ((AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) obj2).tapAction;
                if (tap2 == null) {
                    return null;
                }
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                return Unit.INSTANCE;
            case 2:
                ((Function1) obj3).invoke((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj2);
                return Unit.INSTANCE;
            case 3:
                Tap tap3 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.NoBalance) obj2).tapAction;
                ((Function1) obj3).invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap3, tap3.getAnalyticsTapEventsSpec()));
                return Unit.INSTANCE;
            case 4:
                Function1 function12 = (Function1) obj3;
                Tap tap4 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter) ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter) obj2)).tapAction;
                if (tap4 != null) {
                    function12.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap4, tap4.getAnalyticsTapEventsSpec()));
                }
                return Unit.INSTANCE;
            case 5:
                Tap.Url url = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton) obj2).buttonTapAction;
                ((Function1) obj3).invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(url, url.getAnalyticsTapEventsSpec()));
                return Unit.INSTANCE;
            case 6:
                Function1 function13 = (Function1) obj3;
                TappableIcon tappableIcon = ((AfterpayAppletRetroOrderSelectionViewModel.Loaded) obj2).headerIcon;
                if (tappableIcon != null && (tap = tappableIcon.tapAction) != null) {
                    function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                }
                return Unit.INSTANCE;
            case 7:
                TooltipAppMessageView tooltipAppMessageView = (TooltipAppMessageView) obj3;
                TooltipAppMessageViewModel.Ready ready = (TooltipAppMessageViewModel.Ready) obj2;
                if (tooltipAppMessageView.readyToAnimate) {
                    TooltipAppMessageView.access$revealTooltip(tooltipAppMessageView, ready);
                }
                return Unit.INSTANCE;
            case 8:
                SheetAppMessageModel.CtaButton ctaButton = (SheetAppMessageModel.CtaButton) obj2;
                ((Function1) obj3).invoke(new SheetAppMessageEvent.CtaButtonClicked(ctaButton.urlToOpen, ctaButton.text, true));
                return Unit.INSTANCE;
            case 9:
                Function1 function14 = (Function1) obj3;
                ActionableButtonDefault.Action action = ((ActionableButtonDefault) obj2).action;
                if (action != null) {
                    ActionableButtonDefault.Action.ClientRouteAction clientRouteAction = action instanceof ActionableButtonDefault.Action.ClientRouteAction ? (ActionableButtonDefault.Action.ClientRouteAction) action : null;
                    ActionableButtonDefault.ClientRouteAction value = clientRouteAction != null ? clientRouteAction.getValue() : null;
                    if (value != null) {
                        str = value.client_route_url;
                    }
                }
                function14.invoke(ArcadeComponentButtonProtoBindingKt.clickEvent$default(str));
                return Unit.INSTANCE;
            case 10:
                ((RealHapticVibrator) obj3).vibrate((Haptics.VibrationEffectFactory) obj2);
                return Unit.INSTANCE;
            case 11:
                ((InputDropdownScope) obj3).state.expanded$delegate.setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 12:
                TimelineState timelineState = (TimelineState) obj3;
                timelineState.collapseRanges$delegate.setValue(LazyGridDslKt.access$sortAndMerge(CollectionsKt.minus((List) timelineState.collapseRanges$delegate.getValue(), ((RenderedRow.Collapsed) obj2).range)));
                return Unit.INSTANCE;
            case 13:
                ImmutableList immutableList = (ImmutableList) obj3;
                TimelineState timelineState2 = (TimelineState) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : immutableList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    TimelineItem timelineItem = (TimelineItem) obj4;
                    Iterator it = ((List) timelineState2.collapseRanges$delegate.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((TimelineState.CollapseRange) obj).collapsedIndices.contains(i2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    TimelineState.CollapseRange collapseRange = (TimelineState.CollapseRange) obj;
                    if (collapseRange == null) {
                        collapsed = new RenderedRow.VisibleItem(i2, timelineItem);
                    } else {
                        IntRange intRange = collapseRange.collapsedIndices;
                        int i4 = intRange.first;
                        int i5 = intRange.last;
                        collapsed = i4 == i2 ? new RenderedRow.Collapsed(i2, collapseRange, (i5 > immutableList.size() ? immutableList.size() : i5 + 1) - intRange.first) : null;
                    }
                    if (collapsed != null) {
                        arrayList.add(collapsed);
                    }
                    i2 = i3;
                }
                return arrayList;
            case 14:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj3;
                MutableFloatState mutableFloatState = (MutableFloatState) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(snapshotStateMap.size()));
                Iterator it2 = snapshotStateMap.entries.iterator();
                while (((StateMapMutableKeysIterator) it2).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((StateMapMutableKeysIterator) it2).next();
                    linkedHashMap.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() - ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue()));
                }
                return linkedHashMap;
            case 15:
                PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = (PageFetcher$generateNewPagingSource$3) obj2;
                if (((BottomSheetBinding) obj3).overlaySession != null) {
                    pageFetcher$generateNewPagingSource$3.invoke();
                }
                return Unit.INSTANCE;
            case 16:
                ((Ref$BooleanRef) obj3).element = true;
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 17:
                TabToolbarInternalViewModel.ProfileButton profileButton = (TabToolbarInternalViewModel.ProfileButton) obj2;
                Ui.EventReceiver eventReceiver = ((TitleBarCoreBinding) obj3).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new TabToolbarInternalViewEvent.ProfileClick(profileButton.badgeCount));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 18:
                MoreWaysToAddMoneySectionViewModel moreWaysToAddMoneySectionViewModel = (MoreWaysToAddMoneySectionViewModel) obj3;
                DisclosureSectionProvider disclosureSectionProvider = (DisclosureSectionProvider) obj2;
                List list = moreWaysToAddMoneySectionViewModel.items;
                if (list.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                String str2 = moreWaysToAddMoneySectionViewModel.title;
                List<MoreWaysToAddMoneySectionItemViewModel> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel : list2) {
                    arrayList2.add(new DisclosureItem(moreWaysToAddMoneySectionItemViewModel, new BankingDialogKt$$ExternalSyntheticLambda5(19, disclosureSectionProvider, moreWaysToAddMoneySectionItemViewModel)));
                }
                return CollectionsKt__CollectionsJVMKt.listOf(new AppletTileSection(str2, arrayList2));
            case 19:
                StateFlowKt.emitOrThrow((SharedFlowImpl) ((DisclosureSectionProvider) obj3).moneyAnalyticsService, ((MoreWaysToAddMoneySectionItemViewModel) obj2).navigationAction);
                return Unit.INSTANCE;
            case 20:
                String str3 = ((BalanceHomeViewModel.Loaded.CallToActionViewModel) obj2).clientRoute;
                str3.getClass();
                ((Function1) obj3).invoke(new BalanceHomeViewEvent.CallToActionClicked(str3));
                return Unit.INSTANCE;
            case 21:
                ((Function1) obj3).invoke(new BankingDialogViewEvent.ButtonClicked(((BankingDialogViewModel.Button) obj2).clientScenario));
                return Unit.INSTANCE;
            case 22:
                Function1 function15 = (Function1) obj3;
                ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = ((com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault) obj2).action;
                ActionableButtonDefault.ClientRouteAction clientRouteAction2 = actionableButtonDefault$Action$ClientRouteAction != null ? actionableButtonDefault$Action$ClientRouteAction.value : null;
                clientRouteAction2.getClass();
                String str4 = clientRouteAction2.client_route_url;
                str4.getClass();
                function15.invoke(str4);
                return Unit.INSTANCE;
            case 23:
                ((Function1) obj3).invoke(new BenefitsHubViewEvent.ActionClicked((RowAction.ID) obj2));
                return Unit.INSTANCE;
            case 24:
                ((Function1) obj3).invoke(new BenefitsHubViewEvent.ActionClicked(((BenefitsHubViewModel.Loaded.CallToActionViewModel) obj2).id));
                return Unit.INSTANCE;
            case 25:
                ((Function1) obj3).invoke(new BenefitsHubViewEvent.InsightClicked((BenefitsHubViewModel.Loaded.Insight) obj2));
                return Unit.INSTANCE;
            case 26:
                ((Function1) obj3).invoke(new BillsSubscriptionsMerchantListViewEvent.CategoryToggled(((CategoryFilter) obj2).token));
                return Unit.INSTANCE;
            case 27:
                DependentActivityScreen.ActivityType activityType = DependentActivityScreen.ActivityType.BITCOIN;
                String customerToken = ((RealDependentCustomerTokenRepository) ((SubtreeManager) obj2).snapshotCache).getCustomerToken();
                customerToken.getClass();
                ((BetterNavigator.ScreenNavigator) obj3).goTo(new DependentActivityScreen(activityType, customerToken, false));
                return Unit.INSTANCE;
            case 28:
                ((Function1) obj3).invoke(new BitcoinPayInUsdSettingsViewEvent.ToggleClick(!((BitcoinPayInUsdSettingsViewModel) obj2).toggleEnabled));
                return Unit.INSTANCE;
            default:
                String str5 = ((BitcoinBoostWidgetViewModel) obj2).linkUrl;
                str5.getClass();
                ((Function1) obj3).invoke(new BitcoinBoostWidgetViewEvent$BoostLinkClicked(str5));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda5(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
