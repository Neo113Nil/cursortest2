package com.squareup.cash.multiplatform.bitcoin.parsers;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinVersion;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BitcoinAddress extends Parcelable {

    public final class LegacyAddress implements BitcoinAddress {
        public static final Parcelable.Creator<LegacyAddress> CREATOR = new BitcoinPayment.Creator(1);
        public final String address;
        public final BitcoinVersion version;

        public LegacyAddress(String str, BitcoinVersion bitcoinVersion) {
            str.getClass();
            bitcoinVersion.getClass();
            this.address = str;
            this.version = bitcoinVersion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegacyAddress)) {
                return false;
            }
            LegacyAddress legacyAddress = (LegacyAddress) obj;
            return Intrinsics.areEqual(this.address, legacyAddress.address) && Intrinsics.areEqual(this.version, legacyAddress.version);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress
        public final String getAddress() {
            return this.address;
        }

        public final BitcoinNetwork getNetwork() {
            BitcoinVersion.P2pkhMainnet p2pkhMainnet = BitcoinVersion.P2pkhMainnet.INSTANCE;
            BitcoinVersion bitcoinVersion = this.version;
            if (Intrinsics.areEqual(bitcoinVersion, p2pkhMainnet) || Intrinsics.areEqual(bitcoinVersion, BitcoinVersion.P2shMainnet.INSTANCE)) {
                return BitcoinNetwork.MAINNET;
            }
            if (Intrinsics.areEqual(bitcoinVersion, BitcoinVersion.P2pkhTestnet.INSTANCE) || Intrinsics.areEqual(bitcoinVersion, BitcoinVersion.P2shTestnet.INSTANCE)) {
                return BitcoinNetwork.TESTNET;
            }
            if (bitcoinVersion instanceof BitcoinVersion.Unknown) {
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public final int hashCode() {
            return this.version.hashCode() + (this.address.hashCode() * 31);
        }

        public final String toString() {
            return "LegacyAddress(address=" + this.address + ", version=" + this.version + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.address);
            parcel.writeParcelable(this.version, i);
        }
    }

    public final class NativeSegwitAddress implements BitcoinAddress {
        public static final Parcelable.Creator<NativeSegwitAddress> CREATOR = new BitcoinPayment.Creator(2);
        public final String address;
        public final BitcoinNetwork network;

        public NativeSegwitAddress(String str, BitcoinNetwork bitcoinNetwork) {
            str.getClass();
            this.address = str;
            this.network = bitcoinNetwork;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeSegwitAddress)) {
                return false;
            }
            NativeSegwitAddress nativeSegwitAddress = (NativeSegwitAddress) obj;
            return Intrinsics.areEqual(this.address, nativeSegwitAddress.address) && this.network == nativeSegwitAddress.network;
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress
        public final String getAddress() {
            return this.address;
        }

        public final int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            BitcoinNetwork bitcoinNetwork = this.network;
            return hashCode + (bitcoinNetwork == null ? 0 : bitcoinNetwork.hashCode());
        }

        public final String toString() {
            return "NativeSegwitAddress(address=" + this.address + ", network=" + this.network + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.address);
            BitcoinNetwork bitcoinNetwork = this.network;
            if (bitcoinNetwork == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(bitcoinNetwork.name());
            }
        }
    }

    String getAddress();
}
