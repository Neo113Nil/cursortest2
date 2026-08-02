package com.squareup.cash.onboarding.accountpicker.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class AccountViewModel {
    public final String accountToken;
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final boolean isBusiness;
    public final boolean isInSwipeToRemoveMode;
    public final String subtitle;
    public final String title;

    public AccountViewModel(String str, String str2, String str3, StackedAvatarViewModel.Single single, boolean z, boolean z2) {
        this.accountToken = str;
        this.title = str2;
        this.subtitle = str3;
        this.avatarViewModel = single;
        this.isInSwipeToRemoveMode = z;
        this.isBusiness = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountViewModel)) {
            return false;
        }
        AccountViewModel accountViewModel = (AccountViewModel) obj;
        return this.accountToken.equals(accountViewModel.accountToken) && this.title.equals(accountViewModel.title) && this.subtitle.equals(accountViewModel.subtitle) && this.avatarViewModel.equals(accountViewModel.avatarViewModel) && this.isInSwipeToRemoveMode == accountViewModel.isInSwipeToRemoveMode && this.isBusiness == accountViewModel.isBusiness;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBusiness) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarViewModel.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountToken.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.isInSwipeToRemoveMode);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountViewModel(accountToken=", this.accountToken, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", avatarViewModel=");
        m.append(this.avatarViewModel);
        m.append(", isInSwipeToRemoveMode=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isInSwipeToRemoveMode, ", isBusiness=", this.isBusiness, ")");
    }
}
