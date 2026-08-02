package com.squareup.cash.biometrics;

/* loaded from: classes5.dex */
public interface Biometrics$AuthenticationStatus {

    /* loaded from: classes7.dex */
    public interface AuthenticationStatusError extends Biometrics$AuthenticationStatus {
    }

    public final class BiometricsEnrolled implements Biometrics$AuthenticationStatus {
        public static final BiometricsEnrolled INSTANCE = new BiometricsEnrolled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BiometricsEnrolled);
        }

        public final int hashCode() {
            return 1980065874;
        }

        public final String toString() {
            return "BiometricsEnrolled";
        }
    }

    /* loaded from: classes7.dex */
    public final class HardwareNotSupported implements AuthenticationStatusError {
        public static final HardwareNotSupported INSTANCE = new HardwareNotSupported();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HardwareNotSupported);
        }

        public final int hashCode() {
            return -1374004907;
        }

        public final String toString() {
            return "HardwareNotSupported";
        }
    }

    /* loaded from: classes7.dex */
    public final class NoBiometricSignatures implements AuthenticationStatusError {
        public static final NoBiometricSignatures INSTANCE = new NoBiometricSignatures();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoBiometricSignatures);
        }

        public final int hashCode() {
            return 1766403104;
        }

        public final String toString() {
            return "NoBiometricSignatures";
        }
    }

    /* loaded from: classes7.dex */
    public final class OsUpdateRequired implements AuthenticationStatusError {
        public static final OsUpdateRequired INSTANCE = new OsUpdateRequired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OsUpdateRequired);
        }

        public final int hashCode() {
            return 280659902;
        }

        public final String toString() {
            return "OsUpdateRequired";
        }
    }
}
