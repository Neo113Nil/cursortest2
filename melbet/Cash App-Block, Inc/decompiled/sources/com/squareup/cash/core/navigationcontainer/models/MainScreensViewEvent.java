package com.squareup.cash.core.navigationcontainer.models;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MainScreensViewEvent {

    public final class InAppNotificationEvent implements MainScreensViewEvent {
        public final AppMessageViewEvent event;

        public InAppNotificationEvent(AppMessageViewEvent appMessageViewEvent) {
            appMessageViewEvent.getClass();
            this.event = appMessageViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InAppNotificationEvent) && Intrinsics.areEqual(this.event, ((InAppNotificationEvent) obj).event);
        }

        public final AppMessageViewEvent getEvent() {
            return this.event;
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "InAppNotificationEvent(event=" + this.event + ")";
        }
    }

    public final class TapActivity implements MainScreensViewEvent {
        public final long analyticsBadgeCount;

        public TapActivity(long j) {
            this.analyticsBadgeCount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapActivity) && this.analyticsBadgeCount == ((TapActivity) obj).analyticsBadgeCount;
        }

        public final int hashCode() {
            return Long.hashCode(this.analyticsBadgeCount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.analyticsBadgeCount, "TapActivity(analyticsBadgeCount=", ")");
        }
    }

    public final class TapBanking implements MainScreensViewEvent {
        public final long analyticsBadgeCount;

        public TapBanking(long j) {
            this.analyticsBadgeCount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapBanking) && this.analyticsBadgeCount == ((TapBanking) obj).analyticsBadgeCount;
        }

        public final int hashCode() {
            return Long.hashCode(this.analyticsBadgeCount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.analyticsBadgeCount, "TapBanking(analyticsBadgeCount=", ")");
        }
    }

    public final class TapLocal implements MainScreensViewEvent {
        public final long analyticsBadgeCount;

        public TapLocal(long j) {
            this.analyticsBadgeCount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapLocal) && this.analyticsBadgeCount == ((TapLocal) obj).analyticsBadgeCount;
        }

        public final int hashCode() {
            return Long.hashCode(this.analyticsBadgeCount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.analyticsBadgeCount, "TapLocal(analyticsBadgeCount=", ")");
        }
    }

    public final class TapMoneybot implements MainScreensViewEvent {
        public static final TapMoneybot INSTANCE = new TapMoneybot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapMoneybot);
        }

        public final int hashCode() {
            return 1514607369;
        }

        public final String toString() {
            return "TapMoneybot";
        }
    }

    public final class TapSend implements MainScreensViewEvent {
        public final long analyticsBadgeCount;

        public TapSend(long j) {
            this.analyticsBadgeCount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapSend) && this.analyticsBadgeCount == ((TapSend) obj).analyticsBadgeCount;
        }

        public final int hashCode() {
            return Long.hashCode(this.analyticsBadgeCount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.analyticsBadgeCount, "TapSend(analyticsBadgeCount=", ")");
        }
    }

    public final class TooltipAppMessageEvent implements MainScreensViewEvent {
        public final TooltipAppMessageViewEvent event;

        public TooltipAppMessageEvent(TooltipAppMessageViewEvent tooltipAppMessageViewEvent) {
            tooltipAppMessageViewEvent.getClass();
            this.event = tooltipAppMessageViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TooltipAppMessageEvent) && Intrinsics.areEqual(this.event, ((TooltipAppMessageEvent) obj).event);
        }

        public final TooltipAppMessageViewEvent getEvent() {
            return this.event;
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TooltipAppMessageEvent(event=" + this.event + ")";
        }
    }
}
