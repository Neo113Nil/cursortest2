package com.squareup.cash.investing.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.e;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphTimeRangeViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashSet;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InvestmentEntityContentModel {
    public final InvestingAboutContentModel aboutSection;
    public final UiCallbackModel activityModel;
    public final X509CertChainUtils analystOpinionsSection;
    public final InvestingDetailsCategorySectionContentModel categorySection;
    public final boolean categorySectionPositionedLast;
    public final LinkedHashSet componentSort;
    public final String disclosureText;
    public final InvestingEarningsViewModel earningsSection;
    public final InvestmentEntityButtonContainerModel entityButtonContainerModel;
    public final InvestingEtfHoldingsViewModel etfHoldingSection;
    public final X509CertUtils financialSection;
    public final InvestingGraphContentModel graphContentModel;
    public final InvestingStockDetailsHeaderViewModel headerViewModel;
    public final InvestingDetailTileViewModel keyStatsModel;
    public final MyInvestmentsContentModel myInvestmentsModel;
    public final InvestingCryptoNewsViewModel newsModel;
    public final InvestingCryptoRecurringPurchaseTileViewModel recurringPurchaseModel;
    public final HistoricalRange selectedRange;
    public final InvestingGraphTimeRangeViewModel selectedRangeModel;
    public final boolean showKeyStats;
    public final boolean showPlaceHolderGraph;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Component {
        public static final /* synthetic */ Component[] $VALUES;
        public static final e Companion;
        public static final LinkedHashSet OWNED_ETF_GROUP;
        public static final LinkedHashSet OWNED_STOCK_GROUP;
        public static final LinkedHashSet UNOWNED_ETF_GROUP;
        public static final LinkedHashSet UNOWNED_STOCK_GROUP;

        /* JADX INFO: Fake field, exist only in values array */
        Component EF0;

        static {
            Component component = new Component("GRAPH", 0);
            Component component2 = new Component("BUTTON_BAR", 1);
            Component component3 = new Component("MY_INVESTMENT", 2);
            Component component4 = new Component("ABOUT", 3);
            Component component5 = new Component("KEY_STATS", 4);
            Component component6 = new Component("AUTO_INVEST", 5);
            Component component7 = new Component("NEWS", 6);
            Component component8 = new Component("HOLDINGS", 7);
            Component component9 = new Component("ACTIVITY", 8);
            Component component10 = new Component("FINANCIALS", 9);
            Component component11 = new Component("EARNINGS", 10);
            Component component12 = new Component("ANALYST_OPTIONS", 11);
            Component component13 = new Component("FEATURED_IN", 12);
            Component component14 = new Component("DISCLOSURES", 13);
            $VALUES = new Component[]{component, component2, component3, component4, component5, component6, component7, component8, component9, component10, component11, component12, component13, component14};
            Companion = new e();
            UNOWNED_ETF_GROUP = SetsKt__SetsKt.linkedSetOf(component, component2, component4, component5, component8, component7, component13, component14);
            OWNED_ETF_GROUP = SetsKt__SetsKt.linkedSetOf(component, component2, component3, component7, component6, component9, component5, component4, component8, component13, component14);
            UNOWNED_STOCK_GROUP = SetsKt__SetsKt.linkedSetOf(component, component2, component4, component5, component7, component10, component11, component12, component13, component14);
            OWNED_STOCK_GROUP = SetsKt__SetsKt.linkedSetOf(component, component2, component3, component7, component6, component9, component5, component10, component11, component12, component4, component13, component14);
        }

        public static Component valueOf(String str) {
            return (Component) Enum.valueOf(Component.class, str);
        }

        public static Component[] values() {
            return (Component[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class InvestmentEntityButtonContainerModel {
        public final ColorModel accentColor;
        public final String firstButton;
        public final String secondButton;

        public InvestmentEntityButtonContainerModel(ColorModel colorModel, String str, String str2) {
            this.firstButton = str;
            this.secondButton = str2;
            this.accentColor = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestmentEntityButtonContainerModel)) {
                return false;
            }
            InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel = (InvestmentEntityButtonContainerModel) obj;
            return Intrinsics.areEqual(this.firstButton, investmentEntityButtonContainerModel.firstButton) && Intrinsics.areEqual(this.secondButton, investmentEntityButtonContainerModel.secondButton) && this.accentColor.equals(investmentEntityButtonContainerModel.accentColor);
        }

        public final int hashCode() {
            String str = this.firstButton;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.secondButton;
            return this.accentColor.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestmentEntityButtonContainerModel(firstButton=", this.firstButton, ", secondButton=", this.secondButton, ", accentColor="), this.accentColor, ")");
        }
    }

    public InvestmentEntityContentModel(InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, InvestingGraphContentModel investingGraphContentModel, boolean z, boolean z2, InvestingDetailTileViewModel investingDetailTileViewModel, HistoricalRange historicalRange, InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel, MyInvestmentsContentModel myInvestmentsContentModel, InvestingCryptoNewsViewModel investingCryptoNewsViewModel, InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel, X509CertUtils x509CertUtils, InvestingEarningsViewModel investingEarningsViewModel, X509CertChainUtils x509CertChainUtils, InvestingAboutContentModel investingAboutContentModel, boolean z3, InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel, InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel, UiCallbackModel uiCallbackModel, String str, LinkedHashSet linkedHashSet) {
        str.getClass();
        linkedHashSet.getClass();
        this.headerViewModel = investingStockDetailsHeaderViewModel;
        this.graphContentModel = investingGraphContentModel;
        this.showPlaceHolderGraph = z;
        this.showKeyStats = z2;
        this.keyStatsModel = investingDetailTileViewModel;
        this.selectedRange = historicalRange;
        this.entityButtonContainerModel = investmentEntityButtonContainerModel;
        this.myInvestmentsModel = myInvestmentsContentModel;
        this.newsModel = investingCryptoNewsViewModel;
        this.recurringPurchaseModel = investingCryptoRecurringPurchaseTileViewModel;
        this.financialSection = x509CertUtils;
        this.earningsSection = investingEarningsViewModel;
        this.analystOpinionsSection = x509CertChainUtils;
        this.aboutSection = investingAboutContentModel;
        this.categorySectionPositionedLast = z3;
        this.categorySection = investingDetailsCategorySectionContentModel;
        this.etfHoldingSection = investingEtfHoldingsViewModel;
        this.activityModel = uiCallbackModel;
        this.disclosureText = str;
        this.componentSort = linkedHashSet;
        this.selectedRangeModel = new InvestingGraphTimeRangeViewModel(historicalRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityContentModel)) {
            return false;
        }
        InvestmentEntityContentModel investmentEntityContentModel = (InvestmentEntityContentModel) obj;
        return this.headerViewModel.equals(investmentEntityContentModel.headerViewModel) && this.graphContentModel.equals(investmentEntityContentModel.graphContentModel) && this.showPlaceHolderGraph == investmentEntityContentModel.showPlaceHolderGraph && this.showKeyStats == investmentEntityContentModel.showKeyStats && this.keyStatsModel.equals(investmentEntityContentModel.keyStatsModel) && this.selectedRange == investmentEntityContentModel.selectedRange && Intrinsics.areEqual(this.entityButtonContainerModel, investmentEntityContentModel.entityButtonContainerModel) && Intrinsics.areEqual(this.myInvestmentsModel, investmentEntityContentModel.myInvestmentsModel) && Intrinsics.areEqual(this.newsModel, investmentEntityContentModel.newsModel) && Intrinsics.areEqual(this.recurringPurchaseModel, investmentEntityContentModel.recurringPurchaseModel) && this.financialSection.equals(investmentEntityContentModel.financialSection) && this.earningsSection.equals(investmentEntityContentModel.earningsSection) && this.analystOpinionsSection.equals(investmentEntityContentModel.analystOpinionsSection) && Intrinsics.areEqual(this.aboutSection, investmentEntityContentModel.aboutSection) && this.categorySectionPositionedLast == investmentEntityContentModel.categorySectionPositionedLast && Intrinsics.areEqual(this.categorySection, investmentEntityContentModel.categorySection) && Intrinsics.areEqual(this.etfHoldingSection, investmentEntityContentModel.etfHoldingSection) && Intrinsics.areEqual(this.activityModel, investmentEntityContentModel.activityModel) && Intrinsics.areEqual(this.disclosureText, investmentEntityContentModel.disclosureText) && Intrinsics.areEqual(this.componentSort, investmentEntityContentModel.componentSort);
    }

    public final int hashCode() {
        int hashCode = (this.selectedRange.hashCode() + ((this.keyStatsModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.graphContentModel.hashCode() + (this.headerViewModel.hashCode() * 31)) * 31, 31, this.showPlaceHolderGraph), 31, this.showKeyStats)) * 31)) * 31;
        InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel = this.entityButtonContainerModel;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (investmentEntityButtonContainerModel == null ? 0 : investmentEntityButtonContainerModel.hashCode())) * 31, 31, true);
        MyInvestmentsContentModel myInvestmentsContentModel = this.myInvestmentsModel;
        int hashCode2 = (m + (myInvestmentsContentModel == null ? 0 : myInvestmentsContentModel.hashCode())) * 31;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = this.newsModel;
        int hashCode3 = (hashCode2 + (investingCryptoNewsViewModel == null ? 0 : investingCryptoNewsViewModel.hashCode())) * 31;
        InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = this.recurringPurchaseModel;
        int hashCode4 = (this.analystOpinionsSection.hashCode() + ((this.earningsSection.hashCode() + ((this.financialSection.hashCode() + ((hashCode3 + (investingCryptoRecurringPurchaseTileViewModel == null ? 0 : investingCryptoRecurringPurchaseTileViewModel.hashCode())) * 31)) * 31)) * 31)) * 31;
        InvestingAboutContentModel investingAboutContentModel = this.aboutSection;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (investingAboutContentModel == null ? 0 : investingAboutContentModel.hashCode())) * 31, 31, this.categorySectionPositionedLast);
        InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel = this.categorySection;
        int hashCode5 = (m2 + (investingDetailsCategorySectionContentModel == null ? 0 : investingDetailsCategorySectionContentModel.hashCode())) * 31;
        InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel = this.etfHoldingSection;
        int hashCode6 = (hashCode5 + (investingEtfHoldingsViewModel == null ? 0 : investingEtfHoldingsViewModel.hashCode())) * 31;
        UiCallbackModel uiCallbackModel = this.activityModel;
        return this.componentSort.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (uiCallbackModel != null ? uiCallbackModel.hashCode() : 0)) * 31, 31, this.disclosureText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvestmentEntityContentModel(headerViewModel=");
        sb.append(this.headerViewModel);
        sb.append(", graphContentModel=");
        sb.append(this.graphContentModel);
        sb.append(", showPlaceHolderGraph=");
        re$$ExternalSyntheticOutline0.m(sb, this.showPlaceHolderGraph, ", showKeyStats=", this.showKeyStats, ", keyStatsModel=");
        sb.append(this.keyStatsModel);
        sb.append(", selectedRange=");
        sb.append(this.selectedRange);
        sb.append(", entityButtonContainerModel=");
        sb.append(this.entityButtonContainerModel);
        sb.append(", buttonsVisible=true, myInvestmentsModel=");
        sb.append(this.myInvestmentsModel);
        sb.append(", newsModel=");
        sb.append(this.newsModel);
        sb.append(", recurringPurchaseModel=");
        sb.append(this.recurringPurchaseModel);
        sb.append(", financialSection=");
        sb.append(this.financialSection);
        sb.append(", earningsSection=");
        sb.append(this.earningsSection);
        sb.append(", analystOpinionsSection=");
        sb.append(this.analystOpinionsSection);
        sb.append(", aboutSection=");
        sb.append(this.aboutSection);
        sb.append(", categorySectionPositionedLast=");
        sb.append(this.categorySectionPositionedLast);
        sb.append(", categorySection=");
        sb.append(this.categorySection);
        sb.append(", etfHoldingSection=");
        sb.append(this.etfHoldingSection);
        sb.append(", activityModel=");
        sb.append(this.activityModel);
        sb.append(", disclosureText=");
        sb.append(this.disclosureText);
        sb.append(", componentSort=");
        sb.append(this.componentSort);
        sb.append(")");
        return sb.toString();
    }
}
