package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface CardStudioMoreSheetViewEvent {

    public final class Dismiss implements CardStudioMoreSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 205565652;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class DoneClicked implements CardStudioMoreSheetViewEvent {
        public static final DoneClicked INSTANCE = new DoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneClicked);
        }

        public final int hashCode() {
            return 985740687;
        }

        public final String toString() {
            return "DoneClicked";
        }
    }

    public final class StartOver implements CardStudioMoreSheetViewEvent {
        public static final StartOver INSTANCE = new StartOver();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartOver);
        }

        public final int hashCode() {
            return 1986168352;
        }

        public final String toString() {
            return "StartOver";
        }
    }

    public final class ToggleCashtag implements CardStudioMoreSheetViewEvent {
        public static final ToggleCashtag INSTANCE = new ToggleCashtag();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleCashtag);
        }

        public final int hashCode() {
            return 1484121693;
        }

        public final String toString() {
            return "ToggleCashtag";
        }
    }
}
