package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountInviteButton {
    public static final AccountInviteButton Hidden = new AccountInviteButton("", "", false);
    public final boolean isVisible;
    public final String subtitle;
    public final String title;

    public AccountInviteButton(String str, String str2, boolean z) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.isVisible = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInviteButton)) {
            return false;
        }
        AccountInviteButton accountInviteButton = (AccountInviteButton) obj;
        return Intrinsics.areEqual(this.title, accountInviteButton.title) && this.subtitle.equals(accountInviteButton.subtitle) && this.isVisible == accountInviteButton.isVisible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isVisible) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountInviteButton(title=", this.title, ", subtitle=", this.subtitle, ", isVisible="), this.isVisible, ")");
    }
}
