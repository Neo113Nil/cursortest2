package com.squareup.cash.history.viewmodels;

import android.os.Parcelable;
import com.squareup.cash.mooncake.screens.AlertDialogResult;

/* loaded from: classes6.dex */
public interface CheckStatusViewEvent {

    public final class NegativeClicked implements CheckStatusViewEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NegativeClicked)) {
                return false;
            }
            Parcelable.Creator<AlertDialogResult> creator = AlertDialogResult.CREATOR;
            return true;
        }

        public final int hashCode() {
            return AlertDialogResult.NEGATIVE.hashCode();
        }

        public final String toString() {
            return "NegativeClicked(result=" + AlertDialogResult.NEGATIVE + ")";
        }
    }

    public final class PositiveClicked implements CheckStatusViewEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PositiveClicked)) {
                return false;
            }
            Parcelable.Creator<AlertDialogResult> creator = AlertDialogResult.CREATOR;
            return true;
        }

        public final int hashCode() {
            return AlertDialogResult.POSITIVE.hashCode();
        }

        public final String toString() {
            return "PositiveClicked(result=" + AlertDialogResult.POSITIVE + ")";
        }
    }
}
