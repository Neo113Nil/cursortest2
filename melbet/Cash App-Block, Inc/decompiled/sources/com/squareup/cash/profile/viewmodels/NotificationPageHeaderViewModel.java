package com.squareup.cash.profile.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface NotificationPageHeaderViewModel {

    public final class AccountHeader implements NotificationPageHeaderViewModel {
        public final StackedAvatarViewModel.Single avatar;
        public final boolean isBusinessAccount;
        public final String subtitle;
        public final String title;

        public AccountHeader(StackedAvatarViewModel.Single single, String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.avatar = single;
            this.title = str;
            this.subtitle = str2;
            this.isBusinessAccount = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountHeader)) {
                return false;
            }
            AccountHeader accountHeader = (AccountHeader) obj;
            return this.avatar.equals(accountHeader.avatar) && Intrinsics.areEqual(this.title, accountHeader.title) && Intrinsics.areEqual(this.subtitle, accountHeader.subtitle) && this.isBusinessAccount == accountHeader.isBusinessAccount;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBusinessAccount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.avatar.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountHeader(avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            return re$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", isBusinessAccount=", this.isBusinessAccount, ")");
        }
    }

    public final class EmptyHeader implements NotificationPageHeaderViewModel {
        public static final EmptyHeader INSTANCE = new EmptyHeader();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmptyHeader);
        }

        public final int hashCode() {
            return 1448306241;
        }

        public final String toString() {
            return "EmptyHeader";
        }
    }
}
