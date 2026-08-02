package com.squareup.cash.deposits.physical.viewmodels.barcode;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositBarcodeEvent {

    public final class BarcodeParams extends PaperMoneyDepositBarcodeEvent {
        public final int height;
        public final int width;

        public BarcodeParams(int i, int i2) {
            this.height = i;
            this.width = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeParams)) {
                return false;
            }
            BarcodeParams barcodeParams = (BarcodeParams) obj;
            return this.height == barcodeParams.height && this.width == barcodeParams.width;
        }

        public final int hashCode() {
            return Integer.hashCode(this.width) + (Integer.hashCode(this.height) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.height, this.width, "BarcodeParams(height=", ", width=", ")");
        }
    }

    public final class Exit extends PaperMoneyDepositBarcodeEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1656186277;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class FeeInformationClick extends PaperMoneyDepositBarcodeEvent {
        public static final FeeInformationClick INSTANCE = new FeeInformationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeeInformationClick);
        }

        public final int hashCode() {
            return -634153989;
        }

        public final String toString() {
            return "FeeInformationClick";
        }
    }

    public final class HelpClick extends PaperMoneyDepositBarcodeEvent {
        public final String url;

        public HelpClick(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpClick) && Intrinsics.areEqual(this.url, ((HelpClick) obj).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HelpClick(url=", this.url, ")");
        }
    }

    public final class OpenUrl extends PaperMoneyDepositBarcodeEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }
}
