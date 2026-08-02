package com.squareup.cash.blockers.views;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public interface SwitchToEmailState {

    public final class Handled implements SwitchToEmailState {
        public static final Handled INSTANCE = new Handled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Handled);
        }

        public final int hashCode() {
            return 1206711989;
        }

        public final String toString() {
            return "Handled";
        }
    }

    public final class Unhandled implements SwitchToEmailState {
        public final String input;

        public Unhandled(String str) {
            this.input = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unhandled) && this.input.equals(((Unhandled) obj).input);
        }

        public final int hashCode() {
            return this.input.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unhandled(input=", this.input, ")");
        }
    }
}
