package com.squareup.cash.investing.backend.real;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.primitives.InvestingState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import squareup.cash.investcustomer.syncvalues.InvestDividendSetting;
import squareup.cash.portfolios.syncvalues.PortfolioState;

/* loaded from: classes6.dex */
public final class RealInvestingStateManager {
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final SyncValueReader syncValueReader;

    public RealInvestingStateManager(SyncValueReader syncValueReader, RealFamilyAccountsManager realFamilyAccountsManager) {
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.syncValueReader = syncValueReader;
    }

    public final InvestingState investingStates(Composer composer) {
        InvestingState.Content.DividendState dividendState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1794261180);
        boolean changed = gapComposer.changed(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = this.sponsorshipStateProvider.isActivelySponsored();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i = 13;
        SyncValueReader syncValueReader = this.syncValueReader;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.InvestPortfolioState, new PortfolioState(false, null, ByteString.EMPTY), new Matcher$$ExternalSyntheticLambda9(i));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.InvestTradingState, new InvestTradingStatePayload(false, null), new ActivityItemLayout$$ExternalSyntheticLambda4(26));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue3, null, gapComposer, 1);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.InvestDividendSetting, new InvestDividendSetting(InvestDividendSetting.DividendSetting.PAYOUT, ByteString.EMPTY), new Matcher$$ExternalSyntheticLambda9(i));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        if (((Boolean) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingState.Loading.INSTANCE;
        }
        InvestingState.Content.PortfolioState portfolioState = ((PortfolioState) collectAsState2.getValue()).has_portfolio ? Intrinsics.areEqual(((PortfolioState) collectAsState2.getValue()).has_holdings, Boolean.FALSE) ? InvestingState.Content.PortfolioState.EMPTY : InvestingState.Content.PortfolioState.HAS_HOLDINGS : InvestingState.Content.PortfolioState.ABSENT;
        int ordinal = ((InvestDividendSetting) collectAsState4.getValue()).dividend_setting.ordinal();
        if (ordinal == 0) {
            dividendState = InvestingState.Content.DividendState.SAVE_BALANCE;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            dividendState = InvestingState.Content.DividendState.AUTO_REINVEST;
        }
        Instant instant = ((InvestTradingStatePayload) collectAsState3.getValue()).transferCompletionTime;
        InvestingState.Content.BrokerageAccountState transferInProgress = instant != null ? new InvestingState.Content.BrokerageAccountState.TransferInProgress(instant) : ((InvestTradingStatePayload) collectAsState3.getValue()).hasActiveBrokerageAccount ? InvestingState.Content.BrokerageAccountState.Active.INSTANCE : InvestingState.Content.BrokerageAccountState.Inactive.INSTANCE;
        Boolean bool = (Boolean) collectAsState.getValue();
        bool.getClass();
        InvestingState.Content content = new InvestingState.Content(portfolioState, transferInProgress, bool.booleanValue(), dividendState);
        gapComposer.end(false);
        return content;
    }
}
