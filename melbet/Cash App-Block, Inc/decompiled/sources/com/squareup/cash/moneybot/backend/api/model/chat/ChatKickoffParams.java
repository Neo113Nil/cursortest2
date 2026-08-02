package com.squareup.cash.moneybot.backend.api.model.chat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ChatKickoffParams implements Parcelable {
    public static final Parcelable.Creator<ChatKickoffParams> CREATOR = new LimitsScreen.Creator(17);
    public final boolean autoSend;
    public final List initialMessages;
    public final byte[] rawKickoffMessagesBytes;
    public final String sessionId;

    public ChatKickoffParams(String str, List list, int i) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) == 0, (i & 4) != 0 ? null : str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatKickoffParams)) {
            return false;
        }
        ChatKickoffParams chatKickoffParams = (ChatKickoffParams) obj;
        return Intrinsics.areEqual(this.initialMessages, chatKickoffParams.initialMessages) && this.autoSend == chatKickoffParams.autoSend && Intrinsics.areEqual(this.sessionId, chatKickoffParams.sessionId) && Arrays.equals(this.rawKickoffMessagesBytes, chatKickoffParams.rawKickoffMessagesBytes);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initialMessages.hashCode() * 31, 31, this.autoSend);
        String str = this.sessionId;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.rawKickoffMessagesBytes;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.rawKickoffMessagesBytes);
        StringBuilder sb = new StringBuilder("ChatKickoffParams(initialMessages=");
        sb.append(this.initialMessages);
        sb.append(", autoSend=");
        sb.append(this.autoSend);
        sb.append(", sessionId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sessionId, ", rawKickoffMessagesBytes=", arrays, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.initialMessages, parcel);
        while (m.hasNext()) {
            ((Message.TextMessage) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.autoSend ? 1 : 0);
        parcel.writeString(this.sessionId);
        parcel.writeByteArray(this.rawKickoffMessagesBytes);
    }

    public ChatKickoffParams(List list, boolean z, String str, byte[] bArr) {
        list.getClass();
        this.initialMessages = list;
        this.autoSend = z;
        this.sessionId = str;
        this.rawKickoffMessagesBytes = bArr;
    }
}
