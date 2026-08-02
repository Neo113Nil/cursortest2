package com.squareup.cash.earnings.views.payers;

import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;

/* loaded from: classes6.dex */
public interface PresentationStyle {

    public final class FullScreen implements PresentationStyle {
        public static final FullScreen INSTANCE = new FullScreen();
        public static final ButtonCtaGroupOrientation buttonOrientation = ButtonCtaGroupOrientation.VERTICAL;
        public static final boolean showButtonDivider = true;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FullScreen);
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final ButtonCtaGroupOrientation getButtonOrientation() {
            return buttonOrientation;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean getShowButtonDivider() {
            return showButtonDivider;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean getShowTitleBar() {
            return true;
        }

        public final int hashCode() {
            return 1443893071;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean isOverlay() {
            return false;
        }

        public final String toString() {
            return "FullScreen";
        }
    }

    public final class Overlay implements PresentationStyle {
        public static final Overlay INSTANCE = new Overlay();
        public static final ButtonCtaGroupOrientation buttonOrientation = ButtonCtaGroupOrientation.AUTOMATIC;
        public static final boolean isOverlay = true;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Overlay);
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final ButtonCtaGroupOrientation getButtonOrientation() {
            return buttonOrientation;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean getShowButtonDivider() {
            return false;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean getShowTitleBar() {
            return false;
        }

        public final int hashCode() {
            return 214102364;
        }

        @Override // com.squareup.cash.earnings.views.payers.PresentationStyle
        public final boolean isOverlay() {
            return isOverlay;
        }

        public final String toString() {
            return "Overlay";
        }
    }

    ButtonCtaGroupOrientation getButtonOrientation();

    boolean getShowButtonDivider();

    boolean getShowTitleBar();

    boolean isOverlay();
}
