package com.squareup.cash.earnings.viewmodels.streamdetail;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsStreamViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsStreamDetailViewModel {

    public final class LoadError implements EarningsStreamDetailViewModel {
        public final EarningsHomeViewModel.EarningsActivity activity;
        public final List filterOptions;
        public final DateFilter selectedFilter;
        public final StackedAvatarViewModel.Single streamAvatar;
        public final String streamName;

        public LoadError(String str, StackedAvatarViewModel.Single single, List list, DateFilter dateFilter, EarningsHomeViewModel.EarningsActivity earningsActivity) {
            str.getClass();
            list.getClass();
            this.streamName = str;
            this.streamAvatar = single;
            this.filterOptions = list;
            this.selectedFilter = dateFilter;
            this.activity = earningsActivity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadError)) {
                return false;
            }
            LoadError loadError = (LoadError) obj;
            return Intrinsics.areEqual(this.streamName, loadError.streamName) && this.streamAvatar.equals(loadError.streamAvatar) && Intrinsics.areEqual(this.filterOptions, loadError.filterOptions) && Intrinsics.areEqual(this.selectedFilter, loadError.selectedFilter) && this.activity.equals(loadError.activity);
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final EarningsHomeViewModel.EarningsActivity getActivity() {
            return this.activity;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final List getFilterOptions() {
            return this.filterOptions;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final DateFilter getSelectedFilter() {
            return this.selectedFilter;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final StackedAvatarViewModel.Single getStreamAvatar() {
            return this.streamAvatar;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final String getStreamName() {
            return this.streamName;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.streamAvatar.avatar.hashCode() + (this.streamName.hashCode() * 31)) * 31, 31, this.filterOptions);
            DateFilter dateFilter = this.selectedFilter;
            return this.activity.hashCode() + ((m + (dateFilter == null ? 0 : dateFilter.hashCode())) * 31);
        }

        public final String toString() {
            return "LoadError(streamName=" + this.streamName + ", streamAvatar=" + this.streamAvatar + ", filterOptions=" + this.filterOptions + ", selectedFilter=" + this.selectedFilter + ", activity=" + this.activity + ")";
        }
    }

    public final class Loaded implements EarningsStreamDetailViewModel {
        public final EarningsHomeViewModel.EarningsActivity activity;
        public final List filterOptions;
        public final String periodLabel;
        public final DateFilter selectedFilter;
        public final EarningsStreamViewModel stream;
        public final long totalEarningsRaw;
        public final String totalEarningsText;

        public Loaded(EarningsStreamViewModel earningsStreamViewModel, String str, String str2, long j, List list, DateFilter dateFilter, EarningsHomeViewModel.EarningsActivity earningsActivity) {
            str.getClass();
            list.getClass();
            this.stream = earningsStreamViewModel;
            this.periodLabel = str;
            this.totalEarningsText = str2;
            this.totalEarningsRaw = j;
            this.filterOptions = list;
            this.selectedFilter = dateFilter;
            this.activity = earningsActivity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.stream.equals(loaded.stream) && Intrinsics.areEqual(this.periodLabel, loaded.periodLabel) && this.totalEarningsText.equals(loaded.totalEarningsText) && this.totalEarningsRaw == loaded.totalEarningsRaw && Intrinsics.areEqual(this.filterOptions, loaded.filterOptions) && this.selectedFilter.equals(loaded.selectedFilter) && this.activity.equals(loaded.activity);
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final EarningsHomeViewModel.EarningsActivity getActivity() {
            return this.activity;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final List getFilterOptions() {
            return this.filterOptions;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final DateFilter getSelectedFilter() {
            return this.selectedFilter;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final StackedAvatarViewModel.Single getStreamAvatar() {
            return this.stream.avatar;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final String getStreamName() {
            return this.stream.name;
        }

        public final int hashCode() {
            return this.activity.hashCode() + ((this.selectedFilter.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stream.hashCode() * 31, 31, this.periodLabel), 31, this.totalEarningsText), 31, this.totalEarningsRaw), 31, this.filterOptions)) * 31);
        }

        public final String toString() {
            return "Loaded(stream=" + this.stream + ", periodLabel=" + this.periodLabel + ", totalEarningsText=" + this.totalEarningsText + ", totalEarningsRaw=" + this.totalEarningsRaw + ", filterOptions=" + this.filterOptions + ", selectedFilter=" + this.selectedFilter + ", activity=" + this.activity + ")";
        }
    }

    public final class Loading implements EarningsStreamDetailViewModel {
        public final EarningsHomeViewModel.EarningsActivity activity;
        public final List filterOptions;
        public final DateFilter selectedFilter;
        public final StackedAvatarViewModel.Single streamAvatar;
        public final String streamName;

        public Loading(String str, StackedAvatarViewModel.Single single, List list, DateFilter dateFilter, EarningsHomeViewModel.EarningsActivity earningsActivity) {
            str.getClass();
            list.getClass();
            this.streamName = str;
            this.streamAvatar = single;
            this.filterOptions = list;
            this.selectedFilter = dateFilter;
            this.activity = earningsActivity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.streamName, loading.streamName) && Intrinsics.areEqual(this.streamAvatar, loading.streamAvatar) && Intrinsics.areEqual(this.filterOptions, loading.filterOptions) && Intrinsics.areEqual(this.selectedFilter, loading.selectedFilter) && Intrinsics.areEqual(this.activity, loading.activity);
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final EarningsHomeViewModel.EarningsActivity getActivity() {
            return this.activity;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final List getFilterOptions() {
            return this.filterOptions;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final DateFilter getSelectedFilter() {
            return this.selectedFilter;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final StackedAvatarViewModel.Single getStreamAvatar() {
            return this.streamAvatar;
        }

        @Override // com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel
        public final String getStreamName() {
            return this.streamName;
        }

        public final int hashCode() {
            int hashCode = this.streamName.hashCode() * 31;
            StackedAvatarViewModel.Single single = this.streamAvatar;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (single == null ? 0 : single.avatar.hashCode())) * 31, 31, this.filterOptions);
            DateFilter dateFilter = this.selectedFilter;
            int hashCode2 = (m + (dateFilter == null ? 0 : dateFilter.hashCode())) * 31;
            EarningsHomeViewModel.EarningsActivity earningsActivity = this.activity;
            return hashCode2 + (earningsActivity != null ? earningsActivity.hashCode() : 0);
        }

        public final String toString() {
            return "Loading(streamName=" + this.streamName + ", streamAvatar=" + this.streamAvatar + ", filterOptions=" + this.filterOptions + ", selectedFilter=" + this.selectedFilter + ", activity=" + this.activity + ")";
        }
    }

    EarningsHomeViewModel.EarningsActivity getActivity();

    List getFilterOptions();

    DateFilter getSelectedFilter();

    StackedAvatarViewModel.Single getStreamAvatar();

    String getStreamName();
}
