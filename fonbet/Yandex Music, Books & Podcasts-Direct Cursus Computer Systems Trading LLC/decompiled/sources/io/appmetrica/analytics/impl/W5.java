package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class W5 extends uif implements Function1 {
    public static final W5 a = new W5();

    public W5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
