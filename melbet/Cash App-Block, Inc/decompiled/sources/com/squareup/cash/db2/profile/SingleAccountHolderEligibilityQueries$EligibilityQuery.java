package com.squareup.cash.db2.profile;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SingleAccountHolderEligibilityQueries$EligibilityQuery extends Query {
    public final /* synthetic */ int $r8$classId = 0;
    public final String customerToken;
    public final /* synthetic */ InstrumentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleAccountHolderEligibilityQueries$EligibilityQuery(InstrumentQueries instrumentQueries, String str, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        str.getClass();
        this.this$0 = instrumentQueries;
        this.customerToken = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                instrumentQueries.driver.addListener(new String[]{"singleAccountHolderEligibility"}, listener);
                break;
            default:
                instrumentQueries.driver.addListener(new String[]{"singleAccountHolderEligibility"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                return instrumentQueries.driver.executeQuery(-1203128506, "SELECT singleAccountHolderEligibility.customerToken, singleAccountHolderEligibility.nextRefreshAtMillis, singleAccountHolderEligibility.moneyBtcApplet, singleAccountHolderEligibility.moneyTaxesApplet, singleAccountHolderEligibility.moneyFamiliesApplet, singleAccountHolderEligibility.moneyGlobalBorrowApplet, singleAccountHolderEligibility.moneyInvestingApplet, singleAccountHolderEligibility.moneyTabHomeDesignSystem, singleAccountHolderEligibility.cashCardTab, singleAccountHolderEligibility.cashOffersTab, singleAccountHolderEligibility.paymentSendAsGiftCard, singleAccountHolderEligibility.paymentSendAsBtc, singleAccountHolderEligibility.paymentSendAsStock, singleAccountHolderEligibility.paymentPersonalToC4b, singleAccountHolderEligibility.settingsTaxPasswordAuthApp, singleAccountHolderEligibility.settingsInvestTrustedContactApp, singleAccountHolderEligibility.accountSwitcher, singleAccountHolderEligibility.activityTreehouse, singleAccountHolderEligibility.documentsBtc, singleAccountHolderEligibility.documentsStock, singleAccountHolderEligibility.documentsTaxes, singleAccountHolderEligibility.dda_tab, singleAccountHolderEligibility.remittanceSend, singleAccountHolderEligibility.tapToPay, singleAccountHolderEligibility.sponsorEligible, singleAccountHolderEligibility.moneyEarningsApplet, singleAccountHolderEligibility.c4bPromotionVisibility, singleAccountHolderEligibility.moneybotVisibility, singleAccountHolderEligibility.personalizedAdsToggle, singleAccountHolderEligibility.poolsOnboardingVisibility, singleAccountHolderEligibility.workAppletVisibility, singleAccountHolderEligibility.nearbyPaymentFeatureVisibility, singleAccountHolderEligibility.bitcoinAutoInvest, singleAccountHolderEligibility.recurringP2pPaymentFeatureVisibility\nFROM singleAccountHolderEligibility\nWHERE customerToken = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 26));
            default:
                return instrumentQueries.driver.executeQuery(1802031156, "SELECT nextRefreshAtMillis\nFROM singleAccountHolderEligibility\nWHERE customerToken = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 27));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                instrumentQueries.driver.removeListener(new String[]{"singleAccountHolderEligibility"}, listener);
                break;
            default:
                instrumentQueries.driver.removeListener(new String[]{"singleAccountHolderEligibility"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "SingleAccountHolderEligibility.sq:eligibility";
            default:
                return "SingleAccountHolderEligibility.sq:nextRefreshAt";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleAccountHolderEligibilityQueries$EligibilityQuery(InstrumentQueries instrumentQueries, String str, ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4) {
        super(profileQueries$$ExternalSyntheticLambda4);
        this.this$0 = instrumentQueries;
        this.customerToken = str;
    }
}
