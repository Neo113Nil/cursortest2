package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletRetroOrderSelectionViewEvent {

    public final class GoBack implements AfterpayAppletRetroOrderSelectionViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1692515689;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class RetroAccessoryTapped implements AfterpayAppletRetroOrderSelectionViewEvent, AfterpayAnalyticsAppletTappedEvent {
        public final String actionUrl;
        public final List analyticsAppletTappedEvent;

        public RetroAccessoryTapped(String str, List list) {
            str.getClass();
            this.actionUrl = str;
            this.analyticsAppletTappedEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetroAccessoryTapped)) {
                return false;
            }
            RetroAccessoryTapped retroAccessoryTapped = (RetroAccessoryTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, retroAccessoryTapped.actionUrl) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, retroAccessoryTapped.analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            List list = this.analyticsAppletTappedEvent;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("RetroAccessoryTapped(actionUrl=", this.actionUrl, ", analyticsAppletTappedEvent=", ")", this.analyticsAppletTappedEvent);
        }
    }

    public final class RetroItemTapped implements AfterpayAppletRetroOrderSelectionViewEvent, AfterpayAnalyticsAppletTappedEvent {
        public final String actionUrl;
        public final List analyticsAppletTappedEvent;

        public RetroItemTapped(String str, List list) {
            str.getClass();
            this.actionUrl = str;
            this.analyticsAppletTappedEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetroItemTapped)) {
                return false;
            }
            RetroItemTapped retroItemTapped = (RetroItemTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, retroItemTapped.actionUrl) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, retroItemTapped.analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            List list = this.analyticsAppletTappedEvent;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("RetroItemTapped(actionUrl=", this.actionUrl, ", analyticsAppletTappedEvent=", ")", this.analyticsAppletTappedEvent);
        }
    }

    public final class RetroOrderSelectionScreenScreenViewed implements AfterpayAppletRetroOrderSelectionViewEvent {
        public final List analyticsEventSpecs;

        public RetroOrderSelectionScreenScreenViewed(List list) {
            list.getClass();
            this.analyticsEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetroOrderSelectionScreenScreenViewed) && Intrinsics.areEqual(this.analyticsEventSpecs, ((RetroOrderSelectionScreenScreenViewed) obj).analyticsEventSpecs);
        }

        public final int hashCode() {
            return this.analyticsEventSpecs.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("RetroOrderSelectionScreenScreenViewed(analyticsEventSpecs=", ")", this.analyticsEventSpecs);
        }
    }

    public final class TryAgainTapped implements AfterpayAppletRetroOrderSelectionViewEvent {
        public static final TryAgainTapped INSTANCE = new TryAgainTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainTapped);
        }

        public final int hashCode() {
            return -165732871;
        }

        public final String toString() {
            return "TryAgainTapped";
        }
    }

    public final class UrlTapped implements AfterpayAppletRetroOrderSelectionViewEvent {
        public final String url;

        public UrlTapped(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlTapped) && Intrinsics.areEqual(this.url, ((UrlTapped) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlTapped(url=", this.url, ")");
        }
    }
}
