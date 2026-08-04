package com.gamericefishpro.space.u5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.gamericefishpro.space.c6.c {
    public final com.gamericefishpro.space.c6.c d;
    public final long e;
    public final /* synthetic */ q i;

    public j(q qVar, com.gamericefishpro.space.c6.c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.i = qVar;
        this.d = delegate;
        this.e = com.gamericefishpro.space.t5.b.a();
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean H() {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.H();
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void a(int i, long j) {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            this.d.a(i, j);
        } else {
            com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            this.d.close();
        } else {
            com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String g(int i) {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.g(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final int getColumnCount() {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.getColumnCount();
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String getColumnName(int i) {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.getColumnName(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final long getLong(int i) {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.getLong(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean isNull(int i) {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            return this.d.isNull(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void reset() {
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            this.d.reset();
        } else {
            com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void u(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.i.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Statement is recycled");
            throw null;
        }
        if (this.e == com.gamericefishpro.space.t5.b.a()) {
            this.d.u(i, value);
        } else {
            com.gamericefishpro.space.i.a.Q(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
