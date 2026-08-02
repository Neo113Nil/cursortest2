package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

import com.squareup.cash.R;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class InvestingFrequencyOption {

    public final class OneTime extends InvestingFrequencyOption {
        public static final OneTime INSTANCE = new OneTime();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OneTime);
        }

        public final int hashCode() {
            return 1718088513;
        }

        public final String toString() {
            return "OneTime";
        }
    }

    public final class Recurring extends InvestingFrequencyOption {
        public final RecurringSchedule.Frequency frequency;

        public Recurring(RecurringSchedule.Frequency frequency) {
            frequency.getClass();
            this.frequency = frequency;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Recurring) && this.frequency == ((Recurring) obj).frequency;
        }

        public final int hashCode() {
            return this.frequency.hashCode();
        }

        public final String toString() {
            return "Recurring(frequency=" + this.frequency + ")";
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final int getLabelResId() {
        if (this instanceof OneTime) {
            return R.string.investing_recurringfrequency_onetime;
        }
        if (!(this instanceof Recurring)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((Recurring) this).frequency.ordinal()];
        if (i == 1) {
            return R.string.investing_recurringfrequency_daily;
        }
        if (i == 2) {
            return R.string.investing_recurringfrequency_weekly;
        }
        if (i == 3) {
            return R.string.investing_recurringfrequency_biweekly;
        }
        if (i == 4) {
            return R.string.investing_recurringfrequency_monthly;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
