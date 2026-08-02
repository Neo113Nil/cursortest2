package com.squareup.cash.multiplatform.bitcoin.parsers;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.UInt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public interface BitcoinVersion extends Parcelable {

    public final class Companion {
        /* renamed from: fromRawValue-WZ4Q5Ns, reason: not valid java name */
        public static BitcoinVersion m3661fromRawValueWZ4Q5Ns(int i) {
            return i != 0 ? i != 5 ? i != 111 ? i != 196 ? new Unknown(i) : P2shTestnet.INSTANCE : P2pkhTestnet.INSTANCE : P2shMainnet.INSTANCE : P2pkhMainnet.INSTANCE;
        }
    }

    public final class P2pkhMainnet implements BitcoinVersion {
        public static final P2pkhMainnet INSTANCE = new P2pkhMainnet();
        public static final Parcelable.Creator<P2pkhMainnet> CREATOR = new BitcoinPayment.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof P2pkhMainnet);
        }

        public final int hashCode() {
            return -946189937;
        }

        public final String toString() {
            return "P2pkhMainnet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class P2pkhTestnet implements BitcoinVersion {
        public static final P2pkhTestnet INSTANCE = new P2pkhTestnet();
        public static final Parcelable.Creator<P2pkhTestnet> CREATOR = new BitcoinPayment.Creator(8);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof P2pkhTestnet);
        }

        public final int hashCode() {
            return 1095299094;
        }

        public final String toString() {
            return "P2pkhTestnet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class P2shMainnet implements BitcoinVersion {
        public static final P2shMainnet INSTANCE = new P2shMainnet();
        public static final Parcelable.Creator<P2shMainnet> CREATOR = new BitcoinPayment.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof P2shMainnet);
        }

        public final int hashCode() {
            return 1127226199;
        }

        public final String toString() {
            return "P2shMainnet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class P2shTestnet implements BitcoinVersion {
        public static final P2shTestnet INSTANCE = new P2shTestnet();
        public static final Parcelable.Creator<P2shTestnet> CREATOR = new BitcoinPayment.Creator(10);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof P2shTestnet);
        }

        public final int hashCode() {
            return -1126252066;
        }

        public final String toString() {
            return "P2shTestnet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Unknown implements BitcoinVersion {
        public static final Parcelable.Creator<Unknown> CREATOR = new BitcoinPayment.Creator(11);
        public final int versionByte;

        public Unknown(int i) {
            this.versionByte = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && this.versionByte == ((Unknown) obj).versionByte;
        }

        public final int hashCode() {
            UInt.Companion companion = UInt.Companion;
            return Integer.hashCode(this.versionByte);
        }

        public final String toString() {
            UInt.Companion companion = UInt.Companion;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown(versionByte=", String.valueOf(this.versionByte & BodyPartID.bodyIdMax), ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.versionByte);
        }
    }
}
