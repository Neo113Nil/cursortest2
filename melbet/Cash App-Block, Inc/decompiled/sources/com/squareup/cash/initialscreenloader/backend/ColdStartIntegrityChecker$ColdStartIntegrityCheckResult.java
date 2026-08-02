package com.squareup.cash.initialscreenloader.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ColdStartIntegrityChecker$ColdStartIntegrityCheckResult {

    public final class Failure implements ColdStartIntegrityChecker$ColdStartIntegrityCheckResult {
        public final IntegrityChecker$Result.Failure mandatoryCheckFailure;
        public final ArrayList optionalCheckFailures;

        public Failure(IntegrityChecker$Result.Failure failure, ArrayList arrayList) {
            failure.getClass();
            this.mandatoryCheckFailure = failure;
            this.optionalCheckFailures = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.mandatoryCheckFailure, failure.mandatoryCheckFailure) && this.optionalCheckFailures.equals(failure.optionalCheckFailures);
        }

        public final int hashCode() {
            return this.optionalCheckFailures.hashCode() + (this.mandatoryCheckFailure.integrityCheck.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(mandatoryCheckFailure=" + this.mandatoryCheckFailure + ", optionalCheckFailures=" + this.optionalCheckFailures + ")";
        }
    }

    public final class Success implements ColdStartIntegrityChecker$ColdStartIntegrityCheckResult {
        public final List optionalCheckFailures;

        public Success(List list) {
            list.getClass();
            this.optionalCheckFailures = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.optionalCheckFailures, ((Success) obj).optionalCheckFailures);
        }

        public final int hashCode() {
            return this.optionalCheckFailures.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(optionalCheckFailures=", ")", this.optionalCheckFailures);
        }
    }
}
