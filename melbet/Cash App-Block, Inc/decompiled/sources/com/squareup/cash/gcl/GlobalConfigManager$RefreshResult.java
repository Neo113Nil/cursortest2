package com.squareup.cash.gcl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface GlobalConfigManager$RefreshResult {

    public final class Failure implements GlobalConfigManager$RefreshResult {
        public final RefreshTimeoutException exception;

        public Failure(RefreshTimeoutException refreshTimeoutException) {
            refreshTimeoutException.getClass();
            this.exception = refreshTimeoutException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public final int hashCode() {
            this.exception.getClass();
            return -1631005127;
        }

        public final String toString() {
            return "Failure(exception=" + this.exception + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class NotYetInitiated implements GlobalConfigManager$RefreshResult {
        public static final NotYetInitiated INSTANCE = new NotYetInitiated();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotYetInitiated);
        }

        public final int hashCode() {
            return -423850230;
        }

        public final String toString() {
            return "NotYetInitiated";
        }
    }

    public final class Success implements GlobalConfigManager$RefreshResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 499684791;
        }

        public final String toString() {
            return "Success";
        }
    }
}
