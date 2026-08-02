package com.squareup.cash.card.onboarding;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface ProductDetailsPageToastLabel {

    public final class Card implements ProductDetailsPageToastLabel {
        public final String name;

        public Card(String str) {
            this.name = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Card) && this.name.equals(((Card) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(name=", this.name, ")");
        }
    }

    public final class Heart implements ProductDetailsPageToastLabel {
        public static final Heart INSTANCE = new Heart();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Heart);
        }

        public final int hashCode() {
            return -950684658;
        }

        public final String toString() {
            return "Heart";
        }
    }

    public final class MiniCard implements ProductDetailsPageToastLabel {
        public static final MiniCard INSTANCE = new MiniCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MiniCard);
        }

        public final int hashCode() {
            return -1090627777;
        }

        public final String toString() {
            return "MiniCard";
        }
    }

    public final class Wand implements ProductDetailsPageToastLabel {
        public static final Wand INSTANCE = new Wand();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Wand);
        }

        public final int hashCode() {
            return 801060152;
        }

        public final String toString() {
            return "Wand";
        }
    }
}
