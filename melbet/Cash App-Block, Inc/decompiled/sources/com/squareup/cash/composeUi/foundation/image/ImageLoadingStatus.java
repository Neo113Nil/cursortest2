package com.squareup.cash.composeUi.foundation.image;

/* loaded from: classes6.dex */
public abstract class ImageLoadingStatus {

    public final class Error extends ImageLoadingStatus {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1691039487;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Succeeded extends ImageLoadingStatus {
        public static final Succeeded INSTANCE = new Succeeded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Succeeded);
        }

        public final int hashCode() {
            return 379098330;
        }

        public final String toString() {
            return "Succeeded";
        }
    }

    public final class Unloaded extends ImageLoadingStatus {
        public static final Unloaded INSTANCE = new Unloaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unloaded);
        }

        public final int hashCode() {
            return 601989701;
        }

        public final String toString() {
            return "Unloaded";
        }
    }
}
