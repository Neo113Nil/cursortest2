package com.squareup.cash.fidesmo.presenters;

import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ActivationResult {

    public final class Activating implements ActivationResult {
        public static final Activating INSTANCE = new Activating();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Activating);
        }

        public final int hashCode() {
            return -1512549001;
        }

        public final String toString() {
            return "Activating";
        }
    }

    public final class Completed implements ActivationResult {
        public final SuccessScreen successScreen;

        public Completed(SuccessScreen successScreen) {
            this.successScreen = successScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.successScreen, ((Completed) obj).successScreen);
        }

        public final int hashCode() {
            SuccessScreen successScreen = this.successScreen;
            if (successScreen == null) {
                return 0;
            }
            return successScreen.hashCode();
        }

        public final String toString() {
            return "Completed(successScreen=" + this.successScreen + ")";
        }
    }

    public final class Denied implements ActivationResult {
        public final FidesmoProvisioningBlocker.ErrorUiConfig errorConfig;

        public Denied(FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig) {
            this.errorConfig = errorUiConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Denied) && Intrinsics.areEqual(this.errorConfig, ((Denied) obj).errorConfig);
        }

        public final int hashCode() {
            FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = this.errorConfig;
            if (errorUiConfig == null) {
                return 0;
            }
            return errorUiConfig.hashCode();
        }

        public final String toString() {
            return "Denied(errorConfig=" + this.errorConfig + ")";
        }
    }

    public final class Failed implements ActivationResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1685701700;
        }

        public final String toString() {
            return "Failed";
        }
    }
}
