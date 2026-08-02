package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InAppNotificationMessage {
    public final AppMessageAction action;
    public final Animation animation;
    public final String assetUrl;
    public final Image avatar;
    public final String campaignToken;
    public final Long duration;
    public final Instant expiresAtUtc;
    public final Image image;
    public final boolean isBadged;
    public final String messageToken;
    public final int priority;

    public InAppNotificationMessage(String str, String str2, boolean z, Long l, String str3, AppMessageAction appMessageAction, Animation animation, Image image, Image image2, int i, Instant instant) {
        str.getClass();
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.duration = l;
        this.assetUrl = str3;
        this.action = appMessageAction;
        this.animation = animation;
        this.image = image;
        this.avatar = image2;
        this.priority = i;
        this.expiresAtUtc = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationMessage)) {
            return false;
        }
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        return Intrinsics.areEqual(this.messageToken, inAppNotificationMessage.messageToken) && Intrinsics.areEqual(this.campaignToken, inAppNotificationMessage.campaignToken) && this.isBadged == inAppNotificationMessage.isBadged && Intrinsics.areEqual(this.duration, inAppNotificationMessage.duration) && Intrinsics.areEqual(this.assetUrl, inAppNotificationMessage.assetUrl) && Intrinsics.areEqual(this.action, inAppNotificationMessage.action) && Intrinsics.areEqual(this.animation, inAppNotificationMessage.animation) && Intrinsics.areEqual(this.image, inAppNotificationMessage.image) && Intrinsics.areEqual(this.avatar, inAppNotificationMessage.avatar) && this.priority == inAppNotificationMessage.priority && Intrinsics.areEqual(this.expiresAtUtc, inAppNotificationMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        Long l = this.duration;
        int hashCode2 = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.assetUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppMessageAction appMessageAction = this.action;
        int hashCode4 = (hashCode3 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31;
        Animation animation = this.animation;
        int hashCode5 = (hashCode4 + (animation == null ? 0 : animation.hashCode())) * 31;
        Image image = this.image;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.avatar;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode6 + (image2 == null ? 0 : image2.hashCode())) * 31, 31);
        Instant instant = this.expiresAtUtc;
        return m2 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InAppNotificationMessage(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
        m.append(this.isBadged);
        m.append(", duration=");
        m.append(this.duration);
        m.append(", assetUrl=");
        m.append(this.assetUrl);
        m.append(", action=");
        m.append(this.action);
        m.append(", animation=");
        m.append(this.animation);
        m.append(", image=");
        m.append(this.image);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
