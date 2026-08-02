package com.datadog.android.core.internal.time;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class KronosTimeProvider$safeGetCurrentTimeMs$2$1 extends Lambda implements Function0 {
    public static final KronosTimeProvider$safeGetCurrentTimeMs$2$1 INSTANCE = new KronosTimeProvider$safeGetCurrentTimeMs$2$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "KronosClock.getCurrentTimeMs failed with an exception";
    }
}
