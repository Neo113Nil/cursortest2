package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class AdjustableThresholdViewEvent$DoneClicked {
    public final int value;

    public AdjustableThresholdViewEvent$DoneClicked(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdjustableThresholdViewEvent$DoneClicked) && this.value == ((AdjustableThresholdViewEvent$DoneClicked) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "DoneClicked(value=", ")");
    }
}
