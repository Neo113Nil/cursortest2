package com.anythink.core.common.n.b.a.a;

import com.anythink.core.common.n.c.h;
import com.anythink.core.common.n.c.v;
import java.io.IOException;

/* loaded from: classes.dex */
class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15103a;

    public e(v vVar) {
        super(vVar);
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
    public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
        if (this.f15103a) {
            cVar.i(j9);
            return;
        }
        try {
            super.a(cVar, j9);
        } catch (IOException unused) {
            this.f15103a = true;
            b();
        }
    }

    public void b() {
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15103a) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f15103a = true;
            b();
        }
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        if (this.f15103a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f15103a = true;
            b();
        }
    }
}
