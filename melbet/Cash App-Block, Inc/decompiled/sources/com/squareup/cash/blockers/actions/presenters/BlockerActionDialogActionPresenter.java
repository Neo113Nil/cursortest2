package com.squareup.cash.blockers.actions.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewModel;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.BlockerAction;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class BlockerActionDialogActionPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.BlockerActionDialogActionScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final MultiBlockerFacilitator$Resolver blockerResolver;
    public final BetterNavigator.ScreenNavigator navigator;
    public final CoroutineScope scope;

    public BlockerActionDialogActionPresenter(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.BlockerActionDialogActionScreen blockerActionDialogActionScreen, Analytics analytics, BlockerFlowListener blockerFlowListener, RealMultiBlockerFacilitator realMultiBlockerFacilitator, CoroutineScope coroutineScope) {
        blockerActionDialogActionScreen.getClass();
        this.navigator = screenNavigator;
        this.args = blockerActionDialogActionScreen;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.scope = coroutineScope;
        this.blockerResolver = realMultiBlockerFacilitator.getResolver(screenNavigator, blockerActionDialogActionScreen);
    }

    public static final void access$logCancelAction(BlockerActionDialogActionPresenter blockerActionDialogActionPresenter, String str) {
        Analytics analytics = blockerActionDialogActionPresenter.analytics;
        BlockerAction blockerAction = BlockerAction.CANCEL_DIALOG;
        BlockersScreens.BlockerActionDialogActionScreen blockerActionDialogActionScreen = blockerActionDialogActionPresenter.args;
        BlockersData blockersData = blockerActionDialogActionScreen.blockersData;
        String str2 = blockersData.flowToken;
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        String str3 = blockersData.requestContext.blocker_descriptor_id;
        String nextBlockerType = blockersData.getNextBlockerType();
        BlockersData.AnalyticsData analyticsData = blockerActionDialogActionScreen.blockersData.analyticsData;
        BlockerFlowAnalyticsHelperKt.trackTapBlockerAction(analytics, blockerAction, str2, clientScenario, flow$Type, str3, nextBlockerType, null, str, analyticsData != null ? analyticsData.referrerFlowToken : null, analyticsData != null ? analyticsData.referrerFlowType : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1402041967);
        Updater.LaunchedEffect(gapComposer, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) (0 == true ? 1 : 0), (Object) this, 25));
        BlockerAction.DialogAction dialogAction = this.args.dialogAction;
        String str = dialogAction.title;
        str.getClass();
        String str2 = dialogAction.message;
        str2.getClass();
        BlockerAction.DialogAction.Button button = dialogAction.primary_button;
        button.getClass();
        String str3 = button.text;
        str3.getClass();
        BlockerAction.DialogAction.Button button2 = dialogAction.primary_button;
        button2.getClass();
        BlockerAction.DialogAction.Button.Style style = button2.style;
        BlockerAction.DialogAction.Button button3 = dialogAction.secondary_button;
        BlockerActionDialogActionViewModel blockerActionDialogActionViewModel = new BlockerActionDialogActionViewModel(str, str2, str3, style, button3 != null ? button3.text : null, button3 != null ? button3.style : null);
        gapComposer.end(false);
        return blockerActionDialogActionViewModel;
    }
}
