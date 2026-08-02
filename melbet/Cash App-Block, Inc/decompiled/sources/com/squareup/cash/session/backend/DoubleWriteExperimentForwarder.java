package com.squareup.cash.session.backend;

import dev.zacsweers.metro.internal.Factory;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class DoubleWriteExperimentForwarder {
    public final AtomicReference currentReader = new AtomicReference(null);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new DoubleWriteExperimentForwarder();
        }
    }
}
