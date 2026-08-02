package com.squareup.cash.paymentpad.presenters;

import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ForceGlitterP2p;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.InstrumentationTestConfig$NotATest;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class RealPaymentTabSettings {
    public final ReadonlyStateFlow _paymentPadThemeFlow;
    public final RealBleManager bleManager;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;

    public RealPaymentTabSettings(FeatureFlagManager featureFlagManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealBleManager realBleManager, InstrumentationTestConfig$NotATest instrumentationTestConfig$NotATest, KeyValue keyValue, CoroutineScope coroutineScope) {
        this.featureFlagManager = featureFlagManager;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.bleManager = realBleManager;
        LaunchDarklyFeatureFlags$ForceGlitterP2p launchDarklyFeatureFlags$ForceGlitterP2p = LaunchDarklyFeatureFlags$ForceGlitterP2p.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this._paymentPadThemeFlow = FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realFeatureFlagManager.peekValues(launchDarklyFeatureFlags$ForceGlitterP2p), keyValue.observe(), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 16), 0), coroutineScope, SharingStarted.Companion.Eagerly, ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) realFeatureFlagManager.currentExperimentValue(launchDarklyFeatureFlags$ForceGlitterP2p, false)).enabled() ? PaymentPadTheme.GLITTER : PaymentPadTheme.valueOf((String) keyValue.blockingGet()));
    }
}
