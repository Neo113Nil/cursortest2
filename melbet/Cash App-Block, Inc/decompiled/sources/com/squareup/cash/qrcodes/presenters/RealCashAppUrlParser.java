package com.squareup.cash.qrcodes.presenters;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes7.dex */
public final class RealCashAppUrlParser {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCashAppUrlParser();
        }
    }
}
