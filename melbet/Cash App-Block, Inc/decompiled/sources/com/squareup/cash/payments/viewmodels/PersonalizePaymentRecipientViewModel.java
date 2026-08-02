package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizePaymentRecipientViewModel {

    public final class Loaded implements PersonalizePaymentRecipientViewModel {
        public final String amount;
        public final Background background;
        public final ExpressivePaymentDetailsModel detailsModel;
        public final DialogViewModel dialogModel;
        public final List elements;
        public final boolean isCurrentCustomerSender;
        public final PersonalizedPaymentsReactionsState reactionsState;
        public final List recipients;
        public final SelectedTrack selectedTrack;
        public final boolean showExpressivePaymentsUi;
        public final boolean showReceiptButton;

        public Loaded(List list, String str, Background background, List list2, PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState, boolean z, boolean z2, ConfirmRetryResourceDialog confirmRetryResourceDialog, ExpressivePaymentDetailsModel expressivePaymentDetailsModel, boolean z3, SelectedTrack selectedTrack) {
            list.getClass();
            str.getClass();
            list2.getClass();
            personalizedPaymentsReactionsState.getClass();
            this.recipients = list;
            this.amount = str;
            this.background = background;
            this.elements = list2;
            this.reactionsState = personalizedPaymentsReactionsState;
            this.isCurrentCustomerSender = z;
            this.showExpressivePaymentsUi = z2;
            this.dialogModel = confirmRetryResourceDialog;
            this.detailsModel = expressivePaymentDetailsModel;
            this.showReceiptButton = z3;
            this.selectedTrack = selectedTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.recipients, loaded.recipients) && Intrinsics.areEqual(this.amount, loaded.amount) && Intrinsics.areEqual(this.background, loaded.background) && Intrinsics.areEqual(this.elements, loaded.elements) && Intrinsics.areEqual(this.reactionsState, loaded.reactionsState) && this.isCurrentCustomerSender == loaded.isCurrentCustomerSender && this.showExpressivePaymentsUi == loaded.showExpressivePaymentsUi && Intrinsics.areEqual(this.dialogModel, loaded.dialogModel) && this.detailsModel.equals(loaded.detailsModel) && this.showReceiptButton == loaded.showReceiptButton && Intrinsics.areEqual(this.selectedTrack, loaded.selectedTrack);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipients.hashCode() * 31, 31, this.amount);
            Background background = this.background;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.reactionsState.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (background == null ? 0 : background.hashCode())) * 31, 31, this.elements)) * 31, 31, this.isCurrentCustomerSender), 31, this.showExpressivePaymentsUi);
            DialogViewModel dialogViewModel = this.dialogModel;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.detailsModel.hashCode() + ((m2 + (dialogViewModel == null ? 0 : dialogViewModel.hashCode())) * 31)) * 31, 31, this.showReceiptButton);
            SelectedTrack selectedTrack = this.selectedTrack;
            return m3 + (selectedTrack != null ? selectedTrack.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("Loaded(recipients=", ", amount=", this.amount, ", background=", this.recipients);
            m.append(this.background);
            m.append(", elements=");
            m.append(this.elements);
            m.append(", reactionsState=");
            m.append(this.reactionsState);
            m.append(", isCurrentCustomerSender=");
            m.append(this.isCurrentCustomerSender);
            m.append(", showExpressivePaymentsUi=");
            m.append(this.showExpressivePaymentsUi);
            m.append(", dialogModel=");
            m.append(this.dialogModel);
            m.append(", detailsModel=");
            m.append(this.detailsModel);
            m.append(", showReceiptButton=");
            m.append(this.showReceiptButton);
            m.append(", selectedTrack=");
            m.append(this.selectedTrack);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements PersonalizePaymentRecipientViewModel {
        public final ConfirmRetryResourceDialog dialogModel;
        public final boolean showExpressivePaymentsUi;
        public final boolean showReceiptButton;
        public final PersonalizePaymentToolbarViewModel toolbar;

        public Loading(PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, ConfirmRetryResourceDialog confirmRetryResourceDialog, boolean z, boolean z2) {
            this.toolbar = personalizePaymentToolbarViewModel;
            this.dialogModel = confirmRetryResourceDialog;
            this.showExpressivePaymentsUi = z;
            this.showReceiptButton = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return this.toolbar.equals(loading.toolbar) && Intrinsics.areEqual(this.dialogModel, loading.dialogModel) && this.showExpressivePaymentsUi == loading.showExpressivePaymentsUi && this.showReceiptButton == loading.showReceiptButton;
        }

        public final int hashCode() {
            int hashCode = this.toolbar.hashCode() * 31;
            ConfirmRetryResourceDialog confirmRetryResourceDialog = this.dialogModel;
            return Boolean.hashCode(this.showReceiptButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (confirmRetryResourceDialog == null ? 0 : confirmRetryResourceDialog.hashCode())) * 31, 31, this.showExpressivePaymentsUi);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(toolbar=");
            sb.append(this.toolbar);
            sb.append(", dialogModel=");
            sb.append(this.dialogModel);
            sb.append(", showExpressivePaymentsUi=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showExpressivePaymentsUi, ", showReceiptButton=", this.showReceiptButton, ")");
        }
    }
}
