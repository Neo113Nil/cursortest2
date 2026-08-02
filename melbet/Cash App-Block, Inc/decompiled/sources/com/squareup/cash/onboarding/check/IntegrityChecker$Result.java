package com.squareup.cash.onboarding.check;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class IntegrityChecker$Result {

    public final class Aborted extends IntegrityChecker$Result {
        public final IntegrityCheck integrityCheck;

        public Aborted(IntegrityCheck integrityCheck) {
            integrityCheck.getClass();
            this.integrityCheck = integrityCheck;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Aborted) && Intrinsics.areEqual(this.integrityCheck, ((Aborted) obj).integrityCheck);
        }

        @Override // com.squareup.cash.onboarding.check.IntegrityChecker$Result
        public final IntegrityCheck getIntegrityCheck() {
            return this.integrityCheck;
        }

        public final int hashCode() {
            return this.integrityCheck.hashCode();
        }

        public final String toString() {
            return "Aborted(integrityCheck=" + this.integrityCheck + ")";
        }
    }

    public final class Failure extends IntegrityChecker$Result {
        public final IntegrityCheck integrityCheck;

        public Failure(IntegrityCheck integrityCheck) {
            integrityCheck.getClass();
            this.integrityCheck = integrityCheck;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.integrityCheck, ((Failure) obj).integrityCheck);
        }

        @Override // com.squareup.cash.onboarding.check.IntegrityChecker$Result
        public final IntegrityCheck getIntegrityCheck() {
            return this.integrityCheck;
        }

        public final int hashCode() {
            return this.integrityCheck.hashCode();
        }

        public final String toString() {
            return "Failure(integrityCheck=" + this.integrityCheck + ")";
        }
    }

    public final class Success extends IntegrityChecker$Result {
        public final IntegrityCheck integrityCheck;

        public Success(IntegrityCheck integrityCheck) {
            integrityCheck.getClass();
            this.integrityCheck = integrityCheck;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.integrityCheck, ((Success) obj).integrityCheck);
        }

        @Override // com.squareup.cash.onboarding.check.IntegrityChecker$Result
        public final IntegrityCheck getIntegrityCheck() {
            return this.integrityCheck;
        }

        public final int hashCode() {
            return this.integrityCheck.hashCode();
        }

        public final String toString() {
            return "Success(integrityCheck=" + this.integrityCheck + ")";
        }
    }

    public abstract IntegrityCheck getIntegrityCheck();
}
