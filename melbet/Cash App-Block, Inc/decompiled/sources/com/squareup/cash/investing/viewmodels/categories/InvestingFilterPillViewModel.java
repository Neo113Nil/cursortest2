package com.squareup.cash.investing.viewmodels.categories;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingFilterPillViewModel {
    public final ColorModel accentColor;
    public final FilterToken filterGroupToken;
    public final String filterName;
    public final String label;
    public final SyncInvestmentCategory.PrefixIcon prefixIcon;
    public final int selectedFiltersCount;

    public InvestingFilterPillViewModel(FilterToken filterToken, ColorModel colorModel, SyncInvestmentCategory.PrefixIcon prefixIcon, String str, int i, String str2) {
        filterToken.getClass();
        colorModel.getClass();
        str.getClass();
        str2.getClass();
        this.filterGroupToken = filterToken;
        this.accentColor = colorModel;
        this.prefixIcon = prefixIcon;
        this.label = str;
        this.selectedFiltersCount = i;
        this.filterName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingFilterPillViewModel)) {
            return false;
        }
        InvestingFilterPillViewModel investingFilterPillViewModel = (InvestingFilterPillViewModel) obj;
        return Intrinsics.areEqual(this.filterGroupToken, investingFilterPillViewModel.filterGroupToken) && Intrinsics.areEqual(this.accentColor, investingFilterPillViewModel.accentColor) && this.prefixIcon == investingFilterPillViewModel.prefixIcon && Intrinsics.areEqual(this.label, investingFilterPillViewModel.label) && this.selectedFiltersCount == investingFilterPillViewModel.selectedFiltersCount && Intrinsics.areEqual(this.filterName, investingFilterPillViewModel.filterName);
    }

    public final int hashCode() {
        int hashCode = (this.accentColor.hashCode() + (this.filterGroupToken.value.hashCode() * 31)) * 31;
        SyncInvestmentCategory.PrefixIcon prefixIcon = this.prefixIcon;
        return this.filterName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectedFiltersCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (prefixIcon == null ? 0 : prefixIcon.hashCode())) * 31, 31, this.label), 31);
    }

    public final String toString() {
        return "InvestingFilterPillViewModel(filterGroupToken=" + this.filterGroupToken + ", accentColor=" + this.accentColor + ", prefixIcon=" + this.prefixIcon + ", label=" + this.label + ", selectedFiltersCount=" + this.selectedFiltersCount + ", filterName=" + this.filterName + ")";
    }
}
