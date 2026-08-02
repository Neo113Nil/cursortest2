package com.squareup.cash.investing.presenters.custom.order;

import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.common.CurrencyCode;

/* loaded from: classes6.dex */
public final class GraphInformationPresenter$HistoricalData {
    public final CurrencyCode currencyCode;
    public final GetPortfoliosHistoricalDataResponse portfolioModel;

    public GraphInformationPresenter$HistoricalData(GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse, CurrencyCode currencyCode) {
        currencyCode.getClass();
        this.portfolioModel = getPortfoliosHistoricalDataResponse;
        this.currencyCode = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphInformationPresenter$HistoricalData)) {
            return false;
        }
        GraphInformationPresenter$HistoricalData graphInformationPresenter$HistoricalData = (GraphInformationPresenter$HistoricalData) obj;
        return this.portfolioModel.equals(graphInformationPresenter$HistoricalData.portfolioModel) && this.currencyCode == graphInformationPresenter$HistoricalData.currencyCode;
    }

    public final int hashCode() {
        return this.currencyCode.hashCode() + (this.portfolioModel.hashCode() * 31);
    }

    public final String toString() {
        return "HistoricalData(portfolioModel=" + this.portfolioModel + ", currencyCode=" + this.currencyCode + ")";
    }
}
