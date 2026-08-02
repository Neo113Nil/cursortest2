package com.squareup.cash.account.viewmodels.accountswitcher;

import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AccountSwitcherViewModel {

    public final class Loaded extends AccountSwitcherViewModel {
        public final List accountViewModels;
        public final SettingVisibility addAccountVisibility;
        public final AccountCreationConfig createBusinessAccountConfig;
        public final SettingVisibility createPersonalAccountVisibility;

        public final class AccountCreationConfig {
            public final String body;
            public final String title;
            public final SettingVisibility visibility;

            public AccountCreationConfig(String str, String str2, SettingVisibility settingVisibility) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.body = str2;
                this.visibility = settingVisibility;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AccountCreationConfig)) {
                    return false;
                }
                AccountCreationConfig accountCreationConfig = (AccountCreationConfig) obj;
                return Intrinsics.areEqual(this.title, accountCreationConfig.title) && Intrinsics.areEqual(this.body, accountCreationConfig.body) && this.visibility == accountCreationConfig.visibility;
            }

            public final int hashCode() {
                return this.visibility.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountCreationConfig(title=", this.title, ", body=", this.body, ", visibility=");
                m.append(this.visibility);
                m.append(")");
                return m.toString();
            }
        }

        public Loaded(List list, AccountCreationConfig accountCreationConfig, SettingVisibility settingVisibility, SettingVisibility settingVisibility2) {
            list.getClass();
            this.accountViewModels = list;
            this.createBusinessAccountConfig = accountCreationConfig;
            this.createPersonalAccountVisibility = settingVisibility;
            this.addAccountVisibility = settingVisibility2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.accountViewModels, loaded.accountViewModels) && this.createBusinessAccountConfig.equals(loaded.createBusinessAccountConfig) && this.createPersonalAccountVisibility == loaded.createPersonalAccountVisibility && this.addAccountVisibility == loaded.addAccountVisibility;
        }

        public final int hashCode() {
            return this.addAccountVisibility.hashCode() + ((this.createPersonalAccountVisibility.hashCode() + ((this.createBusinessAccountConfig.hashCode() + (this.accountViewModels.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Loaded(accountViewModels=" + this.accountViewModels + ", createBusinessAccountConfig=" + this.createBusinessAccountConfig + ", createPersonalAccountVisibility=" + this.createPersonalAccountVisibility + ", addAccountVisibility=" + this.addAccountVisibility + ")";
        }
    }

    public final class Loading extends AccountSwitcherViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 898958064;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
