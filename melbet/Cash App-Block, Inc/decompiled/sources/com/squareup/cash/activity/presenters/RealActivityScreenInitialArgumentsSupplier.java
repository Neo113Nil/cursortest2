package com.squareup.cash.activity.presenters;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import papa.PapaEvent;

/* loaded from: classes7.dex */
public final class RealActivityScreenInitialArgumentsSupplier {
    public final BufferedChannel _initialSearchQueries;
    public final ChannelAsFlow initialSearchQueries;

    public RealActivityScreenInitialArgumentsSupplier() {
        BufferedChannel Channel$default = PapaEvent.Channel$default(0, BufferOverflow.DROP_OLDEST, null, 5);
        this._initialSearchQueries = Channel$default;
        this.initialSearchQueries = FlowKt.receiveAsFlow(Channel$default);
    }
}
