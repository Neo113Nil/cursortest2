package com.squareup.cash.profile.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AccountSelectorSectionViewModel implements NotificationSectionViewModel {
    public final ArrayList accounts;
    public final String title;

    public final class AccountViewModel {
        public final String accountToken;
        public final StackedAvatarViewModel.Single avatarViewModel;
        public final boolean isBusiness;
        public final boolean isOn;
        public final BasicShieetScope$$ExternalSyntheticLambda10 onClicked;
        public final String subtitle;
        public final String title;

        public AccountViewModel(String str, String str2, String str3, StackedAvatarViewModel.Single single, boolean z, boolean z2, BasicShieetScope$$ExternalSyntheticLambda10 basicShieetScope$$ExternalSyntheticLambda10) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.accountToken = str;
            this.title = str2;
            this.subtitle = str3;
            this.avatarViewModel = single;
            this.isBusiness = z;
            this.isOn = z2;
            this.onClicked = basicShieetScope$$ExternalSyntheticLambda10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccountViewModel) {
                AccountViewModel accountViewModel = (AccountViewModel) obj;
                return Intrinsics.areEqual(this.accountToken, accountViewModel.accountToken) && Intrinsics.areEqual(this.title, accountViewModel.title) && Intrinsics.areEqual(this.subtitle, accountViewModel.subtitle) && this.avatarViewModel.equals(accountViewModel.avatarViewModel) && this.isBusiness == accountViewModel.isBusiness && this.isOn == accountViewModel.isOn && this.onClicked == accountViewModel.onClicked;
            }
            return false;
        }

        public final int hashCode() {
            return this.onClicked.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarViewModel.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountToken.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.isBusiness), 31, this.isOn);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountViewModel(accountToken=", this.accountToken, ", title=", this.title, ", subtitle=");
            m.append(this.subtitle);
            m.append(", avatarViewModel=");
            m.append(this.avatarViewModel);
            m.append(", isBusiness=");
            re$$ExternalSyntheticOutline0.m(m, this.isBusiness, ", isOn=", this.isOn, ", onClicked=");
            m.append(this.onClicked);
            m.append(")");
            return m.toString();
        }
    }

    public AccountSelectorSectionViewModel(String str, ArrayList arrayList) {
        str.getClass();
        this.title = str;
        this.accounts = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSelectorSectionViewModel)) {
            return false;
        }
        AccountSelectorSectionViewModel accountSelectorSectionViewModel = (AccountSelectorSectionViewModel) obj;
        return Intrinsics.areEqual(this.title, accountSelectorSectionViewModel.title) && this.accounts.equals(accountSelectorSectionViewModel.accounts);
    }

    public final int hashCode() {
        return this.accounts.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.accounts, "AccountSelectorSectionViewModel(title=", this.title, ", accounts=", ")");
    }
}
