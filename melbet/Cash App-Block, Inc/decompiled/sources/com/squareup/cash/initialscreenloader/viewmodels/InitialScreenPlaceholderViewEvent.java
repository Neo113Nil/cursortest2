package com.squareup.cash.initialscreenloader.viewmodels;

/* loaded from: classes6.dex */
public abstract class InitialScreenPlaceholderViewEvent {

    public final class IgnoreError extends InitialScreenPlaceholderViewEvent {
        public static final IgnoreError INSTANCE = new IgnoreError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IgnoreError);
        }

        public final int hashCode() {
            return -808352072;
        }

        public final String toString() {
            return "IgnoreError";
        }
    }

    public final class RetryError extends InitialScreenPlaceholderViewEvent {
        public static final RetryError INSTANCE = new RetryError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryError);
        }

        public final int hashCode() {
            return 1118495902;
        }

        public final String toString() {
            return "RetryError";
        }
    }
}
