package com.squareup.cash.crypto.backend.value;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.protos.common.CurrencyCode;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealCryptoValueRepo {
    public final CurrencyConverter$Factory currencyConverterFactory;
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 defaultCurrencyCodeFlow;

    public RealCryptoValueRepo(CurrencyConverter$Factory currencyConverter$Factory, RealJurisdictionConfigManager realJurisdictionConfigManager) {
        this.currencyConverterFactory = currencyConverter$Factory;
        this.defaultCurrencyCodeFlow = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 23), 24);
    }

    public final ChannelFlowTransformLatest valuePerBitcoin(CurrencyCode currencyCode) {
        return FlowKt.transformLatest(currencyCode == null ? this.defaultCurrencyCodeFlow : new AppLockMonitor$special$$inlined$map$2(currencyCode, 19), new AnchoredDraggableNode$drag$2(null, this, 12));
    }
}
