package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotOverflowMenuScreen implements MoneybotScreen, NeverInBackStackScreen {
    public static final Parcelable.Creator<MoneybotOverflowMenuScreen> CREATOR = new MusicScreen.Creator(11);
    public final ChatSourceContext chatSourceContext;
    public final HomeSourceContext homeSourceContext;

    public /* synthetic */ MoneybotOverflowMenuScreen(ChatSourceContext chatSourceContext, HomeSourceContext homeSourceContext, int i) {
        this((i & 1) != 0 ? null : chatSourceContext, (i & 2) != 0 ? null : homeSourceContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotOverflowMenuScreen)) {
            return false;
        }
        MoneybotOverflowMenuScreen moneybotOverflowMenuScreen = (MoneybotOverflowMenuScreen) obj;
        return Intrinsics.areEqual(this.chatSourceContext, moneybotOverflowMenuScreen.chatSourceContext) && Intrinsics.areEqual(this.homeSourceContext, moneybotOverflowMenuScreen.homeSourceContext);
    }

    public final int hashCode() {
        ChatSourceContext chatSourceContext = this.chatSourceContext;
        int hashCode = (chatSourceContext == null ? 0 : chatSourceContext.hashCode()) * 31;
        HomeSourceContext homeSourceContext = this.homeSourceContext;
        return hashCode + (homeSourceContext != null ? homeSourceContext.hashCode() : 0);
    }

    public final String toString() {
        return "MoneybotOverflowMenuScreen(chatSourceContext=" + this.chatSourceContext + ", homeSourceContext=" + this.homeSourceContext + ")";
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
        HomeSourceContext homeSourceContext = this.homeSourceContext;
        if (homeSourceContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            homeSourceContext.writeToParcel(parcel, i);
        }
    }

    public MoneybotOverflowMenuScreen(ChatSourceContext chatSourceContext, HomeSourceContext homeSourceContext) {
        this.chatSourceContext = chatSourceContext;
        this.homeSourceContext = homeSourceContext;
    }
}
