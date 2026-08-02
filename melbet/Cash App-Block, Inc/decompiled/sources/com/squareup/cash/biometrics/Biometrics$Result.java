package com.squareup.cash.biometrics;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface Biometrics$Result {

    public interface Error extends Biometrics$Result {

        public final class Generic implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public Generic(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return this.errorCode == generic.errorCode && Intrinsics.areEqual(this.errorString, generic.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "Generic(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class HardwareUnavailable implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public HardwareUnavailable(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HardwareUnavailable)) {
                    return false;
                }
                HardwareUnavailable hardwareUnavailable = (HardwareUnavailable) obj;
                return this.errorCode == hardwareUnavailable.errorCode && Intrinsics.areEqual(this.errorString, hardwareUnavailable.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "HardwareUnavailable(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class Lockout implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public Lockout(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Lockout)) {
                    return false;
                }
                Lockout lockout = (Lockout) obj;
                return this.errorCode == lockout.errorCode && Intrinsics.areEqual(this.errorString, lockout.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "Lockout(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class NegativeButton implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public NegativeButton(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NegativeButton)) {
                    return false;
                }
                NegativeButton negativeButton = (NegativeButton) obj;
                return this.errorCode == negativeButton.errorCode && Intrinsics.areEqual(this.errorString, negativeButton.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "NegativeButton(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class NoBiometricSignaturesFound implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public NoBiometricSignaturesFound(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoBiometricSignaturesFound)) {
                    return false;
                }
                NoBiometricSignaturesFound noBiometricSignaturesFound = (NoBiometricSignaturesFound) obj;
                return this.errorCode == noBiometricSignaturesFound.errorCode && Intrinsics.areEqual(this.errorString, noBiometricSignaturesFound.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "NoBiometricSignaturesFound(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class NoDeviceCredentials implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public NoDeviceCredentials(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoDeviceCredentials)) {
                    return false;
                }
                NoDeviceCredentials noDeviceCredentials = (NoDeviceCredentials) obj;
                return this.errorCode == noDeviceCredentials.errorCode && Intrinsics.areEqual(this.errorString, noDeviceCredentials.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "NoDeviceCredentials(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class NoSpace implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public NoSpace(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoSpace)) {
                    return false;
                }
                NoSpace noSpace = (NoSpace) obj;
                return this.errorCode == noSpace.errorCode && Intrinsics.areEqual(this.errorString, noSpace.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "NoSpace(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class SystemCanceled implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public SystemCanceled(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SystemCanceled)) {
                    return false;
                }
                SystemCanceled systemCanceled = (SystemCanceled) obj;
                return this.errorCode == systemCanceled.errorCode && Intrinsics.areEqual(this.errorString, systemCanceled.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "SystemCanceled(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class Timeout implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public Timeout(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Timeout)) {
                    return false;
                }
                Timeout timeout = (Timeout) obj;
                return this.errorCode == timeout.errorCode && Intrinsics.areEqual(this.errorString, timeout.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "Timeout(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class UnableToProcess implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public UnableToProcess(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnableToProcess)) {
                    return false;
                }
                UnableToProcess unableToProcess = (UnableToProcess) obj;
                return this.errorCode == unableToProcess.errorCode && Intrinsics.areEqual(this.errorString, unableToProcess.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "UnableToProcess(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        public final class UserCanceled implements Error {
            public final int errorCode;
            public final CharSequence errorString;

            public UserCanceled(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.errorCode = i;
                this.errorString = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserCanceled)) {
                    return false;
                }
                UserCanceled userCanceled = (UserCanceled) obj;
                return this.errorCode == userCanceled.errorCode && Intrinsics.areEqual(this.errorString, userCanceled.errorString);
            }

            @Override // com.squareup.cash.biometrics.Biometrics$Result.Error
            public final CharSequence getErrorString() {
                return this.errorString;
            }

            public final int hashCode() {
                return this.errorString.hashCode() + (Integer.hashCode(this.errorCode) * 31);
            }

            public final String toString() {
                return "UserCanceled(errorCode=" + this.errorCode + ", errorString=" + ((Object) this.errorString) + ")";
            }
        }

        CharSequence getErrorString();
    }

    public final class Failure implements Biometrics$Result {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1960418347;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class PlatformException implements Biometrics$Result {
        public final Exception throwable;

        public PlatformException(Exception exc) {
            this.throwable = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlatformException) && this.throwable.equals(((PlatformException) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return "PlatformException(throwable=" + this.throwable + ")";
        }
    }

    public final class Success implements Biometrics$Result {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1179822756;
        }

        public final String toString() {
            return "Success";
        }
    }
}
