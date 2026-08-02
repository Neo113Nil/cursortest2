package com.squareup.cash.account.settings.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes5.dex */
public interface AccountSettingsFeatureManager$SettingsDesignMode {

    public final class MultiAccount implements AccountSettingsFeatureManager$SettingsDesignMode {
        public final List accounts;

        public MultiAccount(List list) {
            this.accounts = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiAccount) && this.accounts.equals(((MultiAccount) obj).accounts);
        }

        public final int hashCode() {
            return this.accounts.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("MultiAccount(accounts=", ")", this.accounts);
        }
    }

    public final class SingleAccount implements AccountSettingsFeatureManager$SettingsDesignMode {
        public static final SingleAccount INSTANCE = new SingleAccount();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleAccount);
        }

        public final int hashCode() {
            return 454326132;
        }

        public final String toString() {
            return "SingleAccount";
        }
    }
}
