package com.squareup.cash.pools.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class PoolMemberListViewModel {
    public final boolean canAddPeople;
    public final FailureDialogViewModel failureDialog;
    public final boolean hasReachedMemberLimit;
    public final boolean isOwner;
    public final boolean isOwnerRowTapEnabled;
    public final MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBar;
    public final ImmutableList people;
    public final PoolOwnerInformation poolOwner;
    public final String title;

    public PoolMemberListViewModel(String str, PoolOwnerInformation poolOwnerInformation, ImmutableList immutableList, boolean z, boolean z2, boolean z3, MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel, FailureDialogViewModel failureDialogViewModel, boolean z4) {
        immutableList.getClass();
        this.title = str;
        this.poolOwner = poolOwnerInformation;
        this.people = immutableList;
        this.isOwner = z;
        this.isOwnerRowTapEnabled = z2;
        this.hasReachedMemberLimit = z3;
        this.memberStatusUpdateSnackBar = memberStatusUpdateSnackBarViewModel;
        this.failureDialog = failureDialogViewModel;
        this.canAddPeople = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolMemberListViewModel)) {
            return false;
        }
        PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
        return this.title.equals(poolMemberListViewModel.title) && this.poolOwner.equals(poolMemberListViewModel.poolOwner) && Intrinsics.areEqual(this.people, poolMemberListViewModel.people) && this.isOwner == poolMemberListViewModel.isOwner && this.isOwnerRowTapEnabled == poolMemberListViewModel.isOwnerRowTapEnabled && this.hasReachedMemberLimit == poolMemberListViewModel.hasReachedMemberLimit && Intrinsics.areEqual(this.memberStatusUpdateSnackBar, poolMemberListViewModel.memberStatusUpdateSnackBar) && Intrinsics.areEqual(this.failureDialog, poolMemberListViewModel.failureDialog) && this.canAddPeople == poolMemberListViewModel.canAddPeople;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.people, (this.poolOwner.hashCode() + (this.title.hashCode() * 31)) * 31, 31), 31, this.isOwner), 31, this.isOwnerRowTapEnabled), 31, this.hasReachedMemberLimit);
        MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel = this.memberStatusUpdateSnackBar;
        int hashCode = (m + (memberStatusUpdateSnackBarViewModel == null ? 0 : memberStatusUpdateSnackBarViewModel.hashCode())) * 31;
        FailureDialogViewModel failureDialogViewModel = this.failureDialog;
        return Boolean.hashCode(this.canAddPeople) + ((hashCode + (failureDialogViewModel != null ? failureDialogViewModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoolMemberListViewModel(title=");
        sb.append(this.title);
        sb.append(", poolOwner=");
        sb.append(this.poolOwner);
        sb.append(", people=");
        sb.append(this.people);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", isOwnerRowTapEnabled=");
        re$$ExternalSyntheticOutline0.m(sb, this.isOwnerRowTapEnabled, ", hasReachedMemberLimit=", this.hasReachedMemberLimit, ", memberStatusUpdateSnackBar=");
        sb.append(this.memberStatusUpdateSnackBar);
        sb.append(", failureDialog=");
        sb.append(this.failureDialog);
        sb.append(", canAddPeople=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.canAddPeople, ")");
    }
}
