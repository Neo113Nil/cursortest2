package app.cash.local.viewmodels.fulfillment;

import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;

/* loaded from: classes3.dex */
public interface SchedulingDayTimePickerViewEvent {

    public final class BackClicked implements SchedulingDayTimePickerViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1747116670;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class ConfirmClicked implements SchedulingDayTimePickerViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return -1496535611;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class DaySelected implements SchedulingDayTimePickerViewEvent {
        public final SchedulingDay day;

        public DaySelected(SchedulingDay schedulingDay) {
            this.day = schedulingDay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DaySelected) && this.day.equals(((DaySelected) obj).day);
        }

        public final int hashCode() {
            return this.day.hashCode();
        }

        public final String toString() {
            return "DaySelected(day=" + this.day + ")";
        }
    }

    public final class RetryLoadingDays implements SchedulingDayTimePickerViewEvent {
        public static final RetryLoadingDays INSTANCE = new RetryLoadingDays();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadingDays);
        }

        public final int hashCode() {
            return -774016791;
        }

        public final String toString() {
            return "RetryLoadingDays";
        }
    }

    public final class RetryLoadingTimes implements SchedulingDayTimePickerViewEvent {
        public static final RetryLoadingTimes INSTANCE = new RetryLoadingTimes();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadingTimes);
        }

        public final int hashCode() {
            return 1790286068;
        }

        public final String toString() {
            return "RetryLoadingTimes";
        }
    }

    public final class TimeSelected implements SchedulingDayTimePickerViewEvent {
        public final SchedulingTime time;

        public TimeSelected(SchedulingTime schedulingTime) {
            this.time = schedulingTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeSelected) && this.time.equals(((TimeSelected) obj).time);
        }

        public final int hashCode() {
            return this.time.hashCode();
        }

        public final String toString() {
            return "TimeSelected(time=" + this.time + ")";
        }
    }
}
