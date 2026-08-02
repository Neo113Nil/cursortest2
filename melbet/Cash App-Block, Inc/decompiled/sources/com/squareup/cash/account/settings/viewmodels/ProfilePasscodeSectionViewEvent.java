package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class ProfilePasscodeSectionViewEvent {

    /* loaded from: classes7.dex */
    public final class ChangePasscodeClick extends ProfilePasscodeSectionViewEvent {
        public static final ChangePasscodeClick INSTANCE = new ChangePasscodeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangePasscodeClick);
        }

        public final int hashCode() {
            return 1358469820;
        }

        public final String toString() {
            return "ChangePasscodeClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class GoBack extends ProfilePasscodeSectionViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 212229325;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class ToggleAppLock extends ProfilePasscodeSectionViewEvent {
        public final boolean isEnabled;

        public ToggleAppLock(boolean z) {
            this.isEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleAppLock) && this.isEnabled == ((ToggleAppLock) obj).isEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleAppLock(isEnabled=", ")", this.isEnabled);
        }
    }

    public final class TogglePasscode extends ProfilePasscodeSectionViewEvent {
        public final boolean isEnabled;

        public TogglePasscode(boolean z) {
            this.isEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TogglePasscode) && this.isEnabled == ((TogglePasscode) obj).isEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("TogglePasscode(isEnabled=", ")", this.isEnabled);
        }
    }

    public final class ToggleUseBiometricsForPasscode extends ProfilePasscodeSectionViewEvent {
        public final boolean isEnabled;

        public ToggleUseBiometricsForPasscode(boolean z) {
            this.isEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleUseBiometricsForPasscode) && this.isEnabled == ((ToggleUseBiometricsForPasscode) obj).isEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleUseBiometricsForPasscode(isEnabled=", ")", this.isEnabled);
        }
    }
}
