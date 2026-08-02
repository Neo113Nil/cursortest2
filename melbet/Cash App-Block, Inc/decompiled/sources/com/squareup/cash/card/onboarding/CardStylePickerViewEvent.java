package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface CardStylePickerViewEvent {

    public final class CardSelected implements CardStylePickerViewEvent {
        public final int cardOptionIndex;

        public CardSelected(int i) {
            this.cardOptionIndex = i;
        }
    }

    public final class Exit implements CardStylePickerViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 2125693471;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class OnScrollToTheme implements CardStylePickerViewEvent {
        public final int cardIndex;
        public final String themeToken;

        public OnScrollToTheme(String str, int i) {
            this.themeToken = str;
            this.cardIndex = i;
        }
    }
}
