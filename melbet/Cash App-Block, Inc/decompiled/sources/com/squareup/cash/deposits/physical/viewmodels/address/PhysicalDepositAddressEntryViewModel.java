package com.squareup.cash.deposits.physical.viewmodels.address;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhysicalDepositAddressEntryViewModel {
    public final Error error;
    public final Results results;
    public final String searchBarPlaceholder;

    public final class Error {
        public final String description;
        public final String title;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.description, error.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(title=", this.title, ", description=", this.description, ")");
        }
    }

    public final class Results {
        public final String explanationHeaderText;
        public final String explanationTitleText;
        public final boolean isFirstTimeUseSectionVisible;
        public final boolean isRecentSectionVisible;
        public final boolean isResultsSectionVisible;
        public final ArrayList recentResults;
        public final String recentSectionHeaderText;
        public final String resultsSectionHeaderText;
        public final List searchResults;

        public Results(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, List list, ArrayList arrayList) {
            list.getClass();
            this.recentSectionHeaderText = str;
            this.resultsSectionHeaderText = str2;
            this.explanationTitleText = str3;
            this.explanationHeaderText = str4;
            this.isFirstTimeUseSectionVisible = z;
            this.isRecentSectionVisible = z2;
            this.isResultsSectionVisible = z3;
            this.searchResults = list;
            this.recentResults = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Results)) {
                return false;
            }
            Results results = (Results) obj;
            return Intrinsics.areEqual(this.recentSectionHeaderText, results.recentSectionHeaderText) && Intrinsics.areEqual(this.resultsSectionHeaderText, results.resultsSectionHeaderText) && Intrinsics.areEqual(this.explanationTitleText, results.explanationTitleText) && Intrinsics.areEqual(this.explanationHeaderText, results.explanationHeaderText) && this.isFirstTimeUseSectionVisible == results.isFirstTimeUseSectionVisible && this.isRecentSectionVisible == results.isRecentSectionVisible && this.isResultsSectionVisible == results.isResultsSectionVisible && Intrinsics.areEqual(this.searchResults, results.searchResults) && this.recentResults.equals(results.recentResults);
        }

        public final int hashCode() {
            String str = this.recentSectionHeaderText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.resultsSectionHeaderText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.explanationTitleText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.explanationHeaderText;
            return this.recentResults.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.isFirstTimeUseSectionVisible), 31, this.isRecentSectionVisible), 31, this.isResultsSectionVisible), 31, this.searchResults);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Results(recentSectionHeaderText=", this.recentSectionHeaderText, ", resultsSectionHeaderText=", this.resultsSectionHeaderText, ", explanationTitleText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.explanationTitleText, ", explanationHeaderText=", this.explanationHeaderText, ", isFirstTimeUseSectionVisible=");
            re$$ExternalSyntheticOutline0.m(m, this.isFirstTimeUseSectionVisible, ", isRecentSectionVisible=", this.isRecentSectionVisible, ", isResultsSectionVisible=");
            m.append(this.isResultsSectionVisible);
            m.append(", searchResults=");
            m.append(this.searchResults);
            m.append(", recentResults=");
            return Recorder$$ExternalSyntheticOutline1.m(")", m, this.recentResults);
        }
    }

    public PhysicalDepositAddressEntryViewModel(String str, Results results, Error error, int i) {
        results = (i & 2) != 0 ? null : results;
        error = (i & 4) != 0 ? null : error;
        str.getClass();
        this.searchBarPlaceholder = str;
        this.results = results;
        this.error = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalDepositAddressEntryViewModel)) {
            return false;
        }
        PhysicalDepositAddressEntryViewModel physicalDepositAddressEntryViewModel = (PhysicalDepositAddressEntryViewModel) obj;
        return Intrinsics.areEqual(this.searchBarPlaceholder, physicalDepositAddressEntryViewModel.searchBarPlaceholder) && Intrinsics.areEqual(this.results, physicalDepositAddressEntryViewModel.results) && Intrinsics.areEqual(this.error, physicalDepositAddressEntryViewModel.error);
    }

    public final int hashCode() {
        int hashCode = this.searchBarPlaceholder.hashCode() * 31;
        Results results = this.results;
        int hashCode2 = (hashCode + (results == null ? 0 : results.hashCode())) * 31;
        Error error = this.error;
        return hashCode2 + (error != null ? error.hashCode() : 0);
    }

    public final String toString() {
        return "PhysicalDepositAddressEntryViewModel(searchBarPlaceholder=" + this.searchBarPlaceholder + ", results=" + this.results + ", error=" + this.error + ")";
    }
}
