package com.squareup.cash.shopping.sup.backend;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes7.dex */
public final class SingleWebSessionInMemoryManager {
    public SUPWebSession session;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new SingleWebSessionInMemoryManager();
        }
    }
}
