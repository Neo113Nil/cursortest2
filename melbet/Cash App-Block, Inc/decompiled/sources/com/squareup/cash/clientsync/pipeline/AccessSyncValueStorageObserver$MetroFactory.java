package com.squareup.cash.clientsync.pipeline;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class AccessSyncValueStorageObserver$MetroFactory implements Factory {
    public static final AccessSyncValueStorageObserver$MetroFactory INSTANCE = new AccessSyncValueStorageObserver$MetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AnalyticsObserver();
    }
}
