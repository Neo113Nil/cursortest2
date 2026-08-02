package com.squareup.cash.bitcoin.presenters.applet.disabled;

import com.fillr.e0;
import com.fillr.n;
import com.google.zxing.Result;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPlugin;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinHomePerformanceTracking;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFBitcoin;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.workflow1.internal.SubtreeManager;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class BitcoinDisabledWidgetPlugin extends BitcoinWidgetPlugin {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final Object featureFlagManager;
    public final BitcoinHomeWidgetPresenter presenter;

    public /* synthetic */ BitcoinDisabledWidgetPlugin(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, BitcoinHomeWidgetPresenter bitcoinHomeWidgetPresenter, Object obj, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.presenter = bitcoinHomeWidgetPresenter;
        this.featureFlagManager = obj;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final Object checkAdditionalIsAvailable(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.featureFlagManager;
        switch (i) {
            case 0:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFBitcoin.INSTANCE)).enabled());
            case 1:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFBitcoin.INSTANCE)).enabled());
            case 2:
                return Boolean.valueOf(((RealDependentCustomerTokenRepository) obj).getCustomerToken() != null);
            default:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).currentValue(AmplitudeExperiments$FpBitcoinHomePerformanceTracking.INSTANCE)).enabled());
        }
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPlugin
    public final BitcoinHomeWidgetPresenter getPresenter() {
        int i = this.$r8$classId;
        BitcoinHomeWidgetPresenter bitcoinHomeWidgetPresenter = this.presenter;
        switch (i) {
            case 0:
                return (Result) bitcoinHomeWidgetPresenter;
            case 1:
                return (SubtreeManager) bitcoinHomeWidgetPresenter;
            case 2:
                return (n) bitcoinHomeWidgetPresenter;
            default:
                return (e0) bitcoinHomeWidgetPresenter;
        }
    }
}
