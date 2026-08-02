package com.squareup.cash.multiplatform.bitcoin.parsers;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LightningInvoice extends Parcelable {

    public final class Invoice implements LightningInvoice {
        public static final Parcelable.Creator<Invoice> CREATOR = new BitcoinPayment.Creator(12);
        public final String encodedString;
        public final String invoice;
        public final LightningPrefixes prefix;

        public Invoice(LightningPrefixes lightningPrefixes, String str) {
            lightningPrefixes.getClass();
            str.getClass();
            this.prefix = lightningPrefixes;
            this.encodedString = str;
            this.invoice = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Invoice)) {
                return false;
            }
            Invoice invoice = (Invoice) obj;
            return this.prefix == invoice.prefix && Intrinsics.areEqual(this.encodedString, invoice.encodedString);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice
        public final String getInvoice() {
            return this.invoice;
        }

        public final int hashCode() {
            return this.encodedString.hashCode() + (this.prefix.hashCode() * 31);
        }

        public final String toString() {
            return "Invoice(prefix=" + this.prefix + ", encodedString=" + this.encodedString + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.prefix.name());
            parcel.writeString(this.encodedString);
        }
    }

    public final class LUD16Address implements LightningInvoice {
        public static final Parcelable.Creator<LUD16Address> CREATOR = new BitcoinPayment.Creator(13);
        public final String address;
        public final String invoice;

        public LUD16Address(String str) {
            str.getClass();
            this.address = str;
            this.invoice = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LUD16Address) && Intrinsics.areEqual(this.address, ((LUD16Address) obj).address);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice
        public final String getInvoice() {
            return this.invoice;
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LUD16Address(address=", this.address, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.address);
        }
    }

    String getInvoice();
}
