package com.squareup.cash.security.presenters;

import androidx.core.widget.PopupWindowCompat;
import com.squareup.cash.security.screens.PasswordScreenData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordEntryState {
    public final PopupWindowCompat checkboxModel;
    public final boolean loading;
    public final PasswordScreenData passwordScreenData;

    public PasswordEntryState(boolean z, PasswordScreenData passwordScreenData, PopupWindowCompat popupWindowCompat) {
        passwordScreenData.getClass();
        this.loading = z;
        this.passwordScreenData = passwordScreenData;
        this.checkboxModel = popupWindowCompat;
    }

    public static PasswordEntryState copy$default(PasswordEntryState passwordEntryState, boolean z, PopupWindowCompat popupWindowCompat, int i) {
        if ((i & 1) != 0) {
            z = passwordEntryState.loading;
        }
        PasswordScreenData passwordScreenData = passwordEntryState.passwordScreenData;
        if ((i & 4) != 0) {
            popupWindowCompat = passwordEntryState.checkboxModel;
        }
        passwordEntryState.getClass();
        passwordScreenData.getClass();
        return new PasswordEntryState(z, passwordScreenData, popupWindowCompat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordEntryState)) {
            return false;
        }
        PasswordEntryState passwordEntryState = (PasswordEntryState) obj;
        return this.loading == passwordEntryState.loading && Intrinsics.areEqual(this.passwordScreenData, passwordEntryState.passwordScreenData) && this.checkboxModel.equals(passwordEntryState.checkboxModel);
    }

    public final int hashCode() {
        return this.checkboxModel.hashCode() + ((this.passwordScreenData.hashCode() + (Boolean.hashCode(this.loading) * 31)) * 31);
    }

    public final String toString() {
        return "PasswordEntryState(loading=" + this.loading + ", passwordScreenData=" + this.passwordScreenData + ", checkboxModel=" + this.checkboxModel + ")";
    }
}
