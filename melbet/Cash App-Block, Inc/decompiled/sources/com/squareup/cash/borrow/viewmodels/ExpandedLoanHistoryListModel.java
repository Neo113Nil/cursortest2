package com.squareup.cash.borrow.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.PagingData;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ExpandedLoanHistoryListModel {
    public final BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData data;
    public final List initialLoans;
    public final PagingData pagedLoans;

    public ExpandedLoanHistoryListModel(BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData, List list, PagingData pagingData) {
        expandedLoanListViewData.getClass();
        list.getClass();
        pagingData.getClass();
        this.data = expandedLoanListViewData;
        this.initialLoans = list;
        this.pagedLoans = pagingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedLoanHistoryListModel)) {
            return false;
        }
        ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj;
        return Intrinsics.areEqual(this.data, expandedLoanHistoryListModel.data) && Intrinsics.areEqual(this.initialLoans, expandedLoanHistoryListModel.initialLoans) && Intrinsics.areEqual(this.pagedLoans, expandedLoanHistoryListModel.pagedLoans);
    }

    public final int hashCode() {
        return this.pagedLoans.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.data.hashCode() * 31, 31, this.initialLoans);
    }

    public final String toString() {
        return "ExpandedLoanHistoryListModel(data=" + this.data + ", initialLoans=" + this.initialLoans + ", pagedLoans=" + this.pagedLoans + ")";
    }
}
