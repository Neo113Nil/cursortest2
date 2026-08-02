package com.squareup.cash.eligibility.backend.real;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import java.util.EnumSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class RealFeatureEligibilityRepository implements IoSetupTeardown {
    public final ChannelFlowTransformLatest _eligibility;
    public final Analytics analytics;
    public final AndroidClock clock;
    public final InstrumentQueries eligibilityQueries;
    public final CoroutineContext ioDispatcher;
    public final C4BClientService service;
    public final SessionManager sessionManager;
    public final Signal signOut;
    public final BufferedChannel updateEligibilityRequestsQueue = PapaEvent.Channel$default(-1, null, null, 6);

    /* loaded from: classes6.dex */
    public interface UpdateEligibilityRequest {

        public final class CacheExpired implements UpdateEligibilityRequest {
            public final long expiredAtMillis;

            public CacheExpired(long j) {
                this.expiredAtMillis = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CacheExpired) && this.expiredAtMillis == ((CacheExpired) obj).expiredAtMillis;
            }

            public final int hashCode() {
                return Long.hashCode(this.expiredAtMillis);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m(this.expiredAtMillis, "CacheExpired(expiredAtMillis=", ")");
            }
        }

        public final class Forced implements UpdateEligibilityRequest {
            public final EligibilityRefreshAnalyticsData analyticsData;

            public Forced(EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData) {
                this.analyticsData = eligibilityRefreshAnalyticsData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Forced) && this.analyticsData.equals(((Forced) obj).analyticsData);
            }

            public final int hashCode() {
                return this.analyticsData.hashCode();
            }

            public final String toString() {
                return "Forced(analyticsData=" + this.analyticsData + ")";
            }
        }
    }

    public RealFeatureEligibilityRepository(SessionManager sessionManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, C4BClientService c4BClientService, AndroidClock androidClock, Analytics analytics, Signal signal) {
        this.sessionManager = sessionManager;
        this.ioDispatcher = coroutineContext;
        this.service = c4BClientService;
        this.clock = androidClock;
        this.analytics = analytics;
        this.signOut = signal;
        this.eligibilityQueries = cashAccountDatabaseImpl.singleAccountHolderEligibilityQueries;
        this._eligibility = FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(sessionManager.getSessionState(), 10), new Badger$collect$$inlined$combine$2$3((Continuation) null, this, 2));
    }

    public static final EnumSet access$toEligibleFeatureSet(RealFeatureEligibilityRepository realFeatureEligibilityRepository, SingleAccountHolderEligibility singleAccountHolderEligibility) {
        EnumSet noneOf = EnumSet.noneOf(EligibleFeature.class);
        noneOf.getClass();
        C4bEligibilityState accountSwitcher = singleAccountHolderEligibility.getAccountSwitcher();
        if (!(accountSwitcher != null ? Intrinsics.areEqual(accountSwitcher.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.ACCOUNT_SWITCHER);
        }
        C4bEligibilityState bitcoinAutoInvest = singleAccountHolderEligibility.getBitcoinAutoInvest();
        if (bitcoinAutoInvest != null ? Intrinsics.areEqual(bitcoinAutoInvest.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.BITCOIN_AUTO_INVEST);
        }
        C4bEligibilityState moneybotVisibility = singleAccountHolderEligibility.getMoneybotVisibility();
        if (moneybotVisibility != null ? Intrinsics.areEqual(moneybotVisibility.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.MONEYBOT_VISIBILITY);
        }
        C4bEligibilityState c4bPromotionVisibility = singleAccountHolderEligibility.getC4bPromotionVisibility();
        if (c4bPromotionVisibility != null ? Intrinsics.areEqual(c4bPromotionVisibility.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.C4B_PROMOTION_VISIBILITY);
        }
        C4bEligibilityState cashCardTab = singleAccountHolderEligibility.getCashCardTab();
        if (!(cashCardTab != null ? Intrinsics.areEqual(cashCardTab.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.CASH_CARD_TAB);
        }
        C4bEligibilityState cashOffersTab = singleAccountHolderEligibility.getCashOffersTab();
        if (!(cashOffersTab != null ? Intrinsics.areEqual(cashOffersTab.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.CASH_OFFERS_TAB);
        }
        C4bEligibilityState dda_tab = singleAccountHolderEligibility.getDda_tab();
        if (!(dda_tab != null ? Intrinsics.areEqual(dda_tab.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.DDA_TAB);
        }
        C4bEligibilityState documentsBtc = singleAccountHolderEligibility.getDocumentsBtc();
        if (!(documentsBtc != null ? Intrinsics.areEqual(documentsBtc.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.DOCUMENTS_BTC);
        }
        C4bEligibilityState documentsStock = singleAccountHolderEligibility.getDocumentsStock();
        if (!(documentsStock != null ? Intrinsics.areEqual(documentsStock.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.DOCUMENTS_STOCK);
        }
        C4bEligibilityState documentsTaxes = singleAccountHolderEligibility.getDocumentsTaxes();
        if (!(documentsTaxes != null ? Intrinsics.areEqual(documentsTaxes.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.DOCUMENTS_TAXES);
        }
        C4bEligibilityState moneyBtcApplet = singleAccountHolderEligibility.getMoneyBtcApplet();
        if (!(moneyBtcApplet != null ? Intrinsics.areEqual(moneyBtcApplet.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.MONEY_BTC_APPLET);
        }
        C4bEligibilityState moneyEarningsApplet = singleAccountHolderEligibility.getMoneyEarningsApplet();
        if (moneyEarningsApplet != null ? Intrinsics.areEqual(moneyEarningsApplet.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.MONEY_EARNINGS_APPLET);
        }
        C4bEligibilityState moneyFamiliesApplet = singleAccountHolderEligibility.getMoneyFamiliesApplet();
        if (!(moneyFamiliesApplet != null ? Intrinsics.areEqual(moneyFamiliesApplet.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.MONEY_FAMILIES_APPLET);
        }
        C4bEligibilityState moneyGlobalBorrowApplet = singleAccountHolderEligibility.getMoneyGlobalBorrowApplet();
        if (!(moneyGlobalBorrowApplet != null ? Intrinsics.areEqual(moneyGlobalBorrowApplet.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.MONEY_GLOBAL_BORROW_APPLET);
        }
        C4bEligibilityState moneyInvestingApplet = singleAccountHolderEligibility.getMoneyInvestingApplet();
        if (!(moneyInvestingApplet != null ? Intrinsics.areEqual(moneyInvestingApplet.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.MONEY_INVESTING_APPLET);
        }
        C4bEligibilityState moneyTaxesApplet = singleAccountHolderEligibility.getMoneyTaxesApplet();
        if (!(moneyTaxesApplet != null ? Intrinsics.areEqual(moneyTaxesApplet.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.MONEY_TAXES_APPLET);
        }
        C4bEligibilityState remittanceSend = singleAccountHolderEligibility.getRemittanceSend();
        if (!(remittanceSend != null ? Intrinsics.areEqual(remittanceSend.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.REMITTANCE_SEND);
        }
        C4bEligibilityState sponsorEligible = singleAccountHolderEligibility.getSponsorEligible();
        if (!(sponsorEligible != null ? Intrinsics.areEqual(sponsorEligible.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.SPONSOR_ELIGIBLE);
        }
        C4bEligibilityState tapToPay = singleAccountHolderEligibility.getTapToPay();
        if (!(tapToPay != null ? Intrinsics.areEqual(tapToPay.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.TAP_TO_PAY);
        }
        C4bEligibilityState poolsOnboardingVisibility = singleAccountHolderEligibility.getPoolsOnboardingVisibility();
        if (!(poolsOnboardingVisibility != null ? Intrinsics.areEqual(poolsOnboardingVisibility.is_eligible, Boolean.FALSE) : false)) {
            noneOf.add(EligibleFeature.POOLS_ONBOARDING_VISIBILITY);
        }
        C4bEligibilityState workAppletVisibility = singleAccountHolderEligibility.getWorkAppletVisibility();
        if (workAppletVisibility != null ? Intrinsics.areEqual(workAppletVisibility.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.WORK_APPLET_VISIBILITY);
        }
        C4bEligibilityState nearbyPaymentFeatureVisibility = singleAccountHolderEligibility.getNearbyPaymentFeatureVisibility();
        if (nearbyPaymentFeatureVisibility != null ? Intrinsics.areEqual(nearbyPaymentFeatureVisibility.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.NEARBY_PAYMENT_FEATURE_VISIBILITY);
        }
        C4bEligibilityState recurringP2pPaymentFeatureVisibility = singleAccountHolderEligibility.getRecurringP2pPaymentFeatureVisibility();
        if (recurringP2pPaymentFeatureVisibility != null ? Intrinsics.areEqual(recurringP2pPaymentFeatureVisibility.is_eligible, Boolean.TRUE) : false) {
            noneOf.add(EligibleFeature.RECURRING_P2P_PAYMENT_FEATURE_VISIBILITY);
        }
        return noneOf;
    }

    public final FinishSetupTileBadgeCounter currentEligibleFeatures() {
        return new FinishSetupTileBadgeCounter(9, this._eligibility, this);
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new RealFeatureEligibilityRepository$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealFeatureEligibilityRepository$setup$1$1(this, continuation, 1), 3);
        return StateFlowKt.noOpTeardown;
    }
}
