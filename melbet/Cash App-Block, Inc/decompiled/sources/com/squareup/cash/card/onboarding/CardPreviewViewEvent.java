package com.squareup.cash.card.onboarding;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface CardPreviewViewEvent {

    public final class Back implements CardPreviewViewEvent {
        public final int averageFps;

        public Back(int i) {
            this.averageFps = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Back) && this.averageFps == ((Back) obj).averageFps;
        }

        public final int hashCode() {
            return Integer.hashCode(this.averageFps);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.averageFps, "Back(averageFps=", ")");
        }
    }

    public final class Exit implements CardPreviewViewEvent {
        public final int averageFps;

        public Exit(int i) {
            this.averageFps = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Exit) && this.averageFps == ((Exit) obj).averageFps;
        }

        public final int hashCode() {
            return Integer.hashCode(this.averageFps);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.averageFps, "Exit(averageFps=", ")");
        }
    }

    public final class OrderCard implements CardPreviewViewEvent {
        public final int averageFps;

        public OrderCard(int i) {
            this.averageFps = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderCard) && this.averageFps == ((OrderCard) obj).averageFps;
        }

        public final int hashCode() {
            return Integer.hashCode(this.averageFps);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.averageFps, "OrderCard(averageFps=", ")");
        }
    }

    public final class PersonalizeCard implements CardPreviewViewEvent {
        public final int averageFps;

        public PersonalizeCard(int i) {
            this.averageFps = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PersonalizeCard) && this.averageFps == ((PersonalizeCard) obj).averageFps;
        }

        public final int hashCode() {
            return Integer.hashCode(this.averageFps);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.averageFps, "PersonalizeCard(averageFps=", ")");
        }
    }
}
