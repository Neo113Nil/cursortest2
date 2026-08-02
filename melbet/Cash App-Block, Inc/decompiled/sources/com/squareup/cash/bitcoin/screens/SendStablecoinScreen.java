package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SendStablecoinScreen extends MainScreens {
    public static final Parcelable.Creator<SendStablecoinScreen> CREATOR = new MoveBitcoinScreen.Creator(10);
    public final SolanaAddress address;
    public final boolean showQrScannerButton;

    public SendStablecoinScreen(boolean z, SolanaAddress solanaAddress) {
        super(1);
        this.showQrScannerButton = z;
        this.address = solanaAddress;
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
        if (!(obj instanceof SendStablecoinScreen)) {
            return false;
        }
        SendStablecoinScreen sendStablecoinScreen = (SendStablecoinScreen) obj;
        return this.showQrScannerButton == sendStablecoinScreen.showQrScannerButton && Intrinsics.areEqual(this.address, sendStablecoinScreen.address);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.showQrScannerButton) * 31;
        SolanaAddress solanaAddress = this.address;
        return hashCode + (solanaAddress == null ? 0 : solanaAddress.hashCode());
    }

    public final String toString() {
        return "SendStablecoinScreen(showQrScannerButton=" + this.showQrScannerButton + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.showQrScannerButton ? 1 : 0);
        parcel.writeParcelable(this.address, i);
    }
}
