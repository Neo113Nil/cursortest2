package com.squareup.cash.moneybot.views.chat;

import com.squareup.cash.moneybot.viewmodels.chat.InChatPromptViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RotatingPromptItem {
    public final boolean isIncoming;
    public final boolean isOutgoing;
    public final String key;
    public final InChatPromptViewModel prompt;
    public final int slotIndex;
    public final int sourceIndex;

    public RotatingPromptItem(int i, InChatPromptViewModel inChatPromptViewModel, int i2, boolean z, boolean z2) {
        inChatPromptViewModel.getClass();
        this.sourceIndex = i;
        this.prompt = inChatPromptViewModel;
        this.slotIndex = i2;
        this.isOutgoing = z;
        this.isIncoming = z2;
        this.key = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "in-chat-prompt-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotatingPromptItem)) {
            return false;
        }
        RotatingPromptItem rotatingPromptItem = (RotatingPromptItem) obj;
        return this.sourceIndex == rotatingPromptItem.sourceIndex && Intrinsics.areEqual(this.prompt, rotatingPromptItem.prompt) && this.slotIndex == rotatingPromptItem.slotIndex && this.isOutgoing == rotatingPromptItem.isOutgoing && this.isIncoming == rotatingPromptItem.isIncoming;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isIncoming) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.slotIndex, (this.prompt.hashCode() + (Integer.hashCode(this.sourceIndex) * 31)) * 31, 31), 31, this.isOutgoing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotatingPromptItem(sourceIndex=");
        sb.append(this.sourceIndex);
        sb.append(", prompt=");
        sb.append(this.prompt);
        sb.append(", slotIndex=");
        sb.append(this.slotIndex);
        sb.append(", isOutgoing=");
        sb.append(this.isOutgoing);
        sb.append(", isIncoming=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isIncoming, ")");
    }
}
