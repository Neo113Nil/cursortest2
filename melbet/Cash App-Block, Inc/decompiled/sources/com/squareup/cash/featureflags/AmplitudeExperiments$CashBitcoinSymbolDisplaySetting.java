package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$CashBitcoinSymbolDisplaySetting extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$CashBitcoinSymbolDisplaySetting INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$CashBitcoinSymbolDisplaySetting("cash-bitcoin-symbol-display-setting", 2);
    }
}
