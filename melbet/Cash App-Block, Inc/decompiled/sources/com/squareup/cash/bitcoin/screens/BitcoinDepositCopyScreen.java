package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinDepositCopyScreen extends MainScreens implements BottomSheetScreen {
    public static final Parcelable.Creator<BitcoinDepositCopyScreen> CREATOR = new BitcoinHome.Creator(4);
    public final BitcoinPayments invoice;

    public BitcoinDepositCopyScreen(BitcoinPayments bitcoinPayments) {
        super(1);
        this.invoice = bitcoinPayments;
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
        return (obj instanceof BitcoinDepositCopyScreen) && Intrinsics.areEqual(this.invoice, ((BitcoinDepositCopyScreen) obj).invoice);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        BitcoinPayments bitcoinPayments = this.invoice;
        if (bitcoinPayments == null) {
            return 0;
        }
        return bitcoinPayments.hashCode();
    }

    public final String toString() {
        return "BitcoinDepositCopyScreen(invoice=" + this.invoice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.invoice, i);
    }
}
