package com.squareup.cash.deposits.physical.backend.real.map;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealMapCameraStateManager {
    public final StateFlowImpl lastCameraState = FlowKt.MutableStateFlow(null);

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealMapCameraStateManager();
        }
    }
}
