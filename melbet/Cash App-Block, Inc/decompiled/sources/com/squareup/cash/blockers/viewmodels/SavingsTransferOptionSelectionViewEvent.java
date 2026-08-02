package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public interface SavingsTransferOptionSelectionViewEvent {

    public final class Back implements SavingsTransferOptionSelectionViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 2136127247;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Dismiss implements SavingsTransferOptionSelectionViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 855371618;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class SelectTransferOption implements SavingsTransferOptionSelectionViewEvent {
        public final String id;

        public SelectTransferOption(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTransferOption) && this.id.equals(((SelectTransferOption) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectTransferOption(id=", this.id, ")");
        }
    }
}
