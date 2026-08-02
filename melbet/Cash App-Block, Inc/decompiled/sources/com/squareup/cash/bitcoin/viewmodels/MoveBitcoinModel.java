package com.squareup.cash.bitcoin.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class MoveBitcoinModel {

    public final class Content extends MoveBitcoinModel {
        public final boolean buttonEnabled;
        public final BitcoinKeypadModel keypadModel;
        public final boolean showMaxButton;

        public Content(boolean z, BitcoinKeypadModel bitcoinKeypadModel, boolean z2) {
            this.buttonEnabled = z;
            this.keypadModel = bitcoinKeypadModel;
            this.showMaxButton = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.buttonEnabled == content.buttonEnabled && this.keypadModel.equals(content.keypadModel) && this.showMaxButton == content.showMaxButton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showMaxButton) + ((this.keypadModel.hashCode() + (Boolean.hashCode(this.buttonEnabled) * 31)) * 31);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel
        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(buttonEnabled=");
            sb.append(this.buttonEnabled);
            sb.append(", keypadModel=");
            sb.append(this.keypadModel);
            sb.append(", showMaxButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showMaxButton, ")");
        }
    }

    public final class Loading extends MoveBitcoinModel {
        public static final Loading INSTANCE = new Loading();
    }

    public String toString() {
        throw new AssertionError("Do not log PII");
    }
}
