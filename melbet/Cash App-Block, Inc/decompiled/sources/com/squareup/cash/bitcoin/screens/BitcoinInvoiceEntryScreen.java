package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinInvoiceEntryScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinInvoiceEntryScreen> CREATOR = new BitcoinHome.Creator(14);
    public final CryptoPayment payment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinInvoiceEntryScreen(CryptoPayment cryptoPayment) {
        super(1);
        cryptoPayment.getClass();
        this.payment = cryptoPayment;
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
        return (obj instanceof BitcoinInvoiceEntryScreen) && Intrinsics.areEqual(this.payment, ((BitcoinInvoiceEntryScreen) obj).payment);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.payment.hashCode();
    }

    public final String toString() {
        return "BitcoinInvoiceEntryScreen(payment=" + this.payment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.payment, i);
    }
}
