package com.squareup.cash.bitcoin.presenters.transfer;

import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes5.dex */
public final class BitcoinTransferTitleSubtitleProvider {
    public final BitcoinTransferScreen args;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final MoneyFormatter moneyFormatter;
    public final CoroutineScope scope;
    public final AndroidStringManager stringManager;
    public final MoneyFormatter symbolAndCodeFormatter;
    public final ReadonlyStateFlow title;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BitcoinTransferTitleSubtitleProvider(AndroidStringManager androidStringManager, RealCryptoBalanceRepo realCryptoBalanceRepo, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, LocalizedMoneyFormatter.Factory factory, CoroutineScope coroutineScope, BitcoinTransferScreen bitcoinTransferScreen) {
        bitcoinTransferScreen.getClass();
        this.stringManager = androidStringManager;
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.scope = coroutineScope;
        this.args = bitcoinTransferScreen;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.symbolAndCodeFormatter = factory.createSymbolAndCode();
        this.title = FlowKt.stateIn(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(RealBitcoinCapabilityProvider.isBTCxFlow(), this, 29), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), "");
    }

    public static int getLabel(RecurringSchedule.Frequency frequency) {
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == -1) {
            return R.string.bitcoin_recurringfrequency_onetime;
        }
        if (i == 1) {
            return R.string.bitcoin_recurringfrequency_weekly;
        }
        if (i == 2) {
            return R.string.bitcoin_recurringfrequency_biweekly;
        }
        if (i == 3) {
            return R.string.bitcoin_recurringfrequency_daily;
        }
        if (i == 4) {
            return R.string.bitcoin_recurringfrequency_monthly;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
