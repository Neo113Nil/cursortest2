package com.anythink.core.common.m.c;

import android.content.Context;
import com.anythink.core.common.m.c.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    private static final int f14547e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static final long f14548f = 3600000;

    /* renamed from: g, reason: collision with root package name */
    private volatile h f14549g;

    public f(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.m.c.d, com.anythink.core.common.m.c.i
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar)) {
            return null;
        }
        if (this.f14549g == null) {
            synchronized (this.f14544d) {
                try {
                    if (this.f14549g == null) {
                        this.f14549g = new h(this.f14542b, this.f14543c, new h.a(3600000L));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f14549g.a(dVar, super.a(dVar));
    }

    @Override // com.anythink.core.common.m.c.d
    public final boolean b(com.anythink.core.common.m.b.d dVar) {
        Context context = this.f14542b;
        return context != null && dVar != null && q.a(context) && com.anythink.core.common.m.b.g.f14520c.equals(dVar.b());
    }

    @Override // com.anythink.core.common.m.c.d
    public final String c(com.anythink.core.common.m.b.d dVar) {
        return this.f14549g != null ? h.a(dVar) : dVar.b();
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (b(dVar) && this.f14549g != null) {
            this.f14549g.a(fVar, dVar);
        }
    }
}
