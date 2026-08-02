package com.squareup.cash.appmessages;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class TooltipAppMessageViewEvent {

    public final class TargetClicked extends TooltipAppMessageViewEvent {
        public final AppMessageViewEvent.AppMessageActionTaken actionTaken;
        public final boolean isLocalTooltip;

        public TargetClicked(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetClicked)) {
                return false;
            }
            TargetClicked targetClicked = (TargetClicked) obj;
            return Intrinsics.areEqual(this.actionTaken, targetClicked.actionTaken) && this.isLocalTooltip == targetClicked.isLocalTooltip;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocalTooltip) + (this.actionTaken.hashCode() * 31);
        }

        public final String toString() {
            return "TargetClicked(actionTaken=" + this.actionTaken + ", isLocalTooltip=" + this.isLocalTooltip + ")";
        }

        public TargetClicked(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken, boolean z) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = z;
        }
    }

    public final class TooltipClicked extends TooltipAppMessageViewEvent {
        public final AppMessageViewEvent.AppMessageActionTaken actionTaken;
        public final boolean isLocalTooltip;

        public TooltipClicked(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipClicked)) {
                return false;
            }
            TooltipClicked tooltipClicked = (TooltipClicked) obj;
            return Intrinsics.areEqual(this.actionTaken, tooltipClicked.actionTaken) && this.isLocalTooltip == tooltipClicked.isLocalTooltip;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocalTooltip) + (this.actionTaken.hashCode() * 31);
        }

        public final String toString() {
            return "TooltipClicked(actionTaken=" + this.actionTaken + ", isLocalTooltip=" + this.isLocalTooltip + ")";
        }

        public TooltipClicked(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken, boolean z) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = z;
        }
    }

    public final class TooltipDismissed extends TooltipAppMessageViewEvent {
        public final AppMessageViewEvent.AppMessageActionTaken actionTaken;
        public final boolean isLocalTooltip;

        public TooltipDismissed(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipDismissed)) {
                return false;
            }
            TooltipDismissed tooltipDismissed = (TooltipDismissed) obj;
            return Intrinsics.areEqual(this.actionTaken, tooltipDismissed.actionTaken) && this.isLocalTooltip == tooltipDismissed.isLocalTooltip;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocalTooltip) + (this.actionTaken.hashCode() * 31);
        }

        public final String toString() {
            return "TooltipDismissed(actionTaken=" + this.actionTaken + ", isLocalTooltip=" + this.isLocalTooltip + ")";
        }

        public TooltipDismissed(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken, boolean z) {
            this.actionTaken = appMessageActionTaken;
            this.isLocalTooltip = z;
        }
    }

    public final class TooltipViewed extends TooltipAppMessageViewEvent {
        public final boolean isLocalTooltip;
        public final String messageToken;

        public TooltipViewed(String str, boolean z) {
            str.getClass();
            this.messageToken = str;
            this.isLocalTooltip = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipViewed)) {
                return false;
            }
            TooltipViewed tooltipViewed = (TooltipViewed) obj;
            return Intrinsics.areEqual(this.messageToken, tooltipViewed.messageToken) && this.isLocalTooltip == tooltipViewed.isLocalTooltip;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocalTooltip) + (this.messageToken.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("TooltipViewed(messageToken=", this.messageToken, ", isLocalTooltip=", ")", this.isLocalTooltip);
        }

        public /* synthetic */ TooltipViewed(String str) {
            this(str, false);
        }
    }
}
