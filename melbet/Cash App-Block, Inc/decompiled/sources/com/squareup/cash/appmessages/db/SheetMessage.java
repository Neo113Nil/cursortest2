package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SheetMessage {
    public final String campaign_token;
    public final Instant expiresAtUtc;
    public final Instant inserted_at_utc;
    public final boolean is_badged;
    public final HalfSheetMessage message_format;
    public final String message_token;
    public final String metadata_id;
    public final int priority;

    public SheetMessage(String str, String str2, boolean z, HalfSheetMessage halfSheetMessage, Instant instant, String str3, int i, Instant instant2) {
        str.getClass();
        halfSheetMessage.getClass();
        instant.getClass();
        this.message_token = str;
        this.campaign_token = str2;
        this.is_badged = z;
        this.message_format = halfSheetMessage;
        this.inserted_at_utc = instant;
        this.metadata_id = str3;
        this.priority = i;
        this.expiresAtUtc = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetMessage)) {
            return false;
        }
        SheetMessage sheetMessage = (SheetMessage) obj;
        return Intrinsics.areEqual(this.message_token, sheetMessage.message_token) && Intrinsics.areEqual(this.campaign_token, sheetMessage.campaign_token) && this.is_badged == sheetMessage.is_badged && Intrinsics.areEqual(this.message_format, sheetMessage.message_format) && Intrinsics.areEqual(this.inserted_at_utc, sheetMessage.inserted_at_utc) && Intrinsics.areEqual(this.metadata_id, sheetMessage.metadata_id) && this.priority == sheetMessage.priority && Intrinsics.areEqual(this.expiresAtUtc, sheetMessage.expiresAtUtc);
    }

    public final int hashCode() {
        int hashCode = this.message_token.hashCode() * 31;
        String str = this.campaign_token;
        int hashCode2 = (this.inserted_at_utc.hashCode() + ((this.message_format.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.is_badged)) * 31)) * 31;
        String str2 = this.metadata_id;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Instant instant = this.expiresAtUtc;
        return m + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SheetMessage(message_token=", this.message_token, ", campaign_token=", this.campaign_token, ", is_badged=");
        m.append(this.is_badged);
        m.append(", message_format=");
        m.append(this.message_format);
        m.append(", inserted_at_utc=");
        m.append(this.inserted_at_utc);
        m.append(", metadata_id=");
        m.append(this.metadata_id);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", expiresAtUtc=");
        m.append(this.expiresAtUtc);
        m.append(")");
        return m.toString();
    }
}
