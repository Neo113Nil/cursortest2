package com.squareup.cash.moneybot.backend.api.managers;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class MoneybotDebugSettingsManager {
    public final StateFlowImpl _showRawMarkdown;
    public final ReadonlyStateFlow showRawMarkdown;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new MoneybotDebugSettingsManager();
        }
    }

    public MoneybotDebugSettingsManager() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._showRawMarkdown = MutableStateFlow;
        this.showRawMarkdown = FlowKt.asStateFlow(MutableStateFlow);
    }
}
