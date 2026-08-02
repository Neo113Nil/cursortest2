package com.squareup.cash.cashapplite.viewmodels;

import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;

/* loaded from: classes6.dex */
public interface LiteBalanceHomeViewEvent {

    public final class BackClicked implements LiteBalanceHomeViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1189490987;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class RowClicked implements LiteBalanceHomeViewEvent {
        public final LiteBalanceHomeViewModel.RowId rowId;

        public RowClicked(LiteBalanceHomeViewModel.RowId rowId) {
            this.rowId = rowId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RowClicked) && this.rowId == ((RowClicked) obj).rowId;
        }

        public final int hashCode() {
            return this.rowId.hashCode();
        }

        public final String toString() {
            return "RowClicked(rowId=" + this.rowId + ")";
        }
    }
}
