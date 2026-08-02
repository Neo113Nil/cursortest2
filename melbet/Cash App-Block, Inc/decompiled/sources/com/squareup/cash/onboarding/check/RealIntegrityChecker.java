package com.squareup.cash.onboarding.check;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealIntegrityChecker {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealIntegrityChecker();
        }
    }
}
