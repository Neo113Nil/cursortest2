package com.squareup.cash.earnings.backend.api;

import kotlin.jvm.internal.Intrinsics;
import squareup.cash.earnings.EarningsChartData;

/* loaded from: classes6.dex */
public interface EarningsChartResult {

    public final class Loading implements EarningsChartResult {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1840248513;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Success implements EarningsChartResult {
        public final EarningsChartData chartData;

        public Success(EarningsChartData earningsChartData) {
            this.chartData = earningsChartData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.chartData, ((Success) obj).chartData);
        }

        public final int hashCode() {
            EarningsChartData earningsChartData = this.chartData;
            if (earningsChartData == null) {
                return 0;
            }
            return earningsChartData.hashCode();
        }

        public final String toString() {
            return "Success(chartData=" + this.chartData + ")";
        }
    }
}
