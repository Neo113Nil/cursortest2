package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.vez0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0650qd implements InterfaceC0900z3 {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public C0650qd(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0900z3, io.appmetrica.analytics.impl.Gp
    public final void a(Bp bp) {
        AtomicBoolean atomicBoolean = this.b;
        Boolean bool = bp.o.f;
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        atomicBoolean.set(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        Object failure;
        if (!this.b.get()) {
            return null;
        }
        try {
            failure = vez0.h(vez0.i(this.a));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (SSLSocketFactory) (failure instanceof Result.Failure ? null : failure);
    }
}
