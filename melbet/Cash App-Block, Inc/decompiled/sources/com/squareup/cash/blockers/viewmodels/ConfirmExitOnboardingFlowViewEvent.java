package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface ConfirmExitOnboardingFlowViewEvent {

    public final class Continue implements ConfirmExitOnboardingFlowViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -496048533;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class ExitFlow implements ConfirmExitOnboardingFlowViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return -2051987152;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }
}
