package com.squareup.cash.businessaccount.kybrestriction.viewmodels;

import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface KybRestrictionBannerViewEvent {

    public final class ImpressionEvent implements KybRestrictionBannerViewEvent {
        public final KybEligibilityWarning.BannerDetail bannerDetail;

        public ImpressionEvent(KybEligibilityWarning.BannerDetail bannerDetail) {
            this.bannerDetail = bannerDetail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImpressionEvent) && this.bannerDetail.equals(((ImpressionEvent) obj).bannerDetail);
        }

        public final int hashCode() {
            return this.bannerDetail.hashCode();
        }

        public final String toString() {
            return "ImpressionEvent(bannerDetail=" + this.bannerDetail + ")";
        }
    }

    public final class PrimaryActionEvent implements KybRestrictionBannerViewEvent {
        public final KybEligibilityWarning.BannerDetail bannerDetail;
        public final String routeUrl;

        public PrimaryActionEvent(String str, KybEligibilityWarning.BannerDetail bannerDetail) {
            str.getClass();
            this.routeUrl = str;
            this.bannerDetail = bannerDetail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryActionEvent)) {
                return false;
            }
            PrimaryActionEvent primaryActionEvent = (PrimaryActionEvent) obj;
            return Intrinsics.areEqual(this.routeUrl, primaryActionEvent.routeUrl) && this.bannerDetail.equals(primaryActionEvent.bannerDetail);
        }

        public final int hashCode() {
            return this.bannerDetail.hashCode() + (this.routeUrl.hashCode() * 31);
        }

        public final String toString() {
            return "PrimaryActionEvent(routeUrl=" + this.routeUrl + ", bannerDetail=" + this.bannerDetail + ")";
        }
    }

    public final class SubtitleMarkdownActionEvent implements KybRestrictionBannerViewEvent {
        public final KybEligibilityWarning.BannerDetail bannerDetail;
        public final String displayText;
        public final String markdownUrl;

        public SubtitleMarkdownActionEvent(String str, String str2, KybEligibilityWarning.BannerDetail bannerDetail) {
            str2.getClass();
            this.markdownUrl = str;
            this.displayText = str2;
            this.bannerDetail = bannerDetail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleMarkdownActionEvent)) {
                return false;
            }
            SubtitleMarkdownActionEvent subtitleMarkdownActionEvent = (SubtitleMarkdownActionEvent) obj;
            return Intrinsics.areEqual(this.markdownUrl, subtitleMarkdownActionEvent.markdownUrl) && Intrinsics.areEqual(this.displayText, subtitleMarkdownActionEvent.displayText) && this.bannerDetail.equals(subtitleMarkdownActionEvent.bannerDetail);
        }

        public final int hashCode() {
            String str = this.markdownUrl;
            return this.bannerDetail.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.displayText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubtitleMarkdownActionEvent(markdownUrl=", this.markdownUrl, ", displayText=", this.displayText, ", bannerDetail=");
            m.append(this.bannerDetail);
            m.append(")");
            return m.toString();
        }
    }
}
