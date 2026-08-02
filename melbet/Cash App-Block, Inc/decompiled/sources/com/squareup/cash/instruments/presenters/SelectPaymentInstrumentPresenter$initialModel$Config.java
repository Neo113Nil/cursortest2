package com.squareup.cash.instruments.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentPresenter$initialModel$Config {
    public final boolean cashBalance;
    public final long creditCardFeeBps;
    public final boolean creditLinking;

    public SelectPaymentInstrumentPresenter$initialModel$Config(long j, boolean z, boolean z2) {
        this.creditLinking = z;
        this.cashBalance = z2;
        this.creditCardFeeBps = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectPaymentInstrumentPresenter$initialModel$Config)) {
            return false;
        }
        SelectPaymentInstrumentPresenter$initialModel$Config selectPaymentInstrumentPresenter$initialModel$Config = (SelectPaymentInstrumentPresenter$initialModel$Config) obj;
        return this.creditLinking == selectPaymentInstrumentPresenter$initialModel$Config.creditLinking && this.cashBalance == selectPaymentInstrumentPresenter$initialModel$Config.cashBalance && this.creditCardFeeBps == selectPaymentInstrumentPresenter$initialModel$Config.creditCardFeeBps;
    }

    public final int hashCode() {
        return Long.hashCode(this.creditCardFeeBps) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.creditLinking) * 31, 31, this.cashBalance);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.creditCardFeeBps, ")", NavAction$$ExternalSyntheticOutline0.m("Config(creditLinking=", ", cashBalance=", ", creditCardFeeBps=", this.creditLinking, this.cashBalance));
    }
}
