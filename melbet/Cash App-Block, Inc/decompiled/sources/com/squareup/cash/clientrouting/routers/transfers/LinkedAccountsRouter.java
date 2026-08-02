package com.squareup.cash.clientrouting.routers.transfers;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Unit;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final class LinkedAccountsRouter {
    public final FlowStarter flowStarter;
    public final Navigator navigator;

    public LinkedAccountsRouter(FlowStarter flowStarter, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.navigator = navigator;
    }

    public final Unit route(ClientRoute.ViewSetDefaultInstrument viewSetDefaultInstrument) {
        this.navigator.goTo(new SetDefaultInstrumentScreen(FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.CLIENT_SCENARIO, new MoneyTabScreen(null), null, ClientScenario.TRANSFER_FUNDS, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), viewSetDefaultInstrument.instrumenttoken));
        return Unit.INSTANCE;
    }
}
