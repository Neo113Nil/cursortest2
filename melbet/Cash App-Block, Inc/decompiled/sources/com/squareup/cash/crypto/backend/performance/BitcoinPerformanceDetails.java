package com.squareup.cash.crypto.backend.performance;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BitcoinPerformanceDetails {

    public final class Empty implements BitcoinPerformanceDetails {
        public final PerformanceDetailsUi detailsCopyData;

        public Empty(PerformanceDetailsUi performanceDetailsUi) {
            this.detailsCopyData = performanceDetailsUi;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Empty) && Intrinsics.areEqual(this.detailsCopyData, ((Empty) obj).detailsCopyData);
        }

        @Override // com.squareup.cash.crypto.backend.performance.BitcoinPerformanceDetails
        public final PerformanceDetailsUi getDetailsCopyData() {
            return this.detailsCopyData;
        }

        public final int hashCode() {
            PerformanceDetailsUi performanceDetailsUi = this.detailsCopyData;
            if (performanceDetailsUi == null) {
                return 0;
            }
            return performanceDetailsUi.hashCode();
        }

        public final String toString() {
            return "Empty(detailsCopyData=" + this.detailsCopyData + ")";
        }
    }

    public final class Loaded implements BitcoinPerformanceDetails {
        public final Money deposits;
        public final PerformanceDetailsUi detailsCopyData;
        public final Money purchases;
        public final Money sales;
        public final Money withdrawals;

        public Loaded(Money money, Money money2, Money money3, Money money4, PerformanceDetailsUi performanceDetailsUi) {
            this.purchases = money;
            this.deposits = money2;
            this.sales = money3;
            this.withdrawals = money4;
            this.detailsCopyData = performanceDetailsUi;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.purchases.equals(loaded.purchases) && this.deposits.equals(loaded.deposits) && this.sales.equals(loaded.sales) && this.withdrawals.equals(loaded.withdrawals) && Intrinsics.areEqual(this.detailsCopyData, loaded.detailsCopyData);
        }

        @Override // com.squareup.cash.crypto.backend.performance.BitcoinPerformanceDetails
        public final PerformanceDetailsUi getDetailsCopyData() {
            return this.detailsCopyData;
        }

        public final int hashCode() {
            int m = NavAction$$ExternalSyntheticOutline0.m(this.withdrawals, NavAction$$ExternalSyntheticOutline0.m(this.sales, NavAction$$ExternalSyntheticOutline0.m(this.deposits, this.purchases.hashCode() * 31, 31), 31), 31);
            PerformanceDetailsUi performanceDetailsUi = this.detailsCopyData;
            return m + (performanceDetailsUi == null ? 0 : performanceDetailsUi.hashCode());
        }

        public final String toString() {
            return "Loaded(purchases=" + this.purchases + ", deposits=" + this.deposits + ", sales=" + this.sales + ", withdrawals=" + this.withdrawals + ", detailsCopyData=" + this.detailsCopyData + ")";
        }
    }

    PerformanceDetailsUi getDetailsCopyData();
}
