package com.squareup.cash.genericelements.viewmodels;

import com.google.android.play.integrity.internal.aj;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class GenericComponentViewModel$CellActivityViewModel$Accessory$Amount extends aj {
    public final String amount;

    public GenericComponentViewModel$CellActivityViewModel$Accessory$Amount(String str) {
        this.amount = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericComponentViewModel$CellActivityViewModel$Accessory$Amount) && this.amount.equals(((GenericComponentViewModel$CellActivityViewModel$Accessory$Amount) obj).amount);
    }

    public final int hashCode() {
        return this.amount.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Amount(amount=", this.amount, ")");
    }
}
