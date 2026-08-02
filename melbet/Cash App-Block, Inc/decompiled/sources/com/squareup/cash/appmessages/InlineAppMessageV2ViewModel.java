package com.squareup.cash.appmessages;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface InlineAppMessageV2ViewModel {

    public final class NotAvailable implements InlineAppMessageV2ViewModel {
        public static final NotAvailable INSTANCE = new NotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotAvailable);
        }

        public final int hashCode() {
            return -845726130;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }

    public final class Ready implements InlineAppMessageV2ViewModel {
        public final UiAvatar avatar;
        public final String messageToken;
        public final OnDemandMessageAnalyticsData onDemandAnalytics;
        public final int priority;
        public final String subtitle;
        public final String title;
        public final String url;

        public Ready(String str, UiAvatar uiAvatar, String str2, String str3, String str4, int i, OnDemandMessageAnalyticsData onDemandMessageAnalyticsData) {
            str.getClass();
            uiAvatar.getClass();
            this.messageToken = str;
            this.avatar = uiAvatar;
            this.title = str2;
            this.subtitle = str3;
            this.url = str4;
            this.priority = i;
            this.onDemandAnalytics = onDemandMessageAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.messageToken, ready.messageToken) && Intrinsics.areEqual(this.avatar, ready.avatar) && Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.subtitle, ready.subtitle) && Intrinsics.areEqual(this.url, ready.url) && this.priority == ready.priority && Intrinsics.areEqual(this.onDemandAnalytics, ready.onDemandAnalytics);
        }

        public final int hashCode() {
            int hashCode = (this.avatar.hashCode() + (this.messageToken.hashCode() * 31)) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            OnDemandMessageAnalyticsData onDemandMessageAnalyticsData = this.onDemandAnalytics;
            return m + (onDemandMessageAnalyticsData != null ? onDemandMessageAnalyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(messageToken=");
            sb.append(this.messageToken);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", url=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.url, ", priority=", this.priority, ", onDemandAnalytics=");
            sb.append(this.onDemandAnalytics);
            sb.append(")");
            return sb.toString();
        }
    }
}
