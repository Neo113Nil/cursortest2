package com.squareup.cash.payments.views;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Cancel;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Remove;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewEvent;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewEvent;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelContentEvent;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.paychecks.views.DistributePaycheckView;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewEvent;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.SelectedRecipient;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class UtilKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ UtilKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                function1.invoke(new ItemCoordinates(layoutCoordinates.mo838getSizeYbymL2g(), layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                break;
            case 1:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                if (focusStateImpl.getHasFocus()) {
                    function1.invoke(OffersHomeViewEvent.OnSearchBarFocusAcquired.INSTANCE);
                }
                break;
            case 2:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult) {
                    Object obj2 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent).result;
                    if (obj2 == OnboardingAccountPickerOptionsMenuScreen.Result.ENABLE_EDIT_MODE) {
                        function1.invoke(AccountPickerViewEvent.EnableEditMode.INSTANCE);
                    } else if (obj2 instanceof OnboardingConfirmAccountRemovalScreen$Result$Remove) {
                        String str = ((OnboardingConfirmAccountRemovalScreen$Result$Remove) obj2).account.account_id;
                        str.getClass();
                        function1.invoke(new AccountPickerViewEvent.ConfirmAccountRemoval(str));
                    } else if (obj2 instanceof OnboardingConfirmAccountRemovalScreen$Result$Cancel) {
                        String str2 = ((OnboardingConfirmAccountRemovalScreen$Result$Cancel) obj2).account.account_id;
                        str2.getClass();
                        function1.invoke(new AccountPickerViewEvent.CancelAccountRemoval(str2));
                    }
                }
                break;
            case 3:
                function1.invoke(new OnboardingLandingViewEvent.VideoLoaded(((Long) obj).longValue()));
                break;
            case 4:
                SelectCustomerViewEvent selectCustomerViewEvent = (SelectCustomerViewEvent) obj;
                selectCustomerViewEvent.getClass();
                if (!(selectCustomerViewEvent instanceof SelectCustomerViewEvent.TapCustomerButton)) {
                    if (!(selectCustomerViewEvent instanceof SelectCustomerViewEvent.TapCustomerAvatar)) {
                        if (!Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.TapClose.INSTANCE) && !Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.TapBack.INSTANCE) && !Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.TapContinue.INSTANCE) && !(selectCustomerViewEvent instanceof SelectCustomerViewEvent.ChangeSearchText) && !Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.DismissDialog.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        function1.invoke(new AllowlistSelectionViewEvent.TapCustomerAvatar(((SelectCustomerViewEvent.TapCustomerAvatar) selectCustomerViewEvent).tapAvatarEvent));
                    }
                } else {
                    function1.invoke(new AllowlistSelectionViewEvent.TapCustomerButton(((SelectCustomerViewEvent.TapCustomerButton) selectCustomerViewEvent).tapButtonEvent));
                }
                break;
            case 5:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                int i2 = DistributePaycheckView.$r8$clinit;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent2;
                    function1.invoke(new DistributePaycheckViewEvent.OnDialogResult(onDialogResult.screen, onDialogResult.result));
                }
                break;
            case 6:
                DistributionWheelContentEvent distributionWheelContentEvent = (DistributionWheelContentEvent) obj;
                distributionWheelContentEvent.getClass();
                if (!Intrinsics.areEqual(distributionWheelContentEvent, DistributionWheelContentEvent.HeroAmountTapped.INSTANCE)) {
                    if (!Intrinsics.areEqual(distributionWheelContentEvent, DistributionWheelContentEvent.InfoButtonTapped.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(EditDistributionViewEvent.TapInfoButton.INSTANCE);
                    }
                } else {
                    function1.invoke(EditDistributionViewEvent.TapHeroPercentage.INSTANCE);
                }
                break;
            case 7:
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj;
                item.getClass();
                if (item instanceof EditDistributionViewModel.Content.AtmPickerOption.Percentage) {
                    function1.invoke(new EditDistributionViewEvent.TapATMButton(((EditDistributionViewModel.Content.AtmPickerOption.Percentage) item).value));
                } else if (item instanceof EditDistributionViewModel.Content.AtmPickerOption.CustomValue) {
                    function1.invoke(EditDistributionViewEvent.SetCustomAllocation.INSTANCE);
                }
                break;
            case 8:
                DistributionWheelContentEvent distributionWheelContentEvent2 = (DistributionWheelContentEvent) obj;
                distributionWheelContentEvent2.getClass();
                if (!(distributionWheelContentEvent2 instanceof DistributionWheelContentEvent.InfoButtonTapped)) {
                    if (!(distributionWheelContentEvent2 instanceof DistributionWheelContentEvent.HeroAmountTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(MultipleAllocationViewEvent.TapHeroPercentage.INSTANCE);
                    }
                } else {
                    function1.invoke(MultipleAllocationViewEvent.TapInfoButton.INSTANCE);
                }
                break;
            case 9:
                MainPaymentPadViewEvent mainPaymentPadViewEvent = (MainPaymentPadViewEvent) obj;
                mainPaymentPadViewEvent.getClass();
                function1.invoke(new HomeViewEvent.MainPaymentPadEvent(mainPaymentPadViewEvent));
                break;
            case 10:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                function1.invoke(new HomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new LitePaymentPadViewEvent.AmountChanged(str3));
                break;
            case 12:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                Screen screen = dialogListenerEvent3.getScreen();
                DialogListenerEvent.OnDialogResult onDialogResult2 = dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogResult ? (DialogListenerEvent.OnDialogResult) dialogListenerEvent3 : null;
                function1.invoke(new MainPaymentViewEvent.OnDialogResult(screen, onDialogResult2 != null ? onDialogResult2.result : null));
                break;
            case 13:
                RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
                recipientViewModel.getClass();
                function1.invoke(new MainPaymentViewEvent.ListRowClicked(new SelectedRecipient(new RedactedParcelable(recipientViewModel.recipient)), 14));
                break;
            case 14:
                RecipientViewModel recipientViewModel2 = (RecipientViewModel) obj;
                recipientViewModel2.getClass();
                function1.invoke(new MainPaymentViewEvent.RecipientViewed(recipientViewModel2.recipient));
                break;
            case 15:
                String str4 = (String) obj;
                str4.getClass();
                if (str4.length() > 50) {
                    str4 = StringsKt.substring(str4, RangesKt___RangesKt.until(0, 50));
                }
                function1.invoke(str4);
                break;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.ReviewPaymentDisclaimerUrlTapped(str5));
                break;
            case 17:
                StablecoinWithdrawalOption stablecoinWithdrawalOption = (StablecoinWithdrawalOption) obj;
                stablecoinWithdrawalOption.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.StablecoinWithdrawalOptionSelected(stablecoinWithdrawalOption));
                break;
            case 18:
                RecipientViewModel recipientViewModel3 = (RecipientViewModel) obj;
                recipientViewModel3.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.RecipientAvatarTapped(recipientViewModel3));
                break;
            case 19:
                RecipientViewModel recipientViewModel4 = (RecipientViewModel) obj;
                recipientViewModel4.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.SelectRecipientAndContinue(recipientViewModel4));
                break;
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.RecipientSearchTextChanged(str6));
                break;
            case 21:
                RecipientViewModel recipientViewModel5 = (RecipientViewModel) obj;
                recipientViewModel5.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.RecipientViewed(recipientViewModel5));
                break;
            case 22:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.NoteTextChanged(str7));
                break;
            case 23:
                String str8 = (String) obj;
                str8.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.AmountInputChanged(str8));
                break;
            case 24:
                List list = (List) obj;
                list.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.PayTapped(list));
                break;
            case 25:
                TitleTapped titleTapped = (TitleTapped) obj;
                titleTapped.getClass();
                function1.invoke(new PaymentConfigurationViewEvent.OnTitleTapped(titleTapped));
                break;
            case 26:
                DialogListenerEvent dialogListenerEvent4 = (DialogListenerEvent) obj;
                dialogListenerEvent4.getClass();
                Screen screen2 = dialogListenerEvent4.getScreen();
                DialogListenerEvent.OnDialogResult onDialogResult3 = dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogResult ? (DialogListenerEvent.OnDialogResult) dialogListenerEvent4 : null;
                function1.invoke(new QuickPayViewEvent.OnDialogResult(screen2, onDialogResult3 != null ? onDialogResult3.result : null));
                break;
            case 27:
                ScheduleCalendarDate scheduleCalendarDate = (ScheduleCalendarDate) obj;
                scheduleCalendarDate.getClass();
                function1.invoke(scheduleCalendarDate.date);
                break;
            case 28:
                PaymentScheduleFrequency paymentScheduleFrequency = (PaymentScheduleFrequency) obj;
                paymentScheduleFrequency.getClass();
                function1.invoke(new SchedulePaymentViewEvent.FrequencyChanged(paymentScheduleFrequency));
                break;
            default:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                function1.invoke(new SchedulePaymentViewEvent.DateChanged(localDate));
                break;
        }
        return Unit.INSTANCE;
    }
}
