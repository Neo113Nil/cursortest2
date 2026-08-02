package com.squareup.cash.activity.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import java.time.LocalDate;
import java.time.Month;

/* loaded from: classes5.dex */
public interface ActivityGrouping {

    public final class ByOtherMonth implements ActivityGrouping {
        public final LocalDate date;

        public ByOtherMonth(LocalDate localDate) {
            localDate.getClass();
            this.date = localDate;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByOtherMonth)) {
                return false;
            }
            LocalDate localDate = ((ByOtherMonth) obj).date;
            Month month = localDate.getMonth();
            LocalDate localDate2 = this.date;
            return month == localDate2.getMonth() && localDate.getYear() == localDate2.getYear();
        }

        public final int hashCode() {
            LocalDate localDate = this.date;
            return Integer.hashCode(localDate.getYear()) + (Integer.hashCode(localDate.getMonthValue()) * 31);
        }

        public final String toString() {
            LocalDate localDate = this.date;
            return Recorder$$ExternalSyntheticOutline2.m(localDate.getYear(), localDate.getMonthValue(), "ByOtherMonth(", "-", ")");
        }
    }

    public final class BySection implements ActivityGrouping {
        public final ActivityRowSection section;

        public BySection(ActivityRowSection activityRowSection) {
            activityRowSection.getClass();
            this.section = activityRowSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BySection) && this.section == ((BySection) obj).section;
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final String toString() {
            return "BySection(section=" + this.section + ")";
        }
    }

    public final class ByThisMonth implements ActivityGrouping {
        public static final ByThisMonth INSTANCE = new ByThisMonth();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ByThisMonth);
        }

        public final int hashCode() {
            return 393183382;
        }

        public final String toString() {
            return "ByThisMonth";
        }
    }

    public final class ByToday implements ActivityGrouping {
        public static final ByToday INSTANCE = new ByToday();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ByToday);
        }

        public final int hashCode() {
            return 312275797;
        }

        public final String toString() {
            return "ByToday";
        }
    }
}
