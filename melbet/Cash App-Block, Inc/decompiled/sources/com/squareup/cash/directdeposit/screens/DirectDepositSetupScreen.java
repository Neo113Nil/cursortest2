package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.screens.AccentedScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositSetupScreen implements DirectDepositScreens, AccentedScreen, RestoringScreen {
    public static final Parcelable.Creator<DirectDepositSetupScreen> CREATOR = new Limit.Creator(17);
    public final ColorModel accentColor;
    public final Screen exitScreen;
    public final DirectDepositSetupOrigin origin;

    public DirectDepositSetupScreen(Screen screen, DirectDepositSetupOrigin directDepositSetupOrigin, ColorModel colorModel) {
        directDepositSetupOrigin.getClass();
        this.exitScreen = screen;
        this.origin = directDepositSetupOrigin;
        this.accentColor = colorModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositSetupScreen)) {
            return false;
        }
        DirectDepositSetupScreen directDepositSetupScreen = (DirectDepositSetupScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, directDepositSetupScreen.exitScreen) && this.origin == directDepositSetupScreen.origin && Intrinsics.areEqual(this.accentColor, directDepositSetupScreen.accentColor);
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    public final int hashCode() {
        Screen screen = this.exitScreen;
        int hashCode = (this.origin.hashCode() + ((screen == null ? 0 : screen.hashCode()) * 31)) * 31;
        ColorModel colorModel = this.accentColor;
        return hashCode + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectDepositSetupScreen(exitScreen=");
        sb.append(this.exitScreen);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeString(this.origin.name());
        parcel.writeParcelable(this.accentColor, i);
    }
}
