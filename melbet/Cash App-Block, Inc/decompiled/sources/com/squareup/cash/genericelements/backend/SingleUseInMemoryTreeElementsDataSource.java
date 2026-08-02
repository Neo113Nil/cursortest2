package com.squareup.cash.genericelements.backend;

import dev.zacsweers.metro.internal.Factory;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class SingleUseInMemoryTreeElementsDataSource {
    public final ConcurrentHashMap memCache = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new SingleUseInMemoryTreeElementsDataSource();
        }
    }
}
