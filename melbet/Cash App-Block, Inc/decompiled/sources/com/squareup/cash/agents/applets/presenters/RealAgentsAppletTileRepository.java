package com.squareup.cash.agents.applets.presenters;

import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashAgentsMobile;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;

/* loaded from: classes5.dex */
public final class RealAgentsAppletTileRepository {
    public final DerivedStateFlow agentsAppletTileViewModel;
    public final String appletSubtitle;
    public final String appletTitle;
    public final DerivedStateFlow availabilityState;
    public final String noActivityText;

    public RealAgentsAppletTileRepository(FeatureFlagManager featureFlagManager, RealFamilyAccountsManager realFamilyAccountsManager, RealAgentsRepository realAgentsRepository, AndroidStringManager androidStringManager) {
        this.appletTitle = androidStringManager.get(R.string.agents_applet_title);
        this.appletSubtitle = androidStringManager.get(R.string.agents_applet_subtitle);
        this.noActivityText = androidStringManager.get(R.string.agents_applet_no_activity);
        this.availabilityState = StateFlowKt.combineState(Trace.valuesState(featureFlagManager, AmplitudeExperiments$CashAgentsMobile.INSTANCE), realFamilyAccountsManager.isSponsored(), new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 12));
        this.agentsAppletTileViewModel = StateFlowKt.mapState(realAgentsRepository.state, new ContextKt$$ExternalSyntheticLambda1(this, 13));
    }

    public final DerivedStateFlow getAvailabilityState() {
        return this.availabilityState;
    }
}
