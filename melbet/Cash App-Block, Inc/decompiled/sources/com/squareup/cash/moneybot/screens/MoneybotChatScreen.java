package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotChatScreen implements MoneybotScreen, RestoringScreen, Screen {
    public static final Parcelable.Creator<MoneybotChatScreen> CREATOR = new MusicScreen.Creator(3);
    public final ChatKickoffParams chatKickoffParams;
    public final MoneybotChatEntryPoint entryPoint;
    public final HomeSourceContext homeSourceContext;
    public final MoneybotPendingSheet$TransferOptionPicker pendingSheet;
    public final boolean shouldRequestKeyboardFocus;
    public final String suggestionsId;

    public /* synthetic */ MoneybotChatScreen(ChatKickoffParams chatKickoffParams, MoneybotChatEntryPoint moneybotChatEntryPoint, HomeSourceContext homeSourceContext, String str, MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker, int i) {
        this((i & 1) != 0 ? null : chatKickoffParams, (i & 2) != 0 ? null : moneybotChatEntryPoint, (i & 4) != 0 ? null : homeSourceContext, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? null : moneybotPendingSheet$TransferOptionPicker);
    }

    public static MoneybotChatScreen copy$default(MoneybotChatScreen moneybotChatScreen, ChatKickoffParams chatKickoffParams, MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker, int i) {
        if ((i & 1) != 0) {
            chatKickoffParams = moneybotChatScreen.chatKickoffParams;
        }
        MoneybotChatEntryPoint moneybotChatEntryPoint = moneybotChatScreen.entryPoint;
        HomeSourceContext homeSourceContext = moneybotChatScreen.homeSourceContext;
        String str = moneybotChatScreen.suggestionsId;
        boolean z = moneybotChatScreen.shouldRequestKeyboardFocus;
        moneybotChatScreen.getClass();
        return new MoneybotChatScreen(chatKickoffParams, moneybotChatEntryPoint, homeSourceContext, str, z, moneybotPendingSheet$TransferOptionPicker);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatScreen)) {
            return false;
        }
        MoneybotChatScreen moneybotChatScreen = (MoneybotChatScreen) obj;
        return Intrinsics.areEqual(this.chatKickoffParams, moneybotChatScreen.chatKickoffParams) && this.entryPoint == moneybotChatScreen.entryPoint && Intrinsics.areEqual(this.homeSourceContext, moneybotChatScreen.homeSourceContext) && Intrinsics.areEqual(this.suggestionsId, moneybotChatScreen.suggestionsId) && this.shouldRequestKeyboardFocus == moneybotChatScreen.shouldRequestKeyboardFocus;
    }

    public final int hashCode() {
        ChatKickoffParams chatKickoffParams = this.chatKickoffParams;
        int hashCode = (chatKickoffParams != null ? chatKickoffParams.hashCode() : 0) * 31;
        MoneybotChatEntryPoint moneybotChatEntryPoint = this.entryPoint;
        int hashCode2 = (hashCode + (moneybotChatEntryPoint != null ? moneybotChatEntryPoint.hashCode() : 0)) * 31;
        HomeSourceContext homeSourceContext = this.homeSourceContext;
        int hashCode3 = (hashCode2 + (homeSourceContext != null ? homeSourceContext.hashCode() : 0)) * 31;
        String str = this.suggestionsId;
        return Boolean.hashCode(this.shouldRequestKeyboardFocus) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MoneybotChatScreen(chatKickoffParams=" + this.chatKickoffParams + ", entryPoint=" + this.entryPoint + ", homeSourceContext=" + this.homeSourceContext + ", suggestionsId=" + this.suggestionsId + ", shouldRequestKeyboardFocus=" + this.shouldRequestKeyboardFocus + ", pendingSheet=" + this.pendingSheet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.chatKickoffParams, i);
        MoneybotChatEntryPoint moneybotChatEntryPoint = this.entryPoint;
        if (moneybotChatEntryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(moneybotChatEntryPoint.name());
        }
        HomeSourceContext homeSourceContext = this.homeSourceContext;
        if (homeSourceContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            homeSourceContext.writeToParcel(parcel, i);
        }
        parcel.writeString(this.suggestionsId);
        parcel.writeInt(this.shouldRequestKeyboardFocus ? 1 : 0);
        parcel.writeParcelable(this.pendingSheet, i);
    }

    public MoneybotChatScreen(ChatKickoffParams chatKickoffParams, MoneybotChatEntryPoint moneybotChatEntryPoint, HomeSourceContext homeSourceContext, String str, boolean z, MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker) {
        this.chatKickoffParams = chatKickoffParams;
        this.entryPoint = moneybotChatEntryPoint;
        this.homeSourceContext = homeSourceContext;
        this.suggestionsId = str;
        this.shouldRequestKeyboardFocus = z;
        this.pendingSheet = moneybotPendingSheet$TransferOptionPicker;
    }
}
