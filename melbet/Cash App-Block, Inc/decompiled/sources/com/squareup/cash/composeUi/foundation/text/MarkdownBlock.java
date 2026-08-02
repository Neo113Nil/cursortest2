package com.squareup.cash.composeUi.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MarkdownBlock {

    public final class OrderedListItem implements MarkdownBlock {
        public final AnnotatedString annotatedString;
        public final String number;

        public OrderedListItem(String str, AnnotatedString annotatedString) {
            str.getClass();
            this.number = str;
            this.annotatedString = annotatedString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderedListItem)) {
                return false;
            }
            OrderedListItem orderedListItem = (OrderedListItem) obj;
            return Intrinsics.areEqual(this.number, orderedListItem.number) && this.annotatedString.equals(orderedListItem.annotatedString);
        }

        public final int hashCode() {
            return this.annotatedString.hashCode() + (this.number.hashCode() * 31);
        }

        public final String toString() {
            return "OrderedListItem(number=" + this.number + ", annotatedString=" + ((Object) this.annotatedString) + ")";
        }
    }

    public final class Text implements MarkdownBlock {
        public final AnnotatedString annotatedString;

        public Text(AnnotatedString annotatedString) {
            this.annotatedString = annotatedString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && this.annotatedString.equals(((Text) obj).annotatedString);
        }

        public final int hashCode() {
            return this.annotatedString.hashCode();
        }

        public final String toString() {
            return "Text(annotatedString=" + ((Object) this.annotatedString) + ")";
        }
    }

    public final class UnorderedListItem implements MarkdownBlock {
        public final AnnotatedString annotatedString;

        public UnorderedListItem(AnnotatedString annotatedString) {
            this.annotatedString = annotatedString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnorderedListItem) && this.annotatedString.equals(((UnorderedListItem) obj).annotatedString);
        }

        public final int hashCode() {
            return this.annotatedString.hashCode();
        }

        public final String toString() {
            return "UnorderedListItem(annotatedString=" + ((Object) this.annotatedString) + ")";
        }
    }
}
