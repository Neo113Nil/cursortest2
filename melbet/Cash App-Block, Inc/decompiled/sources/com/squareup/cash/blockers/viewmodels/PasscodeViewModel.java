package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.biometrics.Biometrics$Info;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface PasscodeViewModel {

    /* loaded from: classes5.dex */
    public final class Content implements PasscodeViewModel {
        public final int attempt;
        public final String helpButtonText;
        public final boolean isDismissEnabled;
        public final int passcodeLength;
        public final String subText;
        public final String title;

        public Content(int i, int i2, String str, String str2, String str3, boolean z) {
            str.getClass();
            this.title = str;
            this.subText = str2;
            this.passcodeLength = i;
            this.helpButtonText = str3;
            this.attempt = i2;
            this.isDismissEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subText, content.subText) && this.passcodeLength == content.passcodeLength && Intrinsics.areEqual(this.helpButtonText, content.helpButtonText) && this.attempt == content.attempt && this.isDismissEnabled == content.isDismissEnabled;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subText;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.passcodeLength, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.helpButtonText;
            return Boolean.hashCode(this.isDismissEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.attempt, (m + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subText=", this.subText, ", passcodeLength=");
            m.append(this.passcodeLength);
            m.append(", helpButtonText=");
            m.append(this.helpButtonText);
            m.append(", attempt=");
            m.append(this.attempt);
            m.append(", isDismissEnabled=");
            m.append(this.isDismissEnabled);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements PasscodeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1717198008;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public abstract class VerifyPasscodeModel {

        public final class BiometricsPrompt extends VerifyPasscodeModel {
            public final Biometrics$Info info;

            public BiometricsPrompt(Biometrics$Info biometrics$Info) {
                this.info = biometrics$Info;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BiometricsPrompt) && this.info.equals(((BiometricsPrompt) obj).info);
            }

            public final int hashCode() {
                return this.info.hashCode();
            }

            public final String toString() {
                return "BiometricsPrompt(info=" + this.info + ")";
            }
        }

        public final class InvalidPasscode extends VerifyPasscodeModel {
            public final boolean usedFingerprint;

            public InvalidPasscode(boolean z) {
                this.usedFingerprint = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvalidPasscode) && this.usedFingerprint == ((InvalidPasscode) obj).usedFingerprint;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.usedFingerprint);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("InvalidPasscode(usedFingerprint=", ")", this.usedFingerprint);
            }
        }

        public final class PasscodeVerificationFailed extends VerifyPasscodeModel {
            public static final PasscodeVerificationFailed INSTANCE = new PasscodeVerificationFailed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PasscodeVerificationFailed);
            }

            public final int hashCode() {
                return 1641545878;
            }

            public final String toString() {
                return "PasscodeVerificationFailed";
            }
        }

        public final class VerifyingPasscode extends VerifyPasscodeModel {
            public static final VerifyingPasscode INSTANCE = new VerifyingPasscode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof VerifyingPasscode);
            }

            public final int hashCode() {
                return 846284071;
            }

            public final String toString() {
                return "VerifyingPasscode";
            }
        }
    }
}
