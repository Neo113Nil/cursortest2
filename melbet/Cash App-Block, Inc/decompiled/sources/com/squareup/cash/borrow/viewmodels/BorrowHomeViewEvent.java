package com.squareup.cash.borrow.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowHomeViewEvent {

    public final class Close implements BorrowHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1470204211;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    /* loaded from: classes4.dex */
    public final class TapBulletinRow implements BorrowHomeViewEvent {
        public final BorrowAppletBulletinsTile.Data.Bulletin bulletin;

        public TapBulletinRow(BorrowAppletBulletinsTile.Data.Bulletin bulletin) {
            this.bulletin = bulletin;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapBulletinRow) && this.bulletin.equals(((TapBulletinRow) obj).bulletin);
        }

        public final int hashCode() {
            return this.bulletin.hashCode();
        }

        public final String toString() {
            return "TapBulletinRow(bulletin=" + this.bulletin + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class TapCreditLimitAndBorrowPrimaryButton implements BorrowHomeViewEvent {
        public final Money availableCreditAmount;
        public final InitiateLoanData pickerData;

        public TapCreditLimitAndBorrowPrimaryButton(InitiateLoanData initiateLoanData, Money money) {
            initiateLoanData.getClass();
            money.getClass();
            this.pickerData = initiateLoanData;
            this.availableCreditAmount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapCreditLimitAndBorrowPrimaryButton)) {
                return false;
            }
            TapCreditLimitAndBorrowPrimaryButton tapCreditLimitAndBorrowPrimaryButton = (TapCreditLimitAndBorrowPrimaryButton) obj;
            return Intrinsics.areEqual(this.pickerData, tapCreditLimitAndBorrowPrimaryButton.pickerData) && Intrinsics.areEqual(this.availableCreditAmount, tapCreditLimitAndBorrowPrimaryButton.availableCreditAmount);
        }

        public final int hashCode() {
            return this.availableCreditAmount.hashCode() + (this.pickerData.hashCode() * 31);
        }

        public final String toString() {
            return "TapCreditLimitAndBorrowPrimaryButton(pickerData=" + this.pickerData + ", availableCreditAmount=" + this.availableCreditAmount + ")";
        }
    }

    public final class TapLoanHistoryRow implements BorrowHomeViewEvent {
        public final BorrowAppletLoanHistoryTile.Data.Loan.Details loanDetails;
        public final String loanToken;

        public TapLoanHistoryRow(BorrowAppletLoanHistoryTile.Data.Loan.Details details, String str) {
            details.getClass();
            this.loanDetails = details;
            this.loanToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapLoanHistoryRow)) {
                return false;
            }
            TapLoanHistoryRow tapLoanHistoryRow = (TapLoanHistoryRow) obj;
            return Intrinsics.areEqual(this.loanDetails, tapLoanHistoryRow.loanDetails) && Intrinsics.areEqual(this.loanToken, tapLoanHistoryRow.loanToken);
        }

        public final int hashCode() {
            int hashCode = this.loanDetails.hashCode() * 31;
            String str = this.loanToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "TapLoanHistoryRow(loanDetails=" + this.loanDetails + ", loanToken=" + this.loanToken + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class TapPaymentTimelinePrimaryButton implements BorrowHomeViewEvent {
        public final SheetButtonAction buttonAction;

        public TapPaymentTimelinePrimaryButton(SheetButtonAction sheetButtonAction) {
            this.buttonAction = sheetButtonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapPaymentTimelinePrimaryButton) && this.buttonAction.equals(((TapPaymentTimelinePrimaryButton) obj).buttonAction);
        }

        public final int hashCode() {
            return this.buttonAction.hashCode();
        }

        public final String toString() {
            return "TapPaymentTimelinePrimaryButton(buttonAction=" + this.buttonAction + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class TapPaymentTimelineRow implements BorrowHomeViewEvent {
        public final String route;

        public TapPaymentTimelineRow(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapPaymentTimelineRow) && Intrinsics.areEqual(this.route, ((TapPaymentTimelineRow) obj).route);
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapPaymentTimelineRow(route=", this.route, ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class TapUpsellCard implements BorrowHomeViewEvent {
        public final BorrowAppletBulletinsTile.Data.UpsellCard upsellCard;

        public TapUpsellCard(BorrowAppletBulletinsTile.Data.UpsellCard upsellCard) {
            upsellCard.getClass();
            this.upsellCard = upsellCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapUpsellCard) && Intrinsics.areEqual(this.upsellCard, ((TapUpsellCard) obj).upsellCard);
        }

        public final int hashCode() {
            return this.upsellCard.hashCode();
        }

        public final String toString() {
            return "TapUpsellCard(upsellCard=" + this.upsellCard + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class TapViewAllLoanHistory implements BorrowHomeViewEvent {
        public final BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData;
        public final List loans;

        public TapViewAllLoanHistory(BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData, List list) {
            expandedLoanListViewData.getClass();
            list.getClass();
            this.expandedLoanListViewData = expandedLoanListViewData;
            this.loans = list;
        }
    }
}
