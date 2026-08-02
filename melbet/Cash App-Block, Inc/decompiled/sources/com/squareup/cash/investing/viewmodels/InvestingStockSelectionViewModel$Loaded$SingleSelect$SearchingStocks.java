package com.squareup.cash.investing.viewmodels;

import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks implements InvestingStockSelectionViewModel.Loaded, InvestingStockSelectionViewModel.Loaded.Searching {
    public final InvestingStockSelectionViewModel$Header$TitleOnly header;
    public final String searchBarPlaceholderText;
    public final InvestingStockSelectionViewModel.SearchResultModel searchResults;
    public final InputFieldText searchText;

    public InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks(InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly, InputFieldText inputFieldText, String str, InvestingStockSelectionViewModel.SearchResultModel searchResultModel) {
        InvestingStockSelectionViewModel.NavigationIcon navigationIcon = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
        str.getClass();
        searchResultModel.getClass();
        this.header = investingStockSelectionViewModel$Header$TitleOnly;
        this.searchText = inputFieldText;
        this.searchBarPlaceholderText = str;
        this.searchResults = searchResultModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks)) {
            return false;
        }
        InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks investingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks = (InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks) obj;
        if (!this.header.equals(investingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks.header) || !this.searchText.equals(investingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks.searchText) || !Intrinsics.areEqual(this.searchBarPlaceholderText, investingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks.searchBarPlaceholderText)) {
            return false;
        }
        InvestingStockSelectionViewModel.NavigationIcon navigationIcon = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
        return Intrinsics.areEqual(this.searchResults, investingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks.searchResults);
    }

    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
    public final InvestingStockSelectionViewModel$Header$TitleOnly getHeader() {
        return this.header;
    }

    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
    public final InvestingStockSelectionViewModel.NavigationIcon getNavigationIcon() {
        return InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
    }

    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
    public final String getSearchBarPlaceholderText() {
        return this.searchBarPlaceholderText;
    }

    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
    public final InvestingStockSelectionViewModel.SearchResultModel getSearchResults() {
        return this.searchResults;
    }

    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded.Searching
    public final InputFieldText getSearchText() {
        return this.searchText;
    }

    public final int hashCode() {
        return this.searchResults.hashCode() + ((InvestingStockSelectionViewModel.NavigationIcon.CLOSE.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.searchText.hashCode() + (this.header.title.hashCode() * 31)) * 31, 31, this.searchBarPlaceholderText)) * 31);
    }

    public final String toString() {
        return "SearchingStocks(header=" + this.header + ", searchText=" + this.searchText + ", searchBarPlaceholderText=" + this.searchBarPlaceholderText + ", navigationIcon=" + InvestingStockSelectionViewModel.NavigationIcon.CLOSE + ", searchResults=" + this.searchResults + ")";
    }
}
