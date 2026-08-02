package com.squareup.cash.banking.viewmodels;

import com.squareup.protos.unicorn.BankingTab;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BankingSectionsViewEvent {

    public final class BankingRowClicked implements BankingSectionsViewEvent {
        public final BankingTab.BankingOption bankingOption;

        public BankingRowClicked(BankingTab.BankingOption bankingOption) {
            bankingOption.getClass();
            this.bankingOption = bankingOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BankingRowClicked) && Intrinsics.areEqual(this.bankingOption, ((BankingRowClicked) obj).bankingOption);
        }

        public final int hashCode() {
            return this.bankingOption.hashCode();
        }

        public final String toString() {
            return "BankingRowClicked(bankingOption=" + this.bankingOption + ")";
        }
    }

    public final class RowViewed implements BankingSectionsViewEvent {
        public final String rowId;

        public RowViewed(String str) {
            str.getClass();
            this.rowId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RowViewed) && Intrinsics.areEqual(this.rowId, ((RowViewed) obj).rowId);
        }

        public final int hashCode() {
            return this.rowId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RowViewed(rowId=", this.rowId, ")");
        }
    }
}
