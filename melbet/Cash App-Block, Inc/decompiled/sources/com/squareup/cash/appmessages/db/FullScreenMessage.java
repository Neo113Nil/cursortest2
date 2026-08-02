package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class FullScreenMessage {
    public final String campaignToken;
    public final Instant expiresAtUtc;
    public final Instant insertedAtUtc;
    public final boolean isBadged;
    public final String messageToken;
    public final FullScreenMessage.Placement placement;
    public final AppMessageAction primaryAction;
    public final Color primaryActionColor;
    public final int priority;
    public final AppMessageAction secondaryAction;
    public final Color secondaryActionColor;
    public final Video video;

    public FullScreenMessage(String str, String str2, boolean z, Video video, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, Color color, Color color2, int i, Instant instant, FullScreenMessage.Placement placement, Instant instant2) {
        instant.getClass();
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.video = video;
        this.primaryAction = appMessageAction;
        this.secondaryAction = appMessageAction2;
        this.primaryActionColor = color;
        this.secondaryActionColor = color2;
        this.priority = i;
        this.insertedAtUtc = instant;
        this.placement = placement;
        this.expiresAtUtc = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullScreenMessage)) {
            return false;
        }
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        return this.messageToken.equals(fullScreenMessage.messageToken) && Intrinsics.areEqual(this.campaignToken, fullScreenMessage.campaignToken) && this.isBadged == fullScreenMessage.isBadged && Intrinsics.areEqual(this.video, fullScreenMessage.video) && Intrinsics.areEqual(this.primaryAction, fullScreenMessage.primaryAction) && Intrinsics.areEqual(this.secondaryAction, fullScreenMessage.secondaryAction) && Intrinsics.areEqual(this.primaryActionColor, fullScreenMessage.primaryActionColor) && Intrinsics.areEqual(this.secondaryActionColor, fullScreenMessage.secondaryActionColor) && this.priority == fullScreenMessage.priority && Intrinsics.areEqual(this.insertedAtUtc, fullScreenMessage.insertedAtUtc) && this.placement == fullScreenMessage.placement && Intrinsics.areEqual(this.expiresAtUtc, fullScreenMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        Video video = this.video;
        int hashCode2 = (m + (video == null ? 0 : video.hashCode())) * 31;
        AppMessageAction appMessageAction = this.primaryAction;
        int hashCode3 = (hashCode2 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31;
        AppMessageAction appMessageAction2 = this.secondaryAction;
        int hashCode4 = (hashCode3 + (appMessageAction2 == null ? 0 : appMessageAction2.hashCode())) * 31;
        Color color = this.primaryActionColor;
        int hashCode5 = (hashCode4 + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.secondaryActionColor;
        int hashCode6 = (this.insertedAtUtc.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode5 + (color2 == null ? 0 : color2.hashCode())) * 31, 31)) * 31;
        FullScreenMessage.Placement placement = this.placement;
        int hashCode7 = (hashCode6 + (placement == null ? 0 : placement.hashCode())) * 31;
        Instant instant = this.expiresAtUtc;
        return hashCode7 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FullScreenMessage(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
        m.append(this.isBadged);
        m.append(", video=");
        m.append(this.video);
        m.append(", primaryAction=");
        m.append(this.primaryAction);
        m.append(", secondaryAction=");
        m.append(this.secondaryAction);
        m.append(", primaryActionColor=");
        m.append(this.primaryActionColor);
        m.append(", secondaryActionColor=");
        m.append(this.secondaryActionColor);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", insertedAtUtc=");
        m.append(this.insertedAtUtc);
        m.append(", placement=");
        m.append(this.placement);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
