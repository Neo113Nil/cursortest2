package com.squareup.cash.moneybot.viewmodels.chat;

import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InChatPromptViewModel {
    public final UiAvatar avatar;
    public final String body;
    public final MoneybotChatViewEvent clickAction;

    public InChatPromptViewModel(String str, UiAvatar uiAvatar, MoneybotChatViewEvent.SubmitMessagePrompt submitMessagePrompt) {
        this.body = str;
        this.avatar = uiAvatar;
        this.clickAction = submitMessagePrompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InChatPromptViewModel)) {
            return false;
        }
        InChatPromptViewModel inChatPromptViewModel = (InChatPromptViewModel) obj;
        return Intrinsics.areEqual(this.body, inChatPromptViewModel.body) && Intrinsics.areEqual(this.avatar, inChatPromptViewModel.avatar) && Intrinsics.areEqual(this.clickAction, inChatPromptViewModel.clickAction);
    }

    public final int hashCode() {
        int hashCode = this.body.hashCode() * 31;
        UiAvatar uiAvatar = this.avatar;
        int hashCode2 = (hashCode + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31;
        MoneybotChatViewEvent moneybotChatViewEvent = this.clickAction;
        return hashCode2 + (moneybotChatViewEvent != null ? moneybotChatViewEvent.hashCode() : 0);
    }

    public final String toString() {
        return "InChatPromptViewModel(body=" + this.body + ", avatar=" + this.avatar + ", clickAction=" + this.clickAction + ")";
    }
}
