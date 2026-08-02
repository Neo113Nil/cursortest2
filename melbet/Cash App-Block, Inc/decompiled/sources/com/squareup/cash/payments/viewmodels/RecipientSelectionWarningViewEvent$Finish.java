package com.squareup.cash.payments.viewmodels;

import com.squareup.cash.mooncake.screens.AlertDialogResult;

/* loaded from: classes6.dex */
public final class RecipientSelectionWarningViewEvent$Finish {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSelectionWarningViewEvent$Finish)) {
            return false;
        }
        Object obj2 = AlertDialogResult.POSITIVE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return AlertDialogResult.POSITIVE.hashCode();
    }

    public final String toString() {
        return "Finish(result=" + AlertDialogResult.POSITIVE + ")";
    }
}
