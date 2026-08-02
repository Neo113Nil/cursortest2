package com.squareup.cash.offers.backend.real;

import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealOffersInflightStateManager {
    public final StateFlowImpl inflightOffers = FlowKt.MutableStateFlow(EmptySet.INSTANCE);

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealOffersInflightStateManager();
        }
    }

    public final void updateInflightState(String str, boolean z) {
        StateFlowImpl stateFlowImpl = this.inflightOffers;
        LinkedHashSet plus = z ? SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), str) : SetsKt___SetsKt.minus((Set) stateFlowImpl.getValue(), str);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, plus);
    }
}
