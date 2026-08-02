package com.squareup.cash.security.viewmodels;

import com.squareup.cash.security.screens.PasswordDialogScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PasswordDialogViewModel {

    public final class LoadPasswordDialog implements PasswordDialogViewModel {
        public final PasswordDialogScreen.PasswordDialog passwordDialog;

        public LoadPasswordDialog(PasswordDialogScreen.PasswordDialog passwordDialog) {
            passwordDialog.getClass();
            this.passwordDialog = passwordDialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadPasswordDialog) && Intrinsics.areEqual(this.passwordDialog, ((LoadPasswordDialog) obj).passwordDialog);
        }

        public final int hashCode() {
            return this.passwordDialog.hashCode();
        }

        public final String toString() {
            return "LoadPasswordDialog(passwordDialog=" + this.passwordDialog + ")";
        }
    }
}
