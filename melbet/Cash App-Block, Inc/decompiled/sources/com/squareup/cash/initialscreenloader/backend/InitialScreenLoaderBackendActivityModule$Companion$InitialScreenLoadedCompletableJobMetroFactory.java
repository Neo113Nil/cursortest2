package com.squareup.cash.initialscreenloader.backend;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class InitialScreenLoaderBackendActivityModule$Companion$InitialScreenLoadedCompletableJobMetroFactory implements Factory {
    public static final InitialScreenLoaderBackendActivityModule$Companion$InitialScreenLoadedCompletableJobMetroFactory INSTANCE = new InitialScreenLoaderBackendActivityModule$Companion$InitialScreenLoadedCompletableJobMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return JobKt.Job$default();
    }
}
