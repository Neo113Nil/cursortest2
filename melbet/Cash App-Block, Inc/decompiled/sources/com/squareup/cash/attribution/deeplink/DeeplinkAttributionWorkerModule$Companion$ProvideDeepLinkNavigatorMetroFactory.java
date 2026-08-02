package com.squareup.cash.attribution.deeplink;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class DeeplinkAttributionWorkerModule$Companion$ProvideDeepLinkNavigatorMetroFactory implements Factory {
    public static final DeeplinkAttributionWorkerModule$Companion$ProvideDeepLinkNavigatorMetroFactory INSTANCE = new DeeplinkAttributionWorkerModule$Companion$ProvideDeepLinkNavigatorMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1();
    }
}
