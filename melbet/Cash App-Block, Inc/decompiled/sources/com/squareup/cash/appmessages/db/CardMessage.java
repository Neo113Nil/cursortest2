package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class CardMessage {
    public final Animation animation;
    public final String campaignToken;
    public final Instant expiresAtUtc;
    public final Image image;
    public final boolean isBadged;
    public final String messageToken;
    public final CardMessage.Placement placement;
    public final AppMessageAction primaryNavigationAction;
    public final int priority;
    public final String subtitle;
    public final String title;

    public CardMessage(String str, String str2, boolean z, CardMessage.Placement placement, Image image, String str3, String str4, AppMessageAction appMessageAction, Animation animation, int i, Instant instant) {
        str.getClass();
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.placement = placement;
        this.image = image;
        this.title = str3;
        this.subtitle = str4;
        this.primaryNavigationAction = appMessageAction;
        this.animation = animation;
        this.priority = i;
        this.expiresAtUtc = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMessage)) {
            return false;
        }
        CardMessage cardMessage = (CardMessage) obj;
        return Intrinsics.areEqual(this.messageToken, cardMessage.messageToken) && Intrinsics.areEqual(this.campaignToken, cardMessage.campaignToken) && this.isBadged == cardMessage.isBadged && this.placement == cardMessage.placement && Intrinsics.areEqual(this.image, cardMessage.image) && Intrinsics.areEqual(this.title, cardMessage.title) && Intrinsics.areEqual(this.subtitle, cardMessage.subtitle) && Intrinsics.areEqual(this.primaryNavigationAction, cardMessage.primaryNavigationAction) && Intrinsics.areEqual(this.animation, cardMessage.animation) && this.priority == cardMessage.priority && Intrinsics.areEqual(this.expiresAtUtc, cardMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        CardMessage.Placement placement = this.placement;
        int hashCode2 = (m + (placement == null ? 0 : placement.hashCode())) * 31;
        Image image = this.image;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AppMessageAction appMessageAction = this.primaryNavigationAction;
        int hashCode6 = (hashCode5 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31;
        Animation animation = this.animation;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode6 + (animation == null ? 0 : animation.hashCode())) * 31, 31);
        Instant instant = this.expiresAtUtc;
        return m2 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardMessage(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
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
        m.append(", animation=");
        m.append(this.animation);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
