package com.squareup.cash.blockers.presenters;

/* loaded from: classes6.dex */
public abstract class BlockerImageUploader$State {

    public final class Failure extends BlockerImageUploader$State {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 141445614;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class InProgress extends BlockerImageUploader$State {
        public static final InProgress INSTANCE = new InProgress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InProgress);
        }

        public final int hashCode() {
            return -1940218994;
        }

        public final String toString() {
            return "InProgress";
        }
    }

    public final class Success extends BlockerImageUploader$State {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -639149977;
        }

        public final String toString() {
            return "Success";
        }
    }
}
