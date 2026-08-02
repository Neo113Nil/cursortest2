package com.squareup.cash.payments.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SchedulePaymentViewEvent {

    public final class Cancel extends SchedulePaymentViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -2098261454;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Close extends SchedulePaymentViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1314282688;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DateChanged extends SchedulePaymentViewEvent {
        public final LocalDate date;

        public DateChanged(LocalDate localDate) {
            localDate.getClass();
            this.date = localDate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateChanged) && Intrinsics.areEqual(this.date, ((DateChanged) obj).date);
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final String toString() {
            return "DateChanged(date=" + this.date + ")";
        }
    }

    public final class Done extends SchedulePaymentViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -42363590;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class FrequencyChanged extends SchedulePaymentViewEvent {
        public final PaymentScheduleFrequency frequency;

        public FrequencyChanged(PaymentScheduleFrequency paymentScheduleFrequency) {
            paymentScheduleFrequency.getClass();
            this.frequency = paymentScheduleFrequency;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrequencyChanged) && this.frequency == ((FrequencyChanged) obj).frequency;
        }

        public final int hashCode() {
            return this.frequency.hashCode();
        }

        public final String toString() {
            return "FrequencyChanged(frequency=" + this.frequency + ")";
        }
    }

    public final class RemoveSchedule extends SchedulePaymentViewEvent {
        public static final RemoveSchedule INSTANCE = new RemoveSchedule();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveSchedule);
        }

        public final int hashCode() {
            return -680601869;
        }

        public final String toString() {
            return "RemoveSchedule";
        }
    }
}
