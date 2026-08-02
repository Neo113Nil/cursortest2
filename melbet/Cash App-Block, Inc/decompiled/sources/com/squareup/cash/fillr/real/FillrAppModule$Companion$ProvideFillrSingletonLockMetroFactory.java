package com.squareup.cash.fillr.real;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class FillrAppModule$Companion$ProvideFillrSingletonLockMetroFactory implements Factory {
    public static final FillrAppModule$Companion$ProvideFillrSingletonLockMetroFactory INSTANCE = new FillrAppModule$Companion$ProvideFillrSingletonLockMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new MutexImpl();
    }
}
