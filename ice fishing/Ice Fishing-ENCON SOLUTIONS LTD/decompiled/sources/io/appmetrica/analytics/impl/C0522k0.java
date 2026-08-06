package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6334a = new HashMap();

    public final synchronized C0496j0 a(Q4 q4, PublicLogger publicLogger, We we) {
        C0496j0 c0496j0;
        c0496j0 = (C0496j0) this.f6334a.get(q4.toString());
        if (c0496j0 == null) {
            C0471i0 d2 = we.d();
            c0496j0 = new C0496j0(d2.f6158a, d2.f6159b, new C0724rl(publicLogger, "[App Environment]"));
            this.f6334a.put(q4.toString(), c0496j0);
        }
        return c0496j0;
    }

    public final synchronized void a(C0471i0 c0471i0, We we) {
        we.a(c0471i0).b();
    }
}
