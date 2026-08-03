package i4;

import android.database.sqlite.SQLiteProgram;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class h implements h4.e {

    /* renamed from: g, reason: collision with root package name */
    public final SQLiteProgram f3193g;

    public h(SQLiteProgram sQLiteProgram) {
        j.e(sQLiteProgram, "delegate");
        this.f3193g = sQLiteProgram;
    }

    @Override // h4.e
    public final void c(String str, int i10) {
        j.e(str, "value");
        this.f3193g.bindString(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3193g.close();
    }

    @Override // h4.e
    public final void e(double d10, int i10) {
        this.f3193g.bindDouble(i10, d10);
    }

    @Override // h4.e
    public final void h(int i10) {
        this.f3193g.bindNull(i10);
    }

    @Override // h4.e
    public final void n(int i10, long j3) {
        this.f3193g.bindLong(i10, j3);
    }

    @Override // h4.e
    public final void p(int i10, byte[] bArr) {
        this.f3193g.bindBlob(i10, bArr);
    }
}
