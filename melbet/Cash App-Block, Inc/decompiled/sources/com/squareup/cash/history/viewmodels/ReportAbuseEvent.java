package com.squareup.cash.history.viewmodels;

/* loaded from: classes6.dex */
public abstract class ReportAbuseEvent {

    public final class ActionClick extends ReportAbuseEvent {
        public static final ActionClick INSTANCE = new ActionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionClick);
        }

        public final int hashCode() {
            return 208387327;
        }

        public final String toString() {
            return "ActionClick";
        }
    }

    public final class CancelClick extends ReportAbuseEvent {
        public static final CancelClick INSTANCE = new CancelClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClick);
        }

        public final int hashCode() {
            return 1347983163;
        }

        public final String toString() {
            return "CancelClick";
        }
    }
}
