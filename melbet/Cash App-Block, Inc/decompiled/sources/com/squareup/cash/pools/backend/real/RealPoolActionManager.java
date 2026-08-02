package com.squareup.cash.pools.backend.real;

import com.plaid.internal.EnumC0170g;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealPoolActionManager {
    public final SharedFlowImpl poolActions = FlowKt.MutableSharedFlow$default(0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 5);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealPoolActionManager();
        }
    }
}
