package com.squareup.cash.history.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class PasscodeDialogViewEvent {

    public final class Cancel extends PasscodeDialogViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1851950132;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class GoBack extends PasscodeDialogViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1725817023;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class Submit extends PasscodeDialogViewEvent {
        public final String passcode;

        public Submit(String str) {
            this.passcode = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Submit) && this.passcode.equals(((Submit) obj).passcode);
        }

        public final int hashCode() {
            return this.passcode.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Submit(passcode=", this.passcode, ")");
        }
    }
}
