package com.squareup.cash.bitcoin.views.keypad;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinKeypadAmountPickerModel {
    public final boolean buttonEnabled;
    public final String buttonText;
    public final BitcoinKeypadModel keypadModel;
    public final String noteText;
    public final boolean showMaxButton;
    public final boolean showQrCodeScanner;
    public final String title;

    public BitcoinKeypadAmountPickerModel(int i, BitcoinKeypadModel bitcoinKeypadModel, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        str3 = (i & 32) != 0 ? null : str3;
        z3 = (i & 64) != 0 ? false : z3;
        bitcoinKeypadModel.getClass();
        str2.getClass();
        this.keypadModel = bitcoinKeypadModel;
        this.title = str;
        this.showQrCodeScanner = z;
        this.buttonEnabled = z2;
        this.buttonText = str2;
        this.noteText = str3;
        this.showMaxButton = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinKeypadAmountPickerModel)) {
            return false;
        }
        BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel = (BitcoinKeypadAmountPickerModel) obj;
        return Intrinsics.areEqual(this.keypadModel, bitcoinKeypadAmountPickerModel.keypadModel) && Intrinsics.areEqual(this.title, bitcoinKeypadAmountPickerModel.title) && this.showQrCodeScanner == bitcoinKeypadAmountPickerModel.showQrCodeScanner && this.buttonEnabled == bitcoinKeypadAmountPickerModel.buttonEnabled && Intrinsics.areEqual(this.buttonText, bitcoinKeypadAmountPickerModel.buttonText) && Intrinsics.areEqual(this.noteText, bitcoinKeypadAmountPickerModel.noteText) && this.showMaxButton == bitcoinKeypadAmountPickerModel.showMaxButton;
    }

    public final int hashCode() {
        int hashCode = this.keypadModel.hashCode() * 31;
        String str = this.title;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showQrCodeScanner), 31, this.buttonEnabled), 31, this.buttonText);
        String str2 = this.noteText;
        return Boolean.hashCode(this.showMaxButton) + ((m + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinKeypadAmountPickerModel(keypadModel=");
        sb.append(this.keypadModel);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", showQrCodeScanner=");
        re$$ExternalSyntheticOutline0.m(sb, this.showQrCodeScanner, ", buttonEnabled=", this.buttonEnabled, ", buttonText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.buttonText, ", noteText=", this.noteText, ", showMaxButton=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showMaxButton, ")");
    }
}
