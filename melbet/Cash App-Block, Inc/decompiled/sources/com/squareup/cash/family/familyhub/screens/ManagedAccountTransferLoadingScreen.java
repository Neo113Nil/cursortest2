package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ManagedAccountTransferLoadingScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<ManagedAccountTransferLoadingScreen> CREATOR = new FamilyHome.Creator(8);
    public final Money amount;
    public final String dependentInstrumentToken;
    public final Screen exitScreen;
    public final String sponsorInstrumentToken;
    public final ManagedAccountTransferScreen.TransferType transferType;

    public ManagedAccountTransferLoadingScreen(ManagedAccountTransferScreen.TransferType transferType, Money money, String str, String str2, Screen screen) {
        transferType.getClass();
        money.getClass();
        screen.getClass();
        this.transferType = transferType;
        this.amount = money;
        this.sponsorInstrumentToken = str;
        this.dependentInstrumentToken = str2;
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedAccountTransferLoadingScreen)) {
            return false;
        }
        ManagedAccountTransferLoadingScreen managedAccountTransferLoadingScreen = (ManagedAccountTransferLoadingScreen) obj;
        return this.transferType == managedAccountTransferLoadingScreen.transferType && Intrinsics.areEqual(this.amount, managedAccountTransferLoadingScreen.amount) && Intrinsics.areEqual(this.sponsorInstrumentToken, managedAccountTransferLoadingScreen.sponsorInstrumentToken) && Intrinsics.areEqual(this.dependentInstrumentToken, managedAccountTransferLoadingScreen.dependentInstrumentToken) && Intrinsics.areEqual(this.exitScreen, managedAccountTransferLoadingScreen.exitScreen);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, this.transferType.hashCode() * 31, 31);
        String str = this.sponsorInstrumentToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dependentInstrumentToken;
        return this.exitScreen.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedAccountTransferLoadingScreen(transferType=");
        sb.append(this.transferType);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", sponsorInstrumentToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.sponsorInstrumentToken, ", dependentInstrumentToken=", this.dependentInstrumentToken, ", exitScreen=");
        sb.append(this.exitScreen);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.transferType.name());
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.sponsorInstrumentToken);
        parcel.writeString(this.dependentInstrumentToken);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
