package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class QuickPayViewModel {

    public final class Loading extends QuickPayViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1080446823;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends QuickPayViewModel {
        public final Money acceptedFee;
        public final CurrencyCode currencyCode;
        public final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel;
        public final boolean isAmountError;
        public final boolean isBusinessIconEnabled;
        public final String note;
        public final String noteHint;
        public final Orientation orientation;
        public final List paymentGetters;
        public final PersonalizePaymentEntrypointButtonViewModel personalizePaymentButtonState;
        public final String primaryButtonText;
        public final String rawAmount;
        public final String selectedInstrumentToken;
        public final Versioned shouldRequestNoteFocus;
        public final ToolbarWithAvatarViewModel toolbarWithAvatarViewModel;

        public Ready(String str, CurrencyCode currencyCode, String str2, ToolbarWithAvatarViewModel toolbarWithAvatarViewModel, String str3, String str4, Versioned versioned, boolean z, PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel, String str5, Money money, Orientation orientation, List list, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, boolean z2) {
            str.getClass();
            currencyCode.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            personalizePaymentEntrypointButtonViewModel.getClass();
            orientation.getClass();
            list.getClass();
            this.rawAmount = str;
            this.currencyCode = currencyCode;
            this.primaryButtonText = str2;
            this.toolbarWithAvatarViewModel = toolbarWithAvatarViewModel;
            this.note = str3;
            this.noteHint = str4;
            this.shouldRequestNoteFocus = versioned;
            this.isAmountError = z;
            this.personalizePaymentButtonState = personalizePaymentEntrypointButtonViewModel;
            this.selectedInstrumentToken = str5;
            this.acceptedFee = money;
            this.orientation = orientation;
            this.paymentGetters = list;
            this.instrumentSelectionRowViewModel = instrumentSelectionRowViewModel;
            this.isBusinessIconEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.rawAmount, ready.rawAmount) && this.currencyCode == ready.currencyCode && Intrinsics.areEqual(this.primaryButtonText, ready.primaryButtonText) && this.toolbarWithAvatarViewModel.equals(ready.toolbarWithAvatarViewModel) && Intrinsics.areEqual(this.note, ready.note) && Intrinsics.areEqual(this.noteHint, ready.noteHint) && this.shouldRequestNoteFocus.equals(ready.shouldRequestNoteFocus) && this.isAmountError == ready.isAmountError && Intrinsics.areEqual(this.personalizePaymentButtonState, ready.personalizePaymentButtonState) && Intrinsics.areEqual(this.selectedInstrumentToken, ready.selectedInstrumentToken) && this.acceptedFee.equals(ready.acceptedFee) && this.orientation == ready.orientation && Intrinsics.areEqual(this.paymentGetters, ready.paymentGetters) && Intrinsics.areEqual(this.instrumentSelectionRowViewModel, ready.instrumentSelectionRowViewModel) && this.isBusinessIconEnabled == ready.isBusinessIconEnabled;
        }

        public final int hashCode() {
            int hashCode = (this.personalizePaymentButtonState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.shouldRequestNoteFocus.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.toolbarWithAvatarViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currencyCode.hashCode() + (this.rawAmount.hashCode() * 31)) * 31, 31, true), 31, this.primaryButtonText)) * 31, 31, this.note), 31, this.noteHint)) * 31, 31, this.isAmountError)) * 31;
            String str = this.selectedInstrumentToken;
            int m = Recorder$$ExternalSyntheticOutline2.m((this.orientation.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.acceptedFee, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.paymentGetters);
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = this.instrumentSelectionRowViewModel;
            return Boolean.hashCode(this.isBusinessIconEnabled) + ((m + (instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(rawAmount=");
            sb.append(this.rawAmount);
            sb.append(", currencyCode=");
            sb.append(this.currencyCode);
            sb.append(", primaryButtonEnabled=true, primaryButtonText=");
            sb.append(this.primaryButtonText);
            sb.append(", toolbarWithAvatarViewModel=");
            sb.append(this.toolbarWithAvatarViewModel);
            sb.append(", note=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.note, ", noteHint=", this.noteHint, ", shouldRequestNoteFocus=");
            sb.append(this.shouldRequestNoteFocus);
            sb.append(", isAmountError=");
            sb.append(this.isAmountError);
            sb.append(", personalizePaymentButtonState=");
            sb.append(this.personalizePaymentButtonState);
            sb.append(", selectedInstrumentToken=");
            sb.append(this.selectedInstrumentToken);
            sb.append(", acceptedFee=");
            sb.append(this.acceptedFee);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", paymentGetters=");
            sb.append(this.paymentGetters);
            sb.append(", instrumentSelectionRowViewModel=");
            sb.append(this.instrumentSelectionRowViewModel);
            sb.append(", isBusinessIconEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isBusinessIconEnabled, ")");
        }
    }

    public final class ToolbarWithAvatarViewModel {
        public final StackedAvatarViewModel avatar;
        public final boolean isBackNavigation;
        public final boolean isInstrumentSelectionOpen;
        public final boolean isTappable;
        public final boolean showDetailsOverflow;
        public final String subtitle;
        public final String title;

        public ToolbarWithAvatarViewModel(String str, String str2, boolean z, StackedAvatarViewModel stackedAvatarViewModel, boolean z2, boolean z3, boolean z4) {
            str.getClass();
            this.title = str;
            this.subtitle = str2;
            this.isInstrumentSelectionOpen = z;
            this.avatar = stackedAvatarViewModel;
            this.isTappable = z2;
            this.isBackNavigation = z3;
            this.showDetailsOverflow = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolbarWithAvatarViewModel)) {
                return false;
            }
            ToolbarWithAvatarViewModel toolbarWithAvatarViewModel = (ToolbarWithAvatarViewModel) obj;
            return Intrinsics.areEqual(this.title, toolbarWithAvatarViewModel.title) && Intrinsics.areEqual(this.subtitle, toolbarWithAvatarViewModel.subtitle) && this.isInstrumentSelectionOpen == toolbarWithAvatarViewModel.isInstrumentSelectionOpen && Intrinsics.areEqual(this.avatar, toolbarWithAvatarViewModel.avatar) && this.isTappable == toolbarWithAvatarViewModel.isTappable && this.isBackNavigation == toolbarWithAvatarViewModel.isBackNavigation && this.showDetailsOverflow == toolbarWithAvatarViewModel.showDetailsOverflow;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isInstrumentSelectionOpen);
            StackedAvatarViewModel stackedAvatarViewModel = this.avatar;
            return Boolean.hashCode(this.showDetailsOverflow) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (stackedAvatarViewModel != null ? stackedAvatarViewModel.hashCode() : 0)) * 31, 31, this.isTappable), 31, this.isBackNavigation);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToolbarWithAvatarViewModel(title=", this.title, ", subtitle=", this.subtitle, ", isInstrumentSelectionOpen=");
            m.append(this.isInstrumentSelectionOpen);
            m.append(", avatar=");
            m.append(this.avatar);
            m.append(", isTappable=");
            re$$ExternalSyntheticOutline0.m(m, this.isTappable, ", isBackNavigation=", this.isBackNavigation, ", showDetailsOverflow=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showDetailsOverflow, ")");
        }
    }
}
