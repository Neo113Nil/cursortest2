package com.squareup.cash.earnings.viewmodels.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsHeaderViewModel {
    public final DateFilterBarViewModel filterBarViewModel;
    public final HeaderViewModel header;
    public final DateFilter selectedFilter;
    public final boolean showsChart;
    public final String title;

    public interface HeaderViewModel {

        public final class Loaded implements HeaderViewModel {
            public final boolean animateTotalEarnings;
            public final List chartBars;
            public final String chartContentDescription;
            public final CurrencyCode chartCurrencyCode;
            public final CurrencyCode totalEarningsCurrencyCode;
            public final long totalEarningsRaw;
            public final String totalEarningsText;

            public Loaded(String str, long j, CurrencyCode currencyCode, boolean z, List list, CurrencyCode currencyCode2, String str2) {
                str.getClass();
                currencyCode.getClass();
                list.getClass();
                currencyCode2.getClass();
                this.totalEarningsText = str;
                this.totalEarningsRaw = j;
                this.totalEarningsCurrencyCode = currencyCode;
                this.animateTotalEarnings = z;
                this.chartBars = list;
                this.chartCurrencyCode = currencyCode2;
                this.chartContentDescription = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.areEqual(this.totalEarningsText, loaded.totalEarningsText) && this.totalEarningsRaw == loaded.totalEarningsRaw && this.totalEarningsCurrencyCode == loaded.totalEarningsCurrencyCode && this.animateTotalEarnings == loaded.animateTotalEarnings && Intrinsics.areEqual(this.chartBars, loaded.chartBars) && this.chartCurrencyCode == loaded.chartCurrencyCode && this.chartContentDescription.equals(loaded.chartContentDescription);
            }

            public final int hashCode() {
                return this.chartContentDescription.hashCode() + ((this.chartCurrencyCode.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.totalEarningsCurrencyCode.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.totalEarningsText.hashCode() * 31, 31, this.totalEarningsRaw)) * 31, 31, this.animateTotalEarnings), 31, this.chartBars)) * 31);
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("Loaded(totalEarningsText=", this.totalEarningsText, ", totalEarningsRaw=", this.totalEarningsRaw);
                m.append(", totalEarningsCurrencyCode=");
                m.append(this.totalEarningsCurrencyCode);
                m.append(", animateTotalEarnings=");
                m.append(this.animateTotalEarnings);
                m.append(", chartBars=");
                m.append(this.chartBars);
                m.append(", chartCurrencyCode=");
                m.append(this.chartCurrencyCode);
                return Recorder$$ExternalSyntheticOutline2.m(m, ", chartContentDescription=", this.chartContentDescription, ")");
            }
        }

        public final class Loading implements HeaderViewModel {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -2003210654;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public EarningsHeaderViewModel(HeaderViewModel headerViewModel, DateFilterBarViewModel dateFilterBarViewModel, DateFilter dateFilter, String str, boolean z) {
        this.header = headerViewModel;
        this.filterBarViewModel = dateFilterBarViewModel;
        this.selectedFilter = dateFilter;
        this.title = str;
        this.showsChart = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsHeaderViewModel)) {
            return false;
        }
        EarningsHeaderViewModel earningsHeaderViewModel = (EarningsHeaderViewModel) obj;
        return this.header.equals(earningsHeaderViewModel.header) && this.filterBarViewModel.equals(earningsHeaderViewModel.filterBarViewModel) && Intrinsics.areEqual(this.selectedFilter, earningsHeaderViewModel.selectedFilter) && Intrinsics.areEqual(this.title, earningsHeaderViewModel.title) && this.showsChart == earningsHeaderViewModel.showsChart;
    }

    public final int hashCode() {
        int hashCode = (this.filterBarViewModel.hashCode() + (this.header.hashCode() * 31)) * 31;
        DateFilter dateFilter = this.selectedFilter;
        int hashCode2 = (hashCode + (dateFilter == null ? 0 : dateFilter.hashCode())) * 31;
        String str = this.title;
        return Boolean.hashCode(this.showsChart) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsHeaderViewModel(header=");
        sb.append(this.header);
        sb.append(", filterBarViewModel=");
        sb.append(this.filterBarViewModel);
        sb.append(", selectedFilter=");
        sb.append(this.selectedFilter);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", showsChart=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showsChart, ")");
    }
}
