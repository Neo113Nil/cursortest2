package com.squareup.cash.card.spendinginsights.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public interface RecurringPaymentInfoViewModel {

    public final class Content implements RecurringPaymentInfoViewModel {
        public final String body;
        public final String title;

        public Content(String str, String str2) {
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.body.equals(content.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Content(title=", this.title, ", body=", this.body, ")");
        }
    }

    public final class Empty implements RecurringPaymentInfoViewModel {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -252236272;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
