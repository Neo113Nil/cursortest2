package com.squareup.cash.bitcoin.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class WalletAddressOptionsViewModel {

    public final class Content extends WalletAddressOptionsViewModel {
        public final String copyAddressText;
        public final QrCodeModel qrCodeModel;
        public final CryptoAddress$BitcoinAddress walletAddress;

        public Content(CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress, String str, QrCodeModel qrCodeModel) {
            str.getClass();
            qrCodeModel.getClass();
            this.walletAddress = cryptoAddress$BitcoinAddress;
            this.copyAddressText = str;
            this.qrCodeModel = qrCodeModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.walletAddress, content.walletAddress) && Intrinsics.areEqual(this.copyAddressText, content.copyAddressText) && Intrinsics.areEqual(this.qrCodeModel, content.qrCodeModel);
        }

        public final int hashCode() {
            CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress = this.walletAddress;
            return this.qrCodeModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((cryptoAddress$BitcoinAddress == null ? 0 : cryptoAddress$BitcoinAddress.address.hashCode()) * 31, 31, this.copyAddressText);
        }

        public final String toString() {
            return "Content(walletAddress=" + this.walletAddress + ", copyAddressText=" + this.copyAddressText + ", qrCodeModel=" + this.qrCodeModel + ")";
        }
    }

    public final class Error extends WalletAddressOptionsViewModel {
        public final String errorMessage;
        public final String errorTitle;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.errorTitle = str;
            this.errorMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.errorTitle, error.errorTitle) && Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode() + (this.errorTitle.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(errorTitle=", this.errorTitle, ", errorMessage=", this.errorMessage, ")");
        }
    }
}
