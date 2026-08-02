package com.squareup.cash.cameralauncher;

/* loaded from: classes5.dex */
public interface CameraResult {

    public final class Canceled implements CameraResult {
        public static final Canceled INSTANCE = new Canceled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 1923617646;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    public final class Success implements CameraResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 969802382;
        }

        public final String toString() {
            return "Success";
        }
    }
}
