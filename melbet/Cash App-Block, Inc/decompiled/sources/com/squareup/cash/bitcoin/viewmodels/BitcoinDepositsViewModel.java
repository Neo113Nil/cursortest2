package com.squareup.cash.bitcoin.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BitcoinDepositsViewModel {

    public final class Loaded extends BitcoinDepositsViewModel {
        public final String adjustAmountText;
        public final CurrencyCode currencyCode;
        public final String descriptionText;
        public final String formattedAmount;
        public final String formattedSubAmount;
        public final boolean hasError;
        public final NavigationType navigationType;
        public final BitcoinPayments qrCodeInvoice;
        public final QrCodeModel qrCodeModel;
        public final String shareUrl;
        public final boolean showAdjustButton;
        public final boolean showShareButton;
        public final String unifiedQrCode;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NavigationType {
            public static final /* synthetic */ NavigationType[] $VALUES;
            public static final NavigationType Back;
            public static final NavigationType Close;

            static {
                NavigationType navigationType = new NavigationType(Constants.META_CLOSE, 0);
                Close = navigationType;
                NavigationType navigationType2 = new NavigationType(Constants.META_BACK_BUTTON, 1);
                Back = navigationType2;
                $VALUES = new NavigationType[]{navigationType, navigationType2};
            }

            public static NavigationType valueOf(String str) {
                return (NavigationType) Enum.valueOf(NavigationType.class, str);
            }

            public static NavigationType[] values() {
                return (NavigationType[]) $VALUES.clone();
            }
        }

        public Loaded(String str, String str2, String str3, QrCodeModel qrCodeModel, String str4, boolean z, String str5, BitcoinPayments bitcoinPayments, String str6, boolean z2, boolean z3, CurrencyCode currencyCode, NavigationType navigationType) {
            str.getClass();
            qrCodeModel.getClass();
            str4.getClass();
            currencyCode.getClass();
            this.adjustAmountText = str;
            this.formattedAmount = str2;
            this.formattedSubAmount = str3;
            this.qrCodeModel = qrCodeModel;
            this.descriptionText = str4;
            this.hasError = z;
            this.unifiedQrCode = str5;
            this.qrCodeInvoice = bitcoinPayments;
            this.shareUrl = str6;
            this.showAdjustButton = z2;
            this.showShareButton = z3;
            this.currencyCode = currencyCode;
            this.navigationType = navigationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.adjustAmountText, loaded.adjustAmountText) && Intrinsics.areEqual(this.formattedAmount, loaded.formattedAmount) && Intrinsics.areEqual(this.formattedSubAmount, loaded.formattedSubAmount) && Intrinsics.areEqual(this.qrCodeModel, loaded.qrCodeModel) && Intrinsics.areEqual(this.descriptionText, loaded.descriptionText) && this.hasError == loaded.hasError && Intrinsics.areEqual(this.unifiedQrCode, loaded.unifiedQrCode) && Intrinsics.areEqual(this.qrCodeInvoice, loaded.qrCodeInvoice) && Intrinsics.areEqual(this.shareUrl, loaded.shareUrl) && this.showAdjustButton == loaded.showAdjustButton && this.showShareButton == loaded.showShareButton && this.currencyCode == loaded.currencyCode && this.navigationType == loaded.navigationType;
        }

        public final int hashCode() {
            int hashCode = this.adjustAmountText.hashCode() * 31;
            String str = this.formattedAmount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.formattedSubAmount;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.qrCodeModel.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.descriptionText), 31, this.hasError);
            String str3 = this.unifiedQrCode;
            int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
            BitcoinPayments bitcoinPayments = this.qrCodeInvoice;
            int hashCode4 = (hashCode3 + (bitcoinPayments == null ? 0 : bitcoinPayments.hashCode())) * 31;
            String str4 = this.shareUrl;
            return this.navigationType.hashCode() + ((this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.showAdjustButton), 31, this.showShareButton)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(adjustAmountText=", this.adjustAmountText, ", formattedAmount=", this.formattedAmount, ", formattedSubAmount=");
            m.append(this.formattedSubAmount);
            m.append(", qrCodeModel=");
            m.append(this.qrCodeModel);
            m.append(", descriptionText=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.descriptionText, ", hasError=", this.hasError, ", unifiedQrCode=");
            m.append(this.unifiedQrCode);
            m.append(", qrCodeInvoice=");
            m.append(this.qrCodeInvoice);
            m.append(", shareUrl=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.shareUrl, ", showAdjustButton=", this.showAdjustButton, ", showShareButton=");
            m.append(this.showShareButton);
            m.append(", currencyCode=");
            m.append(this.currencyCode);
            m.append(", navigationType=");
            m.append(this.navigationType);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends BitcoinDepositsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2145734780;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
