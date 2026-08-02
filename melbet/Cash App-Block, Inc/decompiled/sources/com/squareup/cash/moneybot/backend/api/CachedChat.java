package com.squareup.cash.moneybot.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CachedChat {
    public final Chat chat;
    public final String cursor;
    public final long updatedAtMs;

    public CachedChat(Chat chat, String str, long j) {
        this.chat = chat;
        this.cursor = str;
        this.updatedAtMs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedChat)) {
            return false;
        }
        CachedChat cachedChat = (CachedChat) obj;
        return Intrinsics.areEqual(this.chat, cachedChat.chat) && Intrinsics.areEqual(this.cursor, cachedChat.cursor) && this.updatedAtMs == cachedChat.updatedAtMs;
    }

    public final int hashCode() {
        Chat chat = this.chat;
        int hashCode = (chat == null ? 0 : chat.hashCode()) * 31;
        String str = this.cursor;
        return Long.hashCode(this.updatedAtMs) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedChat(chat=");
        sb.append(this.chat);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", updatedAtMs=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.updatedAtMs, ")", sb);
    }
}
