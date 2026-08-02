package com.squareup.cash.crypto.backend.capability;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.Role;
import com.squareup.util.cash.Countries;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealBitcoinActivityProvider {
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final RealInvestmentActivity investmentActivity;

    public RealBitcoinActivityProvider(RealCryptoBalanceRepo realCryptoBalanceRepo, RealInvestmentActivity realInvestmentActivity) {
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.investmentActivity = realInvestmentActivity;
    }

    public final Flow hasBitcoinActivity() {
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new AppLockMonitor$special$$inlined$map$2(Countries.asMoney(this.cryptoBalanceRepo.getBitcoinBalance()), 6));
        RealInvestmentActivity realInvestmentActivity = this.investmentActivity;
        PaymentQueries paymentQueries = realInvestmentActivity.database.cashActivityQueries;
        CurrencyCode currencyCode = CurrencyCode.BTC;
        Role role = Role.RECIPIENT;
        paymentQueries.getClass();
        return FlowKt.distinctUntilChanged(new RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new InstrumentQueries.ForCurrencyQuery(paymentQueries, currencyCode, role, new WebLoginConfigQueries$$ExternalSyntheticLambda0(2))), realInvestmentActivity.ioDispatcher), distinctUntilChanged, RealBitcoinActivityProvider$hasBitcoinActivity$3.INSTANCE, 0), 1));
    }
}
