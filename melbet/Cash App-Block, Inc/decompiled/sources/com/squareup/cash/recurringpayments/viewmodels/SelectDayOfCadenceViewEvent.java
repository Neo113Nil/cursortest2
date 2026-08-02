package com.squareup.cash.recurringpayments.viewmodels;

import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SelectDayOfCadenceViewEvent {

    public final class SelectDayOfCadenceOption extends SelectDayOfCadenceViewEvent {
        public final int dayOfCadence;

        public SelectDayOfCadenceOption(int i) {
            this.dayOfCadence = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectDayOfCadenceOption) && this.dayOfCadence == ((SelectDayOfCadenceOption) obj).dayOfCadence;
        }

        public final int hashCode() {
            return Integer.hashCode(this.dayOfCadence);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dayOfCadence, "SelectDayOfCadenceOption(dayOfCadence=", ")");
        }
    }

    public final class SelectDayPicker extends SelectDayOfCadenceViewEvent {
        public final RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayPicker;

        public SelectDayPicker(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu) {
            this.dayPicker = dayOfCadenceMenu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectDayPicker) && Intrinsics.areEqual(this.dayPicker, ((SelectDayPicker) obj).dayPicker);
        }

        public final int hashCode() {
            RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = this.dayPicker;
            if (dayOfCadenceMenu == null) {
                return 0;
            }
            return dayOfCadenceMenu.hashCode();
        }

        public final String toString() {
            return "SelectDayPicker(dayPicker=" + this.dayPicker + ")";
        }
    }

    public final class TapBack extends SelectDayOfCadenceViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 95401518;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapClose extends SelectDayOfCadenceViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return -1336257135;
        }

        public final String toString() {
            return "TapClose";
        }
    }
}
