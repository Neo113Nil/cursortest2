package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface CalendarBlockerViewEvent {

    public final class ActionButtonClicked implements CalendarBlockerViewEvent {
        public static final ActionButtonClicked INSTANCE = new ActionButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionButtonClicked);
        }

        public final int hashCode() {
            return -434592378;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* loaded from: classes5.dex */
    public final class DateSelected implements CalendarBlockerViewEvent {
        public final LocalDate date;

        public DateSelected(LocalDate localDate) {
            localDate.getClass();
            this.date = localDate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateSelected) && Intrinsics.areEqual(this.date, ((DateSelected) obj).date);
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final String toString() {
            return "DateSelected(date=" + this.date + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class ToggleOption implements CalendarBlockerViewEvent {
        public final boolean toggledOn;

        public ToggleOption(boolean z) {
            this.toggledOn = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleOption) && this.toggledOn == ((ToggleOption) obj).toggledOn;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggledOn);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleOption(toggledOn=", ")", this.toggledOn);
        }
    }

    public final class ToolbarButtonClicked implements CalendarBlockerViewEvent {
        public static final ToolbarButtonClicked INSTANCE = new ToolbarButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToolbarButtonClicked);
        }

        public final int hashCode() {
            return -19500493;
        }

        public final String toString() {
            return "ToolbarButtonClicked";
        }
    }
}
