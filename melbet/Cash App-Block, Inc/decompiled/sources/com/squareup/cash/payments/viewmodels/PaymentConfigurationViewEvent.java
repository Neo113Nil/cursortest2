package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaymentConfigurationViewEvent {

    public final class AddRecipientTapped extends PaymentConfigurationViewEvent {
        public static final AddRecipientTapped INSTANCE = new AddRecipientTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddRecipientTapped);
        }

        public final int hashCode() {
            return -1475256163;
        }

        public final String toString() {
            return "AddRecipientTapped";
        }
    }

    public final class AmountInputChanged extends PaymentConfigurationViewEvent {
        public final String rawAmount;

        public AmountInputChanged(String str) {
            str.getClass();
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountInputChanged) && Intrinsics.areEqual(this.rawAmount, ((AmountInputChanged) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountInputChanged(rawAmount=", this.rawAmount, ")");
        }
    }

    public final class AmountInputContinueTapped extends PaymentConfigurationViewEvent {
        public static final AmountInputContinueTapped INSTANCE = new AmountInputContinueTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountInputContinueTapped);
        }

        public final int hashCode() {
            return 1825742188;
        }

        public final String toString() {
            return "AmountInputContinueTapped";
        }
    }

    public final class Back extends PaymentConfigurationViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1824154144;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class CloseOnwLinkMessage extends PaymentConfigurationViewEvent {
        public static final CloseOnwLinkMessage INSTANCE = new CloseOnwLinkMessage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseOnwLinkMessage);
        }

        public final int hashCode() {
            return -1086989612;
        }

        public final String toString() {
            return "CloseOnwLinkMessage";
        }
    }

    public final class DismissSheet extends PaymentConfigurationViewEvent {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return 423023918;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class GrantContactsPermissionTappedFromCard extends PaymentConfigurationViewEvent {
        public static final GrantContactsPermissionTappedFromCard INSTANCE = new GrantContactsPermissionTappedFromCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantContactsPermissionTappedFromCard);
        }

        public final int hashCode() {
            return 1142251211;
        }

        public final String toString() {
            return "GrantContactsPermissionTappedFromCard";
        }
    }

    public final class GrantContactsPermissionTappedFromRow extends PaymentConfigurationViewEvent {
        public static final GrantContactsPermissionTappedFromRow INSTANCE = new GrantContactsPermissionTappedFromRow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantContactsPermissionTappedFromRow);
        }

        public final int hashCode() {
            return -1071516993;
        }

        public final String toString() {
            return "GrantContactsPermissionTappedFromRow";
        }
    }

    public final class NoteInputContinueTapped extends PaymentConfigurationViewEvent {
        public static final NoteInputContinueTapped INSTANCE = new NoteInputContinueTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoteInputContinueTapped);
        }

        public final int hashCode() {
            return 1408811346;
        }

        public final String toString() {
            return "NoteInputContinueTapped";
        }
    }

    public final class NoteTextChanged extends PaymentConfigurationViewEvent {
        public final String text;

        public NoteTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoteTextChanged) && Intrinsics.areEqual(this.text, ((NoteTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoteTextChanged(text=", this.text, ")");
        }
    }

    public final class OnSheetPeeked extends PaymentConfigurationViewEvent {
        public static final OnSheetPeeked INSTANCE = new OnSheetPeeked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSheetPeeked);
        }

        public final int hashCode() {
            return 1106449665;
        }

        public final String toString() {
            return "OnSheetPeeked";
        }
    }

    public final class OnTitleTapped extends PaymentConfigurationViewEvent {
        public final TitleTapped titleTapped;

        public OnTitleTapped(TitleTapped titleTapped) {
            titleTapped.getClass();
            this.titleTapped = titleTapped;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTitleTapped) && Intrinsics.areEqual(this.titleTapped, ((OnTitleTapped) obj).titleTapped);
        }

        public final int hashCode() {
            return this.titleTapped.hashCode();
        }

        public final String toString() {
            return "OnTitleTapped(titleTapped=" + this.titleTapped + ")";
        }
    }

    public final class PayTapped extends PaymentConfigurationViewEvent {
        public final List lastGesturesSignal;

        public PayTapped(List list) {
            list.getClass();
            this.lastGesturesSignal = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayTapped) && Intrinsics.areEqual(this.lastGesturesSignal, ((PayTapped) obj).lastGesturesSignal);
        }

        public final int hashCode() {
            return this.lastGesturesSignal.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PayTapped(lastGesturesSignal=", ")", this.lastGesturesSignal);
        }
    }

    public final class PersonalizeTapped extends PaymentConfigurationViewEvent {
        public static final PersonalizeTapped INSTANCE = new PersonalizeTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PersonalizeTapped);
        }

        public final int hashCode() {
            return -290821593;
        }

        public final String toString() {
            return "PersonalizeTapped";
        }
    }

    public final class RecipientAvatarTapped extends PaymentConfigurationViewEvent {
        public final RecipientViewModel recipient;

        public RecipientAvatarTapped(RecipientViewModel recipientViewModel) {
            recipientViewModel.getClass();
            this.recipient = recipientViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipientAvatarTapped) && Intrinsics.areEqual(this.recipient, ((RecipientAvatarTapped) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "RecipientAvatarTapped(recipient=" + this.recipient + ")";
        }
    }

    public final class RecipientSearchTextChanged extends PaymentConfigurationViewEvent {
        public final String text;

        public RecipientSearchTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipientSearchTextChanged) && Intrinsics.areEqual(this.text, ((RecipientSearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecipientSearchTextChanged(text=", this.text, ")");
        }
    }

    public final class RecipientViewed extends PaymentConfigurationViewEvent {
        public final RecipientViewModel recipient;

        public RecipientViewed(RecipientViewModel recipientViewModel) {
            recipientViewModel.getClass();
            this.recipient = recipientViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipientViewed) && Intrinsics.areEqual(this.recipient, ((RecipientViewed) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "RecipientViewed(recipient=" + this.recipient + ")";
        }
    }

    public final class RecurringDisabledTapped extends PaymentConfigurationViewEvent {
        public static final RecurringDisabledTapped INSTANCE = new RecurringDisabledTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecurringDisabledTapped);
        }

        public final int hashCode() {
            return -854837620;
        }

        public final String toString() {
            return "RecurringDisabledTapped";
        }
    }

    public final class RecurringDisabledToastDismissed extends PaymentConfigurationViewEvent {
        public static final RecurringDisabledToastDismissed INSTANCE = new RecurringDisabledToastDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecurringDisabledToastDismissed);
        }

        public final int hashCode() {
            return -1026009534;
        }

        public final String toString() {
            return "RecurringDisabledToastDismissed";
        }
    }

    public final class RetryLoadingTapped extends PaymentConfigurationViewEvent {
        public static final RetryLoadingTapped INSTANCE = new RetryLoadingTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadingTapped);
        }

        public final int hashCode() {
            return -482771303;
        }

        public final String toString() {
            return "RetryLoadingTapped";
        }
    }

    public final class ReviewPaymentDisclaimerUrlTapped extends PaymentConfigurationViewEvent {
        public final String url;

        public ReviewPaymentDisclaimerUrlTapped(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewPaymentDisclaimerUrlTapped) && Intrinsics.areEqual(this.url, ((ReviewPaymentDisclaimerUrlTapped) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReviewPaymentDisclaimerUrlTapped(url=", this.url, ")");
        }
    }

    public final class ScanQrCodeTapped extends PaymentConfigurationViewEvent {
        public static final ScanQrCodeTapped INSTANCE = new ScanQrCodeTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanQrCodeTapped);
        }

        public final int hashCode() {
            return -764712272;
        }

        public final String toString() {
            return "ScanQrCodeTapped";
        }
    }

    public final class ScheduleTapped extends PaymentConfigurationViewEvent {
        public static final ScheduleTapped INSTANCE = new ScheduleTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScheduleTapped);
        }

        public final int hashCode() {
            return 1908966908;
        }

        public final String toString() {
            return "ScheduleTapped";
        }
    }

    public final class SearchTooltipDismissed extends PaymentConfigurationViewEvent {
        public static final SearchTooltipDismissed INSTANCE = new SearchTooltipDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchTooltipDismissed);
        }

        public final int hashCode() {
            return -1814355289;
        }

        public final String toString() {
            return "SearchTooltipDismissed";
        }
    }

    public final class SelectInstrumentRowTapped extends PaymentConfigurationViewEvent {
        public static final SelectInstrumentRowTapped INSTANCE = new SelectInstrumentRowTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectInstrumentRowTapped);
        }

        public final int hashCode() {
            return 1906482858;
        }

        public final String toString() {
            return "SelectInstrumentRowTapped";
        }
    }

    public final class SelectRecipientAndContinue extends PaymentConfigurationViewEvent {
        public final RecipientViewModel recipient;

        public SelectRecipientAndContinue(RecipientViewModel recipientViewModel) {
            recipientViewModel.getClass();
            this.recipient = recipientViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectRecipientAndContinue) && Intrinsics.areEqual(this.recipient, ((SelectRecipientAndContinue) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "SelectRecipientAndContinue(recipient=" + this.recipient + ")";
        }
    }

    public final class ShareLinkTapped extends PaymentConfigurationViewEvent {
        public static final ShareLinkTapped INSTANCE = new ShareLinkTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareLinkTapped);
        }

        public final int hashCode() {
            return 402217356;
        }

        public final String toString() {
            return "ShareLinkTapped";
        }
    }

    public final class StablecoinWithdrawalOptionSelected extends PaymentConfigurationViewEvent {
        public final StablecoinWithdrawalOption option;

        public StablecoinWithdrawalOptionSelected(StablecoinWithdrawalOption stablecoinWithdrawalOption) {
            stablecoinWithdrawalOption.getClass();
            this.option = stablecoinWithdrawalOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StablecoinWithdrawalOptionSelected) && Intrinsics.areEqual(this.option, ((StablecoinWithdrawalOptionSelected) obj).option);
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "StablecoinWithdrawalOptionSelected(option=" + this.option + ")";
        }
    }
}
