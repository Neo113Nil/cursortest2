package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewEvent;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class CardActivationQrScannerPresenter$models$1$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LocalPosCheckInPresenter this$0;

    public CardActivationQrScannerPresenter$models$1$1$2(LocalPosCheckInPresenter localPosCheckInPresenter) {
        this.this$0 = localPosCheckInPresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalPosCheckInPresenter localPosCheckInPresenter = this.this$0;
        switch (i) {
            case 0:
                ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(new FailureMessageBlockerScreen(((BlockersScreens.CardActivationQrScreen) localPosCheckInPresenter.cameraPermissions).blockersData, ((AndroidStringManager) localPosCheckInPresenter.stringManager).get(R.string.blockers_card_activation_permissions), null, 4));
                return Unit.INSTANCE;
            default:
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                BlockersScreens.CardActivationQrScreen cardActivationQrScreen = (BlockersScreens.CardActivationQrScreen) localPosCheckInPresenter.cameraPermissions;
                CardActivationQrViewEvent cardActivationQrViewEvent = (CardActivationQrViewEvent) obj;
                if (cardActivationQrViewEvent instanceof CardActivationQrViewEvent.Exit) {
                    ((BlockerFlowListener) localPosCheckInPresenter.store).onFlowCancelled(cardActivationQrScreen.blockersData);
                    screenNavigator.goTo(cardActivationQrScreen.blockersData.exitScreen);
                } else if (cardActivationQrViewEvent instanceof CardActivationQrViewEvent.MissingQr) {
                    BlockersData blockersData = cardActivationQrScreen.blockersData;
                    screenNavigator.goTo(new BlockersScreens.CardActivationScreen(BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData.requestContext, null, null, null, null, null, null, null, null, ScenarioInitiatorType.CARD_TAB_ACTIVATION_FLOW_SCANNER, null, null, null, 7679), null, null, -1, 57343), BlockersScreens.CardActivationScreen.CardActivationData.SkipToCvv.INSTANCE));
                } else {
                    if (!(cardActivationQrViewEvent instanceof CardActivationQrViewEvent.Scanned)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersData blockersData2 = cardActivationQrScreen.blockersData;
                    screenNavigator.goTo(new BlockersScreens.CardActivationScreen(BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData2.requestContext, null, null, null, null, null, null, null, null, ScenarioInitiatorType.CARD_TAB_ACTIVATION_FLOW_SCANNER, null, null, null, 7679), null, null, -1, 57343), new BlockersScreens.CardActivationScreen.CardActivationData.WithCode(((CardActivationQrViewEvent.Scanned) cardActivationQrViewEvent).code)));
                }
                return Unit.INSTANCE;
        }
    }

    public CardActivationQrScannerPresenter$models$1$1$2(CoroutineScope coroutineScope, LocalPosCheckInPresenter localPosCheckInPresenter) {
        this.this$0 = localPosCheckInPresenter;
    }
}
