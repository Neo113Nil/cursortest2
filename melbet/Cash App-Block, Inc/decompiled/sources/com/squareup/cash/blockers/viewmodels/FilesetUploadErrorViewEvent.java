package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface FilesetUploadErrorViewEvent {

    public final class Cancel implements FilesetUploadErrorViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 371835824;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Retry implements FilesetUploadErrorViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -528216398;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
