package com.squareup.cash.earnings.backend.real;

import kotlin.jvm.internal.Intrinsics;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes6.dex */
public interface EarningsChartDataSource {

    public final class Fetch implements EarningsChartDataSource {
        public final EarningsTimeFrame period;

        public Fetch(EarningsTimeFrame earningsTimeFrame) {
            this.period = earningsTimeFrame;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fetch) && this.period.equals(((Fetch) obj).period);
        }

        public final int hashCode() {
            return this.period.hashCode();
        }

        public final String toString() {
            return "Fetch(period=" + this.period + ")";
        }
    }

    public final class Loading implements EarningsChartDataSource {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1397460283;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements EarningsChartDataSource {
        public final EarningsChartData chartData;

        public Ready(EarningsChartData earningsChartData) {
            this.chartData = earningsChartData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && Intrinsics.areEqual(this.chartData, ((Ready) obj).chartData);
        }

        public final int hashCode() {
            EarningsChartData earningsChartData = this.chartData;
            if (earningsChartData == null) {
                return 0;
            }
            return earningsChartData.hashCode();
        }

        public final String toString() {
            return "Ready(chartData=" + this.chartData + ")";
        }
    }
}
