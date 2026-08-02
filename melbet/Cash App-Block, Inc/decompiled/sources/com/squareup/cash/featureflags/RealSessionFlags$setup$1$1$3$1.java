package com.squareup.cash.featureflags;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class RealSessionFlags$setup$1$1$3$1 implements FlowCollector {
    public static final RealSessionFlags$setup$1$1$3$1 INSTANCE = new RealSessionFlags$setup$1$1$3$1();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
