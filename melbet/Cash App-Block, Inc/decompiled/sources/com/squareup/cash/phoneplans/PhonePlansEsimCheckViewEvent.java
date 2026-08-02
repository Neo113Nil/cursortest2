package com.squareup.cash.phoneplans;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface PhonePlansEsimCheckViewEvent {

    public final class CtaClicked implements PhonePlansEsimCheckViewEvent {
        public final String action;

        public CtaClicked(String str) {
            this.action = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CtaClicked) && this.action.equals(((CtaClicked) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CtaClicked(action=", this.action, ")");
        }
    }

    public final class ToolbarButtonClicked implements PhonePlansEsimCheckViewEvent {
        public static final ToolbarButtonClicked INSTANCE = new ToolbarButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToolbarButtonClicked);
        }

        public final int hashCode() {
            return 2023638061;
        }

        public final String toString() {
            return "ToolbarButtonClicked";
        }
    }
}
