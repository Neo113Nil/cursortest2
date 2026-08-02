package com.squareup.cash.earningstracker.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsTrackerViewModel {

    public final class Loaded implements EarningsTrackerViewModel, FilterableEarnings {
        public final List chartBars;
        public final String earningsGraphContentDescription;
        public final DateFilterBarViewModel filterBarViewModel;
        public final String formattedNetEarnings;
        public final String formattedProcessingFees;
        public final String formattedTotalEarnings;
        public final HeroHeaderViewModel heroHeader;
        public final int numberOfCashAppPayments;
        public final int numberOfTapToPayPayments;
        public final boolean shouldShowTapToPayPayments;
        public final List topCustomers;

        public Loaded(HeroHeaderViewModel heroHeaderViewModel, String str, List list, String str2, String str3, String str4, int i, int i2, boolean z, List list2, DateFilterBarViewModel dateFilterBarViewModel) {
            str.getClass();
            list.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list2.getClass();
            this.heroHeader = heroHeaderViewModel;
            this.formattedTotalEarnings = str;
            this.chartBars = list;
            this.earningsGraphContentDescription = str2;
            this.formattedProcessingFees = str3;
            this.formattedNetEarnings = str4;
            this.numberOfCashAppPayments = i;
            this.numberOfTapToPayPayments = i2;
            this.shouldShowTapToPayPayments = z;
            this.topCustomers = list2;
            this.filterBarViewModel = dateFilterBarViewModel;
        }

        public static Loaded copy$default(Loaded loaded, HeroHeaderViewModel heroHeaderViewModel) {
            String str = loaded.formattedTotalEarnings;
            List list = loaded.chartBars;
            String str2 = loaded.earningsGraphContentDescription;
            String str3 = loaded.formattedProcessingFees;
            String str4 = loaded.formattedNetEarnings;
            int i = loaded.numberOfCashAppPayments;
            int i2 = loaded.numberOfTapToPayPayments;
            boolean z = loaded.shouldShowTapToPayPayments;
            List list2 = loaded.topCustomers;
            DateFilterBarViewModel dateFilterBarViewModel = loaded.filterBarViewModel;
            str.getClass();
            list.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list2.getClass();
            return new Loaded(heroHeaderViewModel, str, list, str2, str3, str4, i, i2, z, list2, dateFilterBarViewModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.heroHeader.equals(loaded.heroHeader) && Intrinsics.areEqual(this.formattedTotalEarnings, loaded.formattedTotalEarnings) && Intrinsics.areEqual(this.chartBars, loaded.chartBars) && Intrinsics.areEqual(this.earningsGraphContentDescription, loaded.earningsGraphContentDescription) && Intrinsics.areEqual(this.formattedProcessingFees, loaded.formattedProcessingFees) && Intrinsics.areEqual(this.formattedNetEarnings, loaded.formattedNetEarnings) && this.numberOfCashAppPayments == loaded.numberOfCashAppPayments && this.numberOfTapToPayPayments == loaded.numberOfTapToPayPayments && this.shouldShowTapToPayPayments == loaded.shouldShowTapToPayPayments && Intrinsics.areEqual(this.topCustomers, loaded.topCustomers) && this.filterBarViewModel.equals(loaded.filterBarViewModel);
        }

        @Override // com.squareup.cash.earningstracker.viewmodels.FilterableEarnings
        public final DateFilterBarViewModel getFilterBarViewModel() {
            return this.filterBarViewModel;
        }

        public final int hashCode() {
            return this.filterBarViewModel.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.numberOfTapToPayPayments, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.numberOfCashAppPayments, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.heroHeader.hashCode() * 31, 31, this.formattedTotalEarnings), 31, this.chartBars), 31, this.earningsGraphContentDescription), 31, this.formattedProcessingFees), 31, this.formattedNetEarnings), 31), 31), 31, this.shouldShowTapToPayPayments), 31, this.topCustomers);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(heroHeader=");
            sb.append(this.heroHeader);
            sb.append(", formattedTotalEarnings=");
            sb.append(this.formattedTotalEarnings);
            sb.append(", chartBars=");
            Recorder$$ExternalSyntheticOutline2.m(", earningsGraphContentDescription=", this.earningsGraphContentDescription, ", formattedProcessingFees=", sb, this.chartBars);
            Boxes$$ExternalSyntheticOutline1.m(sb, this.formattedProcessingFees, ", formattedNetEarnings=", this.formattedNetEarnings, ", numberOfCashAppPayments=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.numberOfCashAppPayments, this.numberOfTapToPayPayments, ", numberOfTapToPayPayments=", ", shouldShowTapToPayPayments=", sb);
            sb.append(this.shouldShowTapToPayPayments);
            sb.append(", topCustomers=");
            sb.append(this.topCustomers);
            sb.append(", filterBarViewModel=");
            sb.append(this.filterBarViewModel);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Loading implements EarningsTrackerViewModel, FilterableEarnings {
        public final DateFilterBarViewModel filterBarViewModel;

        public Loading(DateFilterBarViewModel dateFilterBarViewModel) {
            this.filterBarViewModel = dateFilterBarViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.filterBarViewModel.equals(((Loading) obj).filterBarViewModel);
        }

        @Override // com.squareup.cash.earningstracker.viewmodels.FilterableEarnings
        public final DateFilterBarViewModel getFilterBarViewModel() {
            return this.filterBarViewModel;
        }

        public final int hashCode() {
            return this.filterBarViewModel.hashCode();
        }

        public final String toString() {
            return "Loading(filterBarViewModel=" + this.filterBarViewModel + ")";
        }
    }

    public final class LoadingError implements EarningsTrackerViewModel {
        public static final LoadingError INSTANCE = new LoadingError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingError);
        }

        public final int hashCode() {
            return -1548088265;
        }

        public final String toString() {
            return "LoadingError";
        }
    }
}
