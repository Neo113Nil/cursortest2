package com.squareup.cash.history.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.versioned.Versioned;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PasscodeDialogViewModel {
    public final boolean loading;
    public final int passcodeLength;
    public final Versioned resetInvalidInput;
    public final String title;

    public PasscodeDialogViewModel(String str, int i, boolean z, Versioned versioned) {
        str.getClass();
        this.title = str;
        this.passcodeLength = i;
        this.loading = z;
        this.resetInvalidInput = versioned;
    }

    public static PasscodeDialogViewModel copy$default(PasscodeDialogViewModel passcodeDialogViewModel, String str, boolean z, Versioned versioned, int i) {
        if ((i & 1) != 0) {
            str = passcodeDialogViewModel.title;
        }
        int i2 = passcodeDialogViewModel.passcodeLength;
        if ((i & 8) != 0) {
            versioned = passcodeDialogViewModel.resetInvalidInput;
        }
        passcodeDialogViewModel.getClass();
        str.getClass();
        return new PasscodeDialogViewModel(str, i2, z, versioned);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasscodeDialogViewModel)) {
            return false;
        }
        PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, passcodeDialogViewModel.title) && this.passcodeLength == passcodeDialogViewModel.passcodeLength && this.loading == passcodeDialogViewModel.loading && Intrinsics.areEqual(this.resetInvalidInput, passcodeDialogViewModel.resetInvalidInput);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.passcodeLength, this.title.hashCode() * 31, 31), 31, this.loading);
        Versioned versioned = this.resetInvalidInput;
        return m + (versioned == null ? 0 : versioned.hashCode());
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("PasscodeDialogViewModel(title=", this.passcodeLength, this.title, ", passcodeLength=", ", loading=");
        m.append(this.loading);
        m.append(", resetInvalidInput=");
        m.append(this.resetInvalidInput);
        m.append(")");
        return m.toString();
    }
}
