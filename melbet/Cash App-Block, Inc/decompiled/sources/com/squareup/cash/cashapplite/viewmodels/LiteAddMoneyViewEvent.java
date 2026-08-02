package com.squareup.cash.cashapplite.viewmodels;

/* loaded from: classes6.dex */
public interface LiteAddMoneyViewEvent {

    public final class DismissClicked implements LiteAddMoneyViewEvent {
        public static final DismissClicked INSTANCE = new DismissClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissClicked);
        }

        public final int hashCode() {
            return -915208066;
        }

        public final String toString() {
            return "DismissClicked";
        }
    }

    public final class RowClicked implements LiteAddMoneyViewEvent {
        public final AddMoneyRowId rowId;

        public RowClicked(AddMoneyRowId addMoneyRowId) {
            addMoneyRowId.getClass();
            this.rowId = addMoneyRowId;
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
