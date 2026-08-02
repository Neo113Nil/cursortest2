package com.squareup.cash.amountchooser.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.versioned.Versioned;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class KeypadAmountChangedHandled {
    public final ArrayList amountSelectorOptions;
    public final String rawAmount;
    public final Versioned shouldShakeAmountAndShowLimitText;

    public KeypadAmountChangedHandled(String str, ArrayList arrayList, Versioned versioned) {
        this.rawAmount = str;
        this.amountSelectorOptions = arrayList;
        this.shouldShakeAmountAndShowLimitText = versioned;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeypadAmountChangedHandled)) {
            return false;
        }
        KeypadAmountChangedHandled keypadAmountChangedHandled = (KeypadAmountChangedHandled) obj;
        return this.rawAmount.equals(keypadAmountChangedHandled.rawAmount) && this.amountSelectorOptions.equals(keypadAmountChangedHandled.amountSelectorOptions) && this.shouldShakeAmountAndShowLimitText.equals(keypadAmountChangedHandled.shouldShakeAmountAndShowLimitText);
    }

    public final int hashCode() {
        return this.shouldShakeAmountAndShowLimitText.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.amountSelectorOptions, this.rawAmount.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountSelectorOptions, "KeypadAmountChangedHandled(rawAmount=", this.rawAmount, ", amountSelectorOptions=", ", shouldShakeAmountAndShowLimitText=");
        m.append(this.shouldShakeAmountAndShowLimitText);
        m.append(")");
        return m.toString();
    }
}
