package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentConfigurationViewModel extends Parcelable {

    public final class InputAmount implements PaymentConfigurationViewModel, RecipientSelectedStep {
        public static final Parcelable.Creator<InputAmount> CREATOR = new Size.Creator(10);
        public final String buttonLabel;
        public final CurrencyCode currencyCode;
        public final boolean enableContinue;
        public final String rawAmount;
        public final RecipientViewModel recipient;
        public final boolean showClose;
        public final PaymentConfigurationTitleViewModel title;

        public InputAmount(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, RecipientViewModel recipientViewModel, String str, CurrencyCode currencyCode, boolean z2, String str2) {
            paymentConfigurationTitleViewModel.getClass();
            str.getClass();
            currencyCode.getClass();
            str2.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.recipient = recipientViewModel;
            this.rawAmount = str;
            this.currencyCode = currencyCode;
            this.enableContinue = z2;
            this.buttonLabel = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputAmount)) {
                return false;
            }
            InputAmount inputAmount = (InputAmount) obj;
            return Intrinsics.areEqual(this.title, inputAmount.title) && this.showClose == inputAmount.showClose && Intrinsics.areEqual(this.recipient, inputAmount.recipient) && Intrinsics.areEqual(this.rawAmount, inputAmount.rawAmount) && this.currencyCode == inputAmount.currencyCode && this.enableContinue == inputAmount.enableContinue && Intrinsics.areEqual(this.buttonLabel, inputAmount.buttonLabel);
        }

        @Override // com.squareup.cash.payments.viewmodels.RecipientSelectedStep
        public final RecipientViewModel getRecipient() {
            return this.recipient;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose);
            RecipientViewModel recipientViewModel = this.recipient;
            return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (recipientViewModel == null ? 0 : recipientViewModel.hashCode())) * 31, 31, this.rawAmount)) * 31, 31, this.enableContinue);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InputAmount(title=");
            sb.append(this.title);
            sb.append(", showClose=");
            sb.append(this.showClose);
            sb.append(", recipient=");
            sb.append(this.recipient);
            sb.append(", rawAmount=");
            sb.append(this.rawAmount);
            sb.append(", currencyCode=");
            sb.append(this.currencyCode);
            sb.append(", enableContinue=");
            sb.append(this.enableContinue);
            sb.append(", buttonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeParcelable(this.recipient, i);
            parcel.writeString(this.rawAmount);
            parcel.writeString(this.currencyCode.name());
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.buttonLabel);
        }
    }

    public final class InputNote implements PaymentConfigurationViewModel, RecipientSelectedStep {
        public static final Parcelable.Creator<InputNote> CREATOR = new Size.Creator(11);
        public final String buttonLabel;
        public final boolean enableNext;
        public final String note;
        public final RecipientViewModel recipient;
        public final boolean showClose;
        public final PaymentConfigurationTitleViewModel title;

        public InputNote(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, RecipientViewModel recipientViewModel, String str, boolean z2, String str2) {
            paymentConfigurationTitleViewModel.getClass();
            str.getClass();
            str2.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.recipient = recipientViewModel;
            this.note = str;
            this.enableNext = z2;
            this.buttonLabel = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputNote)) {
                return false;
            }
            InputNote inputNote = (InputNote) obj;
            return Intrinsics.areEqual(this.title, inputNote.title) && this.showClose == inputNote.showClose && Intrinsics.areEqual(this.recipient, inputNote.recipient) && Intrinsics.areEqual(this.note, inputNote.note) && this.enableNext == inputNote.enableNext && Intrinsics.areEqual(this.buttonLabel, inputNote.buttonLabel);
        }

        @Override // com.squareup.cash.payments.viewmodels.RecipientSelectedStep
        public final RecipientViewModel getRecipient() {
            return this.recipient;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose);
            RecipientViewModel recipientViewModel = this.recipient;
            return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (recipientViewModel == null ? 0 : recipientViewModel.hashCode())) * 31, 31, this.note), 31, this.enableNext);
        }

        public final String toString() {
            return "InputNote(title=" + this.title + ", showClose=" + this.showClose + ", recipient=" + this.recipient + ", note=" + this.note + ", enableNext=" + this.enableNext + ", buttonLabel=" + this.buttonLabel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeParcelable(this.recipient, i);
            parcel.writeString(this.note);
            parcel.writeInt(this.enableNext ? 1 : 0);
            parcel.writeString(this.buttonLabel);
        }
    }

    public final class Loading implements PaymentConfigurationViewModel {
        public static final Parcelable.Creator<Loading> CREATOR = new Size.Creator(12);
        public final boolean showClose;
        public final LoadingStatus status;
        public final PaymentConfigurationTitleViewModel title;

        public interface LoadingStatus extends Parcelable {

            public final class Errored implements LoadingStatus {
                public static final Errored INSTANCE = new Errored();
                public static final Parcelable.Creator<Errored> CREATOR = new Size.Creator(13);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Errored);
                }

                public final int hashCode() {
                    return 64603339;
                }

                public final String toString() {
                    return "Errored";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class OpenedOwnLink implements LoadingStatus {
                public static final OpenedOwnLink INSTANCE = new OpenedOwnLink();
                public static final Parcelable.Creator<OpenedOwnLink> CREATOR = new Size.Creator(14);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof OpenedOwnLink);
                }

                public final int hashCode() {
                    return 2111927579;
                }

                public final String toString() {
                    return "OpenedOwnLink";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }
        }

        public Loading(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, LoadingStatus loadingStatus) {
            paymentConfigurationTitleViewModel.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.status = loadingStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.title, loading.title) && this.showClose == loading.showClose && Intrinsics.areEqual(this.status, loading.status);
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose);
            LoadingStatus loadingStatus = this.status;
            return m + (loadingStatus == null ? 0 : loadingStatus.hashCode());
        }

        public final String toString() {
            return "Loading(title=" + this.title + ", showClose=" + this.showClose + ", status=" + this.status + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeParcelable(this.status, i);
        }
    }

    public final class RequestShareOption implements PaymentConfigurationViewModel {
        public static final Parcelable.Creator<RequestShareOption> CREATOR = new Size.Creator(15);
        public final boolean addRecipientAsPrimaryCtaEnabled;
        public final boolean createLinkErrored;
        public final boolean createLinkInProgress;
        public final String note;
        public final boolean showClose;
        public final PaymentConfigurationTitleViewModel title;

        public RequestShareOption(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, String str, boolean z2, boolean z3, boolean z4) {
            paymentConfigurationTitleViewModel.getClass();
            str.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.note = str;
            this.createLinkInProgress = z2;
            this.createLinkErrored = z3;
            this.addRecipientAsPrimaryCtaEnabled = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestShareOption)) {
                return false;
            }
            RequestShareOption requestShareOption = (RequestShareOption) obj;
            return Intrinsics.areEqual(this.title, requestShareOption.title) && this.showClose == requestShareOption.showClose && Intrinsics.areEqual(this.note, requestShareOption.note) && this.createLinkInProgress == requestShareOption.createLinkInProgress && this.createLinkErrored == requestShareOption.createLinkErrored && this.addRecipientAsPrimaryCtaEnabled == requestShareOption.addRecipientAsPrimaryCtaEnabled;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.addRecipientAsPrimaryCtaEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose), 31, this.note), 31, this.createLinkInProgress), 31, this.createLinkErrored);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestShareOption(title=");
            sb.append(this.title);
            sb.append(", showClose=");
            sb.append(this.showClose);
            sb.append(", note=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.note, ", createLinkInProgress=", this.createLinkInProgress, ", createLinkErrored=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.createLinkErrored, ", addRecipientAsPrimaryCtaEnabled=", this.addRecipientAsPrimaryCtaEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeString(this.note);
            parcel.writeInt(this.createLinkInProgress ? 1 : 0);
            parcel.writeInt(this.createLinkErrored ? 1 : 0);
            parcel.writeInt(this.addRecipientAsPrimaryCtaEnabled ? 1 : 0);
        }
    }

    public final class ReviewPayment implements PaymentConfigurationViewModel, RecipientSelectedStep {
        public static final Parcelable.Creator<ReviewPayment> CREATOR = new Size.Creator(16);
        public final Color backgroundColor;
        public final List backgroundEffects;
        public final Image backgroundImage;
        public final String buttonLabel;
        public final String disclaimerText;
        public final InstrumentSelectionRowViewModel instrumentModel;
        public final String note;
        public final String previewAmount;
        public final List previewStickers;
        public final Color previewTextColor;
        public final RecipientViewModel recipient;
        public final boolean recurringDisabled;
        public final RecurringDisabledInstrument recurringDisabledToast;
        public final boolean scheduleSelected;
        public final boolean showClose;
        public final boolean showPersonalization;
        public final boolean showScheduleButton;
        public final PaymentConfigurationTitleViewModel title;
        public final List transactionDetails;

        public ReviewPayment(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, RecipientViewModel recipientViewModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, RecurringDisabledInstrument recurringDisabledInstrument, Image image, Color color, List list, String str, Color color2, List list2, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, String str2, String str3, String str4, List list3) {
            paymentConfigurationTitleViewModel.getClass();
            list.getClass();
            list2.getClass();
            str2.getClass();
            str3.getClass();
            list3.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.recipient = recipientViewModel;
            this.showClose = z;
            this.showPersonalization = z2;
            this.showScheduleButton = z3;
            this.scheduleSelected = z4;
            this.recurringDisabled = z5;
            this.recurringDisabledToast = recurringDisabledInstrument;
            this.backgroundImage = image;
            this.backgroundColor = color;
            this.backgroundEffects = list;
            this.previewAmount = str;
            this.previewTextColor = color2;
            this.previewStickers = list2;
            this.instrumentModel = instrumentSelectionRowViewModel;
            this.note = str2;
            this.buttonLabel = str3;
            this.disclaimerText = str4;
            this.transactionDetails = list3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewPayment)) {
                return false;
            }
            ReviewPayment reviewPayment = (ReviewPayment) obj;
            return Intrinsics.areEqual(this.title, reviewPayment.title) && Intrinsics.areEqual(this.recipient, reviewPayment.recipient) && this.showClose == reviewPayment.showClose && this.showPersonalization == reviewPayment.showPersonalization && this.showScheduleButton == reviewPayment.showScheduleButton && this.scheduleSelected == reviewPayment.scheduleSelected && this.recurringDisabled == reviewPayment.recurringDisabled && this.recurringDisabledToast == reviewPayment.recurringDisabledToast && Intrinsics.areEqual(this.backgroundImage, reviewPayment.backgroundImage) && Intrinsics.areEqual(this.backgroundColor, reviewPayment.backgroundColor) && Intrinsics.areEqual(this.backgroundEffects, reviewPayment.backgroundEffects) && Intrinsics.areEqual(this.previewAmount, reviewPayment.previewAmount) && Intrinsics.areEqual(this.previewTextColor, reviewPayment.previewTextColor) && Intrinsics.areEqual(this.previewStickers, reviewPayment.previewStickers) && Intrinsics.areEqual(this.instrumentModel, reviewPayment.instrumentModel) && Intrinsics.areEqual(this.note, reviewPayment.note) && Intrinsics.areEqual(this.buttonLabel, reviewPayment.buttonLabel) && Intrinsics.areEqual(this.disclaimerText, reviewPayment.disclaimerText) && Intrinsics.areEqual(this.transactionDetails, reviewPayment.transactionDetails);
        }

        @Override // com.squareup.cash.payments.viewmodels.RecipientSelectedStep
        public final RecipientViewModel getRecipient() {
            return this.recipient;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            RecipientViewModel recipientViewModel = this.recipient;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (recipientViewModel == null ? 0 : recipientViewModel.hashCode())) * 31, 31, this.showClose), 31, this.showPersonalization), 31, this.showScheduleButton), 31, this.scheduleSelected), 31, this.recurringDisabled);
            RecurringDisabledInstrument recurringDisabledInstrument = this.recurringDisabledToast;
            int hashCode2 = (m + (recurringDisabledInstrument == null ? 0 : recurringDisabledInstrument.hashCode())) * 31;
            Image image = this.backgroundImage;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Color color = this.backgroundColor;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (color == null ? 0 : color.hashCode())) * 31, 31, this.backgroundEffects);
            String str = this.previewAmount;
            int hashCode4 = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            Color color2 = this.previewTextColor;
            int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (color2 == null ? 0 : color2.hashCode())) * 31, 31, this.previewStickers);
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = this.instrumentModel;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (instrumentSelectionRowViewModel == null ? 0 : instrumentSelectionRowViewModel.hashCode())) * 31, 31, this.note), 31, this.buttonLabel);
            String str2 = this.disclaimerText;
            return this.transactionDetails.hashCode() + ((m4 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewPayment(title=");
            sb.append(this.title);
            sb.append(", recipient=");
            sb.append(this.recipient);
            sb.append(", showClose=");
            re$$ExternalSyntheticOutline0.m(sb, this.showClose, ", showPersonalization=", this.showPersonalization, ", showScheduleButton=");
            re$$ExternalSyntheticOutline0.m(sb, this.showScheduleButton, ", scheduleSelected=", this.scheduleSelected, ", recurringDisabled=");
            sb.append(this.recurringDisabled);
            sb.append(", recurringDisabledToast=");
            sb.append(this.recurringDisabledToast);
            sb.append(", backgroundImage=");
            sb.append(this.backgroundImage);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", backgroundEffects=");
            Recorder$$ExternalSyntheticOutline2.m(", previewAmount=", this.previewAmount, ", previewTextColor=", sb, this.backgroundEffects);
            sb.append(this.previewTextColor);
            sb.append(", previewStickers=");
            sb.append(this.previewStickers);
            sb.append(", instrumentModel=");
            sb.append(this.instrumentModel);
            sb.append(", note=");
            sb.append(this.note);
            sb.append(", buttonLabel=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.buttonLabel, ", disclaimerText=", this.disclaimerText, ", transactionDetails=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.transactionDetails, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeParcelable(this.recipient, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeInt(this.showPersonalization ? 1 : 0);
            parcel.writeInt(this.showScheduleButton ? 1 : 0);
            parcel.writeInt(this.scheduleSelected ? 1 : 0);
            parcel.writeInt(this.recurringDisabled ? 1 : 0);
            RecurringDisabledInstrument recurringDisabledInstrument = this.recurringDisabledToast;
            if (recurringDisabledInstrument == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(recurringDisabledInstrument.name());
            }
            parcel.writeString(this.note);
            parcel.writeString(this.buttonLabel);
            parcel.writeString(this.disclaimerText);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.transactionDetails, parcel);
            while (m.hasNext()) {
                ((LabeledDetailRow) m.next()).writeToParcel(parcel, i);
            }
        }
    }

    public final class SelectRecipientMenu implements PaymentConfigurationViewModel {
        public static final Parcelable.Creator<SelectRecipientMenu> CREATOR = new Size.Creator(17);
        public final boolean expandedSheet;
        public final boolean loading;
        public final String recipientSearchQuery;
        public final List sections;
        public final boolean showClose;
        public final boolean showContactPermissionPrompt;
        public final boolean showNoContactsFoundCard;
        public final boolean showQrCodeButton;
        public final boolean showSearchTooltip;
        public final boolean showSyncContactsRow;
        public final PaymentConfigurationTitleViewModel title;

        public SelectRecipientMenu(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, boolean z2, List list, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            paymentConfigurationTitleViewModel.getClass();
            list.getClass();
            str.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.expandedSheet = z2;
            this.sections = list;
            this.recipientSearchQuery = str;
            this.showContactPermissionPrompt = z3;
            this.showSyncContactsRow = z4;
            this.showNoContactsFoundCard = z5;
            this.loading = z6;
            this.showQrCodeButton = z7;
            this.showSearchTooltip = z8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectRecipientMenu)) {
                return false;
            }
            SelectRecipientMenu selectRecipientMenu = (SelectRecipientMenu) obj;
            return Intrinsics.areEqual(this.title, selectRecipientMenu.title) && this.showClose == selectRecipientMenu.showClose && this.expandedSheet == selectRecipientMenu.expandedSheet && Intrinsics.areEqual(this.sections, selectRecipientMenu.sections) && Intrinsics.areEqual(this.recipientSearchQuery, selectRecipientMenu.recipientSearchQuery) && this.showContactPermissionPrompt == selectRecipientMenu.showContactPermissionPrompt && this.showSyncContactsRow == selectRecipientMenu.showSyncContactsRow && this.showNoContactsFoundCard == selectRecipientMenu.showNoContactsFoundCard && this.loading == selectRecipientMenu.loading && this.showQrCodeButton == selectRecipientMenu.showQrCodeButton && this.showSearchTooltip == selectRecipientMenu.showSearchTooltip;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showSearchTooltip) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose), 31, this.expandedSheet), 31, this.sections), 31, this.recipientSearchQuery), 31, this.showContactPermissionPrompt), 31, this.showSyncContactsRow), 31, this.showNoContactsFoundCard), 31, this.loading), 31, this.showQrCodeButton);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectRecipientMenu(title=");
            sb.append(this.title);
            sb.append(", showClose=");
            sb.append(this.showClose);
            sb.append(", expandedSheet=");
            sb.append(this.expandedSheet);
            sb.append(", sections=");
            sb.append(this.sections);
            sb.append(", recipientSearchQuery=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.recipientSearchQuery, ", showContactPermissionPrompt=", this.showContactPermissionPrompt, ", showSyncContactsRow=");
            re$$ExternalSyntheticOutline0.m(sb, this.showSyncContactsRow, ", showNoContactsFoundCard=", this.showNoContactsFoundCard, ", loading=");
            re$$ExternalSyntheticOutline0.m(sb, this.loading, ", showQrCodeButton=", this.showQrCodeButton, ", showSearchTooltip=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showSearchTooltip, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            parcel.writeInt(this.expandedSheet ? 1 : 0);
            parcel.writeString(this.recipientSearchQuery);
            parcel.writeInt(this.showContactPermissionPrompt ? 1 : 0);
            parcel.writeInt(this.showSyncContactsRow ? 1 : 0);
            parcel.writeInt(this.showNoContactsFoundCard ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.showQrCodeButton ? 1 : 0);
            parcel.writeInt(this.showSearchTooltip ? 1 : 0);
        }
    }

    public final class SelectStablecoinWithdrawalOption implements PaymentConfigurationViewModel {
        public static final Parcelable.Creator<SelectStablecoinWithdrawalOption> CREATOR = new Size.Creator(18);
        public final String disclaimerText;
        public final ArrayList rows;
        public final boolean showClose;
        public final PaymentConfigurationTitleViewModel title;

        public SelectStablecoinWithdrawalOption(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, boolean z, ArrayList arrayList, String str) {
            paymentConfigurationTitleViewModel.getClass();
            str.getClass();
            this.title = paymentConfigurationTitleViewModel;
            this.showClose = z;
            this.rows = arrayList;
            this.disclaimerText = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectStablecoinWithdrawalOption)) {
                return false;
            }
            SelectStablecoinWithdrawalOption selectStablecoinWithdrawalOption = (SelectStablecoinWithdrawalOption) obj;
            return Intrinsics.areEqual(this.title, selectStablecoinWithdrawalOption.title) && this.showClose == selectStablecoinWithdrawalOption.showClose && this.rows.equals(selectStablecoinWithdrawalOption.rows) && Intrinsics.areEqual(this.disclaimerText, selectStablecoinWithdrawalOption.disclaimerText);
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final boolean getShowClose() {
            return this.showClose;
        }

        @Override // com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel
        public final PaymentConfigurationTitleViewModel getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.disclaimerText.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.showClose), 31);
        }

        public final String toString() {
            return "SelectStablecoinWithdrawalOption(title=" + this.title + ", showClose=" + this.showClose + ", rows=" + this.rows + ", disclaimerText=" + this.disclaimerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeInt(this.showClose ? 1 : 0);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.rows, parcel);
            while (m.hasNext()) {
                ((StablecoinWithdrawalOptionRow) m.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.disclaimerText);
        }
    }

    boolean getShowClose();

    PaymentConfigurationTitleViewModel getTitle();
}
