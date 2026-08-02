package com.squareup.cash.pools.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class PoolMoreOptionsBottomSheetViewModel {
    public final boolean canManagePool;
    public final boolean hasLeavePoolOption;
    public final boolean isPoolClosed;
    public final boolean poolHasBalance;

    public PoolMoreOptionsBottomSheetViewModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isPoolClosed = z;
        this.canManagePool = z2;
        this.hasLeavePoolOption = z3;
        this.poolHasBalance = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolMoreOptionsBottomSheetViewModel)) {
            return false;
        }
        PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel = (PoolMoreOptionsBottomSheetViewModel) obj;
        return this.isPoolClosed == poolMoreOptionsBottomSheetViewModel.isPoolClosed && this.canManagePool == poolMoreOptionsBottomSheetViewModel.canManagePool && this.hasLeavePoolOption == poolMoreOptionsBottomSheetViewModel.hasLeavePoolOption && this.poolHasBalance == poolMoreOptionsBottomSheetViewModel.poolHasBalance;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.poolHasBalance) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isPoolClosed) * 31, 31, this.canManagePool), 31, this.hasLeavePoolOption);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("PoolMoreOptionsBottomSheetViewModel(isPoolClosed=", ", canManagePool=", ", hasLeavePoolOption=", this.isPoolClosed, this.canManagePool), this.hasLeavePoolOption, ", poolHasBalance=", this.poolHasBalance, ")");
    }
}
