package com.squareup.cash.keystore;

import dev.zacsweers.metro.internal.Factory;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class RealKeyStoreDelegator$MetroFactory implements Factory {
    public static final RealKeyStoreDelegator$MetroFactory INSTANCE = new RealKeyStoreDelegator$MetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ConnectionPool(17, false);
    }
}
