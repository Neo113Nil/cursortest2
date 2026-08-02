package app.cash.local.views.pos;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public interface TransitionStep {

    public final class BrandCardStep implements TransitionStep {
        public static final BrandCardStep INSTANCE = new BrandCardStep();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandCardStep);
        }

        public final int hashCode() {
            return -563353023;
        }

        public final String toString() {
            return "BrandCardStep";
        }
    }

    public final class BrandCardWithAllTextsStep implements TransitionStep {
        public static final BrandCardWithAllTextsStep INSTANCE = new BrandCardWithAllTextsStep();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandCardWithAllTextsStep);
        }

        public final int hashCode() {
            return 1763265548;
        }

        public final String toString() {
            return "BrandCardWithAllTextsStep";
        }
    }

    public final class InitialStep implements TransitionStep {
        public final long delay;

        public InitialStep(long j) {
            this.delay = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialStep) && Duration.m4166equalsimpl0(this.delay, ((InitialStep) obj).delay);
        }

        public final int hashCode() {
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.delay);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InitialStep(delay=", Duration.m4177toStringimpl(this.delay), ")");
        }
    }

    public final class LegalConsentStep implements TransitionStep {
        public static final LegalConsentStep INSTANCE = new LegalConsentStep();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LegalConsentStep);
        }

        public final int hashCode() {
            return -340306641;
        }

        public final String toString() {
            return "LegalConsentStep";
        }
    }

    public final class LocalCashCardStep implements TransitionStep {
        public static final LocalCashCardStep INSTANCE = new LocalCashCardStep();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocalCashCardStep);
        }

        public final int hashCode() {
            return -1219290632;
        }

        public final String toString() {
            return "LocalCashCardStep";
        }
    }
}
