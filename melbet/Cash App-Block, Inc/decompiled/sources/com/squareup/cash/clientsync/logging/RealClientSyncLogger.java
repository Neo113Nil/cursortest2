package com.squareup.cash.clientsync.logging;

import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealClientSyncLogger {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealClientSyncLogger();
        }
    }

    public static void debug$default(RealClientSyncLogger realClientSyncLogger, String str) {
        realClientSyncLogger.getClass();
        Timber.Forest.d(str, new Object[0], null);
    }
}
