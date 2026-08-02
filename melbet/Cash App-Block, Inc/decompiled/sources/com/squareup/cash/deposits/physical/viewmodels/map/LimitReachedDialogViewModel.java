package com.squareup.cash.deposits.physical.viewmodels.map;

import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitReachedDialogViewModel {
    public final PaperCashDepositBlocker.LimitsReachedDialog dialog;

    public LimitReachedDialogViewModel(PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog) {
        limitsReachedDialog.getClass();
        this.dialog = limitsReachedDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitReachedDialogViewModel) && Intrinsics.areEqual(this.dialog, ((LimitReachedDialogViewModel) obj).dialog);
    }

    public final int hashCode() {
        return this.dialog.hashCode();
    }

    public final String toString() {
        return "LimitReachedDialogViewModel(dialog=" + this.dialog + ")";
    }
}
