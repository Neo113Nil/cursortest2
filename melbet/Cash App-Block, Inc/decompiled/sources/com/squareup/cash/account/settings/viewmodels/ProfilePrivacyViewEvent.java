package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ProfilePrivacyViewEvent {

    public final class AllowedAccountsEvent implements ProfilePrivacyViewEvent {
        public final AllowedAccountsSectionViewEvent$TapViewAll event;

        public AllowedAccountsEvent(AllowedAccountsSectionViewEvent$TapViewAll allowedAccountsSectionViewEvent$TapViewAll) {
            allowedAccountsSectionViewEvent$TapViewAll.getClass();
            this.event = allowedAccountsSectionViewEvent$TapViewAll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllowedAccountsEvent) && Intrinsics.areEqual(this.event, ((AllowedAccountsEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return 1932194736;
        }

        public final String toString() {
            return "AllowedAccountsEvent(event=" + this.event + ")";
        }
    }

    public final class BlockedAccountsEvent implements ProfilePrivacyViewEvent {
        public final BlockedAccountsSectionViewEvent$TapViewAll event;

        public BlockedAccountsEvent(BlockedAccountsSectionViewEvent$TapViewAll blockedAccountsSectionViewEvent$TapViewAll) {
            blockedAccountsSectionViewEvent$TapViewAll.getClass();
            this.event = blockedAccountsSectionViewEvent$TapViewAll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockedAccountsEvent) && Intrinsics.areEqual(this.event, ((BlockedAccountsEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return -2080437012;
        }

        public final String toString() {
            return "BlockedAccountsEvent(event=" + this.event + ")";
        }
    }

    public final class ManageIncomingRequests implements ProfilePrivacyViewEvent {
        public static final ManageIncomingRequests INSTANCE = new ManageIncomingRequests();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageIncomingRequests);
        }

        public final int hashCode() {
            return -1183248786;
        }

        public final String toString() {
            return "ManageIncomingRequests";
        }
    }

    public final class ManageSearchVisibility implements ProfilePrivacyViewEvent {
        public static final ManageSearchVisibility INSTANCE = new ManageSearchVisibility();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageSearchVisibility);
        }

        public final int hashCode() {
            return -445347010;
        }

        public final String toString() {
            return "ManageSearchVisibility";
        }
    }

    public final class NavBack implements ProfilePrivacyViewEvent {
        public static final NavBack INSTANCE = new NavBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavBack);
        }

        public final int hashCode() {
            return 1645262251;
        }

        public final String toString() {
            return "NavBack";
        }
    }

    public abstract class NewPolicy implements ProfilePrivacyViewEvent {
    }

    public final class PersonalizedAdsEvent implements ProfilePrivacyViewEvent {
        public final PersonalizedAdsSectionViewEvent event;

        public PersonalizedAdsEvent(PersonalizedAdsSectionViewEvent personalizedAdsSectionViewEvent) {
            this.event = personalizedAdsSectionViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PersonalizedAdsEvent) && this.event.equals(((PersonalizedAdsEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "PersonalizedAdsEvent(event=" + this.event + ")";
        }
    }

    public final class ToggleCashMeUrlSetting implements ProfilePrivacyViewEvent {
        public final boolean enabled;

        public ToggleCashMeUrlSetting(boolean z) {
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleCashMeUrlSetting) && this.enabled == ((ToggleCashMeUrlSetting) obj).enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleCashMeUrlSetting(enabled=", ")", this.enabled);
        }
    }

    public final class ToggleContactsSync implements ProfilePrivacyViewEvent {
        public final boolean allow;

        public ToggleContactsSync(boolean z) {
            this.allow = z;
        }
    }
}
