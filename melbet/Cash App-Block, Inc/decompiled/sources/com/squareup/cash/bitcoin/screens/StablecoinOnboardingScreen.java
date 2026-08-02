package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class StablecoinOnboardingScreen extends MainScreens implements NeverInBackStackScreen {
    public static final Parcelable.Creator<StablecoinOnboardingScreen> CREATOR = new MoveBitcoinScreen.Creator(14);
    public final StablecoinOnboardingType onboardingType;
    public final boolean startedAsInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StablecoinOnboardingScreen(StablecoinOnboardingType stablecoinOnboardingType, boolean z) {
        super(1);
        stablecoinOnboardingType.getClass();
        this.onboardingType = stablecoinOnboardingType;
        this.startedAsInfo = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinOnboardingScreen)) {
            return false;
        }
        StablecoinOnboardingScreen stablecoinOnboardingScreen = (StablecoinOnboardingScreen) obj;
        return this.onboardingType == stablecoinOnboardingScreen.onboardingType && this.startedAsInfo == stablecoinOnboardingScreen.startedAsInfo;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return Boolean.hashCode(this.startedAsInfo) + (this.onboardingType.hashCode() * 31);
    }

    public final String toString() {
        return "StablecoinOnboardingScreen(onboardingType=" + this.onboardingType + ", startedAsInfo=" + this.startedAsInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.onboardingType.name());
        parcel.writeInt(this.startedAsInfo ? 1 : 0);
    }
}
