package com.squareup.cash.activity.presenters;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface ActivityItemCallbackEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AnalyticsEvent implements ActivityItemCallbackEvent {
        public static final /* synthetic */ AnalyticsEvent[] $VALUES;
        public static final AnalyticsEvent AvatarTapped;
        public static final AnalyticsEvent ButtonTapped;
        public static final AnalyticsEvent ItemComplete;
        public static final AnalyticsEvent ItemTapped;
        public static final AnalyticsEvent ItemViewed;
        public static final AnalyticsEvent LinkOpened;
        public static final AnalyticsEvent ReceiptOpened;

        static {
            AnalyticsEvent analyticsEvent = new AnalyticsEvent("AvatarTapped", 0);
            AvatarTapped = analyticsEvent;
            AnalyticsEvent analyticsEvent2 = new AnalyticsEvent("ButtonTapped", 1);
            ButtonTapped = analyticsEvent2;
            AnalyticsEvent analyticsEvent3 = new AnalyticsEvent("ItemTapped", 2);
            ItemTapped = analyticsEvent3;
            AnalyticsEvent analyticsEvent4 = new AnalyticsEvent("ReceiptOpened", 3);
            ReceiptOpened = analyticsEvent4;
            AnalyticsEvent analyticsEvent5 = new AnalyticsEvent("LinkOpened", 4);
            LinkOpened = analyticsEvent5;
            AnalyticsEvent analyticsEvent6 = new AnalyticsEvent("ItemViewed", 5);
            ItemViewed = analyticsEvent6;
            AnalyticsEvent analyticsEvent7 = new AnalyticsEvent("ItemComplete", 6);
            ItemComplete = analyticsEvent7;
            $VALUES = new AnalyticsEvent[]{analyticsEvent, analyticsEvent2, analyticsEvent3, analyticsEvent4, analyticsEvent5, analyticsEvent6, analyticsEvent7};
        }

        public static AnalyticsEvent valueOf(String str) {
            return (AnalyticsEvent) Enum.valueOf(AnalyticsEvent.class, str);
        }

        public static AnalyticsEvent[] values() {
            return (AnalyticsEvent[]) $VALUES.clone();
        }
    }

    public final class DismissBadge implements ActivityItemCallbackEvent {
        public static final DismissBadge INSTANCE = new DismissBadge();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissBadge);
        }

        public final int hashCode() {
            return -2017144022;
        }

        public final String toString() {
            return "DismissBadge";
        }
    }

    public final class ShowProgress implements ActivityItemCallbackEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowProgress);
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "ShowProgress(show=true)";
        }
    }

    public final class ShowReactionPicker implements ActivityItemCallbackEvent {
        public final boolean show;

        public ShowReactionPicker(boolean z) {
            this.show = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowReactionPicker) && this.show == ((ShowReactionPicker) obj).show;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.show);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ShowReactionPicker(show=", ")", this.show);
        }
    }
}
