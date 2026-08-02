package com.squareup.cash.profile.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChannelListViewEvent {

    public final class AddAlias extends ChannelListViewEvent {
        public final ChannelType channelType;

        public AddAlias(ChannelType channelType) {
            channelType.getClass();
            this.channelType = channelType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddAlias) && this.channelType == ((AddAlias) obj).channelType;
        }

        public final int hashCode() {
            return this.channelType.hashCode();
        }

        public final String toString() {
            return "AddAlias(channelType=" + this.channelType + ")";
        }
    }

    public final class AdjustableThresholdClicked extends ChannelListViewEvent {
        public final int currentValue;
        public final int maxValue;
        public final int minValue;
        public final NotificationCategory notificationCategory;

        public AdjustableThresholdClicked(int i, int i2, int i3, NotificationCategory notificationCategory) {
            notificationCategory.getClass();
            this.currentValue = i;
            this.minValue = i2;
            this.maxValue = i3;
            this.notificationCategory = notificationCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdjustableThresholdClicked)) {
                return false;
            }
            AdjustableThresholdClicked adjustableThresholdClicked = (AdjustableThresholdClicked) obj;
            return this.currentValue == adjustableThresholdClicked.currentValue && this.minValue == adjustableThresholdClicked.minValue && this.maxValue == adjustableThresholdClicked.maxValue && this.notificationCategory == adjustableThresholdClicked.notificationCategory;
        }

        public final int hashCode() {
            return this.notificationCategory.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxValue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minValue, Integer.hashCode(this.currentValue) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.currentValue, this.minValue, "AdjustableThresholdClicked(currentValue=", ", minValue=", ", maxValue=");
            m107m.append(this.maxValue);
            m107m.append(", notificationCategory=");
            m107m.append(this.notificationCategory);
            m107m.append(")");
            return m107m.toString();
        }
    }

    public final class DialogDismissed extends ChannelListViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return 1001008719;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class GoBack extends ChannelListViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -12790751;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class OpenNotificationSettingsClick extends ChannelListViewEvent {
        public static final OpenNotificationSettingsClick INSTANCE = new OpenNotificationSettingsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenNotificationSettingsClick);
        }

        public final int hashCode() {
            return -1704879522;
        }

        public final String toString() {
            return "OpenNotificationSettingsClick";
        }
    }

    public final class SponsoredAccountClicked extends ChannelListViewEvent {
        public final SponsoredFamilyMember account;
        public final boolean toggledValue;

        public SponsoredAccountClicked(SponsoredFamilyMember sponsoredFamilyMember, boolean z) {
            sponsoredFamilyMember.getClass();
            this.account = sponsoredFamilyMember;
            this.toggledValue = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SponsoredAccountClicked)) {
                return false;
            }
            SponsoredAccountClicked sponsoredAccountClicked = (SponsoredAccountClicked) obj;
            return Intrinsics.areEqual(this.account, sponsoredAccountClicked.account) && this.toggledValue == sponsoredAccountClicked.toggledValue;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggledValue) + (this.account.hashCode() * 31);
        }

        public final String toString() {
            return "SponsoredAccountClicked(account=" + this.account + ", toggledValue=" + this.toggledValue + ")";
        }
    }

    public final class ToggleClicked extends ChannelListViewEvent {
        public final ChannelType channelType;
        public final boolean hasNoEnabledAlias;
        public final boolean toggledValue;

        public ToggleClicked(ChannelType channelType, boolean z, boolean z2) {
            channelType.getClass();
            this.channelType = channelType;
            this.toggledValue = z;
            this.hasNoEnabledAlias = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleClicked)) {
                return false;
            }
            ToggleClicked toggleClicked = (ToggleClicked) obj;
            return this.channelType == toggleClicked.channelType && this.toggledValue == toggleClicked.toggledValue && this.hasNoEnabledAlias == toggleClicked.hasNoEnabledAlias;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasNoEnabledAlias) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.channelType.hashCode() * 31, 31, this.toggledValue);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleClicked(channelType=");
            sb.append(this.channelType);
            sb.append(", toggledValue=");
            sb.append(this.toggledValue);
            sb.append(", hasNoEnabledAlias=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasNoEnabledAlias, ")");
        }
    }
}
