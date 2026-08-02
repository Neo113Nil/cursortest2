package com.squareup.cash.overrides;

import app.cash.broadway.navigation.ScreenOverrideRule;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DenylistBlockerRedirect;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.support.screens.SupportScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DenylistScreenOverrideRule implements ScreenOverrideRule {
    public final FeatureFlagManager featureFlagManager;

    public DenylistScreenOverrideRule(FeatureFlagManager featureFlagManager) {
        this.featureFlagManager = featureFlagManager;
    }

    @Override // app.cash.broadway.navigation.ScreenOverrideRule
    public final Screen maybeOverride(ScreenOverrideRule.State state, Screen screen) {
        Screen screen2 = state.currentFullScreen;
        screen.getClass();
        if (!((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$DenylistBlockerRedirect.INSTANCE)).enabled() || !(screen2 instanceof BlockersScreens) || (screen instanceof BlockersScreens) || (screen instanceof SupportScreens) || (screen instanceof InitialScreenPlaceholder)) {
            return null;
        }
        BlockersScreens blockersScreens = screen2 instanceof BlockersScreens ? (BlockersScreens) screen2 : null;
        BlockersData blockersData = blockersScreens != null ? blockersScreens.getBlockersData() : null;
        if (blockersData != null && blockersData.flow == BlockersData.Flow.ONBOARDING && Intrinsics.areEqual(blockersData.blockerId, "denylistedOnboardingBlocker")) {
            BlockersScreens blockersScreens2 = screen2 instanceof BlockersScreens ? (BlockersScreens) screen2 : null;
            BlockersData blockersData2 = blockersScreens2 != null ? blockersScreens2.getBlockersData() : null;
            if (blockersData2 != null) {
                return new BlockersScreens.WelcomeScreen(BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -17, 65535));
            }
        }
        return null;
    }
}
