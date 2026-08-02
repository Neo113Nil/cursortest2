package com.squareup.cash.shared.ui;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes8.dex */
public final class SharedUiVariables {
    public volatile boolean hasSentLocalNavigationIconCDF;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new SharedUiVariables();
        }
    }
}
