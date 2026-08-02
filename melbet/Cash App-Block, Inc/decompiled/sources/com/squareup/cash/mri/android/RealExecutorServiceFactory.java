package com.squareup.cash.mri.android;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealExecutorServiceFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealExecutorServiceFactory();
        }
    }
}
