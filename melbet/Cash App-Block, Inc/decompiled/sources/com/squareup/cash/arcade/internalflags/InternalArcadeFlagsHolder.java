package com.squareup.cash.arcade.internalflags;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class InternalArcadeFlagsHolder {
    public static final InternalArcadeFlagsHolder INSTANCE = new InternalArcadeFlagsHolder();
    public static final ReadonlyStateFlow immutableFlags;
    public static final StateFlowImpl mutableFlags;

    static {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(InternalArcadeFlags.Default);
        mutableFlags = MutableStateFlow;
        immutableFlags = FlowKt.asStateFlow(MutableStateFlow);
    }
}
