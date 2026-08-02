package com.squareup.cash.genericelements.viewmodels;

import com.google.android.play.integrity.internal.ak;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush extends ak {
    public final String label;

    public GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush(String str) {
        this.label = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) && this.label.equals(((GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) obj).label);
    }

    public final int hashCode() {
        return this.label.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LabeledPush(label=", this.label, ")");
    }
}
