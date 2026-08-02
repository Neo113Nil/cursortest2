package com.squareup.cash.blockers.treehouse.views;

import android.content.Context;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.blockers.treehouse.viewmodels.TreehouseBlockerEvent;
import com.squareup.cash.blockers.treehouse.viewmodels.TreehouseBlockerViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;
import com.squareup.cash.treehouse.flows.RawFlowService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TreehouseBlockerUi implements Ui {
    public RealRawFlowService rawFlowService;
    public Ui.EventReceiver receiver;
    public final CashTreehouseLayout view;

    /* loaded from: classes5.dex */
    public final class RealRawFlowService implements RawFlowService {
        public BlockersData blockersData;
        public Ui.EventReceiver receiver;

        @Override // com.squareup.cash.treehouse.flows.RawFlowService
        public final Object advance(ByteString byteString, boolean z, Continuation continuation) {
            Ui.EventReceiver eventReceiver = this.receiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(new TreehouseBlockerEvent.AdvanceToBlocker((BlockerDescriptor) BlockerDescriptor.ADAPTER.decode(byteString), z));
            }
            return Unit.INSTANCE;
        }

        @Override // com.squareup.cash.treehouse.flows.RawFlowService
        public final Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
            ResponseContext responseContext = (ResponseContext) ResponseContext.ADAPTER.decode(byteString2);
            BlockersData blockersData = this.blockersData;
            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
            this.blockersData = blockersData.updateFromResponseContext(responseContext, false);
            return Unit.INSTANCE;
        }

        @Override // com.squareup.cash.treehouse.flows.RawFlowService
        public final Object dismiss(Continuation continuation) {
            Ui.EventReceiver eventReceiver = this.receiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(TreehouseBlockerEvent.Dismiss.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        @Override // com.squareup.cash.treehouse.flows.RawFlowService
        public final Object produceRequestContext(List list, Continuation continuation) {
            RequestContext requestContext = this.blockersData.requestContext;
            if (!list.isEmpty()) {
                requestContext = RequestContext.copy$default(requestContext, null, null, null, null, list, null, null, null, null, null, null, null, 8175);
            }
            return requestContext.encodeByteString();
        }

        @Override // com.squareup.cash.treehouse.flows.RawFlowService
        public final Object retreat(ByteString byteString, Continuation continuation) {
            Ui.EventReceiver eventReceiver = this.receiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(TreehouseBlockerEvent.Retreat.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public TreehouseBlockerUi(TreehouseFlows treehouseFlows, CashTreehouseLayout.Factory factory, Context context, OnBackPressedDispatcher onBackPressedDispatcher) {
        context.getClass();
        this.view = CashTreehouseLayout.Factory.create$default(factory, context, treehouseFlows.treehouseApp, onBackPressedDispatcher);
    }

    public final CashTreehouseLayout getView() {
        return this.view;
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.receiver = eventReceiver;
        RealRawFlowService realRawFlowService = this.rawFlowService;
        if (realRawFlowService != null) {
            realRawFlowService.receiver = eventReceiver;
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setModel(Object obj) {
        TreehouseBlockerViewModel treehouseBlockerViewModel = (TreehouseBlockerViewModel) obj;
        treehouseBlockerViewModel.getClass();
        BlockersData blockersData = treehouseBlockerViewModel.blockersData;
        blockersData.getClass();
        RealRawFlowService realRawFlowService = new RealRawFlowService();
        realRawFlowService.blockersData = blockersData;
        this.rawFlowService = realRawFlowService;
        Ui.EventReceiver eventReceiver = this.receiver;
        if (eventReceiver != null) {
            realRawFlowService.receiver = eventReceiver;
        }
        BlockerScreenSpec blockerScreenSpec = treehouseBlockerViewModel.spec;
        BetterNavigator.ScreenNavigator screenNavigator = treehouseBlockerViewModel.navigator;
        CashTreehouseLayout cashTreehouseLayout = this.view;
        cashTreehouseLayout.setBlockerScreenContent(blockerScreenSpec, screenNavigator, realRawFlowService);
        CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.BoundWhenReady, null, 2);
    }
}
