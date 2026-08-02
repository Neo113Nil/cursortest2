package com.squareup.cash.investing.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockMetricTypePickerViewModel {
    public final ArrayList options;

    public abstract class Option {

        public final class FollowingOption extends Option {
            public final boolean isSelected;
            public final String label;
            public final FollowingStockMetricType metricType;

            public FollowingOption(String str, FollowingStockMetricType followingStockMetricType, boolean z) {
                str.getClass();
                this.label = str;
                this.metricType = followingStockMetricType;
                this.isSelected = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FollowingOption)) {
                    return false;
                }
                FollowingOption followingOption = (FollowingOption) obj;
                return Intrinsics.areEqual(this.label, followingOption.label) && this.metricType == followingOption.metricType && this.isSelected == followingOption.isSelected;
            }

            @Override // com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel.Option
            public final String getLabel() {
                return this.label;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isSelected) + ((this.metricType.hashCode() + (this.label.hashCode() * 31)) * 31);
            }

            @Override // com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel.Option
            public final boolean isSelected() {
                return this.isSelected;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FollowingOption(label=");
                sb.append(this.label);
                sb.append(", metricType=");
                sb.append(this.metricType);
                sb.append(", isSelected=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isSelected, ")");
            }
        }

        public final class PortfolioOption extends Option {
            public final boolean isSelected;
            public final String label;
            public final PortfolioStockMetricType metricType;

            public PortfolioOption(String str, PortfolioStockMetricType portfolioStockMetricType, boolean z) {
                str.getClass();
                portfolioStockMetricType.getClass();
                this.label = str;
                this.metricType = portfolioStockMetricType;
                this.isSelected = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PortfolioOption)) {
                    return false;
                }
                PortfolioOption portfolioOption = (PortfolioOption) obj;
                return Intrinsics.areEqual(this.label, portfolioOption.label) && this.metricType == portfolioOption.metricType && this.isSelected == portfolioOption.isSelected;
            }

            @Override // com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel.Option
            public final String getLabel() {
                return this.label;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isSelected) + ((this.metricType.hashCode() + (this.label.hashCode() * 31)) * 31);
            }

            @Override // com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel.Option
            public final boolean isSelected() {
                return this.isSelected;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PortfolioOption(label=");
                sb.append(this.label);
                sb.append(", metricType=");
                sb.append(this.metricType);
                sb.append(", isSelected=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isSelected, ")");
            }
        }

        public abstract String getLabel();

        public abstract boolean isSelected();
    }

    public StockMetricTypePickerViewModel(ArrayList arrayList) {
        this.options = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StockMetricTypePickerViewModel) && this.options.equals(((StockMetricTypePickerViewModel) obj).options);
    }

    public final int hashCode() {
        return this.options.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("StockMetricTypePickerViewModel(options=", ")", this.options);
    }
}
