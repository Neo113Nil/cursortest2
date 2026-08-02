package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StablecoinDepositOptionsScreen extends BitcoinOverlay {
    public static final Parcelable.Creator<StablecoinDepositOptionsScreen> CREATOR = new MoveBitcoinScreen.Creator(12);
    public final AskedQuestion askedQuestion;
    public final Screen exitScreen;

    public /* synthetic */ StablecoinDepositOptionsScreen(MoneyTabScreen moneyTabScreen, AskedQuestion askedQuestion, int i) {
        this((i & 1) != 0 ? null : moneyTabScreen, (i & 2) != 0 ? null : askedQuestion);
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
        if (!(obj instanceof StablecoinDepositOptionsScreen)) {
            return false;
        }
        StablecoinDepositOptionsScreen stablecoinDepositOptionsScreen = (StablecoinDepositOptionsScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, stablecoinDepositOptionsScreen.exitScreen) && Intrinsics.areEqual(this.askedQuestion, stablecoinDepositOptionsScreen.askedQuestion);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        Screen screen = this.exitScreen;
        int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
        AskedQuestion askedQuestion = this.askedQuestion;
        return hashCode + (askedQuestion != null ? askedQuestion.hashCode() : 0);
    }

    public final String toString() {
        return "StablecoinDepositOptionsScreen(exitScreen=" + this.exitScreen + ", askedQuestion=" + this.askedQuestion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.askedQuestion, i);
    }

    public StablecoinDepositOptionsScreen(Screen screen, AskedQuestion askedQuestion) {
        super(1);
        this.exitScreen = screen;
        this.askedQuestion = askedQuestion;
    }
}
