package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface CardStudioUndoViewEvent {

    public final class Cancel implements CardStudioUndoViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1837688124;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Undo implements CardStudioUndoViewEvent {
        public static final Undo INSTANCE = new Undo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undo);
        }

        public final int hashCode() {
            return 1714835374;
        }

        public final String toString() {
            return "Undo";
        }
    }
}
