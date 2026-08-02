package com.squareup.cash.cashapplite.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LiteCashInViewEvent {

    public final class BackClicked implements LiteCashInViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1013990118;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CopyRowClicked implements LiteCashInViewEvent {
        public final CashInRowViewModel row;

        public CopyRowClicked(CashInRowViewModel cashInRowViewModel) {
            cashInRowViewModel.getClass();
            this.row = cashInRowViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopyRowClicked) && Intrinsics.areEqual(this.row, ((CopyRowClicked) obj).row);
        }

        public final int hashCode() {
            return this.row.hashCode();
        }

        public final String toString() {
            return "CopyRowClicked(row=" + this.row + ")";
        }
    }
}
