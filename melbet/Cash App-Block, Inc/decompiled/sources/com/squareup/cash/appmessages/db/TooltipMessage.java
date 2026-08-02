package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TooltipMessage {
    public final TooltipMessage.ArrowPosition arrowPosition;
    public final String campaignToken;
    public final Instant expiresAtUtc;
    public final boolean isBadged;
    public final String messageToken;
    public final Placement placement;
    public final int priority;
    public final AppMessageAction tooltip;

    public TooltipMessage(String str, String str2, boolean z, Placement placement, TooltipMessage.ArrowPosition arrowPosition, AppMessageAction appMessageAction, int i, Instant instant) {
        str.getClass();
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.placement = placement;
        this.arrowPosition = arrowPosition;
        this.tooltip = appMessageAction;
        this.priority = i;
        this.expiresAtUtc = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipMessage)) {
            return false;
        }
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        return Intrinsics.areEqual(this.messageToken, tooltipMessage.messageToken) && Intrinsics.areEqual(this.campaignToken, tooltipMessage.campaignToken) && this.isBadged == tooltipMessage.isBadged && this.placement == tooltipMessage.placement && this.arrowPosition == tooltipMessage.arrowPosition && Intrinsics.areEqual(this.tooltip, tooltipMessage.tooltip) && this.priority == tooltipMessage.priority && Intrinsics.areEqual(this.expiresAtUtc, tooltipMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        Placement placement = this.placement;
        int hashCode2 = (m + (placement == null ? 0 : placement.hashCode())) * 31;
        TooltipMessage.ArrowPosition arrowPosition = this.arrowPosition;
        int hashCode3 = (hashCode2 + (arrowPosition == null ? 0 : arrowPosition.hashCode())) * 31;
        AppMessageAction appMessageAction = this.tooltip;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode3 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31, 31);
        Instant instant = this.expiresAtUtc;
        return m2 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TooltipMessage(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
        m.append(this.isBadged);
        m.append(", placement=");
        m.append(this.placement);
        m.append(", arrowPosition=");
        m.append(this.arrowPosition);
        m.append(", tooltip=");
        m.append(this.tooltip);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
