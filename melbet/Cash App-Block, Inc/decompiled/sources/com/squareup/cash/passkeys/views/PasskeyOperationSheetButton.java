package com.squareup.cash.passkeys.views;

import com.squareup.cash.arcade.components.button.ButtonProminence;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PasskeyOperationSheetButton {
    public final boolean destructive;
    public final Function0 onClick;
    public final ButtonProminence prominence;
    public final String text;

    public PasskeyOperationSheetButton(String str, ButtonProminence buttonProminence, boolean z, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.text = str;
        this.prominence = buttonProminence;
        this.destructive = z;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyOperationSheetButton)) {
            return false;
        }
        PasskeyOperationSheetButton passkeyOperationSheetButton = (PasskeyOperationSheetButton) obj;
        return Intrinsics.areEqual(this.text, passkeyOperationSheetButton.text) && this.prominence == passkeyOperationSheetButton.prominence && this.destructive == passkeyOperationSheetButton.destructive && Intrinsics.areEqual(this.onClick, passkeyOperationSheetButton.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.prominence.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.destructive);
    }

    public final String toString() {
        return "PasskeyOperationSheetButton(text=" + this.text + ", prominence=" + this.prominence + ", destructive=" + this.destructive + ", onClick=" + this.onClick + ")";
    }
}
