package com.squareup.cash.blockers.presenters;

/* loaded from: classes4.dex */
public abstract class SetNamePresenter$SubmitNameResult {

    public final class NotSuccessful extends SetNamePresenter$SubmitNameResult {
        public static final NotSuccessful INSTANCE = new NotSuccessful();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotSuccessful);
        }

        public final int hashCode() {
            return -2082441550;
        }

        public final String toString() {
            return "NotSuccessful";
        }
    }

    public final class Successful extends SetNamePresenter$SubmitNameResult {
        public static final Successful INSTANCE = new Successful();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Successful);
        }

        public final int hashCode() {
            return -838308907;
        }

        public final String toString() {
            return "Successful";
        }
    }
}
