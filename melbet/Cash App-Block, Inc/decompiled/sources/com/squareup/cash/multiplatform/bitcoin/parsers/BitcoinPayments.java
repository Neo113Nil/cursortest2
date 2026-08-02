package com.squareup.cash.multiplatform.bitcoin.parsers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadl;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.EthereumAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes6.dex */
public interface BitcoinPayments extends Parcelable {

    public final class Bitcoin implements BitcoinPayments {
        public static final Parcelable.Creator<Bitcoin> CREATOR = new BitcoinPayment.Creator(3);
        public final BitcoinPayment bitcoinPayment;

        public Bitcoin(BitcoinPayment bitcoinPayment) {
            bitcoinPayment.getClass();
            this.bitcoinPayment = bitcoinPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bitcoin) && Intrinsics.areEqual(this.bitcoinPayment, ((Bitcoin) obj).bitcoinPayment);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getAsUri() {
            String str;
            BitcoinPayment bitcoinPayment = this.bitcoinPayment;
            Long l = bitcoinPayment.amount;
            if (l != null) {
                long longValue = l.longValue();
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMinimumFractionDigits(0);
                decimalFormat.setMaximumFractionDigits(8);
                decimalFormat.setGroupingUsed(false);
                str = decimalFormat.format(longValue / 1.0E8d);
                str.getClass();
            } else {
                str = null;
            }
            Pair pair = new Pair("amount", str);
            LightningInvoice lightningInvoice = bitcoinPayment.lightningInvoice;
            Map mapOf = MapsKt__MapsKt.mapOf(pair, new Pair("lightning", lightningInvoice != null ? lightningInvoice.getInvoice() : null));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapOf.entrySet()) {
                if (((String) entry.getValue()) != null && (!StringsKt.isBlank(r3))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("bitcoin:");
            BitcoinAddress bitcoinAddress = bitcoinPayment.address;
            if (bitcoinAddress != null) {
                m.append(bitcoinAddress.getAddress());
            }
            zzadl.addParameters(m, linkedHashMap);
            return m.toString();
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getOriginalData() {
            return this.bitcoinPayment.data;
        }

        public final int hashCode() {
            return this.bitcoinPayment.hashCode();
        }

        public final String toString() {
            return "Bitcoin(bitcoinPayment=" + this.bitcoinPayment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.bitcoinPayment.writeToParcel(parcel, i);
        }
    }

    public final class Ethereum implements BitcoinPayments {
        public static final Parcelable.Creator<Ethereum> CREATOR = new BitcoinPayment.Creator(4);
        public final EthereumAddress ethereumAddress;

        public Ethereum(EthereumAddress ethereumAddress) {
            ethereumAddress.getClass();
            this.ethereumAddress = ethereumAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ethereum) && Intrinsics.areEqual(this.ethereumAddress, ((Ethereum) obj).ethereumAddress);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getAsUri() {
            EthereumAddress ethereumAddress = this.ethereumAddress;
            ethereumAddress.getClass();
            Map m = Thread$State$EnumUnboxingLocalUtility.m("value", ethereumAddress.value);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : m.entrySet()) {
                if (((String) entry.getValue()) != null && (!StringsKt.isBlank(r3))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ethereum:" + ethereumAddress.address);
            zzadl.addParameters(sb, linkedHashMap);
            return sb.toString();
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getOriginalData() {
            return this.ethereumAddress.data;
        }

        public final int hashCode() {
            return this.ethereumAddress.hashCode();
        }

        public final String toString() {
            return "Ethereum(ethereumAddress=" + this.ethereumAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.ethereumAddress.writeToParcel(parcel, i);
        }
    }

    public final class Lightning implements BitcoinPayments {
        public static final Parcelable.Creator<Lightning> CREATOR = new BitcoinPayment.Creator(5);
        public final LightningInvoice invoice;

        public Lightning(LightningInvoice lightningInvoice) {
            lightningInvoice.getClass();
            this.invoice = lightningInvoice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lightning) && Intrinsics.areEqual(this.invoice, ((Lightning) obj).invoice);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getAsUri() {
            LightningInvoice lightningInvoice = this.invoice;
            if (lightningInvoice instanceof LightningInvoice.Invoice) {
                return Recorder$$ExternalSyntheticOutline2.m("lightning:", ((LightningInvoice.Invoice) lightningInvoice).invoice);
            }
            if (lightningInvoice instanceof LightningInvoice.LUD16Address) {
                return ((LightningInvoice.LUD16Address) lightningInvoice).invoice;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public final LightningInvoice getInvoice() {
            return this.invoice;
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getOriginalData() {
            return this.invoice.getInvoice();
        }

        public final int hashCode() {
            return this.invoice.hashCode();
        }

        public final String toString() {
            return "Lightning(invoice=" + this.invoice + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.invoice, i);
        }
    }

    public final class Stablecoin implements BitcoinPayments {
        public static final Parcelable.Creator<Stablecoin> CREATOR = new BitcoinPayment.Creator(6);
        public final SolanaAddress address;

        public Stablecoin(SolanaAddress solanaAddress) {
            solanaAddress.getClass();
            this.address = solanaAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stablecoin) && Intrinsics.areEqual(this.address, ((Stablecoin) obj).address);
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getAsUri() {
            SolanaAddress solanaAddress = this.address;
            solanaAddress.getClass();
            Map mapOf = MapsKt__MapsKt.mapOf(new Pair("amount", solanaAddress.amount), new Pair(AnnotatedPrivateKey.LABEL, solanaAddress.label), new Pair("memo", solanaAddress.memo), new Pair("message", solanaAddress.message), new Pair("spl-token", solanaAddress.splToken));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapOf.entrySet()) {
                if (((String) entry.getValue()) != null && (!StringsKt.isBlank(r3))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("solana:" + solanaAddress.address);
            zzadl.addParameters(sb, linkedHashMap);
            return sb.toString();
        }

        @Override // com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments
        public final String getOriginalData() {
            return this.address.data;
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return "Stablecoin(address=" + this.address + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.address.writeToParcel(parcel, i);
        }
    }

    String getAsUri();

    String getOriginalData();
}
