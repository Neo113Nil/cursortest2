package io.appmetrica.analytics.impl;

import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Z5 extends Lambda implements tls {
    public static final Z5 a = new Z5();

    public Z5() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
