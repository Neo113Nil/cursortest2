package com.squareup.cash.blockers.analytics;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractStartFlow;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlocker;
import com.squareup.cash.cdf.cashcard.CashCardActivateStart;
import com.squareup.cash.cdf.check.CheckDepositStart;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountViewStart;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UseStatusResultForJourneyOutcome;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealBlockerFlowAnalytics implements BlockerFlowListener, IoSetupTeardown {
    public final Analytics analytics;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final FeatureFlagManager featureFlagManager;
    public String flowToken;
    public BlockersData lastBlockersData;

    public RealBlockerFlowAnalytics(Analytics analytics, AppForegroundStateProvider appForegroundStateProvider, FeatureFlagManager featureFlagManager) {
        this.analytics = analytics;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.featureFlagManager = featureFlagManager;
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onBlockerPresented(BlockersData blockersData, String str, String str2, BlockerDescriptor blockerDescriptor) {
        blockerDescriptor.getClass();
        String str3 = blockersData.flowToken;
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        String str4 = analyticsData != null ? analyticsData.referrerFlowToken : null;
        BlockerFlowReferrerType blockerFlowReferrerType = analyticsData != null ? analyticsData.referrerFlowType : null;
        str3.getClass();
        this.analytics.track(new BlockerFlowInteractViewBlocker(str == null ? "" : str, str2 == null ? "" : str2, clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, str3, str4, blockerFlowReferrerType), null);
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCancelled(BlockersData blockersData) {
        blockersData.getClass();
        this.lastBlockersData = null;
        sanityCheckFlowToken(blockersData);
        this.flowToken = null;
        String nextBlockerType = Intrinsics.areEqual(blockersData.getNextBlockerId(), blockersData.requestContext.blocker_descriptor_id) ? blockersData.getNextBlockerType() : null;
        BlockerExitStatus blockerExitStatus = BlockerExitStatus.CANCELLED;
        List list = blockersData.flowPath;
        String str = blockersData.flowToken;
        Long l = blockersData.flowStartTime;
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        BlockerFlowAnalyticsHelperKt.logEndBlockerFlowEvent(this.analytics, nextBlockerType, blockerExitStatus, list, str, l, clientScenario, flow$Type, analyticsData != null ? analyticsData.referrerFlowToken : null, analyticsData != null ? analyticsData.referrerFlowType : null);
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCompleted(BlockersData blockersData) {
        StatusResult statusResult;
        StatusResult.Icon icon;
        boolean z;
        JourneyOutcome journeyOutcome;
        blockersData.getClass();
        this.lastBlockersData = null;
        sanityCheckFlowToken(blockersData);
        this.flowToken = null;
        JourneyOutcome journeyOutcome2 = blockersData.journeyContext.outcome;
        Analytics analytics = this.analytics;
        if (journeyOutcome2 == null && (statusResult = blockersData.statusResult) != null && (icon = statusResult.icon) != null) {
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UseStatusResultForJourneyOutcome.INSTANCE)).enabled()) {
                int ordinal = icon.ordinal();
                z = true;
                if (ordinal == 0 || ordinal == 1) {
                    journeyOutcome = JourneyOutcome.JOURNEY_OUTCOME_SUCCEEDED;
                    BlockerFlowAnalyticsHelperKt.logReceiveJourneyOutcome(analytics, blockersData.clientScenario, blockersData.flowType, blockersData.flowToken, blockersData.flowPath, blockersData.getNextBlockerType(), journeyOutcome, icon.toString(), z);
                }
            }
            z = false;
            journeyOutcome = null;
            BlockerFlowAnalyticsHelperKt.logReceiveJourneyOutcome(analytics, blockersData.clientScenario, blockersData.flowType, blockersData.flowToken, blockersData.flowPath, blockersData.getNextBlockerType(), journeyOutcome, icon.toString(), z);
        }
        String nextBlockerType = Intrinsics.areEqual(blockersData.getNextBlockerId(), blockersData.requestContext.blocker_descriptor_id) ? blockersData.getNextBlockerType() : null;
        BlockerExitStatus blockerExitStatus = BlockerExitStatus.FINISHED;
        List list = blockersData.flowPath;
        String str = blockersData.flowToken;
        Long l = blockersData.flowStartTime;
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        BlockerFlowAnalyticsHelperKt.logEndBlockerFlowEvent(analytics, nextBlockerType, blockerExitStatus, list, str, l, clientScenario, flow$Type, analyticsData != null ? analyticsData.referrerFlowToken : null, analyticsData != null ? analyticsData.referrerFlowType : null);
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowStarted(BlockersData blockersData, String str, ScenarioPlan scenarioPlan, ClientScenario clientScenario) {
        String str2;
        List<BlockerDescriptor> list;
        String str3;
        BlockersData.AnalyticsData.Source source;
        blockersData.getClass();
        str.getClass();
        if (Intrinsics.areEqual(this.flowToken, str)) {
            return;
        }
        this.flowToken = str;
        Flow$Type flow$Type = blockersData.flowType;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        String analyticsName = (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName();
        String str4 = analyticsData != null ? analyticsData.referrerFlowToken : null;
        BlockerFlowReferrerType blockerFlowReferrerType = analyticsData != null ? analyticsData.referrerFlowType : null;
        if (scenarioPlan == null || (list = scenarioPlan.blocker_descriptors) == null) {
            str2 = null;
        } else {
            String str5 = "";
            for (BlockerDescriptor blockerDescriptor : list) {
                if (!StringsKt.isBlank(str5) && (str3 = blockerDescriptor.id) != null) {
                    str5 = ((Object) str5) + "->" + str3;
                } else if (StringsKt.isBlank(str5)) {
                    String str6 = blockerDescriptor.id;
                    if (str6 == null) {
                        str6 = "";
                    }
                    str5 = ((Object) str5) + str6;
                }
            }
            str2 = str5;
        }
        BlockerFlowInteractStartFlow blockerFlowInteractStartFlow = new BlockerFlowInteractStartFlow(str2, clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, str, analyticsName, str4, blockerFlowReferrerType);
        Analytics analytics = this.analytics;
        analytics.track(blockerFlowInteractStartFlow, null);
        int i = clientScenario == null ? -1 : BlockerFlowAnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            analytics.track(new CashCardActivateStart(), null);
        } else if (i == 4) {
            analytics.track(new CheckDepositStart(analyticsName), null);
        } else {
            if (i != 5) {
                return;
            }
            analytics.track(new DirectDepositAccountViewStart(DirectDepositAccountViewStart.AppLocation.FORM_BLOCKER), null);
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onNavigation(Screen screen, Screen screen2, boolean z) {
        screen2.getClass();
        boolean z2 = screen2 instanceof BlockersScreens;
        if (z2 || (screen instanceof BlockersScreens)) {
            if (z2) {
                this.lastBlockersData = ((BlockersScreens) screen2).getBlockersData();
            }
            if (screen instanceof BlockersScreens) {
                boolean z3 = false;
                boolean z4 = z && ((screen2 instanceof Back) || !z2);
                boolean z5 = !z && ((BlockersScreens) screen).getBlockersData().exitScreen.getClass().equals(screen2.getClass());
                if (!z && (screen instanceof BlockersScreens.StatusResultScreen)) {
                    z3 = true;
                }
                BlockersScreens blockersScreens = (BlockersScreens) screen;
                boolean isEmpty = blockersScreens.getBlockersData().getNextBlockers().isEmpty();
                String str = this.flowToken;
                if (str == null || !str.equals(blockersScreens.getBlockersData().flowToken)) {
                    return;
                }
                if (z3 || z4 || z5) {
                    if (isEmpty && (z5 || z3)) {
                        onFlowCompleted(blockersScreens.getBlockersData());
                    } else {
                        onFlowCancelled(blockersScreens.getBlockersData());
                    }
                }
            }
        }
    }

    public final void sanityCheckFlowToken(BlockersData blockersData) {
        if (blockersData == null) {
            return;
        }
        String str = blockersData.flowToken;
        if (Intrinsics.areEqual(this.flowToken, str)) {
            return;
        }
        Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Flow token has been changed to ", str, " when completing blocker flow."), new Object[0]);
        this.flowToken = str;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 1), 1);
        return StateFlowKt.noOpTeardown;
    }
}
