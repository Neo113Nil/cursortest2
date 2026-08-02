package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;

/* loaded from: classes6.dex */
public abstract class DependentDetailViewEvent {

    public final class AllowanceSectionEvent extends DependentDetailViewEvent {
        public final AllowanceSectionViewEvent$TapAllowanceView allowanceSectionViewEvent;

        public AllowanceSectionEvent(AllowanceSectionViewEvent$TapAllowanceView allowanceSectionViewEvent$TapAllowanceView) {
            this.allowanceSectionViewEvent = allowanceSectionViewEvent$TapAllowanceView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllowanceSectionEvent) && this.allowanceSectionViewEvent.equals(((AllowanceSectionEvent) obj).allowanceSectionViewEvent);
        }

        public final int hashCode() {
            return this.allowanceSectionViewEvent.allowanceViewEvent.hashCode();
        }

        public final String toString() {
            return "AllowanceSectionEvent(allowanceSectionViewEvent=" + this.allowanceSectionViewEvent + ")";
        }
    }

    public final class BalanceTapped extends DependentDetailViewEvent {
        public final DependentBalanceName name;

        public BalanceTapped(DependentBalanceName dependentBalanceName) {
            this.name = dependentBalanceName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BalanceTapped) && this.name == ((BalanceTapped) obj).name;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return "BalanceTapped(name=" + this.name + ")";
        }
    }

    public final class OpenControlsAndLimitClicked extends DependentDetailViewEvent {
        public static final OpenControlsAndLimitClicked INSTANCE = new OpenControlsAndLimitClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenControlsAndLimitClicked);
        }

        public final int hashCode() {
            return -2075401436;
        }

        public final String toString() {
            return "OpenControlsAndLimitClicked";
        }
    }

    public final class OpenNotificationSettingsClicked extends DependentDetailViewEvent {
        public static final OpenNotificationSettingsClicked INSTANCE = new OpenNotificationSettingsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenNotificationSettingsClicked);
        }

        public final int hashCode() {
            return 1846268912;
        }

        public final String toString() {
            return "OpenNotificationSettingsClicked";
        }
    }

    public final class SeeAllActivitiesEvent extends DependentDetailViewEvent {
        public static final SeeAllActivitiesEvent INSTANCE = new SeeAllActivitiesEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllActivitiesEvent);
        }

        public final int hashCode() {
            return -840349632;
        }

        public final String toString() {
            return "SeeAllActivitiesEvent";
        }
    }

    public final class TapBack extends DependentDetailViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 2032707755;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapProfile extends DependentDetailViewEvent {
        public static final TapProfile INSTANCE = new TapProfile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapProfile);
        }

        public final int hashCode() {
            return 1690705765;
        }

        public final String toString() {
            return "TapProfile";
        }
    }

    public final class TapSendCash extends DependentDetailViewEvent {
        public static final TapSendCash INSTANCE = new TapSendCash();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapSendCash);
        }

        public final int hashCode() {
            return -1173496673;
        }

        public final String toString() {
            return "TapSendCash";
        }
    }

    public final class TapShowQrCode extends DependentDetailViewEvent {
        public static final TapShowQrCode INSTANCE = new TapShowQrCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapShowQrCode);
        }

        public final int hashCode() {
            return -1735668273;
        }

        public final String toString() {
            return "TapShowQrCode";
        }
    }
}
