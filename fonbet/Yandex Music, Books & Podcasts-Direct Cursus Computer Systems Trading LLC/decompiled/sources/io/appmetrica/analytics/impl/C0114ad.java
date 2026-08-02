package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ixf;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0114ad implements InterfaceC0824z3 {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public C0114ad(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0824z3, io.appmetrica.analytics.impl.InterfaceC0530op
    public final void a(@NotNull C0385jp c0385jp) {
        AtomicBoolean atomicBoolean = this.b;
        Boolean bool = c0385jp.o.f;
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        atomicBoolean.set(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        Object t7oVar;
        if (!this.b.get()) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            Context context = this.a;
            context.getClass();
            t7oVar = ixf.u(ixf.v(context));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (SSLSocketFactory) (t7oVar instanceof t7o ? null : t7oVar);
    }
}
