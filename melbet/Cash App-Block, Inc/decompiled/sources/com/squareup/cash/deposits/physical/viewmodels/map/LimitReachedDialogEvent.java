package com.squareup.cash.deposits.physical.viewmodels.map;

/* loaded from: classes6.dex */
public abstract class LimitReachedDialogEvent {

    public final class ActionNegativeClick extends LimitReachedDialogEvent {
        public static final ActionNegativeClick INSTANCE = new ActionNegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionNegativeClick);
        }

        public final int hashCode() {
            return 1487350921;
        }

        public final String toString() {
            return "ActionNegativeClick";
        }
    }

    public final class ActionPositiveClick extends LimitReachedDialogEvent {
        public static final ActionPositiveClick INSTANCE = new ActionPositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionPositiveClick);
        }

        public final int hashCode() {
            return 530684229;
        }

        public final String toString() {
            return "ActionPositiveClick";
        }
    }
}
