package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class RealQrCodesHandler$QrCodeResult {

    /* loaded from: classes9.dex */
    public final class BitcoinPaymentsQrCode extends RealQrCodesHandler$QrCodeResult {
        public final BitcoinPayments invoice;

        public BitcoinPaymentsQrCode(BitcoinPayments bitcoinPayments) {
            this.invoice = bitcoinPayments;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BitcoinPaymentsQrCode) && this.invoice.equals(((BitcoinPaymentsQrCode) obj).invoice);
        }

        public final int hashCode() {
            return this.invoice.hashCode();
        }

        public final String toString() {
            return "BitcoinPaymentsQrCode(invoice=" + this.invoice + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class Other extends RealQrCodesHandler$QrCodeResult {
        public final String qrCodeData;

        public Other(String str) {
            str.getClass();
            this.qrCodeData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Other) && Intrinsics.areEqual(this.qrCodeData, ((Other) obj).qrCodeData);
        }

        public final int hashCode() {
            return this.qrCodeData.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Other(qrCodeData=", this.qrCodeData, ")");
        }
    }
}
