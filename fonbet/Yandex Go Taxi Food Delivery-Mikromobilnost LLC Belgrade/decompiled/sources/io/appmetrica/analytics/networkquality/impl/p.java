package io.appmetrica.analytics.networkquality.impl;

import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class p extends Lambda implements tls {
    public static final p a = new p();

    public p() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Thread.sleep(((Number) obj).longValue());
        return zy11.a;
    }
}
