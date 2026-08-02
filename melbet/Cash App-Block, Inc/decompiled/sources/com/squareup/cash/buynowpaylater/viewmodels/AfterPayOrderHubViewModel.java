package com.squareup.cash.buynowpaylater.viewmodels;

import androidx.paging.PagingData;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubViewModel {
    public final LoadingViewModel loadingViewModel;
    public final PagingData pagingData;

    public final class LoadingViewModel {
        public final AfterPayOrderHubLoadingStatus.InitialLoadStatus initialLoadStatus;
        public final AfterPayOrderHubLoadingStatus.PaginatedLoadStatus paginatedLoadStatus;

        public LoadingViewModel(AfterPayOrderHubLoadingStatus.InitialLoadStatus initialLoadStatus, AfterPayOrderHubLoadingStatus.PaginatedLoadStatus paginatedLoadStatus) {
            this.initialLoadStatus = initialLoadStatus;
            this.paginatedLoadStatus = paginatedLoadStatus;
        }

        public static LoadingViewModel copy$default(LoadingViewModel loadingViewModel, AfterPayOrderHubLoadingStatus.InitialLoadStatus initialLoadStatus, AfterPayOrderHubLoadingStatus.PaginatedLoadStatus paginatedLoadStatus, int i) {
            if ((i & 1) != 0) {
                initialLoadStatus = loadingViewModel.initialLoadStatus;
            }
            if ((i & 2) != 0) {
                paginatedLoadStatus = loadingViewModel.paginatedLoadStatus;
            }
            loadingViewModel.getClass();
            initialLoadStatus.getClass();
            paginatedLoadStatus.getClass();
            return new LoadingViewModel(initialLoadStatus, paginatedLoadStatus);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingViewModel)) {
                return false;
            }
            LoadingViewModel loadingViewModel = (LoadingViewModel) obj;
            return this.initialLoadStatus.equals(loadingViewModel.initialLoadStatus) && this.paginatedLoadStatus.equals(loadingViewModel.paginatedLoadStatus);
        }

        public final int hashCode() {
            return this.paginatedLoadStatus.hashCode() + (this.initialLoadStatus.hashCode() * 31);
        }

        public final String toString() {
            return "LoadingViewModel(initialLoadStatus=" + this.initialLoadStatus + ", paginatedLoadStatus=" + this.paginatedLoadStatus + ")";
        }
    }

    public AfterPayOrderHubViewModel(LoadingViewModel loadingViewModel, PagingData pagingData) {
        loadingViewModel.getClass();
        pagingData.getClass();
        this.loadingViewModel = loadingViewModel;
        this.pagingData = pagingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayOrderHubViewModel)) {
            return false;
        }
        AfterPayOrderHubViewModel afterPayOrderHubViewModel = (AfterPayOrderHubViewModel) obj;
        return Intrinsics.areEqual(this.loadingViewModel, afterPayOrderHubViewModel.loadingViewModel) && Intrinsics.areEqual(this.pagingData, afterPayOrderHubViewModel.pagingData);
    }

    public final int hashCode() {
        return this.pagingData.hashCode() + (this.loadingViewModel.hashCode() * 31);
    }

    public final String toString() {
        return "AfterPayOrderHubViewModel(loadingViewModel=" + this.loadingViewModel + ", pagingData=" + this.pagingData + ")";
    }
}
