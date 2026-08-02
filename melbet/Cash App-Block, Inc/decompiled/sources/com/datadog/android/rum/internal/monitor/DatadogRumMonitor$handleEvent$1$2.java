package com.datadog.android.rum.internal.monitor;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogRumMonitor$handleEvent$1$2 extends Lambda implements Function0 {
    public static final DatadogRumMonitor$handleEvent$1$2 INSTANCE = new DatadogRumMonitor$handleEvent$1$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "Cannot write JVM crash, because write context is not available.";
    }
}
