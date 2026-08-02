package com.squareup.cash.security.viewmodels;

import com.squareup.cash.security.screens.PasswordDialogScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordDialogViewEvent$ButtonClick {
    public final PasswordDialogScreen.PasswordDialog.Button button;

    public PasswordDialogViewEvent$ButtonClick(PasswordDialogScreen.PasswordDialog.Button button) {
        button.getClass();
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordDialogViewEvent$ButtonClick) && Intrinsics.areEqual(this.button, ((PasswordDialogViewEvent$ButtonClick) obj).button);
    }

    public final int hashCode() {
        return this.button.hashCode();
    }

    public final String toString() {
        return "ButtonClick(button=" + this.button + ")";
    }
}
