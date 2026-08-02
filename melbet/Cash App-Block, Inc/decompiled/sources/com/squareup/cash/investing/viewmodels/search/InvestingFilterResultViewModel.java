package com.squareup.cash.investing.viewmodels.search;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingFilterResultViewModel implements InvestingSearchRow {
    public final String countLabel;
    public final String resetLabel;
    public final ColorModel resetLabelColor;

    public InvestingFilterResultViewModel(ColorModel colorModel, String str, String str2) {
        colorModel.getClass();
        this.countLabel = str;
        this.resetLabel = str2;
        this.resetLabelColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingFilterResultViewModel)) {
            return false;
        }
        InvestingFilterResultViewModel investingFilterResultViewModel = (InvestingFilterResultViewModel) obj;
        return this.countLabel.equals(investingFilterResultViewModel.countLabel) && Intrinsics.areEqual(this.resetLabel, investingFilterResultViewModel.resetLabel) && Intrinsics.areEqual(this.resetLabelColor, investingFilterResultViewModel.resetLabelColor);
    }

    public final int hashCode() {
        int hashCode = this.countLabel.hashCode() * 31;
        String str = this.resetLabel;
        return this.resetLabelColor.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestingFilterResultViewModel(countLabel=", this.countLabel, ", resetLabel=", this.resetLabel, ", resetLabelColor="), this.resetLabelColor, ")");
    }
}
