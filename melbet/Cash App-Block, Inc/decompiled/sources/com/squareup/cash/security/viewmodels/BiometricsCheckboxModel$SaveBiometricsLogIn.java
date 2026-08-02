package com.squareup.cash.security.viewmodels;

import androidx.core.widget.PopupWindowCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class BiometricsCheckboxModel$SaveBiometricsLogIn extends PopupWindowCompat {
    public final boolean isChecked;

    public BiometricsCheckboxModel$SaveBiometricsLogIn(boolean z) {
        this.isChecked = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BiometricsCheckboxModel$SaveBiometricsLogIn) && this.isChecked == ((BiometricsCheckboxModel$SaveBiometricsLogIn) obj).isChecked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isChecked);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("SaveBiometricsLogIn(isChecked=", ")", this.isChecked);
    }
}
