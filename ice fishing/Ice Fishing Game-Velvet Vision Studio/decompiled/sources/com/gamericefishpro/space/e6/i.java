package com.gamericefishpro.space.e6;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i implements com.gamericefishpro.space.d6.g {
    public final SQLiteProgram d;

    public i(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void G(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.bindBlob(i, value);
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void a(int i, long j) {
        this.d.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void i(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.bindString(i, value);
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void k(double d, int i) {
        this.d.bindDouble(i, d);
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void p(int i) {
        this.d.bindNull(i);
    }
}
