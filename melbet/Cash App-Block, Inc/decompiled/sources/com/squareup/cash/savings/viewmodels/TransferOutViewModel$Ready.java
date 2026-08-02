package com.squareup.cash.savings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TransferOutViewModel$Ready {
    public final Function1 amountFormatter;
    public final Function1 amountTransformer;
    public final AmountPickerViewModel.Ready.Amount.MoneyAmount initialAmount;
    public final AmountPickerViewModel.Ready.Amount.MoneyAmount maxAmount;
    public final AmountPickerViewModel.Ready.Amount.MoneyAmount minAmount;
    public final int sliderSteps;
    public final boolean submitEnabled;
    public final String submitText;
    public final String subtitle;
    public final String title;

    public TransferOutViewModel$Ready(String str, String str2, AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount, AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount2, AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount3, String str3, boolean z, Function1 function1, Function1 function12, int i) {
        str.getClass();
        str3.getClass();
        function1.getClass();
        function12.getClass();
        this.title = str;
        this.subtitle = str2;
        this.initialAmount = moneyAmount;
        this.minAmount = moneyAmount2;
        this.maxAmount = moneyAmount3;
        this.submitText = str3;
        this.submitEnabled = z;
        this.amountTransformer = function1;
        this.amountFormatter = function12;
        this.sliderSteps = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOutViewModel$Ready)) {
            return false;
        }
        TransferOutViewModel$Ready transferOutViewModel$Ready = (TransferOutViewModel$Ready) obj;
        return Intrinsics.areEqual(this.title, transferOutViewModel$Ready.title) && this.subtitle.equals(transferOutViewModel$Ready.subtitle) && this.initialAmount.equals(transferOutViewModel$Ready.initialAmount) && this.minAmount.equals(transferOutViewModel$Ready.minAmount) && this.maxAmount.equals(transferOutViewModel$Ready.maxAmount) && Intrinsics.areEqual(this.submitText, transferOutViewModel$Ready.submitText) && this.submitEnabled == transferOutViewModel$Ready.submitEnabled && Intrinsics.areEqual(this.amountTransformer, transferOutViewModel$Ready.amountTransformer) && Intrinsics.areEqual(this.amountFormatter, transferOutViewModel$Ready.amountFormatter) && this.sliderSteps == transferOutViewModel$Ready.sliderSteps;
    }

    public final int hashCode() {
        return Integer.hashCode(this.sliderSteps) + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount.money, NavAction$$ExternalSyntheticOutline0.m(this.minAmount.money, NavAction$$ExternalSyntheticOutline0.m(this.initialAmount.money, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31), 31), 31), 31, this.submitText), 31, this.submitEnabled), 31, this.amountTransformer), 31, this.amountFormatter);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(title=", this.title, ", subtitle=", this.subtitle, ", initialAmount=");
        m.append(this.initialAmount);
        m.append(", minAmount=");
        m.append(this.minAmount);
        m.append(", maxAmount=");
        m.append(this.maxAmount);
        m.append(", submitText=");
        m.append(this.submitText);
        m.append(", submitEnabled=");
        m.append(this.submitEnabled);
        m.append(", amountTransformer=");
        m.append(this.amountTransformer);
        m.append(", amountFormatter=");
        m.append(this.amountFormatter);
        m.append(", sliderSteps=");
        m.append(this.sliderSteps);
        m.append(")");
        return m.toString();
    }
}
