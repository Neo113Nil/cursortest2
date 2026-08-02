package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingRecurringFrequencyPickerViewEvent {

    public final class BackPressed extends InvestingRecurringFrequencyPickerViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -837848064;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class ConfirmPressed extends InvestingRecurringFrequencyPickerViewEvent {
        public final InvestingFrequencyOption selectedFrequency;

        public ConfirmPressed(InvestingFrequencyOption investingFrequencyOption) {
            investingFrequencyOption.getClass();
            this.selectedFrequency = investingFrequencyOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmPressed) && Intrinsics.areEqual(this.selectedFrequency, ((ConfirmPressed) obj).selectedFrequency);
        }

        public final int hashCode() {
            return this.selectedFrequency.hashCode();
        }

        public final String toString() {
            return "ConfirmPressed(selectedFrequency=" + this.selectedFrequency + ")";
        }
    }
}
