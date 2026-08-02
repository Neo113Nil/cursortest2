package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AccountSwitchInfoDialogViewModel {
    public final String confirmationButtonText;
    public final String subtitle;
    public final String title;

    public AccountSwitchInfoDialogViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.confirmationButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchInfoDialogViewModel)) {
            return false;
        }
        AccountSwitchInfoDialogViewModel accountSwitchInfoDialogViewModel = (AccountSwitchInfoDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, accountSwitchInfoDialogViewModel.title) && Intrinsics.areEqual(this.subtitle, accountSwitchInfoDialogViewModel.subtitle) && Intrinsics.areEqual(this.confirmationButtonText, accountSwitchInfoDialogViewModel.confirmationButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.confirmationButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.subtitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitchInfoDialogViewModel(title=", this.title, ", subtitle=", this.subtitle, ", confirmationButtonText="), this.confirmationButtonText, ")");
    }
}
