package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface CameraPermissionViewEvent {

    public final class NegativeClick implements CameraPermissionViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return 213258346;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements CameraPermissionViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return -743408346;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
