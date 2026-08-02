package com.squareup.cash.appforeground;

import androidx.lifecycle.ProcessLifecycleOwner;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class AppForegroundModule$Companion$RealAppForegroundStateProviderMetroFactory implements Factory {
    public static final AppForegroundModule$Companion$RealAppForegroundStateProviderMetroFactory INSTANCE = new AppForegroundModule$Companion$RealAppForegroundStateProviderMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RealAppForegroundStateProvider(ProcessLifecycleOwner.newInstance);
    }
}
