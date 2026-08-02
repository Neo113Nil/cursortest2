package com.squareup.cash.bitcoin.viewmodels.performance.details;

import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinPerformanceDetailsViewModel {

    public final class Loaded implements BitcoinPerformanceDetailsViewModel {
        public final boolean isStale;
        public final BitcoinPerformanceDetailsContentViewModel model;
        public final BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem selectedInfoItem;

        public Loaded(BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel, BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem, boolean z) {
            this.model = bitcoinPerformanceDetailsContentViewModel;
            this.selectedInfoItem = bitcoinPerformanceDetailsSectionInfoItem;
            this.isStale = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.model.equals(loaded.model) && Intrinsics.areEqual(this.selectedInfoItem, loaded.selectedInfoItem) && this.isStale == loaded.isStale;
        }

        public final int hashCode() {
            int hashCode = this.model.hashCode() * 31;
            BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = this.selectedInfoItem;
            return Boolean.hashCode(this.isStale) + ((hashCode + (bitcoinPerformanceDetailsSectionInfoItem == null ? 0 : bitcoinPerformanceDetailsSectionInfoItem.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(model=");
            sb.append(this.model);
            sb.append(", selectedInfoItem=");
            sb.append(this.selectedInfoItem);
            sb.append(", isStale=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isStale, ")");
        }
    }

    public final class Loading implements BitcoinPerformanceDetailsViewModel {
        public final PerformanceDetailsUi detailsCopyData;

        public Loading(PerformanceDetailsUi performanceDetailsUi) {
            this.detailsCopyData = performanceDetailsUi;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.detailsCopyData, ((Loading) obj).detailsCopyData);
        }

        public final int hashCode() {
            PerformanceDetailsUi performanceDetailsUi = this.detailsCopyData;
            if (performanceDetailsUi == null) {
                return 0;
            }
            return performanceDetailsUi.hashCode();
        }

        public final String toString() {
            return "Loading(detailsCopyData=" + this.detailsCopyData + ")";
        }
    }
}
