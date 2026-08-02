package com.squareup.cash.attribution;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class DeferredDeepLinkStateModule$Companion$DeferredDeepLinkStateMetroFactory implements Factory {
    public static final DeferredDeepLinkStateModule$Companion$DeferredDeepLinkStateMetroFactory INSTANCE = new DeferredDeepLinkStateModule$Companion$DeferredDeepLinkStateMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return FlowKt.MutableSharedFlow$default(1, 50, null, 4);
    }
}
