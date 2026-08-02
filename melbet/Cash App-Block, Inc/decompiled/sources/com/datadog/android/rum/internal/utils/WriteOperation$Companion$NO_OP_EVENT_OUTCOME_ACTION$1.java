package com.datadog.android.rum.internal.utils;

import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 extends Lambda implements Function1 {
    public static final WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 INSTANCE = new WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((AdvancedRumMonitor) obj).getClass();
        return Unit.INSTANCE;
    }
}
