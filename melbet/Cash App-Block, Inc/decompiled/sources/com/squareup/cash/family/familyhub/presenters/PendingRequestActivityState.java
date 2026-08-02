package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PendingRequestActivityState {

    public final class Failed extends PendingRequestActivityState {
        public static final Failed INSTANCE = new Failed();
    }

    public final class Loaded extends PendingRequestActivityState {
        public final FormattedPaymentHistoryActivityItem activityItem;
        public final String buttonUrl;

        public Loaded(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, String str) {
            this.activityItem = formattedPaymentHistoryActivityItem;
            this.buttonUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.activityItem.equals(loaded.activityItem) && Intrinsics.areEqual(this.buttonUrl, loaded.buttonUrl);
        }

        public final int hashCode() {
            int hashCode = this.activityItem.hashCode() * 31;
            String str = this.buttonUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Loaded(activityItem=" + this.activityItem + ", buttonUrl=" + this.buttonUrl + ")";
        }
    }

    public final class Loading extends PendingRequestActivityState {
        public static final Loading INSTANCE = new Loading();
    }
}
