package com.gamericefishpro.space.v5;

import com.gamericefishpro.space.e6.j;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.gamericefishpro.space.d6.b db, String sql) {
        super(db, sql);
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.v = db.m(sql);
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean H() {
        b();
        this.v.e.execute();
        return false;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void a(int i, long j) {
        b();
        this.v.a(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.v.close();
        this.i = true;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String g(int i) {
        b();
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String getColumnName(int i) {
        b();
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final long getLong(int i) {
        b();
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean isNull(int i) {
        b();
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void u(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        b();
        this.v.i(i, value);
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void reset() {
    }
}
