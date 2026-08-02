package com.squareup.cash.blockers.navigation;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerFullScreen;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$AndroidPlasmaFlowLoadingNewErrorMessaging;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.util.coroutines.TickerKt;

/* loaded from: classes6.dex */
public final class FlowNavigationHelper {
    public final BlockerFlowListener blockerFlowListener;
    public final BlockersDataNavigator blockersDataNavigator;
    public final FeatureFlagManager featureFlagManager;
    public final AndroidStringManager stringManager;

    public FlowNavigationHelper(BlockersDataNavigator blockersDataNavigator, BlockerFlowListener blockerFlowListener, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager) {
        this.blockersDataNavigator = blockersDataNavigator;
        this.blockerFlowListener = blockerFlowListener;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
    }

    public final Screen getFlowFailureScreen(Screen screen, ApiResult.Failure failure, BlockersData blockersData) {
        screen.getClass();
        blockersData.getClass();
        ScenarioInitiatorType scenarioInitiatorType = blockersData.requestContext.scenario_initiator_type;
        ScenarioInitiatorType scenarioInitiatorType2 = ScenarioInitiatorType.ANDROID_INTENT;
        AndroidStringManager androidStringManager = this.stringManager;
        if (scenarioInitiatorType != scenarioInitiatorType2) {
            return ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$AndroidPlasmaFlowLoadingNewErrorMessaging.INSTANCE)).enabled() ? TickerKt.toMessageScreen$default(failure, screen, androidStringManager) : new BlockersScreens.Error(blockersData, androidStringManager.get(R.string.generic_network_error), null);
        }
        ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, failure, null);
        return new FailureMessageBlockerFullScreen(blockersData, errorMessaging.title, errorMessaging.message, true);
    }

    public final Screen getFlowSuccessScreen(Screen screen, ApiResult.Success success, BlockersData blockersData, boolean z) {
        screen.getClass();
        blockersData.getClass();
        GetFlowResponse getFlowResponse = (GetFlowResponse) success.response;
        ResponseContext responseContext = getFlowResponse.response_context;
        responseContext.getClass();
        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
        ClientScenario clientScenario = getFlowResponse.client_scenario;
        String str = getFlowResponse.token;
        str.getClass();
        BlockersData copy$default = BlockersData.copy$default(updateFromResponseContext, null, str, null, null, null, null, null, null, false, false, null, null, null, false, clientScenario, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65539, 65535);
        if (z) {
            this.blockerFlowListener.onFlowStarted(blockersData, str, updateFromResponseContext.scenarioPlan, getFlowResponse.client_scenario);
        }
        return this.blockersDataNavigator.getNext(screen, copy$default);
    }
}
