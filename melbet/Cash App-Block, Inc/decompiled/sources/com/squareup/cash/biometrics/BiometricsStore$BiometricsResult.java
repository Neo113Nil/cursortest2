package com.squareup.cash.biometrics;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.biometrics.Biometrics$Result;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class BiometricsStore$BiometricsResult {

    public final class DecryptionFailure extends BiometricsStore$BiometricsResult {
        public final Throwable cause;

        public DecryptionFailure(Throwable th) {
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DecryptionFailure) && this.cause.equals(((DecryptionFailure) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("DecryptionFailure(cause=", ")", this.cause);
        }
    }

    public final class Error extends BiometricsStore$BiometricsResult {
        public final Biometrics$Result.Error error;

        public Error(Biometrics$Result.Error error) {
            this.error = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.error.equals(((Error) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public final class PlatformException extends BiometricsStore$BiometricsResult {
        public final Throwable cause;

        public PlatformException(Throwable th) {
            th.getClass();
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlatformException) && Intrinsics.areEqual(this.cause, ((PlatformException) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("PlatformException(cause=", ")", this.cause);
        }
    }

    /* loaded from: classes9.dex */
    public final class Success extends BiometricsStore$BiometricsResult {
        public final String value;

        public Success(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.value.equals(((Success) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", this.value, ")");
        }
    }
}
