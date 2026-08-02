package com.squareup.cash.account.settings.viewmodels.trustedcontact;

import androidx.biometric.AuthenticatorUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TrustedContactSettingViewModel {
    public final AuthenticatorUtils actionRow;
    public final String description;
    public final String title;

    public TrustedContactSettingViewModel(String str, String str2, AuthenticatorUtils authenticatorUtils) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
        this.actionRow = authenticatorUtils;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedContactSettingViewModel)) {
            return false;
        }
        TrustedContactSettingViewModel trustedContactSettingViewModel = (TrustedContactSettingViewModel) obj;
        return Intrinsics.areEqual(this.title, trustedContactSettingViewModel.title) && Intrinsics.areEqual(this.description, trustedContactSettingViewModel.description) && this.actionRow.equals(trustedContactSettingViewModel.actionRow);
    }

    public final int hashCode() {
        return this.actionRow.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TrustedContactSettingViewModel(title=", this.title, ", description=", this.description, ", actionRow=");
        m.append(this.actionRow);
        m.append(")");
        return m.toString();
    }
}
