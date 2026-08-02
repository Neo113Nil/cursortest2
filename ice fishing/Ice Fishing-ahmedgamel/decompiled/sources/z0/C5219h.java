package z0;

import android.database.sqlite.SQLiteProgram;
import y0.InterfaceC5198c;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5219h implements InterfaceC5198c {

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteProgram f42219n;

    public C5219h(SQLiteProgram delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f42219n = delegate;
    }

    @Override // y0.InterfaceC5198c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f42219n.bindString(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42219n.close();
    }

    @Override // y0.InterfaceC5198c
    public final void e(int i, double d9) {
        this.f42219n.bindDouble(i, d9);
    }

    @Override // y0.InterfaceC5198c
    public final void g(int i, long j6) {
        this.f42219n.bindLong(i, j6);
    }

    @Override // y0.InterfaceC5198c
    public final void h(int i, byte[] bArr) {
        this.f42219n.bindBlob(i, bArr);
    }

    @Override // y0.InterfaceC5198c
    public final void o(int i) {
        this.f42219n.bindNull(i);
    }
}
