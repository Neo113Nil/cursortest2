package com.gamericefishpro.space.s5;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public final t a;
    public final AtomicBoolean b;
    public final com.gamericefishpro.space.oh.s c;

    public w(t database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.a = database;
        this.b = new AtomicBoolean(false);
        this.c = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(16, this));
    }

    public final com.gamericefishpro.space.e6.j a() {
        this.a.a();
        return this.b.compareAndSet(false, true) ? (com.gamericefishpro.space.e6.j) this.c.getValue() : b();
    }

    public final com.gamericefishpro.space.e6.j b() {
        String sql = c();
        t tVar = this.a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        tVar.a();
        tVar.b();
        return tVar.j().L().m(sql);
    }

    public abstract String c();

    public final void d(com.gamericefishpro.space.e6.j statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((com.gamericefishpro.space.e6.j) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
