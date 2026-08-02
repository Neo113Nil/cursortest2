package com.squareup.cash.crypto.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.protos.common.Money;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface CryptoPayment extends Parcelable {

    /* loaded from: classes6.dex */
    public final class InvoiceIdPayment implements CryptoPayment {
        public static final Parcelable.Creator<InvoiceIdPayment> CREATOR = new ViewStateId.Creator(25);
        public final UUID externalId;
        public final String invoiceId;

        public InvoiceIdPayment(String str, UUID uuid) {
            str.getClass();
            this.invoiceId = str;
            this.externalId = uuid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvoiceIdPayment)) {
                return false;
            }
            InvoiceIdPayment invoiceIdPayment = (InvoiceIdPayment) obj;
            return Intrinsics.areEqual(this.invoiceId, invoiceIdPayment.invoiceId) && Intrinsics.areEqual(this.externalId, invoiceIdPayment.externalId);
        }

        @Override // com.squareup.cash.crypto.navigation.CryptoPayment
        public final UUID getExternalId() {
            return this.externalId;
        }

        public final int hashCode() {
            int hashCode = this.invoiceId.hashCode() * 31;
            UUID uuid = this.externalId;
            return hashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public final String toString() {
            return "InvoiceIdPayment(invoiceId=" + this.invoiceId + ", externalId=" + this.externalId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.invoiceId);
            parcel.writeSerializable(this.externalId);
        }
    }

    /* loaded from: classes6.dex */
    public final class TokenPayment implements CryptoPayment {
        public static final Parcelable.Creator<TokenPayment> CREATOR = new ViewStateId.Creator(27);
        public final UUID externalId;
        public final String token;

        public TokenPayment(String str, UUID uuid) {
            str.getClass();
            this.externalId = uuid;
            this.token = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenPayment)) {
                return false;
            }
            TokenPayment tokenPayment = (TokenPayment) obj;
            return Intrinsics.areEqual(this.externalId, tokenPayment.externalId) && Intrinsics.areEqual(this.token, tokenPayment.token);
        }

        @Override // com.squareup.cash.crypto.navigation.CryptoPayment
        public final UUID getExternalId() {
            return this.externalId;
        }

        public final int hashCode() {
            UUID uuid = this.externalId;
            return this.token.hashCode() + ((uuid == null ? 0 : uuid.hashCode()) * 31);
        }

        public final String toString() {
            return "TokenPayment(externalId=" + this.externalId + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.externalId);
            parcel.writeString(this.token);
        }
    }

    UUID getExternalId();

    /* loaded from: classes6.dex */
    public final class InvoicePayment implements CryptoPayment {
        public static final Parcelable.Creator<InvoicePayment> CREATOR = new ViewStateId.Creator(26);
        public final Money customerSuppliedAmount;
        public final UUID externalId;
        public final BitcoinPayments invoice;
        public final CryptoPaymentSource source;

        public InvoicePayment(BitcoinPayments bitcoinPayments, CryptoPaymentSource cryptoPaymentSource, Money money, UUID uuid) {
            bitcoinPayments.getClass();
            cryptoPaymentSource.getClass();
            this.invoice = bitcoinPayments;
            this.source = cryptoPaymentSource;
            this.customerSuppliedAmount = money;
            this.externalId = uuid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvoicePayment)) {
                return false;
            }
            InvoicePayment invoicePayment = (InvoicePayment) obj;
            return Intrinsics.areEqual(this.invoice, invoicePayment.invoice) && this.source == invoicePayment.source && Intrinsics.areEqual(this.customerSuppliedAmount, invoicePayment.customerSuppliedAmount) && Intrinsics.areEqual(this.externalId, invoicePayment.externalId);
        }

        @Override // com.squareup.cash.crypto.navigation.CryptoPayment
        public final UUID getExternalId() {
            return this.externalId;
        }

        public final int hashCode() {
            int hashCode = (this.source.hashCode() + (this.invoice.hashCode() * 31)) * 31;
            Money money = this.customerSuppliedAmount;
            int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
            UUID uuid = this.externalId;
            return hashCode2 + (uuid != null ? uuid.hashCode() : 0);
        }

        public final String toString() {
            return "InvoicePayment(invoice=" + this.invoice + ", source=" + this.source + ", customerSuppliedAmount=" + this.customerSuppliedAmount + ", externalId=" + this.externalId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.invoice, i);
            parcel.writeString(this.source.name());
            parcel.writeParcelable(this.customerSuppliedAmount, i);
            parcel.writeSerializable(this.externalId);
        }

        public /* synthetic */ InvoicePayment(BitcoinPayments bitcoinPayments, CryptoPaymentSource cryptoPaymentSource, Money money, int i) {
            this(bitcoinPayments, cryptoPaymentSource, (i & 4) != 0 ? null : money, (UUID) null);
        }
    }
}
