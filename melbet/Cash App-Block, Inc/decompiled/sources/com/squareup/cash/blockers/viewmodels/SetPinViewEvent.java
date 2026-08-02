package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class SetPinViewEvent {

    public final class ForgotPasscodeHelpItemSelected extends SetPinViewEvent {
        public static final ForgotPasscodeHelpItemSelected INSTANCE = new ForgotPasscodeHelpItemSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ForgotPasscodeHelpItemSelected);
        }

        public final int hashCode() {
            return 1998006872;
        }

        public final String toString() {
            return "ForgotPasscodeHelpItemSelected";
        }
    }

    public final class HelpButtonClicked extends SetPinViewEvent {
        public static final HelpButtonClicked INSTANCE = new HelpButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonClicked);
        }

        public final int hashCode() {
            return -1864468468;
        }

        public final String toString() {
            return "HelpButtonClicked";
        }
    }

    public final class PrimaryButtonClicked extends SetPinViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return -1380283013;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    public final class SubmitPin extends SetPinViewEvent {
        public final String pin;

        public SubmitPin(String str) {
            str.getClass();
            this.pin = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitPin) && Intrinsics.areEqual(this.pin, ((SubmitPin) obj).pin);
        }

        public final int hashCode() {
            return this.pin.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitPin(pin=", this.pin, ")");
        }
    }
}
