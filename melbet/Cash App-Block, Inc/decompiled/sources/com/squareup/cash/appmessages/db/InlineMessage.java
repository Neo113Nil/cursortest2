package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InlineMessage {
    public final Animation animation;
    public final String campaignToken;
    public final boolean cannotBeDismissed;
    public final Instant expiresAtUtc;
    public final Image image;
    public final boolean isBadged;
    public final String messageToken;
    public final MessageType messageType;
    public final InlineMessage.Placement placement;
    public final AppMessageAction primaryNavigationAction;
    public final int priority;
    public final AppMessageAction secondaryNavigationAction;
    public final String subtitle;
    public final String title;

    public InlineMessage(String str, String str2, boolean z, InlineMessage.Placement placement, Image image, String str3, String str4, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, boolean z2, Animation animation, int i, MessageType messageType, Instant instant) {
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.placement = placement;
        this.image = image;
        this.title = str3;
        this.subtitle = str4;
        this.primaryNavigationAction = appMessageAction;
        this.secondaryNavigationAction = appMessageAction2;
        this.cannotBeDismissed = z2;
        this.animation = animation;
        this.priority = i;
        this.messageType = messageType;
        this.expiresAtUtc = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessage)) {
            return false;
        }
        InlineMessage inlineMessage = (InlineMessage) obj;
        return this.messageToken.equals(inlineMessage.messageToken) && Intrinsics.areEqual(this.campaignToken, inlineMessage.campaignToken) && this.isBadged == inlineMessage.isBadged && this.placement == inlineMessage.placement && Intrinsics.areEqual(this.image, inlineMessage.image) && Intrinsics.areEqual(this.title, inlineMessage.title) && Intrinsics.areEqual(this.subtitle, inlineMessage.subtitle) && Intrinsics.areEqual(this.primaryNavigationAction, inlineMessage.primaryNavigationAction) && Intrinsics.areEqual(this.secondaryNavigationAction, inlineMessage.secondaryNavigationAction) && this.cannotBeDismissed == inlineMessage.cannotBeDismissed && Intrinsics.areEqual(this.animation, inlineMessage.animation) && this.priority == inlineMessage.priority && this.messageType == inlineMessage.messageType && Intrinsics.areEqual(this.expiresAtUtc, inlineMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        InlineMessage.Placement placement = this.placement;
        int hashCode2 = (m + (placement == null ? 0 : placement.hashCode())) * 31;
        Image image = this.image;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AppMessageAction appMessageAction = this.primaryNavigationAction;
        int hashCode6 = (hashCode5 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31;
        AppMessageAction appMessageAction2 = this.secondaryNavigationAction;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (appMessageAction2 == null ? 0 : appMessageAction2.hashCode())) * 31, 31, this.cannotBeDismissed);
        Animation animation = this.animation;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (m2 + (animation == null ? 0 : animation.hashCode())) * 31, 31);
        MessageType messageType = this.messageType;
        int hashCode7 = (m3 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        Instant instant = this.expiresAtUtc;
        return hashCode7 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InlineMessage(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
        m.append(this.isBadged);
        m.append(", placement=");
        m.append(this.placement);
        m.append(", image=");
        m.append(this.image);
        m.append(", title=");
        m.append(this.title);
        m.append(", subtitle=");
        m.append(this.subtitle);
        m.append(", primaryNavigationAction=");
        m.append(this.primaryNavigationAction);
        m.append(", secondaryNavigationAction=");
        m.append(this.secondaryNavigationAction);
        m.append(", cannotBeDismissed=");
        m.append(this.cannotBeDismissed);
        m.append(", animation=");
        m.append(this.animation);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", messageType=");
        m.append(this.messageType);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
