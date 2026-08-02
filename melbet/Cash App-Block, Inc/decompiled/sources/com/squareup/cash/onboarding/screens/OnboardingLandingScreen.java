package com.squareup.cash.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OnboardingLandingScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<OnboardingLandingScreen> CREATOR = new P2PListScreen.Creator(1);
    public final Screen nextScreen;
    public final String placeholderImageUrl;
    public final String videoUrl;

    public OnboardingLandingScreen(Screen screen, String str, String str2) {
        str.getClass();
        str2.getClass();
        screen.getClass();
        this.placeholderImageUrl = str;
        this.videoUrl = str2;
        this.nextScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingLandingScreen)) {
            return false;
        }
        OnboardingLandingScreen onboardingLandingScreen = (OnboardingLandingScreen) obj;
        return Intrinsics.areEqual(this.placeholderImageUrl, onboardingLandingScreen.placeholderImageUrl) && Intrinsics.areEqual(this.videoUrl, onboardingLandingScreen.videoUrl) && Intrinsics.areEqual(this.nextScreen, onboardingLandingScreen.nextScreen);
    }

    public final int hashCode() {
        return this.nextScreen.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholderImageUrl.hashCode() * 31, 31, this.videoUrl);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnboardingLandingScreen(placeholderImageUrl=", this.placeholderImageUrl, ", videoUrl=", this.videoUrl, ", nextScreen=");
        m.append(this.nextScreen);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.placeholderImageUrl);
        parcel.writeString(this.videoUrl);
        parcel.writeParcelable(this.nextScreen, i);
    }
}
