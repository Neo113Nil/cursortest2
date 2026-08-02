package com.squareup.cash.graphics.swampgl;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes6.dex */
public final class RealGraphicsSupportProvider {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealGraphicsSupportProvider();
        }
    }
}
