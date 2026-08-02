package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class yfs implements mkw0 {
    public final SQLiteProgram a;

    public yfs(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.mkw0
    public final void C() {
        this.a.clearBindings();
    }

    @Override // defpackage.mkw0
    public final void b(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.mkw0
    public final void m(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.mkw0
    public final void m0(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // defpackage.mkw0
    public final void p(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.mkw0
    public final void z(double d, int i) {
        this.a.bindDouble(i, d);
    }
}
