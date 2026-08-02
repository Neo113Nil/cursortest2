package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotDebugOverlayScreen implements MoneybotScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<MoneybotDebugOverlayScreen> CREATOR = new MusicScreen.Creator(4);
    public final ChatSourceContext chatSourceContext;

    public MoneybotDebugOverlayScreen(ChatSourceContext chatSourceContext) {
        this.chatSourceContext = chatSourceContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneybotDebugOverlayScreen) && Intrinsics.areEqual(this.chatSourceContext, ((MoneybotDebugOverlayScreen) obj).chatSourceContext);
    }

    public final int hashCode() {
        ChatSourceContext chatSourceContext = this.chatSourceContext;
        if (chatSourceContext == null) {
            return 0;
        }
        return chatSourceContext.hashCode();
    }

    public final String toString() {
        return "MoneybotDebugOverlayScreen(chatSourceContext=" + this.chatSourceContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ChatSourceContext chatSourceContext = this.chatSourceContext;
        if (chatSourceContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatSourceContext.writeToParcel(parcel, i);
        }
    }
}
