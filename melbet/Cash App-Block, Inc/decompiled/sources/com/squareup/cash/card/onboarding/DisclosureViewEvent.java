package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface DisclosureViewEvent {

    public final class Exit implements DisclosureViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 846945547;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class OnBack implements DisclosureViewEvent {
        public static final OnBack INSTANCE = new OnBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBack);
        }

        public final int hashCode() {
            return -1853236205;
        }

        public final String toString() {
            return "OnBack";
        }
    }

    public final class OnCloseDialog implements DisclosureViewEvent {
        public static final OnCloseDialog INSTANCE = new OnCloseDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseDialog);
        }

        public final int hashCode() {
            return 700214452;
        }

        public final String toString() {
            return "OnCloseDialog";
        }
    }

    public final class OnDialogNegative implements DisclosureViewEvent {
        public static final OnDialogNegative INSTANCE = new OnDialogNegative();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnDialogNegative);
        }

        public final int hashCode() {
            return 475493833;
        }

        public final String toString() {
            return "OnDialogNegative";
        }
    }

    public final class OnDialogPositive implements DisclosureViewEvent {
        public static final OnDialogPositive INSTANCE = new OnDialogPositive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnDialogPositive);
        }

        public final int hashCode() {
            return 302187405;
        }

        public final String toString() {
            return "OnDialogPositive";
        }
    }

    public final class OnScrollChange implements DisclosureViewEvent {
        public static final OnScrollChange INSTANCE = new OnScrollChange();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnScrollChange);
        }

        public final int hashCode() {
            return -1286421495;
        }

        public final String toString() {
            return "OnScrollChange";
        }
    }

    public final class OpenUrl implements DisclosureViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }
    }

    public final class SubmitViewClick implements DisclosureViewEvent {
        public static final SubmitViewClick INSTANCE = new SubmitViewClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitViewClick);
        }

        public final int hashCode() {
            return 1149667998;
        }

        public final String toString() {
            return "SubmitViewClick";
        }
    }
}
