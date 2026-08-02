package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public interface HelpOptionsViewEvent {

    public final class CancelClick implements HelpOptionsViewEvent {
        public static final CancelClick INSTANCE = new CancelClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClick);
        }

        public final int hashCode() {
            return 1572076308;
        }

        public final String toString() {
            return "CancelClick";
        }
    }

    public final class OptionSelected implements HelpOptionsViewEvent {
        public final int helpItemPosition;

        public OptionSelected(int i) {
            this.helpItemPosition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionSelected) && this.helpItemPosition == ((OptionSelected) obj).helpItemPosition;
        }

        public final int hashCode() {
            return Integer.hashCode(this.helpItemPosition);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.helpItemPosition, "OptionSelected(helpItemPosition=", ")");
        }
    }
}
