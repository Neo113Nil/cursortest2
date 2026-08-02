package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0590ob implements InterfaceC0441j7 {
    public final SystemTimeProvider a = new SystemTimeProvider();

    public final long a(Yc yc) {
        long j = yc.k;
        return j > 0 ? j : this.a.currentTimeMillis();
    }
}
