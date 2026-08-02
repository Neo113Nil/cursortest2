package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InChatPrompt {
    public final UiAvatar avatar;
    public final String body;
    public final String category;
    public final String id;
    public final String prompt;

    public InChatPrompt(String str, UiAvatar uiAvatar, String str2, String str3, String str4) {
        this.body = str;
        this.avatar = uiAvatar;
        this.prompt = str2;
        this.id = str3;
        this.category = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InChatPrompt)) {
            return false;
        }
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        return this.body.equals(inChatPrompt.body) && Intrinsics.areEqual(this.avatar, inChatPrompt.avatar) && this.prompt.equals(inChatPrompt.prompt) && Intrinsics.areEqual(this.id, inChatPrompt.id) && Intrinsics.areEqual(this.category, inChatPrompt.category);
    }

    public final int hashCode() {
        int hashCode = this.body.hashCode() * 31;
        UiAvatar uiAvatar = this.avatar;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31, 31, this.prompt);
        String str = this.id;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InChatPrompt(body=");
        sb.append(this.body);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", prompt=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.prompt, ", id=", this.id, ", category=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.category, ")");
    }
}
