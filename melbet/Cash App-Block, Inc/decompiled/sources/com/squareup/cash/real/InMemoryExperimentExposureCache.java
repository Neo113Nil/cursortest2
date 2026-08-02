package com.squareup.cash.real;

import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class InMemoryExperimentExposureCache {
    public final LinkedHashMap exposuresMap = new LinkedHashMap();

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new InMemoryExperimentExposureCache();
        }
    }
}
