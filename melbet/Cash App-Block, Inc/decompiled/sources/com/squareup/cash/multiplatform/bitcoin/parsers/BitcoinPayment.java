package com.squareup.cash.multiplatform.bitcoin.parsers;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinVersion;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.EthereumAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BitcoinPayment implements Parcelable {
    public static final Parcelable.Creator<BitcoinPayment> CREATOR = new Creator(0);
    public final BitcoinAddress address;
    public final Long amount;
    public final String data;
    public final String depositTransactionToken;
    public final boolean isUri;
    public final LightningInvoice lightningInvoice;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new BitcoinPayment(parcel.readString(), (BitcoinAddress) parcel.readParcelable(BitcoinPayment.class.getClassLoader()), parcel.readInt() != 0, (LightningInvoice) parcel.readParcelable(BitcoinPayment.class.getClassLoader()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
                case 1:
                    parcel.getClass();
                    return new BitcoinAddress.LegacyAddress(parcel.readString(), (BitcoinVersion) parcel.readParcelable(BitcoinAddress.LegacyAddress.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new BitcoinAddress.NativeSegwitAddress(parcel.readString(), parcel.readInt() != 0 ? BitcoinNetwork.valueOf(parcel.readString()) : null);
                case 3:
                    parcel.getClass();
                    return new BitcoinPayments.Bitcoin(BitcoinPayment.CREATOR.createFromParcel(parcel));
                case 4:
                    parcel.getClass();
                    return new BitcoinPayments.Ethereum(EthereumAddress.CREATOR.createFromParcel(parcel));
                case 5:
                    parcel.getClass();
                    return new BitcoinPayments.Lightning((LightningInvoice) parcel.readParcelable(BitcoinPayments.Lightning.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new BitcoinPayments.Stablecoin(SolanaAddress.CREATOR.createFromParcel(parcel));
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinVersion.P2pkhMainnet.INSTANCE;
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinVersion.P2pkhTestnet.INSTANCE;
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinVersion.P2shMainnet.INSTANCE;
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinVersion.P2shTestnet.INSTANCE;
                case 11:
                    parcel.getClass();
                    return new BitcoinVersion.Unknown(parcel.readInt());
                case 12:
                    parcel.getClass();
                    return new LightningInvoice.Invoice(LightningPrefixes.valueOf(parcel.readString()), parcel.readString());
                default:
                    parcel.getClass();
                    return new LightningInvoice.LUD16Address(parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new BitcoinPayment[i];
                case 1:
                    return new BitcoinAddress.LegacyAddress[i];
                case 2:
                    return new BitcoinAddress.NativeSegwitAddress[i];
                case 3:
                    return new BitcoinPayments.Bitcoin[i];
                case 4:
                    return new BitcoinPayments.Ethereum[i];
                case 5:
                    return new BitcoinPayments.Lightning[i];
                case 6:
                    return new BitcoinPayments.Stablecoin[i];
                case 7:
                    return new BitcoinVersion.P2pkhMainnet[i];
                case 8:
                    return new BitcoinVersion.P2pkhTestnet[i];
                case 9:
                    return new BitcoinVersion.P2shMainnet[i];
                case 10:
                    return new BitcoinVersion.P2shTestnet[i];
                case 11:
                    return new BitcoinVersion.Unknown[i];
                case 12:
                    return new LightningInvoice.Invoice[i];
                default:
                    return new LightningInvoice.LUD16Address[i];
            }
        }
    }

    public BitcoinPayment(String str, BitcoinAddress bitcoinAddress, boolean z, LightningInvoice lightningInvoice, Long l, String str2) {
        str.getClass();
        this.data = str;
        this.address = bitcoinAddress;
        this.isUri = z;
        this.lightningInvoice = lightningInvoice;
        this.amount = l;
        this.depositTransactionToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinPayment)) {
            return false;
        }
        BitcoinPayment bitcoinPayment = (BitcoinPayment) obj;
        return Intrinsics.areEqual(this.data, bitcoinPayment.data) && Intrinsics.areEqual(this.address, bitcoinPayment.address) && this.isUri == bitcoinPayment.isUri && Intrinsics.areEqual(this.lightningInvoice, bitcoinPayment.lightningInvoice) && Intrinsics.areEqual(this.amount, bitcoinPayment.amount) && Intrinsics.areEqual(this.depositTransactionToken, bitcoinPayment.depositTransactionToken);
    }

    public final int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        BitcoinAddress bitcoinAddress = this.address;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (bitcoinAddress == null ? 0 : bitcoinAddress.hashCode())) * 31, 31, this.isUri);
        LightningInvoice lightningInvoice = this.lightningInvoice;
        int hashCode2 = (m + (lightningInvoice == null ? 0 : lightningInvoice.hashCode())) * 31;
        Long l = this.amount;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.depositTransactionToken;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BitcoinPayment(data=" + this.data + ", address=" + this.address + ", isUri=" + this.isUri + ", lightningInvoice=" + this.lightningInvoice + ", amount=" + this.amount + ", depositTransactionToken=" + this.depositTransactionToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.data);
        parcel.writeParcelable(this.address, i);
        parcel.writeInt(this.isUri ? 1 : 0);
        parcel.writeParcelable(this.lightningInvoice, i);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.depositTransactionToken);
    }

    public /* synthetic */ BitcoinPayment(String str, BitcoinAddress bitcoinAddress, boolean z, LightningInvoice lightningInvoice, Long l, int i) {
        this(str, bitcoinAddress, z, (i & 8) != 0 ? null : lightningInvoice, (i & 16) != 0 ? null : l, (String) null);
    }
}
