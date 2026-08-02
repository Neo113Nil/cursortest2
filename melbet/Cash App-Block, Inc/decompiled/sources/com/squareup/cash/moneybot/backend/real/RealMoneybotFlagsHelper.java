package com.squareup.cash.moneybot.backend.real;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotActivityListLiveRows;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotAutomationsHub;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotCanvasBackground;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotHomeWidgets;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotImageAttachments;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotPinMessageAsWidget;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotSingleResponseQuickActionBar;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotSlashCommands;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneybotLoadingDelayMilliseconds;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneybotShowDebugOptions;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealMoneybotFlagsHelper implements MoneybotFlagsHelper {
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final RealSessionFlags sessionFlags;

    public RealMoneybotFlagsHelper(FeatureFlagManager featureFlagManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealSessionFlags realSessionFlags) {
        this.featureFlagManager = featureFlagManager;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.sessionFlags = realSessionFlags;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean activityListLiveRowsEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotActivityListLiveRows.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean automationsHubEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotAutomationsHub.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean canvasBackgroundEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotCanvasBackground.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean enableMessagePinning() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotPinMessageAsWidget.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final long loadingDelayMs() {
        return ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneybotLoadingDelayMilliseconds.INSTANCE)).value;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final Flow moneybotEnabled() {
        return new RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1(new FinishSetupTileBadgeCounter(10, this.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.MONEYBOT_VISIBILITY}), this, 0);
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final Flow moneybotHomeEnabled() {
        return new RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1(new FinishSetupTileBadgeCounter(10, this.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.MONEYBOT_VISIBILITY}), this, 1);
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean moneybotHomeWidgetsEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotHomeWidgets.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean showDebugOptions() {
        return ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneybotShowDebugOptions.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean showImageAttachmentButton() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotImageAttachments.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean singleResponseQuickActionBarEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MoneybotSingleResponseQuickActionBar.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean slashCommandsEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MoneybotSlashCommands.INSTANCE)).enabled();
    }
}
