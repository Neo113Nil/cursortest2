package com.squareup.cash.account.viewmodels.accountswitcher;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountViewModel {
    public final String accountToken;
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final String businessCategory;
    public final boolean isActiveAccount;
    public final boolean isBusiness;
    public final String subtitle;
    public final String title;

    public AccountViewModel(String str, String str2, String str3, StackedAvatarViewModel.Single single, boolean z, boolean z2, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.accountToken = str;
        this.title = str2;
        this.subtitle = str3;
        this.avatarViewModel = single;
        this.isBusiness = z;
        this.isActiveAccount = z2;
        this.businessCategory = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountViewModel)) {
            return false;
        }
        AccountViewModel accountViewModel = (AccountViewModel) obj;
        return Intrinsics.areEqual(this.accountToken, accountViewModel.accountToken) && Intrinsics.areEqual(this.title, accountViewModel.title) && Intrinsics.areEqual(this.subtitle, accountViewModel.subtitle) && Intrinsics.areEqual(this.avatarViewModel, accountViewModel.avatarViewModel) && this.isBusiness == accountViewModel.isBusiness && this.isActiveAccount == accountViewModel.isActiveAccount && Intrinsics.areEqual(this.businessCategory, accountViewModel.businessCategory);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarViewModel.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountToken.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.isBusiness), 31, this.isActiveAccount);
        String str = this.businessCategory;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountViewModel(accountToken=", this.accountToken, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", avatarViewModel=");
        m.append(this.avatarViewModel);
        m.append(", isBusiness=");
        re$$ExternalSyntheticOutline0.m(m, this.isBusiness, ", isActiveAccount=", this.isActiveAccount, ", businessCategory=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.businessCategory, ")");
    }
}
