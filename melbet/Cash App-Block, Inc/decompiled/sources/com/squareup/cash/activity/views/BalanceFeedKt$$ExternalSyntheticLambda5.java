package com.squareup.cash.activity.views;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.Screen;
import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewEvent$UpsellRowClicked;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewModel;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewEvent;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewEvent;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewEvent;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewEvent$OptionClicked;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletInfoSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletMerchantSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletInfoSheetView;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceFeedKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BalanceFeedKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Density density = (Density) obj;
                int intValue = ((LazyListState) obj2).scrollPosition.index$delegate.getIntValue();
                float f = RecyclerView.DECELERATION_RATE;
                if (intValue == 0) {
                    f = RangesKt___RangesKt.coerceIn(1.0f - Math.abs(r10.scrollPosition.scrollOffset$delegate.getIntValue() / density.mo236toPx0680j_4(32.0f)), RecyclerView.DECELERATION_RATE, 1.0f);
                }
                break;
            case 1:
                ((Function1) obj2).invoke(new AccountDocumentsViewEvent.BannerClick(((AccountDocumentsViewModel) obj).statementType));
                break;
            case 2:
                ((Function1) obj2).invoke(new AccountDocumentsViewEvent.FooterClick(((AccountDocumentsViewModel.DocumentModel.FooterModel) obj).url));
                break;
            case 3:
                ProfileUpsellViewModel.ProfileUpsellRow profileUpsellRow = (ProfileUpsellViewModel.ProfileUpsellRow) obj;
                ((Function1) obj2).invoke(new ProfileUpsellViewEvent$UpsellRowClicked(profileUpsellRow.url, profileUpsellRow.f1041type));
                break;
            case 4:
                ((Function1) obj2).invoke(new ThemeSwitcherViewEvent.SelectTheme((PaymentPadTheme) obj));
                break;
            case 5:
                ((Function1) obj2).invoke(new AccountSwitcherViewEvent.AccountClicked(((AccountViewModel) obj).accountToken));
                break;
            case 6:
                ((Function1) obj2).invoke(new AddAccountOptionsViewEvent$OptionClicked(((AddAccountOptionsViewModel.Loaded.AccountOption) obj).optionType));
                break;
            case 7:
                ((Function1) obj2).invoke(new BusinessInfoViewEvent.UpdateBusinessAddress(((BusinessInfoViewModel.ConfirmationSheetViewModel) obj).businessAddress));
                break;
            case 8:
                ((Function1) obj2).invoke(new EditProfileViewEvent.BusinessProfileClicked(((EditProfileViewModel$EditCustomerProfileViewModel) obj).isBusiness));
                break;
            case 9:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                Screen screen = (Screen) disclosurePresenter.launcher;
                screen.getClass();
                LocalActivitySetupTeardown.MetroFactory metroFactory = ((ActivityInviteItemPresenter$Factory$Impl) obj2).delegateFactory;
                FlowStarter flowStarter = (FlowStarter) metroFactory.appForegroundStateProvider.invoke();
                AppConfigManager appConfigManager = (AppConfigManager) metroFactory.sessionManager.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.syncValueReader.invoke();
                Analytics analytics = (Analytics) metroFactory.shortlinkHandler.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.ioDispatcher.invoke();
                flowStarter.getClass();
                appConfigManager.getClass();
                androidStringManager.getClass();
                analytics.getClass();
                factory.getClass();
                break;
            case 10:
                ((Function1) obj2).invoke(new ReceiptViewEvent.ButtonClicked((PaymentHistoryButton) obj));
                break;
            case 11:
                Function1 function1 = (Function1) obj;
                String str = ((ReceiptSection.LocationRow) obj2).location;
                if (str != null) {
                    function1.invoke(new ReceiptViewEvent.OpenMap(str));
                }
                break;
            case 12:
                Function1 function12 = (Function1) obj;
                PaymentHistoryButton paymentHistoryButton = ((ReceiptSection.ActionRow) obj2).payment_history_button;
                if (paymentHistoryButton != null) {
                    function12.invoke(new ReceiptViewEvent.ButtonClicked(paymentHistoryButton));
                }
                break;
            case 13:
                Function1 function13 = (Function1) obj;
                String str2 = ((ReceiptSection.ImageRow) obj2).tap_action_url;
                if (str2 != null) {
                    function13.invoke(new ReceiptViewEvent.OpenUrl(str2));
                }
                break;
            case 14:
                ((Function1) obj2).invoke(new ReceiptViewEvent.UpsellClicked((ReceiptSection.Upsell) obj));
                break;
            case 15:
                Function1 function14 = (Function1) obj;
                List list = ((AfterpayAppletHomeContentViewModel) obj2).impressionEvent;
                if (list != null && !list.isEmpty()) {
                    function14.invoke(new ItemViewed(list, null));
                }
                break;
            case 16:
                int i2 = AfterpayAppletInfoSheetView.$r8$clinit;
                ((Function1) obj2).invoke(new AfterpayAppletInfoSheetViewEvent.DismissSheet(((AfterpayAppletInfoSheetViewModel) obj).analyticsDismissEvent));
                break;
            case 17:
                ((Function1) obj2).invoke(new AfterpayAppletInfoSheetViewEvent.ButtonTapped((Button) obj));
                break;
            case 18:
                ((Function1) obj2).invoke(new AfterpayAppletMerchantSheetViewEvent.CtaButtonTapped(((AfterpayAppletMerchantSheetViewModel.Loaded) obj).button.tapAction));
                break;
            case 19:
                Function1 function15 = (Function1) obj;
                Tap tap = ((AfterpayAppletUpsellSheetViewModel.AvatarItem) obj2).tapAction;
                if (tap != null) {
                    function15.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                }
                break;
            case 20:
                Tap tap2 = ((AfterpayAppletUpsellSheetViewModel.CtaButton) obj).tapAction;
                ((Function1) obj2).invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                break;
            case 21:
                ((Function1) obj2).invoke(((AfterpaySearchViewModel.BodyViewModel.NoContentViewModel) obj).buttonClickEvent);
                break;
            case 22:
                ((MutableState) obj).setValue(((AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel) obj2).token);
                break;
            case 23:
                ((Function1) obj2).invoke(new AfterpaySearchViewEvent.FilterBottomSheetViewEvent.ClearFilterSelection(((AfterpaySearchViewModel.FilterBottomSheetViewModel) obj).filterGroupId));
                break;
            case 24:
                AfterpayAppletUpsellCardViewModel.ButtonViewModel buttonViewModel = (AfterpayAppletUpsellCardViewModel.ButtonViewModel) obj;
                ((Function1) obj2).invoke(new AfterpaySearchViewEvent.UpsellCardButtonTapped(buttonViewModel.actionUrl, buttonViewModel.analyticsEventSpecs));
                break;
            case 25:
                Function1 function16 = (Function1) obj;
                Tap tap3 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) obj2).tapAction;
                if (tap3 != null) {
                    function16.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap3, tap3.getAnalyticsTapEventsSpec()));
                }
                break;
            case 26:
                Function1 function17 = (Function1) obj;
                Tap tap4 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader.AvatarCarousel.AvatarItem) obj2).tapAction;
                if (tap4 != null) {
                    function17.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap4, tap4.getAnalyticsTapEventsSpec()));
                }
                break;
            case 27:
                Function1 function18 = (Function1) obj;
                Tap tap5 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement) obj2).sectionHeader.tapAction;
                if (tap5 != null) {
                    function18.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap5, tap5.getAnalyticsTapEventsSpec()));
                }
                break;
            case 28:
                Function1 function19 = (Function1) obj;
                List list2 = ((RetroTransaction) obj2).viewEventSpec;
                if (list2 != null) {
                    function19.invoke(list2);
                }
                break;
            default:
                RetroTransaction retroTransaction = (RetroTransaction) obj2;
                Function2 function2 = (Function2) obj;
                String str3 = retroTransaction.urlToOpen;
                if (str3 != null) {
                    function2.invoke(str3, retroTransaction.tapEventSpec);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
