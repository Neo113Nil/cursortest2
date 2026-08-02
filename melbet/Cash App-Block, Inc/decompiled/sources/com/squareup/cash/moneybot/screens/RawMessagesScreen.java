package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RawMessagesScreen implements MoneybotScreen, RestoringScreen {
    public static final Parcelable.Creator<RawMessagesScreen> CREATOR = new MusicScreen.Creator(24);
    public final String sessionId;

    public RawMessagesScreen(String str) {
        str.getClass();
        this.sessionId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RawMessagesScreen) && Intrinsics.areEqual(this.sessionId, ((RawMessagesScreen) obj).sessionId);
    }

    public final int hashCode() {
        return this.sessionId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RawMessagesScreen(sessionId=", this.sessionId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sessionId);
    }
}
