package com.squareup.cash.account.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AccountholderAccountRepository$LoadAccountsResult {

    public final class Failure extends AccountholderAccountRepository$LoadAccountsResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1764319688;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Successful extends AccountholderAccountRepository$LoadAccountsResult {
        public final List accounts;

        public Successful(List list) {
            this.accounts = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && this.accounts.equals(((Successful) obj).accounts);
        }

        public final int hashCode() {
            return this.accounts.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Successful(accounts=", ")", this.accounts);
        }
    }
}
