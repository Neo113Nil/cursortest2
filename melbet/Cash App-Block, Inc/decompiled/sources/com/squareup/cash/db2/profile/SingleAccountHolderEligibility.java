package com.squareup.cash.db2.profile;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SingleAccountHolderEligibility {
    public final C4bEligibilityState accountSwitcher;
    public final C4bEligibilityState activityTreehouse;
    public final C4bEligibilityState bitcoinAutoInvest;
    public final C4bEligibilityState c4bPromotionVisibility;
    public final C4bEligibilityState cashCardTab;
    public final C4bEligibilityState cashOffersTab;
    public final String customerToken;
    public final C4bEligibilityState dda_tab;
    public final C4bEligibilityState documentsBtc;
    public final C4bEligibilityState documentsStock;
    public final C4bEligibilityState documentsTaxes;
    public final C4bEligibilityState moneyBtcApplet;
    public final C4bEligibilityState moneyEarningsApplet;
    public final C4bEligibilityState moneyFamiliesApplet;
    public final C4bEligibilityState moneyGlobalBorrowApplet;
    public final C4bEligibilityState moneyInvestingApplet;
    public final C4bEligibilityState moneyTabHomeDesignSystem;
    public final C4bEligibilityState moneyTaxesApplet;
    public final C4bEligibilityState moneybotVisibility;
    public final C4bEligibilityState nearbyPaymentFeatureVisibility;
    public final long nextRefreshAtMillis;
    public final C4bEligibilityState paymentPersonalToC4b;
    public final C4bEligibilityState paymentSendAsBtc;
    public final C4bEligibilityState paymentSendAsGiftCard;
    public final C4bEligibilityState paymentSendAsStock;
    public final C4bEligibilityState personalizedAdsToggle;
    public final C4bEligibilityState poolsOnboardingVisibility;
    public final C4bEligibilityState recurringP2pPaymentFeatureVisibility;
    public final C4bEligibilityState remittanceSend;
    public final C4bEligibilityState settingsInvestTrustedContactApp;
    public final C4bEligibilityState settingsTaxPasswordAuthApp;
    public final C4bEligibilityState sponsorEligible;
    public final C4bEligibilityState tapToPay;
    public final C4bEligibilityState workAppletVisibility;

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireAdapter accountSwitcherAdapter;
        public final WireAdapter activityTreehouseAdapter;
        public final WireAdapter bitcoinAutoInvestAdapter;
        public final WireAdapter c4bPromotionVisibilityAdapter;
        public final WireAdapter cashCardTabAdapter;
        public final WireAdapter cashOffersTabAdapter;
        public final WireAdapter dda_tabAdapter;
        public final WireAdapter documentsBtcAdapter;
        public final WireAdapter documentsStockAdapter;
        public final WireAdapter documentsTaxesAdapter;
        public final WireAdapter moneyBtcAppletAdapter;
        public final WireAdapter moneyEarningsAppletAdapter;
        public final WireAdapter moneyFamiliesAppletAdapter;
        public final WireAdapter moneyGlobalBorrowAppletAdapter;
        public final WireAdapter moneyInvestingAppletAdapter;
        public final WireAdapter moneyTabHomeDesignSystemAdapter;
        public final WireAdapter moneyTaxesAppletAdapter;
        public final WireAdapter moneybotVisibilityAdapter;
        public final WireAdapter nearbyPaymentFeatureVisibilityAdapter;
        public final WireAdapter paymentPersonalToC4bAdapter;
        public final WireAdapter paymentSendAsBtcAdapter;
        public final WireAdapter paymentSendAsGiftCardAdapter;
        public final WireAdapter paymentSendAsStockAdapter;
        public final WireAdapter personalizedAdsToggleAdapter;
        public final WireAdapter poolsOnboardingVisibilityAdapter;
        public final WireAdapter recurringP2pPaymentFeatureVisibilityAdapter;
        public final WireAdapter remittanceSendAdapter;
        public final WireAdapter settingsInvestTrustedContactAppAdapter;
        public final WireAdapter settingsTaxPasswordAuthAppAdapter;
        public final WireAdapter sponsorEligibleAdapter;
        public final WireAdapter tapToPayAdapter;
        public final WireAdapter workAppletVisibilityAdapter;

        public Adapter(WireAdapter wireAdapter, WireAdapter wireAdapter2, WireAdapter wireAdapter3, WireAdapter wireAdapter4, WireAdapter wireAdapter5, WireAdapter wireAdapter6, WireAdapter wireAdapter7, WireAdapter wireAdapter8, WireAdapter wireAdapter9, WireAdapter wireAdapter10, WireAdapter wireAdapter11, WireAdapter wireAdapter12, WireAdapter wireAdapter13, WireAdapter wireAdapter14, WireAdapter wireAdapter15, WireAdapter wireAdapter16, WireAdapter wireAdapter17, WireAdapter wireAdapter18, WireAdapter wireAdapter19, WireAdapter wireAdapter20, WireAdapter wireAdapter21, WireAdapter wireAdapter22, WireAdapter wireAdapter23, WireAdapter wireAdapter24, WireAdapter wireAdapter25, WireAdapter wireAdapter26, WireAdapter wireAdapter27, WireAdapter wireAdapter28, WireAdapter wireAdapter29, WireAdapter wireAdapter30, WireAdapter wireAdapter31, WireAdapter wireAdapter32) {
            this.moneyBtcAppletAdapter = wireAdapter;
            this.moneyTaxesAppletAdapter = wireAdapter2;
            this.moneyFamiliesAppletAdapter = wireAdapter3;
            this.moneyGlobalBorrowAppletAdapter = wireAdapter4;
            this.moneyInvestingAppletAdapter = wireAdapter5;
            this.moneyTabHomeDesignSystemAdapter = wireAdapter6;
            this.cashCardTabAdapter = wireAdapter7;
            this.cashOffersTabAdapter = wireAdapter8;
            this.paymentSendAsGiftCardAdapter = wireAdapter9;
            this.paymentSendAsBtcAdapter = wireAdapter10;
            this.paymentSendAsStockAdapter = wireAdapter11;
            this.paymentPersonalToC4bAdapter = wireAdapter12;
            this.settingsTaxPasswordAuthAppAdapter = wireAdapter13;
            this.settingsInvestTrustedContactAppAdapter = wireAdapter14;
            this.accountSwitcherAdapter = wireAdapter15;
            this.activityTreehouseAdapter = wireAdapter16;
            this.documentsBtcAdapter = wireAdapter17;
            this.documentsStockAdapter = wireAdapter18;
            this.documentsTaxesAdapter = wireAdapter19;
            this.dda_tabAdapter = wireAdapter20;
            this.remittanceSendAdapter = wireAdapter21;
            this.tapToPayAdapter = wireAdapter22;
            this.sponsorEligibleAdapter = wireAdapter23;
            this.moneyEarningsAppletAdapter = wireAdapter24;
            this.c4bPromotionVisibilityAdapter = wireAdapter25;
            this.moneybotVisibilityAdapter = wireAdapter26;
            this.personalizedAdsToggleAdapter = wireAdapter27;
            this.poolsOnboardingVisibilityAdapter = wireAdapter28;
            this.workAppletVisibilityAdapter = wireAdapter29;
            this.nearbyPaymentFeatureVisibilityAdapter = wireAdapter30;
            this.bitcoinAutoInvestAdapter = wireAdapter31;
            this.recurringP2pPaymentFeatureVisibilityAdapter = wireAdapter32;
        }
    }

    public SingleAccountHolderEligibility(String str, long j, C4bEligibilityState c4bEligibilityState, C4bEligibilityState c4bEligibilityState2, C4bEligibilityState c4bEligibilityState3, C4bEligibilityState c4bEligibilityState4, C4bEligibilityState c4bEligibilityState5, C4bEligibilityState c4bEligibilityState6, C4bEligibilityState c4bEligibilityState7, C4bEligibilityState c4bEligibilityState8, C4bEligibilityState c4bEligibilityState9, C4bEligibilityState c4bEligibilityState10, C4bEligibilityState c4bEligibilityState11, C4bEligibilityState c4bEligibilityState12, C4bEligibilityState c4bEligibilityState13, C4bEligibilityState c4bEligibilityState14, C4bEligibilityState c4bEligibilityState15, C4bEligibilityState c4bEligibilityState16, C4bEligibilityState c4bEligibilityState17, C4bEligibilityState c4bEligibilityState18, C4bEligibilityState c4bEligibilityState19, C4bEligibilityState c4bEligibilityState20, C4bEligibilityState c4bEligibilityState21, C4bEligibilityState c4bEligibilityState22, C4bEligibilityState c4bEligibilityState23, C4bEligibilityState c4bEligibilityState24, C4bEligibilityState c4bEligibilityState25, C4bEligibilityState c4bEligibilityState26, C4bEligibilityState c4bEligibilityState27, C4bEligibilityState c4bEligibilityState28, C4bEligibilityState c4bEligibilityState29, C4bEligibilityState c4bEligibilityState30, C4bEligibilityState c4bEligibilityState31, C4bEligibilityState c4bEligibilityState32) {
        str.getClass();
        this.customerToken = str;
        this.nextRefreshAtMillis = j;
        this.moneyBtcApplet = c4bEligibilityState;
        this.moneyTaxesApplet = c4bEligibilityState2;
        this.moneyFamiliesApplet = c4bEligibilityState3;
        this.moneyGlobalBorrowApplet = c4bEligibilityState4;
        this.moneyInvestingApplet = c4bEligibilityState5;
        this.moneyTabHomeDesignSystem = c4bEligibilityState6;
        this.cashCardTab = c4bEligibilityState7;
        this.cashOffersTab = c4bEligibilityState8;
        this.paymentSendAsGiftCard = c4bEligibilityState9;
        this.paymentSendAsBtc = c4bEligibilityState10;
        this.paymentSendAsStock = c4bEligibilityState11;
        this.paymentPersonalToC4b = c4bEligibilityState12;
        this.settingsTaxPasswordAuthApp = c4bEligibilityState13;
        this.settingsInvestTrustedContactApp = c4bEligibilityState14;
        this.accountSwitcher = c4bEligibilityState15;
        this.activityTreehouse = c4bEligibilityState16;
        this.documentsBtc = c4bEligibilityState17;
        this.documentsStock = c4bEligibilityState18;
        this.documentsTaxes = c4bEligibilityState19;
        this.dda_tab = c4bEligibilityState20;
        this.remittanceSend = c4bEligibilityState21;
        this.tapToPay = c4bEligibilityState22;
        this.sponsorEligible = c4bEligibilityState23;
        this.moneyEarningsApplet = c4bEligibilityState24;
        this.c4bPromotionVisibility = c4bEligibilityState25;
        this.moneybotVisibility = c4bEligibilityState26;
        this.personalizedAdsToggle = c4bEligibilityState27;
        this.poolsOnboardingVisibility = c4bEligibilityState28;
        this.workAppletVisibility = c4bEligibilityState29;
        this.nearbyPaymentFeatureVisibility = c4bEligibilityState30;
        this.bitcoinAutoInvest = c4bEligibilityState31;
        this.recurringP2pPaymentFeatureVisibility = c4bEligibilityState32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleAccountHolderEligibility)) {
            return false;
        }
        SingleAccountHolderEligibility singleAccountHolderEligibility = (SingleAccountHolderEligibility) obj;
        return Intrinsics.areEqual(this.customerToken, singleAccountHolderEligibility.customerToken) && this.nextRefreshAtMillis == singleAccountHolderEligibility.nextRefreshAtMillis && Intrinsics.areEqual(this.moneyBtcApplet, singleAccountHolderEligibility.moneyBtcApplet) && Intrinsics.areEqual(this.moneyTaxesApplet, singleAccountHolderEligibility.moneyTaxesApplet) && Intrinsics.areEqual(this.moneyFamiliesApplet, singleAccountHolderEligibility.moneyFamiliesApplet) && Intrinsics.areEqual(this.moneyGlobalBorrowApplet, singleAccountHolderEligibility.moneyGlobalBorrowApplet) && Intrinsics.areEqual(this.moneyInvestingApplet, singleAccountHolderEligibility.moneyInvestingApplet) && Intrinsics.areEqual(this.moneyTabHomeDesignSystem, singleAccountHolderEligibility.moneyTabHomeDesignSystem) && Intrinsics.areEqual(this.cashCardTab, singleAccountHolderEligibility.cashCardTab) && Intrinsics.areEqual(this.cashOffersTab, singleAccountHolderEligibility.cashOffersTab) && Intrinsics.areEqual(this.paymentSendAsGiftCard, singleAccountHolderEligibility.paymentSendAsGiftCard) && Intrinsics.areEqual(this.paymentSendAsBtc, singleAccountHolderEligibility.paymentSendAsBtc) && Intrinsics.areEqual(this.paymentSendAsStock, singleAccountHolderEligibility.paymentSendAsStock) && Intrinsics.areEqual(this.paymentPersonalToC4b, singleAccountHolderEligibility.paymentPersonalToC4b) && Intrinsics.areEqual(this.settingsTaxPasswordAuthApp, singleAccountHolderEligibility.settingsTaxPasswordAuthApp) && Intrinsics.areEqual(this.settingsInvestTrustedContactApp, singleAccountHolderEligibility.settingsInvestTrustedContactApp) && Intrinsics.areEqual(this.accountSwitcher, singleAccountHolderEligibility.accountSwitcher) && Intrinsics.areEqual(this.activityTreehouse, singleAccountHolderEligibility.activityTreehouse) && Intrinsics.areEqual(this.documentsBtc, singleAccountHolderEligibility.documentsBtc) && Intrinsics.areEqual(this.documentsStock, singleAccountHolderEligibility.documentsStock) && Intrinsics.areEqual(this.documentsTaxes, singleAccountHolderEligibility.documentsTaxes) && Intrinsics.areEqual(this.dda_tab, singleAccountHolderEligibility.dda_tab) && Intrinsics.areEqual(this.remittanceSend, singleAccountHolderEligibility.remittanceSend) && Intrinsics.areEqual(this.tapToPay, singleAccountHolderEligibility.tapToPay) && Intrinsics.areEqual(this.sponsorEligible, singleAccountHolderEligibility.sponsorEligible) && Intrinsics.areEqual(this.moneyEarningsApplet, singleAccountHolderEligibility.moneyEarningsApplet) && Intrinsics.areEqual(this.c4bPromotionVisibility, singleAccountHolderEligibility.c4bPromotionVisibility) && Intrinsics.areEqual(this.moneybotVisibility, singleAccountHolderEligibility.moneybotVisibility) && Intrinsics.areEqual(this.personalizedAdsToggle, singleAccountHolderEligibility.personalizedAdsToggle) && Intrinsics.areEqual(this.poolsOnboardingVisibility, singleAccountHolderEligibility.poolsOnboardingVisibility) && Intrinsics.areEqual(this.workAppletVisibility, singleAccountHolderEligibility.workAppletVisibility) && Intrinsics.areEqual(this.nearbyPaymentFeatureVisibility, singleAccountHolderEligibility.nearbyPaymentFeatureVisibility) && Intrinsics.areEqual(this.bitcoinAutoInvest, singleAccountHolderEligibility.bitcoinAutoInvest) && Intrinsics.areEqual(this.recurringP2pPaymentFeatureVisibility, singleAccountHolderEligibility.recurringP2pPaymentFeatureVisibility);
    }

    public final C4bEligibilityState getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final C4bEligibilityState getBitcoinAutoInvest() {
        return this.bitcoinAutoInvest;
    }

    public final C4bEligibilityState getC4bPromotionVisibility() {
        return this.c4bPromotionVisibility;
    }

    public final C4bEligibilityState getCashCardTab() {
        return this.cashCardTab;
    }

    public final C4bEligibilityState getCashOffersTab() {
        return this.cashOffersTab;
    }

    public final C4bEligibilityState getDda_tab() {
        return this.dda_tab;
    }

    public final C4bEligibilityState getDocumentsBtc() {
        return this.documentsBtc;
    }

    public final C4bEligibilityState getDocumentsStock() {
        return this.documentsStock;
    }

    public final C4bEligibilityState getDocumentsTaxes() {
        return this.documentsTaxes;
    }

    public final C4bEligibilityState getMoneyBtcApplet() {
        return this.moneyBtcApplet;
    }

    public final C4bEligibilityState getMoneyEarningsApplet() {
        return this.moneyEarningsApplet;
    }

    public final C4bEligibilityState getMoneyFamiliesApplet() {
        return this.moneyFamiliesApplet;
    }

    public final C4bEligibilityState getMoneyGlobalBorrowApplet() {
        return this.moneyGlobalBorrowApplet;
    }

    public final C4bEligibilityState getMoneyInvestingApplet() {
        return this.moneyInvestingApplet;
    }

    public final C4bEligibilityState getMoneyTaxesApplet() {
        return this.moneyTaxesApplet;
    }

    public final C4bEligibilityState getMoneybotVisibility() {
        return this.moneybotVisibility;
    }

    public final C4bEligibilityState getNearbyPaymentFeatureVisibility() {
        return this.nearbyPaymentFeatureVisibility;
    }

    public final C4bEligibilityState getPoolsOnboardingVisibility() {
        return this.poolsOnboardingVisibility;
    }

    public final C4bEligibilityState getRecurringP2pPaymentFeatureVisibility() {
        return this.recurringP2pPaymentFeatureVisibility;
    }

    public final C4bEligibilityState getRemittanceSend() {
        return this.remittanceSend;
    }

    public final C4bEligibilityState getSponsorEligible() {
        return this.sponsorEligible;
    }

    public final C4bEligibilityState getTapToPay() {
        return this.tapToPay;
    }

    public final C4bEligibilityState getWorkAppletVisibility() {
        return this.workAppletVisibility;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.customerToken.hashCode() * 31, 31, this.nextRefreshAtMillis);
        C4bEligibilityState c4bEligibilityState = this.moneyBtcApplet;
        int hashCode = (m + (c4bEligibilityState == null ? 0 : c4bEligibilityState.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState2 = this.moneyTaxesApplet;
        int hashCode2 = (hashCode + (c4bEligibilityState2 == null ? 0 : c4bEligibilityState2.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState3 = this.moneyFamiliesApplet;
        int hashCode3 = (hashCode2 + (c4bEligibilityState3 == null ? 0 : c4bEligibilityState3.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState4 = this.moneyGlobalBorrowApplet;
        int hashCode4 = (hashCode3 + (c4bEligibilityState4 == null ? 0 : c4bEligibilityState4.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState5 = this.moneyInvestingApplet;
        int hashCode5 = (hashCode4 + (c4bEligibilityState5 == null ? 0 : c4bEligibilityState5.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState6 = this.moneyTabHomeDesignSystem;
        int hashCode6 = (hashCode5 + (c4bEligibilityState6 == null ? 0 : c4bEligibilityState6.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState7 = this.cashCardTab;
        int hashCode7 = (hashCode6 + (c4bEligibilityState7 == null ? 0 : c4bEligibilityState7.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState8 = this.cashOffersTab;
        int hashCode8 = (hashCode7 + (c4bEligibilityState8 == null ? 0 : c4bEligibilityState8.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState9 = this.paymentSendAsGiftCard;
        int hashCode9 = (hashCode8 + (c4bEligibilityState9 == null ? 0 : c4bEligibilityState9.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState10 = this.paymentSendAsBtc;
        int hashCode10 = (hashCode9 + (c4bEligibilityState10 == null ? 0 : c4bEligibilityState10.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState11 = this.paymentSendAsStock;
        int hashCode11 = (hashCode10 + (c4bEligibilityState11 == null ? 0 : c4bEligibilityState11.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState12 = this.paymentPersonalToC4b;
        int hashCode12 = (hashCode11 + (c4bEligibilityState12 == null ? 0 : c4bEligibilityState12.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState13 = this.settingsTaxPasswordAuthApp;
        int hashCode13 = (hashCode12 + (c4bEligibilityState13 == null ? 0 : c4bEligibilityState13.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState14 = this.settingsInvestTrustedContactApp;
        int hashCode14 = (hashCode13 + (c4bEligibilityState14 == null ? 0 : c4bEligibilityState14.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState15 = this.accountSwitcher;
        int hashCode15 = (hashCode14 + (c4bEligibilityState15 == null ? 0 : c4bEligibilityState15.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState16 = this.activityTreehouse;
        int hashCode16 = (hashCode15 + (c4bEligibilityState16 == null ? 0 : c4bEligibilityState16.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState17 = this.documentsBtc;
        int hashCode17 = (hashCode16 + (c4bEligibilityState17 == null ? 0 : c4bEligibilityState17.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState18 = this.documentsStock;
        int hashCode18 = (hashCode17 + (c4bEligibilityState18 == null ? 0 : c4bEligibilityState18.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState19 = this.documentsTaxes;
        int hashCode19 = (hashCode18 + (c4bEligibilityState19 == null ? 0 : c4bEligibilityState19.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState20 = this.dda_tab;
        int hashCode20 = (hashCode19 + (c4bEligibilityState20 == null ? 0 : c4bEligibilityState20.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState21 = this.remittanceSend;
        int hashCode21 = (hashCode20 + (c4bEligibilityState21 == null ? 0 : c4bEligibilityState21.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState22 = this.tapToPay;
        int hashCode22 = (hashCode21 + (c4bEligibilityState22 == null ? 0 : c4bEligibilityState22.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState23 = this.sponsorEligible;
        int hashCode23 = (hashCode22 + (c4bEligibilityState23 == null ? 0 : c4bEligibilityState23.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState24 = this.moneyEarningsApplet;
        int hashCode24 = (hashCode23 + (c4bEligibilityState24 == null ? 0 : c4bEligibilityState24.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState25 = this.c4bPromotionVisibility;
        int hashCode25 = (hashCode24 + (c4bEligibilityState25 == null ? 0 : c4bEligibilityState25.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState26 = this.moneybotVisibility;
        int hashCode26 = (hashCode25 + (c4bEligibilityState26 == null ? 0 : c4bEligibilityState26.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState27 = this.personalizedAdsToggle;
        int hashCode27 = (hashCode26 + (c4bEligibilityState27 == null ? 0 : c4bEligibilityState27.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState28 = this.poolsOnboardingVisibility;
        int hashCode28 = (hashCode27 + (c4bEligibilityState28 == null ? 0 : c4bEligibilityState28.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState29 = this.workAppletVisibility;
        int hashCode29 = (hashCode28 + (c4bEligibilityState29 == null ? 0 : c4bEligibilityState29.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState30 = this.nearbyPaymentFeatureVisibility;
        int hashCode30 = (hashCode29 + (c4bEligibilityState30 == null ? 0 : c4bEligibilityState30.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState31 = this.bitcoinAutoInvest;
        int hashCode31 = (hashCode30 + (c4bEligibilityState31 == null ? 0 : c4bEligibilityState31.hashCode())) * 31;
        C4bEligibilityState c4bEligibilityState32 = this.recurringP2pPaymentFeatureVisibility;
        return hashCode31 + (c4bEligibilityState32 != null ? c4bEligibilityState32.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("SingleAccountHolderEligibility(customerToken=", this.customerToken, ", nextRefreshAtMillis=", this.nextRefreshAtMillis);
        m.append(", moneyBtcApplet=");
        m.append(this.moneyBtcApplet);
        m.append(", moneyTaxesApplet=");
        m.append(this.moneyTaxesApplet);
        m.append(", moneyFamiliesApplet=");
        m.append(this.moneyFamiliesApplet);
        m.append(", moneyGlobalBorrowApplet=");
        m.append(this.moneyGlobalBorrowApplet);
        m.append(", moneyInvestingApplet=");
        m.append(this.moneyInvestingApplet);
        m.append(", moneyTabHomeDesignSystem=");
        m.append(this.moneyTabHomeDesignSystem);
        m.append(", cashCardTab=");
        m.append(this.cashCardTab);
        m.append(", cashOffersTab=");
        m.append(this.cashOffersTab);
        m.append(", paymentSendAsGiftCard=");
        m.append(this.paymentSendAsGiftCard);
        m.append(", paymentSendAsBtc=");
        m.append(this.paymentSendAsBtc);
        m.append(", paymentSendAsStock=");
        m.append(this.paymentSendAsStock);
        m.append(", paymentPersonalToC4b=");
        m.append(this.paymentPersonalToC4b);
        m.append(", settingsTaxPasswordAuthApp=");
        m.append(this.settingsTaxPasswordAuthApp);
        m.append(", settingsInvestTrustedContactApp=");
        m.append(this.settingsInvestTrustedContactApp);
        m.append(", accountSwitcher=");
        m.append(this.accountSwitcher);
        m.append(", activityTreehouse=");
        m.append(this.activityTreehouse);
        m.append(", documentsBtc=");
        m.append(this.documentsBtc);
        m.append(", documentsStock=");
        m.append(this.documentsStock);
        m.append(", documentsTaxes=");
        m.append(this.documentsTaxes);
        m.append(", dda_tab=");
        m.append(this.dda_tab);
        m.append(", remittanceSend=");
        m.append(this.remittanceSend);
        m.append(", tapToPay=");
        m.append(this.tapToPay);
        m.append(", sponsorEligible=");
        m.append(this.sponsorEligible);
        m.append(", moneyEarningsApplet=");
        m.append(this.moneyEarningsApplet);
        m.append(", c4bPromotionVisibility=");
        m.append(this.c4bPromotionVisibility);
        m.append(", moneybotVisibility=");
        m.append(this.moneybotVisibility);
        m.append(", personalizedAdsToggle=");
        m.append(this.personalizedAdsToggle);
        m.append(", poolsOnboardingVisibility=");
        m.append(this.poolsOnboardingVisibility);
        m.append(", workAppletVisibility=");
        m.append(this.workAppletVisibility);
        m.append(", nearbyPaymentFeatureVisibility=");
        m.append(this.nearbyPaymentFeatureVisibility);
        m.append(", bitcoinAutoInvest=");
        m.append(this.bitcoinAutoInvest);
        m.append(", recurringP2pPaymentFeatureVisibility=");
        m.append(this.recurringP2pPaymentFeatureVisibility);
        m.append(")");
        return m.toString();
    }
}
