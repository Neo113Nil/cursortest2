package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ChatFooterViewModel$Attachment$ImageAttachment {
    public final String mimeType;
    public final String uri;

    public ChatFooterViewModel$Attachment$ImageAttachment(String str, String str2) {
        str.getClass();
        this.uri = str;
        this.mimeType = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatFooterViewModel$Attachment$ImageAttachment)) {
            return false;
        }
        ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment = (ChatFooterViewModel$Attachment$ImageAttachment) obj;
        return Intrinsics.areEqual(this.uri, chatFooterViewModel$Attachment$ImageAttachment.uri) && this.mimeType.equals(chatFooterViewModel$Attachment$ImageAttachment.mimeType);
    }

    public final int hashCode() {
        return this.mimeType.hashCode() + (this.uri.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ImageAttachment(uri=", this.uri, ", mimeType=", this.mimeType, ")");
    }
}
