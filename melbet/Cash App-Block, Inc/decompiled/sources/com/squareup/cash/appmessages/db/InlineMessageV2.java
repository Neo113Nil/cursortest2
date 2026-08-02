package com.squareup.cash.appmessages.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class InlineMessageV2 {
    public final UiAvatar avatar;
    public final String campaignToken;
    public final Instant expiresAtUtc;
    public final boolean isBadged;
    public final String messageToken;
    public final InlineV2Message.Placement placement;
    public final int priority;
    public final String subtitle;
    public final String title;
    public final String url;

    public InlineMessageV2(int i, InlineV2Message.Placement placement, UiAvatar uiAvatar, String str, String str2, String str3, String str4, String str5, Instant instant, boolean z) {
        str.getClass();
        this.messageToken = str;
        this.campaignToken = str2;
        this.isBadged = z;
        this.placement = placement;
        this.avatar = uiAvatar;
        this.title = str3;
        this.subtitle = str4;
        this.url = str5;
        this.priority = i;
        this.expiresAtUtc = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessageV2)) {
            return false;
        }
        InlineMessageV2 inlineMessageV2 = (InlineMessageV2) obj;
        return Intrinsics.areEqual(this.messageToken, inlineMessageV2.messageToken) && Intrinsics.areEqual(this.campaignToken, inlineMessageV2.campaignToken) && this.isBadged == inlineMessageV2.isBadged && this.placement == inlineMessageV2.placement && Intrinsics.areEqual(this.avatar, inlineMessageV2.avatar) && Intrinsics.areEqual(this.title, inlineMessageV2.title) && Intrinsics.areEqual(this.subtitle, inlineMessageV2.subtitle) && Intrinsics.areEqual(this.url, inlineMessageV2.url) && this.priority == inlineMessageV2.priority && Intrinsics.areEqual(this.expiresAtUtc, inlineMessageV2.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.messageToken.hashCode() * 31;
        String str = this.campaignToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBadged);
        InlineV2Message.Placement placement = this.placement;
        int hashCode2 = (m + (placement == null ? 0 : placement.hashCode())) * 31;
        UiAvatar uiAvatar = this.avatar;
        int hashCode3 = (hashCode2 + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Instant instant = this.expiresAtUtc;
        return m2 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InlineMessageV2(messageToken=", this.messageToken, ", campaignToken=", this.campaignToken, ", isBadged=");
        m.append(this.isBadged);
        m.append(", placement=");
        m.append(this.placement);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", title=");
        m.append(this.title);
        m.append(", subtitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", url=", this.url, ", priority=");
        m.append(this.priority);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
