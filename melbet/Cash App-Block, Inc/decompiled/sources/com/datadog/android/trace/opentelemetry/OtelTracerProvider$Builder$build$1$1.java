package com.datadog.android.trace.opentelemetry;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class OtelTracerProvider$Builder$build$1$1 extends Lambda implements Function1 {
    public static final OtelTracerProvider$Builder$build$1$1 INSTANCE = new OtelTracerProvider$Builder$build$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        map.put("is_opentelemetry_enabled", Boolean.TRUE);
        map.put("opentelemetry_api_version", "1.40.0");
        return Unit.INSTANCE;
    }
}
