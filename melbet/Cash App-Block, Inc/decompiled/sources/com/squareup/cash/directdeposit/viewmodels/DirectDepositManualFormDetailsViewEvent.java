package com.squareup.cash.directdeposit.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface DirectDepositManualFormDetailsViewEvent {

    public final class CheckAddSignature implements DirectDepositManualFormDetailsViewEvent {
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

    public final class CreateForm implements DirectDepositManualFormDetailsViewEvent {
        public static final CreateForm INSTANCE = new CreateForm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateForm);
        }

        public final int hashCode() {
            return 1204665424;
        }

        public final String toString() {
            return "CreateForm";
        }
    }

    public final class EditCompanyName implements DirectDepositManualFormDetailsViewEvent {
        public static final EditCompanyName INSTANCE = new EditCompanyName();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditCompanyName);
        }

        public final int hashCode() {
            return 475783630;
        }

        public final String toString() {
            return "EditCompanyName";
        }
    }

    public final class EditName implements DirectDepositManualFormDetailsViewEvent {
        public static final EditName INSTANCE = new EditName();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditName);
        }

        public final int hashCode() {
            return 1360337957;
        }

        public final String toString() {
            return "EditName";
        }
    }

    public final class EditPaycheckAmount implements DirectDepositManualFormDetailsViewEvent {
        public static final EditPaycheckAmount INSTANCE = new EditPaycheckAmount();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditPaycheckAmount);
        }

        public final int hashCode() {
            return -1275462926;
        }

        public final String toString() {
            return "EditPaycheckAmount";
        }
    }

    public final class NavigationIconClick implements DirectDepositManualFormDetailsViewEvent {
        public static final NavigationIconClick INSTANCE = new NavigationIconClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationIconClick);
        }

        public final int hashCode() {
            return -1816744341;
        }

        public final String toString() {
            return "NavigationIconClick";
        }
    }
}
