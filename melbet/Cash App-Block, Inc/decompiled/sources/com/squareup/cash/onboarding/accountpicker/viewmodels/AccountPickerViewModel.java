package com.squareup.cash.onboarding.accountpicker.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AccountPickerViewModel {

    public final class AccountList implements AccountPickerViewModel {
        public final List accountViewModels;
        public final boolean isInEditMode;
        public final boolean isLoading;
        public final String title;

        public AccountList(String str, List list, boolean z, boolean z2) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.accountViewModels = list;
            this.isLoading = z;
            this.isInEditMode = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountList)) {
                return false;
            }
            AccountList accountList = (AccountList) obj;
            return Intrinsics.areEqual(this.title, accountList.title) && Intrinsics.areEqual(this.accountViewModels, accountList.accountViewModels) && this.isLoading == accountList.isLoading && this.isInEditMode == accountList.isInEditMode;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isInEditMode) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.accountViewModels), 31, this.isLoading);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("AccountList(title=", this.title, ", accountViewModels=", ", isLoading=", this.accountViewModels), this.isLoading, ", isInEditMode=", this.isInEditMode, ")");
        }
    }

    public final class AccountRemovalFailed implements AccountPickerViewModel {
        public final String accountToken;

        public AccountRemovalFailed(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountRemovalFailed) && Intrinsics.areEqual(this.accountToken, ((AccountRemovalFailed) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountRemovalFailed(accountToken=", this.accountToken, ")");
        }
    }

    public final class AccountRemoved implements AccountPickerViewModel {
        public static final AccountRemoved INSTANCE = new AccountRemoved();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountRemoved);
        }

        public final int hashCode() {
            return -1100298099;
        }

        public final String toString() {
            return "AccountRemoved";
        }
    }
}
