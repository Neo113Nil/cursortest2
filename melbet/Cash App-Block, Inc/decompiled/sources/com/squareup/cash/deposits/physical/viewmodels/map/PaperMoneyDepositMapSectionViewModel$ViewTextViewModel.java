package com.squareup.cash.deposits.physical.viewmodels.map;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapSectionViewModel$ViewTextViewModel extends TaskUtil {
    public final PaperCashDepositBlocker.MapScreen mapScreen;

    public PaperMoneyDepositMapSectionViewModel$ViewTextViewModel(PaperCashDepositBlocker.MapScreen mapScreen) {
        mapScreen.getClass();
        this.mapScreen = mapScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaperMoneyDepositMapSectionViewModel$ViewTextViewModel) && Intrinsics.areEqual(this.mapScreen, ((PaperMoneyDepositMapSectionViewModel$ViewTextViewModel) obj).mapScreen);
    }

    public final int hashCode() {
        return this.mapScreen.hashCode();
    }

    public final String toString() {
        return "ViewTextViewModel(mapScreen=" + this.mapScreen + ")";
    }
}
