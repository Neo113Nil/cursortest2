package com.squareup.cash.directdeposit.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface DirectDepositUpdateManualFormDetailsViewEvent {

    public final class CheckAddSignature implements DirectDepositUpdateManualFormDetailsViewEvent {
        public final boolean checked;

        public CheckAddSignature(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckAddSignature) && this.checked == ((CheckAddSignature) obj).checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("CheckAddSignature(checked=", ")", this.checked);
        }
    }

    public final class CreateForm implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final CreateForm INSTANCE = new CreateForm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateForm);
        }

        public final int hashCode() {
            return 2109376967;
        }

        public final String toString() {
            return "CreateForm";
        }
    }

    public final class EditCompanyName implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final EditCompanyName INSTANCE = new EditCompanyName();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditCompanyName);
        }

        public final int hashCode() {
            return 1450698423;
        }

        public final String toString() {
            return "EditCompanyName";
        }
    }

    public final class EditName implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final EditName INSTANCE = new EditName();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditName);
        }

        public final int hashCode() {
            return -1074472100;
        }

        public final String toString() {
            return "EditName";
        }
    }

    public final class EditPaycheckAmount implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final EditPaycheckAmount INSTANCE = new EditPaycheckAmount();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditPaycheckAmount);
        }

        public final int hashCode() {
            return -157720215;
        }

        public final String toString() {
            return "EditPaycheckAmount";
        }
    }

    public final class Exit implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1763952571;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class RetryLoadingForm implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final RetryLoadingForm INSTANCE = new RetryLoadingForm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadingForm);
        }

        public final int hashCode() {
            return -1195234049;
        }

        public final String toString() {
            return "RetryLoadingForm";
        }
    }

    public final class ViewExistingForm implements DirectDepositUpdateManualFormDetailsViewEvent {
        public static final ViewExistingForm INSTANCE = new ViewExistingForm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewExistingForm);
        }

        public final int hashCode() {
            return 1265284315;
        }

        public final String toString() {
            return "ViewExistingForm";
        }
    }
}
