package com.squareup.cash.passkeys.backend;

/* loaded from: classes6.dex */
public interface PasskeyRepository$PasskeyRegistrationResult {

    public final class Cancelled implements PasskeyRepository$PasskeyRegistrationResult {
        public static final Cancelled INSTANCE = new Cancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return 1162595616;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    public final class DeviceNotSupported implements PasskeyRepository$PasskeyRegistrationResult {
        public static final DeviceNotSupported INSTANCE = new DeviceNotSupported();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceNotSupported);
        }

        public final int hashCode() {
            return 1651350946;
        }

        public final String toString() {
            return "DeviceNotSupported";
        }
    }

    public final class DuplicateCredentialOnDevice implements PasskeyRepository$PasskeyRegistrationResult {
        public static final DuplicateCredentialOnDevice INSTANCE = new DuplicateCredentialOnDevice();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DuplicateCredentialOnDevice);
        }

        public final int hashCode() {
            return 1369105670;
        }

        public final String toString() {
            return "DuplicateCredentialOnDevice";
        }
    }

    public final class Error implements PasskeyRepository$PasskeyRegistrationResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 2096674135;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Success implements PasskeyRepository$PasskeyRegistrationResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 175999890;
        }

        public final String toString() {
            return "Success";
        }
    }
}
