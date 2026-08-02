package com.squareup.cash.bitcoin.formatter;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.SignOption;
import com.squareup.cash.common.moneyformatter.ZeroBiasOption;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinSymbolDisplaySetting;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class RealBitcoinFormatter {
    public final FeatureFlagManager featureFlagManager;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final AndroidStringManager stringManager;

    public RealBitcoinFormatter(FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.moneyFormatterFactory = factory;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        DecimalFormat decimalFormat = new DecimalFormat(Recorder$$ExternalSyntheticOutline2.m("###,###,###.# ", androidStringManager.get(R.string.bitcoin_formatter_million)));
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        new DecimalFormat(Recorder$$ExternalSyntheticOutline2.m("###,###,###.# ", androidStringManager.get(R.string.bitcoin_formatter_billion))).setRoundingMode(roundingMode);
        new DecimalFormat(Recorder$$ExternalSyntheticOutline2.m("###,###,###.# ", androidStringManager.get(R.string.bitcoin_formatter_trillion))).setRoundingMode(roundingMode);
    }

    public static /* synthetic */ String format$default(RealBitcoinFormatter realBitcoinFormatter, BitcoinDisplayUnits bitcoinDisplayUnits, Money money, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return realBitcoinFormatter.format(bitcoinDisplayUnits, money, z, false);
    }

    public static String formatBitcoinWithSymbolPrefix$default(RealBitcoinFormatter realBitcoinFormatter, BitcoinDisplayUnits bitcoinDisplayUnits, Money money, boolean z) {
        bitcoinDisplayUnits.getClass();
        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realBitcoinFormatter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled()) {
            return realBitcoinFormatter.format(bitcoinDisplayUnits, money, true, true);
        }
        BitcoinDisplayUnits bitcoinDisplayUnits2 = BitcoinDisplayUnits.BITCOIN;
        if (bitcoinDisplayUnits != bitcoinDisplayUnits2) {
            z = true;
        }
        String format2 = realBitcoinFormatter.format(bitcoinDisplayUnits, money, z, true);
        return bitcoinDisplayUnits == bitcoinDisplayUnits2 ? Recorder$$ExternalSyntheticOutline2.m$1(Moneys.symbol(CurrencyCode.BTC), format2) : format2;
    }

    public final String format(BitcoinDisplayUnits bitcoinDisplayUnits, Money money, boolean z, boolean z2) {
        bitcoinDisplayUnits.getClass();
        money.getClass();
        if (bitcoinDisplayUnits == BitcoinDisplayUnits.BITCOIN) {
            return this.moneyFormatterFactory.create(new MoneyFormatterConfig(NumberFormat.Full.INSTANCE, z ? CurrencyRepresentationOption.CODE : CurrencyRepresentationOption.NONE, new DenominationOption.DollarsAndCents(!z2), SignOption.STANDARD, ZeroBiasOption.NONE)).format(money);
        }
        return (z && ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled()) ? Moneys.symbol(CurrencyCode.BTC).concat(formatInBitcoinBaseUnit(money, false)) : z ? formatInBitcoinBaseUnit(money, true) : formatInBitcoinBaseUnit(money, false);
    }

    public final String formatInBitcoinBaseUnit(Money money, boolean z) {
        long abs = Math.abs(Moneys.amount(money));
        String format2 = RealBitcoinFormatterKt.SATS_FORMAT_DEFAULT.format(abs);
        format2.getClass();
        if (!z) {
            return format2;
        }
        Long valueOf = Long.valueOf(abs);
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("formattedAmount", format2);
        arrayMap.put("amount", valueOf);
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.bitcoin_formatter_sat)).format(arrayMap);
        format3.getClass();
        return format3;
    }
}
