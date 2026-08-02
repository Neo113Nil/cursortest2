package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinMapOnboardingScreen extends MainScreens implements NeverInBackStackScreen {
    public static final Parcelable.Creator<BitcoinMapOnboardingScreen> CREATOR = new BitcoinHome.Creator(19);
    public final BitcoinMapScreen.Source source;

    public BitcoinMapOnboardingScreen(BitcoinMapScreen.Source source) {
        super(1);
        this.source = source;
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
        return (obj instanceof BitcoinMapOnboardingScreen) && this.source == ((BitcoinMapOnboardingScreen) obj).source;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        BitcoinMapScreen.Source source = this.source;
        if (source == null) {
            return 0;
        }
        return source.hashCode();
    }

    public final String toString() {
        return "BitcoinMapOnboardingScreen(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BitcoinMapScreen.Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(source.name());
        }
    }
}
