package com.squareup.cash.benefits.applets.viewmodels;

/* loaded from: classes5.dex */
public interface BankingBenefitsAppletTileEvent {

    public final class OnAppletTileClick implements BankingBenefitsAppletTileEvent {
        public static final OnAppletTileClick INSTANCE = new OnAppletTileClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnAppletTileClick);
        }

        public final int hashCode() {
            return -1100015411;
        }

        public final String toString() {
            return "OnAppletTileClick";
        }
    }

    public final class OnPromotedAppletTileClick implements BankingBenefitsAppletTileEvent {
        public static final OnPromotedAppletTileClick INSTANCE = new OnPromotedAppletTileClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPromotedAppletTileClick);
        }

        public final int hashCode() {
            return -78909815;
        }

        public final String toString() {
            return "OnPromotedAppletTileClick";
        }
    }
}
