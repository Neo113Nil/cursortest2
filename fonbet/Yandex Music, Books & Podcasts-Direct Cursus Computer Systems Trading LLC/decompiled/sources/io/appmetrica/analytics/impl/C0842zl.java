package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmCrashWrapper;

/* renamed from: io.appmetrica.analytics.impl.zl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0842zl implements Qb {
    public final IRtmCrashWrapper a;

    public C0842zl(@NonNull IRtmCrashWrapper iRtmCrashWrapper) {
        this.a = iRtmCrashWrapper;
    }

    @Override // io.appmetrica.analytics.impl.Qb
    public final void a(Throwable th, @NonNull Z z) {
        this.a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
