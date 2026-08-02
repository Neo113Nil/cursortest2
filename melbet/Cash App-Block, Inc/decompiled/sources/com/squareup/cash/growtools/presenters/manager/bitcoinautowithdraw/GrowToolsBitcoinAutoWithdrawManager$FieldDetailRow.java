package com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw;

import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;

/* loaded from: classes5.dex */
public final class GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow {
    public final String field;
    public final GrowToolsManagerViewModel.Loaded.DetailRow row;

    public GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow(String str, GrowToolsManagerViewModel.Loaded.DetailRow detailRow) {
        this.field = str;
        this.row = detailRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow)) {
            return false;
        }
        GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow growToolsBitcoinAutoWithdrawManager$FieldDetailRow = (GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow) obj;
        return this.field.equals(growToolsBitcoinAutoWithdrawManager$FieldDetailRow.field) && this.row.equals(growToolsBitcoinAutoWithdrawManager$FieldDetailRow.row);
    }

    public final int hashCode() {
        return this.row.hashCode() + (this.field.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDetailRow(field=" + this.field + ", row=" + this.row + ")";
    }
}
