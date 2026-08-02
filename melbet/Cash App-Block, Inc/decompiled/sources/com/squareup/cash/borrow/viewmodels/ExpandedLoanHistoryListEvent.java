package com.squareup.cash.borrow.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ExpandedLoanHistoryListEvent {

    public final class Close implements ExpandedLoanHistoryListEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1453780435;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DisplayLoanDetails implements ExpandedLoanHistoryListEvent {
        public final BorrowAppletLoanHistoryTile.Data.Loan.Details loanDetails;
        public final String loanToken;

        public DisplayLoanDetails(BorrowAppletLoanHistoryTile.Data.Loan.Details details, String str) {
            details.getClass();
            this.loanDetails = details;
            this.loanToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayLoanDetails)) {
                return false;
            }
            DisplayLoanDetails displayLoanDetails = (DisplayLoanDetails) obj;
            return Intrinsics.areEqual(this.loanDetails, displayLoanDetails.loanDetails) && Intrinsics.areEqual(this.loanToken, displayLoanDetails.loanToken);
        }

        public final int hashCode() {
            int hashCode = this.loanDetails.hashCode() * 31;
            String str = this.loanToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "DisplayLoanDetails(loanDetails=" + this.loanDetails + ", loanToken=" + this.loanToken + ")";
        }
    }
}
