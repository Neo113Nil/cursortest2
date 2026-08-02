package com.squareup.cash.account.backend;

import com.squareup.protos.cash.janus.syncvalues.FullAccount;

/* loaded from: classes5.dex */
public abstract class AccountholderAccountRepository$GetAccountResult {

    public final class NotFound extends AccountholderAccountRepository$GetAccountResult {
        public static final NotFound INSTANCE = new NotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public final int hashCode() {
            return -2117055290;
        }

        public final String toString() {
            return "NotFound";
        }
    }

    public final class Successful extends AccountholderAccountRepository$GetAccountResult {
        public final FullAccount account;

        public Successful(FullAccount fullAccount) {
            this.account = fullAccount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && this.account.equals(((Successful) obj).account);
        }

        public final FullAccount getAccount() {
            return this.account;
        }

        public final int hashCode() {
            return this.account.hashCode();
        }

        public final String toString() {
            return "Successful(account=" + this.account + ")";
        }
    }
}
