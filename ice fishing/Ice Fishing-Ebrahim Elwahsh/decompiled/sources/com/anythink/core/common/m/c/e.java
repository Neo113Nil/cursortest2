package com.anythink.core.common.m.c;

import android.content.Context;
import com.anythink.core.common.m.c.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    private static final int f14702e = 5;

    /* renamed from: f, reason: collision with root package name */
    private volatile h f14703f;

    public e(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.m.c.d, com.anythink.core.common.m.c.i
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar)) {
            return null;
        }
        if (this.f14703f == null) {
            synchronized (this.f14701d) {
                try {
                    if (this.f14703f == null) {
                        com.anythink.core.common.g.c.a();
                        h.a aVar = new h.a(com.anythink.core.common.g.c.c() ? com.anythink.core.common.g.c.f13422b : 86400000L);
                        aVar.f14719c = false;
                        this.f14703f = new h(this.f14699b, this.f14700c, aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f14703f.a(dVar, super.a(dVar));
    }

    @Override // com.anythink.core.common.m.c.d
    public final boolean b(com.anythink.core.common.m.b.d dVar) {
        Context context = this.f14699b;
        return context != null && dVar != null && q.a(context) && com.anythink.core.common.m.b.g.f14680f.equals(dVar.b());
    }

    @Override // com.anythink.core.common.m.c.d
    public final String c(com.anythink.core.common.m.b.d dVar) {
        return this.f14703f != null ? h.a(dVar) : dVar.b();
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (b(dVar) && this.f14703f != null) {
            this.f14703f.a(fVar, dVar);
        }
    }
}
