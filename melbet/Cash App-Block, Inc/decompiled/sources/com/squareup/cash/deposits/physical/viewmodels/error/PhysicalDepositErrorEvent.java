package com.squareup.cash.deposits.physical.viewmodels.error;

/* loaded from: classes6.dex */
public abstract class PhysicalDepositErrorEvent {

    public final class ActionNegativeClick extends PhysicalDepositErrorEvent {
        public static final ActionNegativeClick INSTANCE = new ActionNegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionNegativeClick);
        }

        public final int hashCode() {
            return 1621392179;
        }

        public final String toString() {
            return "ActionNegativeClick";
        }
    }

    public final class ActionPositiveClick extends PhysicalDepositErrorEvent {
        public static final ActionPositiveClick INSTANCE = new ActionPositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionPositiveClick);
        }

        public final int hashCode() {
            return 664725487;
        }

        public final String toString() {
            return "ActionPositiveClick";
        }
    }
}
