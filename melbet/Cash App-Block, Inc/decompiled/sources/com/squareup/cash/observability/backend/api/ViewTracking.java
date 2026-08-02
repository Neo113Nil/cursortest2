package com.squareup.cash.observability.backend.api;

import com.squareup.cash.observability.backend.real.RealDatadogViewTracking;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public interface ViewTracking {
    static void viewEnded$default(ViewTracking viewTracking) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        ((RealDatadogViewTracking) viewTracking).viewEnded(emptyMap);
    }
}
