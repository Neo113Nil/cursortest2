package com.squareup.cash.data.profile;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public abstract class PasscodeSettings {

    public final class Default extends PasscodeSettings {
        public static final Default INSTANCE = new Default();

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getAppLockActivated() {
            return false;
        }

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getHasPasscode() {
            return false;
        }

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getRequirePasscodeConfirmation() {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public final class Loaded extends PasscodeSettings {
        public final boolean appLockActivated;
        public final boolean hasPasscode;
        public final boolean requirePasscodeConfirmation;

        public Loaded(boolean z, boolean z2, boolean z3) {
            this.hasPasscode = z;
            this.requirePasscodeConfirmation = z2;
            this.appLockActivated = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.hasPasscode == loaded.hasPasscode && this.requirePasscodeConfirmation == loaded.requirePasscodeConfirmation && this.appLockActivated == loaded.appLockActivated;
        }

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getAppLockActivated() {
            return this.appLockActivated;
        }

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getHasPasscode() {
            return this.hasPasscode;
        }

        @Override // com.squareup.cash.data.profile.PasscodeSettings
        public final boolean getRequirePasscodeConfirmation() {
            return this.requirePasscodeConfirmation;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.appLockActivated) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.hasPasscode) * 31, 31, this.requirePasscodeConfirmation);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Loaded(hasPasscode=", ", requirePasscodeConfirmation=", ", appLockActivated=", this.hasPasscode, this.requirePasscodeConfirmation), this.appLockActivated, ")");
        }
    }

    public abstract boolean getAppLockActivated();

    public abstract boolean getHasPasscode();

    public abstract boolean getRequirePasscodeConfirmation();
}
