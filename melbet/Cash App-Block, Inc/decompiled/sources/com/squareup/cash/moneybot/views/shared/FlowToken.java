package com.squareup.cash.moneybot.views.shared;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes6.dex */
public interface FlowToken {

    public final class NewLine implements FlowToken {
        public static final NewLine INSTANCE = new NewLine();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewLine);
        }

        public final int hashCode() {
            return 854111549;
        }

        public final String toString() {
            return "NewLine";
        }
    }

    public final class Word implements FlowToken {
        public final AnnotatedString text;

        public Word(AnnotatedString annotatedString) {
            this.text = annotatedString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Word) && this.text.equals(((Word) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return "Word(text=" + ((Object) this.text) + ")";
        }
    }
}
