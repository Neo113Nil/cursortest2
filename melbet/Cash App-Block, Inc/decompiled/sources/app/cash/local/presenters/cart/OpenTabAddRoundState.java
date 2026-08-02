package app.cash.local.presenters.cart;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface OpenTabAddRoundState {

    public final class Failure implements OpenTabAddRoundState {
        public final int attemptId;

        public Failure(int i) {
            this.attemptId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.attemptId == ((Failure) obj).attemptId;
        }

        @Override // app.cash.local.presenters.cart.OpenTabAddRoundState
        public final int getAttemptId() {
            return this.attemptId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.attemptId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.attemptId, "Failure(attemptId=", ")");
        }
    }

    public final class Idle implements OpenTabAddRoundState {
        public final int attemptId;

        public Idle(int i) {
            this.attemptId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Idle) && this.attemptId == ((Idle) obj).attemptId;
        }

        @Override // app.cash.local.presenters.cart.OpenTabAddRoundState
        public final int getAttemptId() {
            return this.attemptId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.attemptId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.attemptId, "Idle(attemptId=", ")");
        }
    }

    public final class Ordered implements OpenTabAddRoundState {
        public final int attemptId;
        public final int itemCount;

        public Ordered(int i, int i2) {
            this.itemCount = i;
            this.attemptId = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ordered)) {
                return false;
            }
            Ordered ordered = (Ordered) obj;
            return this.itemCount == ordered.itemCount && this.attemptId == ordered.attemptId;
        }

        @Override // app.cash.local.presenters.cart.OpenTabAddRoundState
        public final int getAttemptId() {
            return this.attemptId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.attemptId) + (Integer.hashCode(this.itemCount) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.itemCount, this.attemptId, "Ordered(itemCount=", ", attemptId=", ")");
        }
    }

    public final class Ordering implements OpenTabAddRoundState {
        public final int attemptId;
        public final int itemCount;

        public Ordering(int i, int i2) {
            this.itemCount = i;
            this.attemptId = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ordering)) {
                return false;
            }
            Ordering ordering = (Ordering) obj;
            return this.itemCount == ordering.itemCount && this.attemptId == ordering.attemptId;
        }

        @Override // app.cash.local.presenters.cart.OpenTabAddRoundState
        public final int getAttemptId() {
            return this.attemptId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.attemptId) + (Integer.hashCode(this.itemCount) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.itemCount, this.attemptId, "Ordering(itemCount=", ", attemptId=", ")");
        }
    }

    int getAttemptId();
}
