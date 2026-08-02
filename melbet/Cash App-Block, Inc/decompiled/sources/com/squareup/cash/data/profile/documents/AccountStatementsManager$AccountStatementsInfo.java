package com.squareup.cash.data.profile.documents;

import com.squareup.protos.cash.registrar.api.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AccountStatementsManager$AccountStatementsInfo {
    public final boolean hasAccountStatements;

    /* loaded from: classes6.dex */
    public final class MultipleAccounts extends AccountStatementsManager$AccountStatementsInfo {
        public static final MultipleAccounts INSTANCE = new MultipleAccounts(true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultipleAccounts);
        }

        public final int hashCode() {
            return 1520463402;
        }

        public final String toString() {
            return "MultipleAccounts";
        }
    }

    /* loaded from: classes6.dex */
    public final class NoAccounts extends AccountStatementsManager$AccountStatementsInfo {
        public static final NoAccounts INSTANCE = new NoAccounts(false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoAccounts);
        }

        public final int hashCode() {
            return -272485413;
        }

        public final String toString() {
            return "NoAccounts";
        }
    }

    public final class SingleAccount extends AccountStatementsManager$AccountStatementsInfo {
        public final String customerToken;
        public final StatementType statementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAccount(String str, StatementType statementType) {
            super(true);
            str.getClass();
            statementType.getClass();
            this.customerToken = str;
            this.statementType = statementType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleAccount)) {
                return false;
            }
            SingleAccount singleAccount = (SingleAccount) obj;
            return Intrinsics.areEqual(this.customerToken, singleAccount.customerToken) && this.statementType == singleAccount.statementType;
        }

        public final int hashCode() {
            return this.statementType.hashCode() + (this.customerToken.hashCode() * 31);
        }

        public final String toString() {
            return "SingleAccount(customerToken=" + this.customerToken + ", statementType=" + this.statementType + ")";
        }
    }

    public AccountStatementsManager$AccountStatementsInfo(boolean z) {
        this.hasAccountStatements = z;
    }
}
