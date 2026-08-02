package androidx.work.impl.constraints;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public abstract class ConstraintsState {

    public final class ConstraintsMet extends ConstraintsState {
        public static final ConstraintsMet INSTANCE = new ConstraintsMet();
    }

    /* loaded from: classes3.dex */
    public final class ConstraintsNotMet extends ConstraintsState {
        public final int reason;

        public ConstraintsNotMet(int i) {
            this.reason = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.reason == ((ConstraintsNotMet) obj).reason;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return Integer.hashCode(this.reason);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("ConstraintsNotMet(reason="), this.reason, ')');
        }
    }
}
