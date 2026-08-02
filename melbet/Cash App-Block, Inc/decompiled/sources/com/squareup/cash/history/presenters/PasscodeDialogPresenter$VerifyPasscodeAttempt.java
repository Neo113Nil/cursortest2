package com.squareup.cash.history.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PasscodeDialogPresenter$VerifyPasscodeAttempt {
    public final String passcode;
    public final String passcodeToken;

    public PasscodeDialogPresenter$VerifyPasscodeAttempt(String str, String str2) {
        this.passcode = str;
        this.passcodeToken = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasscodeDialogPresenter$VerifyPasscodeAttempt)) {
            return false;
        }
        PasscodeDialogPresenter$VerifyPasscodeAttempt passcodeDialogPresenter$VerifyPasscodeAttempt = (PasscodeDialogPresenter$VerifyPasscodeAttempt) obj;
        return Intrinsics.areEqual(this.passcode, passcodeDialogPresenter$VerifyPasscodeAttempt.passcode) && Intrinsics.areEqual(this.passcodeToken, passcodeDialogPresenter$VerifyPasscodeAttempt.passcodeToken);
    }

    public final int hashCode() {
        String str = this.passcode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.passcodeToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("VerifyPasscodeAttempt(passcode=", this.passcode, ", passcodeToken=", this.passcodeToken, ")");
    }
}
