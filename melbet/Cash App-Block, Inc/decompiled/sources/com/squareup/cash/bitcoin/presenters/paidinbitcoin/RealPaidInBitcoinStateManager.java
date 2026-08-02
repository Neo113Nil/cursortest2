package com.squareup.cash.bitcoin.presenters.paidinbitcoin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.crypto.backend.payroll.RealCryptoPayrollProvider;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class RealPaidInBitcoinStateManager {
    public final RealCryptoPayrollProvider cryptoPayrollProvider;
    public final RealDemandDepositAccountManager demandDepositAccountManager;
    public final IssuedCardManager issuedCardManager;

    public RealPaidInBitcoinStateManager(RealCryptoPayrollProvider realCryptoPayrollProvider, IssuedCardManager issuedCardManager, RealDemandDepositAccountManager realDemandDepositAccountManager) {
        this.cryptoPayrollProvider = realCryptoPayrollProvider;
        this.issuedCardManager = issuedCardManager;
        this.demandDepositAccountManager = realDemandDepositAccountManager;
    }

    public final PaidInBitcoinState states(GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-2033268050);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(this.cryptoPayrollProvider.syncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.CryptoPayrollPreference), 2);
            gapComposer.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
            rememberedValue = realGooglePayer$createWallet$$inlined$filter$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealIssuedCardManager) this.issuedCardManager).getIssuedCardState();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, CashAppCard.PhysicalCardOrderState.NO_CARD, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(this.demandDepositAccountManager.selectUiDda(), 1);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Integer num = (Integer) collectAsState.getValue();
        boolean z = (num != null ? num.intValue() : 0) > 0;
        Integer num2 = (Integer) collectAsState.getValue();
        CashAppCard.PhysicalCardOrderState physicalCardOrderState = (CashAppCard.PhysicalCardOrderState) collectAsState2.getValue();
        DirectDepositAccount directDepositAccount = (DirectDepositAccount) collectAsState3.getValue();
        PaidInBitcoinState paidInBitcoinState = new PaidInBitcoinState(z, num2, physicalCardOrderState, directDepositAccount != null ? Intrinsics.areEqual(directDepositAccount.is_placeholder, Boolean.FALSE) : false);
        gapComposer.end(false);
        return paidInBitcoinState;
    }
}
