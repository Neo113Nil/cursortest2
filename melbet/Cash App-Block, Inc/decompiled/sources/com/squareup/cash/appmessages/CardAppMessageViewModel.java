package com.squareup.cash.appmessages;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public interface CardAppMessageViewModel {

    public final class NotAvailable implements CardAppMessageViewModel {
        public static final NotAvailable INSTANCE = new NotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotAvailable);
        }

        public final int hashCode() {
            return -1559283095;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }

    public final class Ready implements CardAppMessageViewModel {
        public final StringUtilsKt actions;
        public final AppMessageImage image;
        public final String messageToken;
        public final OnDemandMessageAnalyticsData onDemandAnalytics;
        public final int priority;
        public final String subtitle;
        public final String title;

        public Ready(String str, AppMessageImage appMessageImage, String str2, String str3, int i, StringUtilsKt stringUtilsKt, OnDemandMessageAnalyticsData onDemandMessageAnalyticsData) {
            str.getClass();
            str2.getClass();
            this.messageToken = str;
            this.image = appMessageImage;
            this.title = str2;
            this.subtitle = str3;
            this.priority = i;
            this.actions = stringUtilsKt;
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
            return Intrinsics.areEqual(this.messageToken, ready.messageToken) && Intrinsics.areEqual(this.image, ready.image) && Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.subtitle, ready.subtitle) && this.priority == ready.priority && Intrinsics.areEqual(this.actions, ready.actions) && Intrinsics.areEqual(this.onDemandAnalytics, ready.onDemandAnalytics);
        }

        public final int hashCode() {
            int hashCode = this.messageToken.hashCode() * 31;
            AppMessageImage appMessageImage = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (appMessageImage == null ? 0 : appMessageImage.hashCode())) * 31, 31, this.title);
            String str = this.subtitle;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
            StringUtilsKt stringUtilsKt = this.actions;
            int hashCode2 = (m2 + (stringUtilsKt == null ? 0 : stringUtilsKt.hashCode())) * 31;
            OnDemandMessageAnalyticsData onDemandMessageAnalyticsData = this.onDemandAnalytics;
            return hashCode2 + (onDemandMessageAnalyticsData != null ? onDemandMessageAnalyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(messageToken=");
            sb.append(this.messageToken);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", priority=");
            sb.append(this.priority);
            sb.append(", actions=");
            sb.append(this.actions);
            sb.append(", onDemandAnalytics=");
            sb.append(this.onDemandAnalytics);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ Ready(String str, AppMessageImage appMessageImage, String str2, String str3, int i, StringUtilsKt stringUtilsKt, int i2) {
            this(str, appMessageImage, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? null : stringUtilsKt, (OnDemandMessageAnalyticsData) null);
        }
    }
}
