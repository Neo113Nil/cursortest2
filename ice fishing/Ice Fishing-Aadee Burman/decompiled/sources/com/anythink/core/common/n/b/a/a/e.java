package com.anythink.core.common.n.b.a.a;

import com.anythink.core.common.n.c.h;
import com.anythink.core.common.n.c.v;
import java.io.IOException;

/* loaded from: classes.dex */
class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14945a;

    public e(v vVar) {
        super(vVar);
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
    public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
        if (this.f14945a) {
            cVar.i(j6);
            return;
        }
        try {
            super.a(cVar, j6);
        } catch (IOException unused) {
            this.f14945a = true;
            b();
        }
    }

    public void b() {
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14945a) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f14945a = true;
            b();
        }
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        if (this.f14945a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f14945a = true;
            b();
        }
    }
}
