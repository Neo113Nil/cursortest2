package com.squareup.cash.borrow.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BorrowHomeViewModel {
    public final ArrayList tileList;
    public final String title;

    public interface Tile {

        public final class BulletinTileModel implements Tile {
            public final BorrowAppletBulletinsTile.Data tileData;

            public BulletinTileModel(BorrowAppletBulletinsTile.Data data) {
                data.getClass();
                this.tileData = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BulletinTileModel) && Intrinsics.areEqual(this.tileData, ((BulletinTileModel) obj).tileData);
            }

            public final int hashCode() {
                return this.tileData.hashCode();
            }

            public final String toString() {
                return "BulletinTileModel(tileData=" + this.tileData + ")";
            }
        }

        public final class CreditLimitAndBorrowButtonTileModel implements Tile {
            public final String creditLimitMoneyLabel;
            public final BorrowAppletCreditLimitAndBorrowButtonTile.Data tileData;

            public CreditLimitAndBorrowButtonTileModel(String str, BorrowAppletCreditLimitAndBorrowButtonTile.Data data) {
                str.getClass();
                this.creditLimitMoneyLabel = str;
                this.tileData = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreditLimitAndBorrowButtonTileModel)) {
                    return false;
                }
                CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel = (CreditLimitAndBorrowButtonTileModel) obj;
                return Intrinsics.areEqual(this.creditLimitMoneyLabel, creditLimitAndBorrowButtonTileModel.creditLimitMoneyLabel) && this.tileData.equals(creditLimitAndBorrowButtonTileModel.tileData);
            }

            public final int hashCode() {
                return this.tileData.hashCode() + (this.creditLimitMoneyLabel.hashCode() * 31);
            }

            public final String toString() {
                return "CreditLimitAndBorrowButtonTileModel(creditLimitMoneyLabel=" + this.creditLimitMoneyLabel + ", tileData=" + this.tileData + ")";
            }
        }

        public final class LoanHistoryTileModel implements Tile {
            public final BorrowAppletLoanHistoryTile.Data tileData;

            public LoanHistoryTileModel(BorrowAppletLoanHistoryTile.Data data) {
                data.getClass();
                this.tileData = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoanHistoryTileModel) && Intrinsics.areEqual(this.tileData, ((LoanHistoryTileModel) obj).tileData);
            }

            public final int hashCode() {
                return this.tileData.hashCode();
            }

            public final String toString() {
                return "LoanHistoryTileModel(tileData=" + this.tileData + ")";
            }
        }

        public final class PaymentTimelineTileModel implements Tile {
            public final SheetButtonAction buttonAction;
            public final BorrowAppletPaymentTimelineTile.Data tileData;

            public PaymentTimelineTileModel(BorrowAppletPaymentTimelineTile.Data data, SheetButtonAction sheetButtonAction) {
                this.tileData = data;
                this.buttonAction = sheetButtonAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentTimelineTileModel)) {
                    return false;
                }
                PaymentTimelineTileModel paymentTimelineTileModel = (PaymentTimelineTileModel) obj;
                return this.tileData.equals(paymentTimelineTileModel.tileData) && this.buttonAction.equals(paymentTimelineTileModel.buttonAction);
            }

            public final int hashCode() {
                return this.buttonAction.hashCode() + (this.tileData.hashCode() * 31);
            }

            public final String toString() {
                return "PaymentTimelineTileModel(tileData=" + this.tileData + ", buttonAction=" + this.buttonAction + ")";
            }
        }
    }

    public BorrowHomeViewModel(String str, ArrayList arrayList) {
        str.getClass();
        this.title = str;
        this.tileList = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowHomeViewModel)) {
            return false;
        }
        BorrowHomeViewModel borrowHomeViewModel = (BorrowHomeViewModel) obj;
        return Intrinsics.areEqual(this.title, borrowHomeViewModel.title) && this.tileList.equals(borrowHomeViewModel.tileList);
    }

    public final int hashCode() {
        return this.tileList.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.tileList, "BorrowHomeViewModel(title=", this.title, ", tileList=", ")");
    }
}
