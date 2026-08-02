package com.squareup.cash.payments.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class QuickPayDetailsViewModel {
    public final ColorModel accentColorOverride;
    public final String changePaymentOrientationButtonText;
    public final String closeButtonText;

    public QuickPayDetailsViewModel(ColorModel colorModel, String str, String str2) {
        str.getClass();
        str2.getClass();
        colorModel.getClass();
        this.changePaymentOrientationButtonText = str;
        this.closeButtonText = str2;
        this.accentColorOverride = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayDetailsViewModel)) {
            return false;
        }
        QuickPayDetailsViewModel quickPayDetailsViewModel = (QuickPayDetailsViewModel) obj;
        return Intrinsics.areEqual(this.changePaymentOrientationButtonText, quickPayDetailsViewModel.changePaymentOrientationButtonText) && Intrinsics.areEqual(this.closeButtonText, quickPayDetailsViewModel.closeButtonText) && Intrinsics.areEqual(this.accentColorOverride, quickPayDetailsViewModel.accentColorOverride);
    }

    public final int hashCode() {
        return this.accentColorOverride.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.changePaymentOrientationButtonText.hashCode() * 31, 31, this.closeButtonText);
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("QuickPayDetailsViewModel(changePaymentOrientationButtonText=", this.changePaymentOrientationButtonText, ", closeButtonText=", this.closeButtonText, ", accentColorOverride="), this.accentColorOverride, ")");
    }
}
