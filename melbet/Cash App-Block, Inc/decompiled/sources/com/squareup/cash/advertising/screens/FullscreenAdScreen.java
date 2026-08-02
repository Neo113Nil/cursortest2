package com.squareup.cash.advertising.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FullscreenAdScreen implements Screen {
    public static final Parcelable.Creator<FullscreenAdScreen> CREATOR = new ActivityScreen.Creator(8);
    public final String token;

    public FullscreenAdScreen(String str) {
        str.getClass();
        this.token = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullscreenAdScreen) && Intrinsics.areEqual(this.token, ((FullscreenAdScreen) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FullscreenAdScreen(token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
    }
}
