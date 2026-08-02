package com.squareup.cash.common.messaging.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public final class FailureMessageDialogViewEvent$Close {
    public static final FailureMessageDialogViewEvent$Close INSTANCE = new FailureMessageDialogViewEvent$Close();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FailureMessageDialogViewEvent$Close);
    }

    public final int hashCode() {
        return -819726090;
    }

    public final String toString() {
        return Constants.META_CLOSE;
    }
}
