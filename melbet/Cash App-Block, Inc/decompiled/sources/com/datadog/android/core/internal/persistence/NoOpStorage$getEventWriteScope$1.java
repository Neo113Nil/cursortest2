package com.datadog.android.core.internal.persistence;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class NoOpStorage$getEventWriteScope$1 extends Lambda implements Function1 {
    public static final NoOpStorage$getEventWriteScope$1 INSTANCE = new NoOpStorage$getEventWriteScope$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Function1) obj).getClass();
        return Unit.INSTANCE;
    }
}
