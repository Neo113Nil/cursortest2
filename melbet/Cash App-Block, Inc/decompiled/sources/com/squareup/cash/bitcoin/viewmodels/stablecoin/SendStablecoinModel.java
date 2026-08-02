package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class SendStablecoinModel {

    public final class Content extends SendStablecoinModel {
        public final boolean buttonEnabled;
        public final boolean hasInvalidAmount;
        public final Money maxAmount;
        public final String restoreKeypadAmount;
        public final boolean showQrScannerButton;
        public final String subtitle;

        public Content(boolean z, Money money, boolean z2, String str, String str2, boolean z3) {
            this.buttonEnabled = z;
            this.maxAmount = money;
            this.hasInvalidAmount = z2;
            this.restoreKeypadAmount = str;
            this.subtitle = str2;
            this.showQrScannerButton = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.buttonEnabled == content.buttonEnabled && this.maxAmount.equals(content.maxAmount) && this.hasInvalidAmount == content.hasInvalidAmount && Intrinsics.areEqual(this.restoreKeypadAmount, content.restoreKeypadAmount) && this.subtitle.equals(content.subtitle) && this.showQrScannerButton == content.showQrScannerButton;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, Boolean.hashCode(this.buttonEnabled) * 31, 31), 31, this.hasInvalidAmount);
            String str = this.restoreKeypadAmount;
            return Boolean.hashCode(this.showQrScannerButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitle);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel
        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(buttonEnabled=");
            sb.append(this.buttonEnabled);
            sb.append(", maxAmount=");
            sb.append(this.maxAmount);
            sb.append(", hasInvalidAmount=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.hasInvalidAmount, ", restoreKeypadAmount=", this.restoreKeypadAmount, ", subtitle=");
            return re$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", showQrScannerButton=", this.showQrScannerButton, ")");
        }
    }

    public final class Loading extends SendStablecoinModel {
        public static final Loading INSTANCE = new Loading();
    }

    public String toString() {
        throw new AssertionError("Do not log PII");
    }
}
