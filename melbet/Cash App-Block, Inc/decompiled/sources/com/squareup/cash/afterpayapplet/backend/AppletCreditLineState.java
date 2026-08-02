package com.squareup.cash.afterpayapplet.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface AppletCreditLineState {

    public final class AvailableCredit implements AppletCreditLineState {
        public final String limitText;

        public AvailableCredit(String str) {
            this.limitText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvailableCredit) && this.limitText.equals(((AvailableCredit) obj).limitText);
        }

        public final int hashCode() {
            return this.limitText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvailableCredit(limitText=", this.limitText, ")");
        }
    }

    public final class Error implements AppletCreditLineState {
        public final String text;

        public Error(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.text.equals(((Error) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(text=", this.text, ")");
        }
    }

    public final class LimitReached implements AppletCreditLineState {
        public final String text;

        public LimitReached(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LimitReached) && this.text.equals(((LimitReached) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LimitReached(text=", this.text, ")");
        }
    }

    public final class Loading implements AppletCreditLineState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1612841384;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
