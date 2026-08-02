package com.squareup.cash.card.onboarding;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DisableFilament;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class RealStyledCardPresenter implements Flow {
    public final AppConfigManager appConfigManager;
    public final CardCustomizationData cardData;
    public final RealFilamentSupportProvider filamentSupportProvider;
    public final CoroutineContext ioDispatcher;
    public final boolean isFilamentDisabled;
    public final RealProfileManager profileManager;

    public RealStyledCardPresenter(AppConfigManager appConfigManager, RealProfileManager realProfileManager, RealFilamentSupportProvider realFilamentSupportProvider, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext, CardCustomizationData cardCustomizationData) {
        cardCustomizationData.getClass();
        this.appConfigManager = appConfigManager;
        this.profileManager = realProfileManager;
        this.filamentSupportProvider = realFilamentSupportProvider;
        this.ioDispatcher = coroutineContext;
        this.cardData = cardCustomizationData;
        this.isFilamentDisabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$DisableFilament.INSTANCE)).enabled();
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) this.appConfigManager).stampConfig();
        String str = this.cardData.formatted_cashtag;
        Object collect = FlowKt.take(FlowKt.combine(stampConfig, str != null ? new AppLockMonitor$special$$inlined$map$2(str, 19) : new CardModelView$cardHeat$$inlined$map$1(this.profileManager.publicProfile(), 20), FlowKt.flowOn(new AppLockMonitor$special$$inlined$map$2(Boolean.valueOf(this.filamentSupportProvider.isDeviceSupported()), 19), this.ioDispatcher), new RealStyledCardPresenter$model$1(this, null, 0)), 1).collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
