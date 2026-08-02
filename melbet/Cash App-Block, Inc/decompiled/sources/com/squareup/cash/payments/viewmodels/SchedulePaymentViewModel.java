package com.squareup.cash.payments.viewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class SchedulePaymentViewModel {
    public final ImmutableList dates;
    public final String disclaimerText;
    public final ImmutableList frequencies;
    public final boolean hasExistingSelection;
    public final ScheduleCalendarDate selectedDate;
    public final PaymentScheduleFrequency selectedFrequency;

    public final class FrequencyOption {
        public final PaymentScheduleFrequency frequency;
        public final String label;

        public FrequencyOption(PaymentScheduleFrequency paymentScheduleFrequency, String str) {
            str.getClass();
            this.frequency = paymentScheduleFrequency;
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyOption)) {
                return false;
            }
            FrequencyOption frequencyOption = (FrequencyOption) obj;
            return this.frequency == frequencyOption.frequency && Intrinsics.areEqual(this.label, frequencyOption.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (this.frequency.hashCode() * 31);
        }

        public final String toString() {
            return "FrequencyOption(frequency=" + this.frequency + ", label=" + this.label + ")";
        }
    }

    public SchedulePaymentViewModel(ImmutableList immutableList, PaymentScheduleFrequency paymentScheduleFrequency, ImmutableList immutableList2, ScheduleCalendarDate scheduleCalendarDate, boolean z, String str) {
        immutableList.getClass();
        paymentScheduleFrequency.getClass();
        immutableList2.getClass();
        str.getClass();
        this.frequencies = immutableList;
        this.selectedFrequency = paymentScheduleFrequency;
        this.dates = immutableList2;
        this.selectedDate = scheduleCalendarDate;
        this.hasExistingSelection = z;
        this.disclaimerText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchedulePaymentViewModel)) {
            return false;
        }
        SchedulePaymentViewModel schedulePaymentViewModel = (SchedulePaymentViewModel) obj;
        return Intrinsics.areEqual(this.frequencies, schedulePaymentViewModel.frequencies) && this.selectedFrequency == schedulePaymentViewModel.selectedFrequency && Intrinsics.areEqual(this.dates, schedulePaymentViewModel.dates) && Intrinsics.areEqual(this.selectedDate, schedulePaymentViewModel.selectedDate) && this.hasExistingSelection == schedulePaymentViewModel.hasExistingSelection && Intrinsics.areEqual(this.disclaimerText, schedulePaymentViewModel.disclaimerText);
    }

    public final int hashCode() {
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.dates, (this.selectedFrequency.hashCode() + (this.frequencies.hashCode() * 31)) * 31, 31);
        ScheduleCalendarDate scheduleCalendarDate = this.selectedDate;
        return this.disclaimerText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (scheduleCalendarDate == null ? 0 : scheduleCalendarDate.hashCode())) * 31, 31, this.hasExistingSelection);
    }

    public final String toString() {
        return "SchedulePaymentViewModel(frequencies=" + this.frequencies + ", selectedFrequency=" + this.selectedFrequency + ", dates=" + this.dates + ", selectedDate=" + this.selectedDate + ", hasExistingSelection=" + this.hasExistingSelection + ", disclaimerText=" + this.disclaimerText + ")";
    }
}
