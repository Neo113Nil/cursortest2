package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfilePasswordDialogViewModel$MessageDialog {
    public final String message;

    public ProfilePasswordDialogViewModel$MessageDialog(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfilePasswordDialogViewModel$MessageDialog) && Intrinsics.areEqual(this.message, ((ProfilePasswordDialogViewModel$MessageDialog) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageDialog(message=", this.message, ")");
    }
}
