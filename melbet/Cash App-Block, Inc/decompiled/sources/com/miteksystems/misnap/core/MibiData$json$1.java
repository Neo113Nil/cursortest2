package com.miteksystems.misnap.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final class MibiData$json$1 extends Lambda implements Function1 {
    public static final MibiData$json$1 INSTANCE = new MibiData$json$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder jsonBuilder = (JsonBuilder) obj;
        jsonBuilder.getClass();
        jsonBuilder.ignoreUnknownKeys = true;
        jsonBuilder.explicitNulls = false;
        jsonBuilder.encodeDefaults = true;
        return Unit.INSTANCE;
    }
}
