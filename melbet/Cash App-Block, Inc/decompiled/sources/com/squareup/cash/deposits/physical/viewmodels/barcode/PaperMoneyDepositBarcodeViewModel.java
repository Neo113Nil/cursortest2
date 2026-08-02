package com.squareup.cash.deposits.physical.viewmodels.barcode;

import com.squareup.cash.deposits.physical.backend.api.barcode.android.AndroidBarcode;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositBarcodeViewModel {

    public final class Loading extends PaperMoneyDepositBarcodeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1691498431;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends PaperMoneyDepositBarcodeViewModel {
        public final AndroidBarcode barcodeImage;
        public final boolean showDetailRows;
        public final GetPaperCashDepositBarcodeResponse.Success success;
        public final String termsText;
        public final String timerText;

        public Ready(GetPaperCashDepositBarcodeResponse.Success success, String str, AndroidBarcode androidBarcode, String str2, boolean z) {
            success.getClass();
            str2.getClass();
            this.success = success;
            this.timerText = str;
            this.barcodeImage = androidBarcode;
            this.termsText = str2;
            this.showDetailRows = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.success, ready.success) && this.timerText.equals(ready.timerText) && this.barcodeImage.equals(ready.barcodeImage) && Intrinsics.areEqual(this.termsText, ready.termsText) && this.showDetailRows == ready.showDetailRows;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showDetailRows) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.barcodeImage.bitmap.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.success.hashCode() * 31, 31, this.timerText)) * 31, 31, this.termsText);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(success=");
            sb.append(this.success);
            sb.append(", timerText=");
            sb.append(this.timerText);
            sb.append(", barcodeImage=");
            sb.append(this.barcodeImage);
            sb.append(", termsText=");
            sb.append(this.termsText);
            sb.append(", showDetailRows=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showDetailRows, ")");
        }
    }
}
