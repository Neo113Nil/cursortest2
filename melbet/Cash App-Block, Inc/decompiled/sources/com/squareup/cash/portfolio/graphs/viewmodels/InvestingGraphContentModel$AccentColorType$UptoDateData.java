package com.squareup.cash.portfolio.graphs.viewmodels;

import androidx.compose.ui.text.style.TextGeometricTransformKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingGraphContentModel$AccentColorType$UptoDateData extends TextGeometricTransformKt {
    public final ColorModel accentColor;

    public InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel colorModel) {
        colorModel.getClass();
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingGraphContentModel$AccentColorType$UptoDateData) && Intrinsics.areEqual(this.accentColor, ((InvestingGraphContentModel$AccentColorType$UptoDateData) obj).accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode();
    }

    public final String toString() {
        return "UptoDateData(accentColor=" + this.accentColor + ")";
    }
}
