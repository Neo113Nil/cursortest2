package com.squareup.cash.onboarding.backend;

import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;

/* loaded from: classes4.dex */
public interface OnboardingIntegrityChecker$OnboardingIntegrityCheckResult {

    public final class Failure implements OnboardingIntegrityChecker$OnboardingIntegrityCheckResult {
        public final IntegrityCheckFactory$Type firstFailureType;

        public Failure(IntegrityCheckFactory$Type integrityCheckFactory$Type) {
            integrityCheckFactory$Type.getClass();
            this.firstFailureType = integrityCheckFactory$Type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.firstFailureType == ((Failure) obj).firstFailureType;
        }

        public final int hashCode() {
            return this.firstFailureType.hashCode();
        }

        public final String toString() {
            return "Failure(firstFailureType=" + this.firstFailureType + ")";
        }
    }

    public final class Success implements OnboardingIntegrityChecker$OnboardingIntegrityCheckResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1189195352;
        }

        public final String toString() {
            return "Success";
        }
    }
}
