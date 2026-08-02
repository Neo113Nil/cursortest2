package com.squareup.cash.earnings.viewmodels.payers;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AddPayerCustomersViewEvent {

    public final class Dismiss implements AddPayerCustomersViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -853263276;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class DismissError implements AddPayerCustomersViewEvent {
        public static final DismissError INSTANCE = new DismissError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissError);
        }

        public final int hashCode() {
            return -1082508780;
        }

        public final String toString() {
            return "DismissError";
        }
    }

    public final class RetryLoad implements AddPayerCustomersViewEvent {
        public static final RetryLoad INSTANCE = new RetryLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoad);
        }

        public final int hashCode() {
            return -813824264;
        }

        public final String toString() {
            return "RetryLoad";
        }
    }

    public final class SearchTextChanged implements AddPayerCustomersViewEvent {
        public final String text;

        public SearchTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.text, ((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(text=", this.text, ")");
        }
    }

    public final class TapDone implements AddPayerCustomersViewEvent {
        public static final TapDone INSTANCE = new TapDone();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapDone);
        }

        public final int hashCode() {
            return 228874127;
        }

        public final String toString() {
            return "TapDone";
        }
    }

    public final class ToggleCustomer implements AddPayerCustomersViewEvent {
        public final String customerToken;

        public ToggleCustomer(String str) {
            str.getClass();
            this.customerToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleCustomer) && Intrinsics.areEqual(this.customerToken, ((ToggleCustomer) obj).customerToken);
        }

        public final int hashCode() {
            return this.customerToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToggleCustomer(customerToken=", this.customerToken, ")");
        }
    }
}
