package com.squareup.cash.investing.viewmodels;

/* loaded from: classes6.dex */
public abstract class StockMetricTypePickerViewEvent {

    public final class SelectFollowingMetricType extends StockMetricTypePickerViewEvent {
        public final FollowingStockMetricType metricType;

        public SelectFollowingMetricType(FollowingStockMetricType followingStockMetricType) {
            this.metricType = followingStockMetricType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectFollowingMetricType) && this.metricType == ((SelectFollowingMetricType) obj).metricType;
        }

        public final int hashCode() {
            return this.metricType.hashCode();
        }

        public final String toString() {
            return "SelectFollowingMetricType(metricType=" + this.metricType + ")";
        }
    }

    public final class SelectPortfolioMetricType extends StockMetricTypePickerViewEvent {
        public final PortfolioStockMetricType metricType;

        public SelectPortfolioMetricType(PortfolioStockMetricType portfolioStockMetricType) {
            portfolioStockMetricType.getClass();
            this.metricType = portfolioStockMetricType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPortfolioMetricType) && this.metricType == ((SelectPortfolioMetricType) obj).metricType;
        }

        public final int hashCode() {
            return this.metricType.hashCode();
        }

        public final String toString() {
            return "SelectPortfolioMetricType(metricType=" + this.metricType + ")";
        }
    }
}
