package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.api.HelpItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class PasscodeViewEvent {

    public final class BackPressed extends PasscodeViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -678793048;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class ForgotPasscode extends PasscodeViewEvent {
        public static final ForgotPasscode INSTANCE = new ForgotPasscode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ForgotPasscode);
        }

        public final int hashCode() {
            return -361853132;
        }

        public final String toString() {
            return "ForgotPasscode";
        }
    }

    public final class HelpButtonClick extends PasscodeViewEvent {
        public static final HelpButtonClick INSTANCE = new HelpButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonClick);
        }

        public final int hashCode() {
            return 1814268002;
        }

        public final String toString() {
            return "HelpButtonClick";
        }
    }

    public final class HelpClick extends PasscodeViewEvent {
        public final HelpItem item;

        public HelpClick(HelpItem helpItem) {
            helpItem.getClass();
            this.item = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpClick) && Intrinsics.areEqual(this.item, ((HelpClick) obj).item);
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "HelpClick(item=" + this.item + ")";
        }
    }

    public abstract class VerifyPasscode extends PasscodeViewEvent {

        public final class WithFingerprint extends VerifyPasscode {
            public final String passcodeToken;

            public WithFingerprint(String str) {
                str.getClass();
                this.passcodeToken = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WithFingerprint) && Intrinsics.areEqual(this.passcodeToken, ((WithFingerprint) obj).passcodeToken);
            }

            public final int hashCode() {
                return this.passcodeToken.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithFingerprint(passcodeToken=", this.passcodeToken, ")");
            }
        }

        public final class WithoutFingerprint extends VerifyPasscode {
            public final String passcode;

            public WithoutFingerprint(String str) {
                str.getClass();
                this.passcode = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WithoutFingerprint) && Intrinsics.areEqual(this.passcode, ((WithoutFingerprint) obj).passcode);
            }

            public final int hashCode() {
                return this.passcode.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithoutFingerprint(passcode=", this.passcode, ")");
            }
        }
    }
}
