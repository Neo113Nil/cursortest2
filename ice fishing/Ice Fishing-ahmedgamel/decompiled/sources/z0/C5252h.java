package z0;

import android.database.sqlite.SQLiteProgram;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5252h implements y0.c {

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteProgram f42248n;

    public C5252h(SQLiteProgram delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f42248n = delegate;
    }

    @Override // y0.c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f42248n.bindString(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42248n.close();
    }

    @Override // y0.c
    public final void e(int i, double d2) {
        this.f42248n.bindDouble(i, d2);
    }

    @Override // y0.c
    public final void g(int i, long j6) {
        this.f42248n.bindLong(i, j6);
    }

    @Override // y0.c
    public final void h(int i, byte[] bArr) {
        this.f42248n.bindBlob(i, bArr);
    }

    @Override // y0.c
    public final void o(int i) {
        this.f42248n.bindNull(i);
    }
}
