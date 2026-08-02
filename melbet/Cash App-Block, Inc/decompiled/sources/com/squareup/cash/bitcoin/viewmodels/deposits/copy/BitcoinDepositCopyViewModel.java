package com.squareup.cash.bitcoin.viewmodels.deposits.copy;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinDepositCopyViewModel {

    public final class Error implements BitcoinDepositCopyViewModel {
        public final String errorMessage;
        public final String errorTitle;
        public final String retryButtonText;

        public Error(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.errorTitle = str;
            this.errorMessage = str2;
            this.retryButtonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.errorTitle, error.errorTitle) && Intrinsics.areEqual(this.errorMessage, error.errorMessage) && Intrinsics.areEqual(this.retryButtonText, error.retryButtonText);
        }

        public final int hashCode() {
            return this.retryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.errorTitle.hashCode() * 31, 31, this.errorMessage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(errorTitle=", this.errorTitle, ", errorMessage=", this.errorMessage, ", retryButtonText="), this.retryButtonText, ")");
        }
    }

    public final class Loaded implements BitcoinDepositCopyViewModel {
        public final String lightningInvoiceCopyText;
        public final String onChainAddressCopyText;

        public Loaded(String str, String str2) {
            this.onChainAddressCopyText = str;
            this.lightningInvoiceCopyText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.onChainAddressCopyText, loaded.onChainAddressCopyText) && Intrinsics.areEqual(this.lightningInvoiceCopyText, loaded.lightningInvoiceCopyText);
        }

        public final int hashCode() {
            String str = this.onChainAddressCopyText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lightningInvoiceCopyText;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Loaded(onChainAddressCopyText=", this.onChainAddressCopyText, ", lightningInvoiceCopyText=", this.lightningInvoiceCopyText, ")");
        }
    }

    public final class Loading implements BitcoinDepositCopyViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1425527168;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
