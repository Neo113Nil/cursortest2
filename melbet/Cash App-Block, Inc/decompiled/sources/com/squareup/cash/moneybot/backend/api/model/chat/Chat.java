package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Chat {
    public final List activity;
    public final List messages;
    public final String name;
    public final ChatSessionStatus status;
    public final TokenInfo tokenInfo;

    public Chat(String str, List list, List list2, ChatSessionStatus chatSessionStatus, TokenInfo tokenInfo) {
        list.getClass();
        list2.getClass();
        chatSessionStatus.getClass();
        this.name = str;
        this.messages = list;
        this.activity = list2;
        this.status = chatSessionStatus;
        this.tokenInfo = tokenInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static Chat copy$default(Chat chat, String str, List list, ArrayList arrayList, ChatSessionStatus chatSessionStatus, TokenInfo tokenInfo, int i) {
        if ((i & 1) != 0) {
            str = chat.name;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = chat.messages;
        }
        List list2 = list;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = chat.activity;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 8) != 0) {
            chatSessionStatus = chat.status;
        }
        ChatSessionStatus chatSessionStatus2 = chatSessionStatus;
        if ((i & 16) != 0) {
            tokenInfo = chat.tokenInfo;
        }
        chat.getClass();
        list2.getClass();
        arrayList3.getClass();
        chatSessionStatus2.getClass();
        return new Chat(str2, list2, arrayList3, chatSessionStatus2, tokenInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chat)) {
            return false;
        }
        Chat chat = (Chat) obj;
        return Intrinsics.areEqual(this.name, chat.name) && Intrinsics.areEqual(this.messages, chat.messages) && Intrinsics.areEqual(this.activity, chat.activity) && this.status == chat.status && Intrinsics.areEqual(this.tokenInfo, chat.tokenInfo);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (this.status.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.messages), 31, this.activity)) * 31;
        TokenInfo tokenInfo = this.tokenInfo;
        return hashCode + (tokenInfo != null ? tokenInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Chat(name=", this.name, ", messages=", ", activity=", this.messages);
        m.append(this.activity);
        m.append(", status=");
        m.append(this.status);
        m.append(", tokenInfo=");
        m.append(this.tokenInfo);
        m.append(")");
        return m.toString();
    }
}
