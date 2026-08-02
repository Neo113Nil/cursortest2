package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface ProfileCropViewEvent {

    public final class CancelClicked implements ProfileCropViewEvent {
        public static final CancelClicked INSTANCE = new CancelClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return 1744977731;
        }

        public final String toString() {
            return "CancelClicked";
        }
    }

    public final class CropFinished implements ProfileCropViewEvent {
        public static final CropFinished INSTANCE = new CropFinished();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CropFinished);
        }

        public final int hashCode() {
            return 2022798700;
        }

        public final String toString() {
            return "CropFinished";
        }
    }
}
